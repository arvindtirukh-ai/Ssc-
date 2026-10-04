package com.example.data.repository

import android.content.Context
import android.content.SharedPreferences
import com.example.data.model.ChapterNote
import com.example.data.model.Flashcard
import com.example.data.model.Medium
import com.example.data.model.PYQuestion
import com.example.data.model.QuizQuestion
import com.example.data.model.SearchResultItem
import com.example.data.model.SubjectSection
import com.example.data.model.SubjectType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class StudyRepository(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences("ssc_study_prefs", Context.MODE_PRIVATE)

    private val _bookmarkedIds = MutableStateFlow<Set<String>>(loadBookmarks())
    val bookmarkedIds: StateFlow<Set<String>> = _bookmarkedIds.asStateFlow()

    private val _currentMedium = MutableStateFlow(loadMedium())
    val currentMedium: StateFlow<Medium> = _currentMedium.asStateFlow()

    private fun loadBookmarks(): Set<String> {
        return prefs.getStringSet("bookmarked_items", emptySet()) ?: emptySet()
    }

    private fun loadMedium(): Medium {
        val name = prefs.getString("selected_medium", Medium.ENGLISH.name)
        return try {
            Medium.valueOf(name ?: Medium.ENGLISH.name)
        } catch (_: Exception) {
            Medium.ENGLISH
        }
    }

    fun toggleBookmark(id: String) {
        val current = _bookmarkedIds.value.toMutableSet()
        if (current.contains(id)) {
            current.remove(id)
        } else {
            current.add(id)
        }
        prefs.edit().putStringSet("bookmarked_items", current).apply()
        _bookmarkedIds.value = current
    }

    fun setMedium(medium: Medium) {
        prefs.edit().putString("selected_medium", medium.name).apply()
        _currentMedium.value = medium
    }

    fun getChapters(subject: SubjectType): List<ChapterNote> {
        return when (subject) {
            SubjectType.SCIENCE -> ScienceData.chapters
            SubjectType.MATHEMATICS -> MathsData.chapters
            SubjectType.SOCIAL_SCIENCE -> SocialScienceData.chapters
            SubjectType.ENGLISH -> EnglishData.chapters
        }
    }

    fun getPYQs(subject: SubjectType, yearFilter: Int? = null): List<PYQuestion> {
        val all = when (subject) {
            SubjectType.SCIENCE -> ScienceData.pyqs
            SubjectType.MATHEMATICS -> MathsData.pyqs
            SubjectType.SOCIAL_SCIENCE -> SocialScienceData.pyqs
            SubjectType.ENGLISH -> EnglishData.pyqs
        }
        return if (yearFilter == null || yearFilter == 0) {
            all
        } else {
            all.filter { it.yearInt == yearFilter }
        }
    }

    fun getFlashcards(subject: SubjectType): List<Flashcard> {
        return when (subject) {
            SubjectType.SCIENCE -> ScienceData.flashcards
            SubjectType.MATHEMATICS -> MathsData.flashcards
            SubjectType.SOCIAL_SCIENCE -> SocialScienceData.flashcards
            SubjectType.ENGLISH -> EnglishData.flashcards
        }
    }

    fun getQuizQuestions(subject: SubjectType): List<QuizQuestion> {
        return when (subject) {
            SubjectType.SCIENCE -> ScienceData.quizQuestions
            SubjectType.MATHEMATICS -> MathsData.quizQuestions
            SubjectType.SOCIAL_SCIENCE -> SocialScienceData.quizQuestions
            SubjectType.ENGLISH -> EnglishData.quizQuestions
        }
    }

    fun searchAll(query: String, medium: Medium): List<SearchResultItem> {
        if (query.isBlank()) return emptyList()
        val q = query.trim().lowercase()
        val results = mutableListOf<SearchResultItem>()

        SubjectType.values().forEach { subj ->
            // Search in chapters
            getChapters(subj).forEach { ch ->
                val title = if (medium == Medium.ENGLISH) ch.chapterTitleEn else ch.chapterTitleMr
                val summary = if (medium == Medium.ENGLISH) ch.summaryEn else ch.summaryMr
                val points = if (medium == Medium.ENGLISH) ch.keyPointsEn else ch.keyPointsMr

                if (title.lowercase().contains(q) ||
                    summary.lowercase().contains(q) ||
                    points.any { it.lowercase().contains(q) } ||
                    ch.chapterTitleEn.lowercase().contains(q) ||
                    ch.chapterTitleMr.lowercase().contains(q)
                ) {
                    results.add(
                        SearchResultItem(
                            id = ch.id,
                            subject = subj,
                            section = SubjectSection.CHAPTER_NOTES,
                            title = "Ch ${ch.chapterNumber}: $title",
                            subtitle = if (medium == Medium.ENGLISH) subj.titleEn else subj.titleMr,
                            previewText = summary
                        )
                    )
                }
            }

            // Search in PYQs
            getPYQs(subj).forEach { pyq ->
                val question = if (medium == Medium.ENGLISH) pyq.questionEn else pyq.questionMr
                val answer = if (medium == Medium.ENGLISH) pyq.answerEn else pyq.answerMr
                val chTitle = if (medium == Medium.ENGLISH) pyq.chapterTitleEn else pyq.chapterTitleMr

                if (question.lowercase().contains(q) ||
                    answer.lowercase().contains(q) ||
                    chTitle.lowercase().contains(q) ||
                    pyq.yearTag.lowercase().contains(q) ||
                    pyq.questionType.lowercase().contains(q) ||
                    pyq.questionEn.lowercase().contains(q) ||
                    pyq.questionMr.lowercase().contains(q)
                ) {
                    results.add(
                        SearchResultItem(
                            id = pyq.id,
                            subject = subj,
                            section = SubjectSection.IMP_PYQS,
                            title = "${pyq.yearTag} (${pyq.marks}M): $chTitle",
                            subtitle = "${if (medium == Medium.ENGLISH) subj.titleEn else subj.titleMr} • ${pyq.questionType}",
                            previewText = question,
                            yearTag = pyq.yearTag,
                            marks = pyq.marks
                        )
                    )
                }
            }

            // Search in flashcards
            getFlashcards(subj).forEach { fc ->
                val front = if (medium == Medium.ENGLISH) fc.frontEn else fc.frontMr
                val back = if (medium == Medium.ENGLISH) fc.backEn else fc.backMr

                if (front.lowercase().contains(q) ||
                    back.lowercase().contains(q) ||
                    fc.chapterTitleEn.lowercase().contains(q) ||
                    fc.chapterTitleMr.lowercase().contains(q)
                ) {
                    results.add(
                        SearchResultItem(
                            id = fc.id,
                            subject = subj,
                            section = SubjectSection.FORMULA_QUIZ,
                            title = front,
                            subtitle = "${if (medium == Medium.ENGLISH) subj.titleEn else subj.titleMr} • ${fc.chapterTitleEn}",
                            previewText = back
                        )
                    )
                }
            }
        }

        return results
    }

    fun getAllBookmarkedPYQs(): List<PYQuestion> {
        val bookmarks = _bookmarkedIds.value
        val allPyqs = SubjectType.values().flatMap { getPYQs(it) }
        return allPyqs.filter { bookmarks.contains(it.id) }
    }

    fun getAllBookmarkedFlashcards(): List<Flashcard> {
        val bookmarks = _bookmarkedIds.value
        val allCards = SubjectType.values().flatMap { getFlashcards(it) }
        return allCards.filter { bookmarks.contains(it.id) }
    }
}
