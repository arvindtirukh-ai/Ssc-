package com.example.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.model.ChapterNote
import com.example.data.model.Flashcard
import com.example.data.model.Medium
import com.example.data.model.PYQuestion
import com.example.data.model.QuizQuestion
import com.example.data.model.SearchResultItem
import com.example.data.model.SubjectSection
import com.example.data.model.SubjectType
import com.example.data.repository.StudyRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn

data class QuizUiState(
    val currentQuestionIndex: Int = 0,
    val selectedOptionIndex: Int? = null,
    val isAnswerSubmitted: Boolean = false,
    val score: Int = 0,
    val isQuizCompleted: Boolean = false,
    val userAnswers: Map<Int, Int> = emptyMap()
)

data class StudyUiState(
    val selectedSubject: SubjectType = SubjectType.SCIENCE,
    val selectedSection: SubjectSection = SubjectSection.CHAPTER_NOTES,
    val selectedYearFilter: Int? = null, // null means "All Years" (2017 - 2026)
    val searchQuery: String = "",
    val isSearchActive: Boolean = false,
    val searchResults: List<SearchResultItem> = emptyList(),
    val medium: Medium = Medium.ENGLISH,
    val bookmarkedIds: Set<String> = emptySet(),
    val expandedChapterId: String? = null,
    val expandedPyqId: String? = null,
    val currentFlashcardIndex: Int = 0,
    val isFlashcardFlipped: Boolean = false,
    val quizState: QuizUiState = QuizUiState(),
    val showBookmarksDialog: Boolean = false
)

class StudyViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = StudyRepository(application.applicationContext)

    private val _uiState = MutableStateFlow(StudyUiState())
    val uiState: StateFlow<StudyUiState> = _uiState.asStateFlow()

    init {
        // Collect repository states
        val mediumFlow = repository.currentMedium
        val bookmarksFlow = repository.bookmarkedIds

        _uiState.value = _uiState.value.copy(
            medium = mediumFlow.value,
            bookmarkedIds = bookmarksFlow.value
        )
    }

    fun selectSubject(subject: SubjectType) {
        if (_uiState.value.selectedSubject != subject) {
            _uiState.value = _uiState.value.copy(
                selectedSubject = subject,
                expandedChapterId = null,
                expandedPyqId = null,
                currentFlashcardIndex = 0,
                isFlashcardFlipped = false,
                quizState = QuizUiState() // Reset quiz for new subject
            )
        }
    }

    fun selectSection(section: SubjectSection) {
        _uiState.value = _uiState.value.copy(
            selectedSection = section
        )
    }

    fun setYearFilter(year: Int?) {
        _uiState.value = _uiState.value.copy(selectedYearFilter = year)
    }

    fun toggleMedium() {
        val next = if (_uiState.value.medium == Medium.ENGLISH) Medium.MARATHI else Medium.ENGLISH
        repository.setMedium(next)
        _uiState.value = _uiState.value.copy(medium = next)
        // Refresh search if query active
        if (_uiState.value.searchQuery.isNotBlank()) {
            onSearchQueryChange(_uiState.value.searchQuery)
        }
    }

    fun toggleBookmark(id: String) {
        repository.toggleBookmark(id)
        _uiState.value = _uiState.value.copy(
            bookmarkedIds = repository.bookmarkedIds.value
        )
    }

    fun onSearchQueryChange(query: String) {
        val results = if (query.isBlank()) {
            emptyList()
        } else {
            repository.searchAll(query, _uiState.value.medium)
        }
        _uiState.value = _uiState.value.copy(
            searchQuery = query,
            searchResults = results,
            isSearchActive = query.isNotBlank()
        )
    }

    fun clearSearch() {
        _uiState.value = _uiState.value.copy(
            searchQuery = "",
            isSearchActive = false,
            searchResults = emptyList()
        )
    }

    fun navigateFromSearchResult(item: SearchResultItem) {
        _uiState.value = _uiState.value.copy(
            selectedSubject = item.subject,
            selectedSection = item.section,
            searchQuery = "",
            isSearchActive = false,
            expandedChapterId = if (item.section == SubjectSection.CHAPTER_NOTES) item.id else null,
            expandedPyqId = if (item.section == SubjectSection.IMP_PYQS) item.id else null
        )
    }

    fun toggleChapterExpanded(chapterId: String) {
        val current = _uiState.value.expandedChapterId
        _uiState.value = _uiState.value.copy(
            expandedChapterId = if (current == chapterId) null else chapterId
        )
    }

    fun togglePyqExpanded(pyqId: String) {
        val current = _uiState.value.expandedPyqId
        _uiState.value = _uiState.value.copy(
            expandedPyqId = if (current == pyqId) null else pyqId
        )
    }

    // Flashcard interactions
    fun flipFlashcard() {
        _uiState.value = _uiState.value.copy(
            isFlashcardFlipped = !_uiState.value.isFlashcardFlipped
        )
    }

    fun nextFlashcard(totalCount: Int) {
        if (totalCount == 0) return
        val next = (_uiState.value.currentFlashcardIndex + 1) % totalCount
        _uiState.value = _uiState.value.copy(
            currentFlashcardIndex = next,
            isFlashcardFlipped = false
        )
    }

    fun prevFlashcard(totalCount: Int) {
        if (totalCount == 0) return
        val prev = if (_uiState.value.currentFlashcardIndex - 1 < 0) totalCount - 1 else _uiState.value.currentFlashcardIndex - 1
        _uiState.value = _uiState.value.copy(
            currentFlashcardIndex = prev,
            isFlashcardFlipped = false
        )
    }

    // Quiz interactions
    fun selectQuizOption(optionIndex: Int) {
        if (_uiState.value.quizState.isAnswerSubmitted) return
        _uiState.value = _uiState.value.copy(
            quizState = _uiState.value.quizState.copy(selectedOptionIndex = optionIndex)
        )
    }

    fun submitQuizAnswer(correctIndex: Int) {
        val qState = _uiState.value.quizState
        val selected = qState.selectedOptionIndex ?: return
        if (qState.isAnswerSubmitted) return

        val isCorrect = (selected == correctIndex)
        val newScore = if (isCorrect) qState.score + 1 else qState.score
        val updatedAnswers = qState.userAnswers.toMutableMap()
        updatedAnswers[qState.currentQuestionIndex] = selected

        _uiState.value = _uiState.value.copy(
            quizState = qState.copy(
                isAnswerSubmitted = true,
                score = newScore,
                userAnswers = updatedAnswers
            )
        )
    }

    fun nextQuizQuestion(totalQuestions: Int) {
        val qState = _uiState.value.quizState
        val nextIdx = qState.currentQuestionIndex + 1
        if (nextIdx >= totalQuestions) {
            _uiState.value = _uiState.value.copy(
                quizState = qState.copy(isQuizCompleted = true)
            )
        } else {
            _uiState.value = _uiState.value.copy(
                quizState = qState.copy(
                    currentQuestionIndex = nextIdx,
                    selectedOptionIndex = null,
                    isAnswerSubmitted = false
                )
            )
        }
    }

    fun resetQuiz() {
        _uiState.value = _uiState.value.copy(
            quizState = QuizUiState()
        )
    }

    fun setShowBookmarks(show: Boolean) {
        _uiState.value = _uiState.value.copy(showBookmarksDialog = show)
    }

    // Repository getters
    fun getCurrentChapters(): List<ChapterNote> = repository.getChapters(_uiState.value.selectedSubject)
    fun getCurrentPYQs(): List<PYQuestion> = repository.getPYQs(_uiState.value.selectedSubject, _uiState.value.selectedYearFilter)
    fun getCurrentFlashcards(): List<Flashcard> = repository.getFlashcards(_uiState.value.selectedSubject)
    fun getCurrentQuizQuestions(): List<QuizQuestion> = repository.getQuizQuestions(_uiState.value.selectedSubject)
    fun getAllBookmarkedPYQs(): List<PYQuestion> = repository.getAllBookmarkedPYQs()
    fun getAllBookmarkedFlashcards(): List<Flashcard> = repository.getAllBookmarkedFlashcards()
}
