@file:OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)

package com.example.ui

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Calculate
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.Flip
import androidx.compose.material.icons.filled.HistoryEdu
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.Public
import androidx.compose.material.icons.filled.Science
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.Medium
import com.example.data.model.SubjectSection
import com.example.data.model.SubjectType
import com.example.ui.components.AppFooter
import com.example.ui.components.AppHeader
import com.example.ui.components.BookmarksDialog
import com.example.ui.components.ChapterNotesScreen
import com.example.ui.components.FormulaAndQuizScreen
import com.example.ui.components.PYQScreen
import com.example.ui.components.SearchResultsOverlay
import com.example.ui.theme.BluePrimary
import com.example.ui.theme.LightBlueBorder

@Composable
fun MainScreen(viewModel: StudyViewModel) {
    val uiState by viewModel.uiState.collectAsState()

    val subjects = listOf(
        SubjectType.SCIENCE,
        SubjectType.MATHEMATICS,
        SubjectType.SOCIAL_SCIENCE,
        SubjectType.ENGLISH
    )

    val sections = listOf(
        SubjectSection.CHAPTER_NOTES,
        SubjectSection.IMP_PYQS,
        SubjectSection.FORMULA_QUIZ
    )

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .testTag("main_screen_scaffold"),
        topBar = {
            AppHeader(
                medium = uiState.medium,
                onToggleMedium = { viewModel.toggleMedium() },
                searchQuery = uiState.searchQuery,
                onSearchQueryChange = { viewModel.onSearchQueryChange(it) },
                onClearSearch = { viewModel.clearSearch() },
                bookmarkCount = uiState.bookmarkedIds.size,
                onOpenBookmarks = { viewModel.setShowBookmarks(true) }
            )
        },
        bottomBar = {
            AppFooter(medium = uiState.medium)
        },
        containerColor = MaterialTheme.colorScheme.background
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                // 1. Main 4 Subject Tabs
                TabRow(
                    selectedTabIndex = subjects.indexOf(uiState.selectedSubject),
                    containerColor = MaterialTheme.colorScheme.surface,
                    contentColor = BluePrimary,
                    indicator = { tabPositions ->
                        val index = subjects.indexOf(uiState.selectedSubject)
                        if (index >= 0 && index < tabPositions.size) {
                            TabRowDefaults.SecondaryIndicator(
                                Modifier.tabIndicatorOffset(tabPositions[index]),
                                color = BluePrimary,
                                height = 3.dp
                            )
                        }
                    },
                    divider = { HorizontalDivider(color = LightBlueBorder.copy(alpha = 0.5f)) }
                ) {
                    subjects.forEach { subject ->
                        val isSelected = uiState.selectedSubject == subject
                        val label = if (uiState.medium == Medium.ENGLISH) subject.titleEn else subject.titleMr
                        val icon = when (subject) {
                            SubjectType.SCIENCE -> Icons.Default.Science
                            SubjectType.MATHEMATICS -> Icons.Default.Calculate
                            SubjectType.SOCIAL_SCIENCE -> Icons.Default.Public
                            SubjectType.ENGLISH -> Icons.Default.MenuBook
                        }

                        Tab(
                            selected = isSelected,
                            onClick = { viewModel.selectSubject(subject) },
                            text = {
                                Text(
                                    text = label,
                                    fontSize = 12.sp,
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                    maxLines = 1
                                )
                            },
                            icon = {
                                Icon(
                                    imageVector = icon,
                                    contentDescription = label,
                                    modifier = Modifier.size(18.dp)
                                )
                            },
                            modifier = Modifier.testTag("tab_subject_${subject.id}")
                        )
                    }
                }

                // 2. Sub-Sections Tab Row (Chapter Notes, 10-Year IMP PYQs, Formula & Quiz)
                TabRow(
                    selectedTabIndex = sections.indexOf(uiState.selectedSection),
                    containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                    contentColor = BluePrimary,
                    divider = { HorizontalDivider(color = LightBlueBorder.copy(alpha = 0.4f)) }
                ) {
                    sections.forEach { section ->
                        val isSelected = uiState.selectedSection == section
                        val label = if (uiState.medium == Medium.ENGLISH) section.titleEn else section.titleMr
                        val icon = when (section) {
                            SubjectSection.CHAPTER_NOTES -> Icons.Default.Description
                            SubjectSection.IMP_PYQS -> Icons.Default.HistoryEdu
                            SubjectSection.FORMULA_QUIZ -> Icons.Default.Flip
                        }

                        Tab(
                            selected = isSelected,
                            onClick = { viewModel.selectSection(section) },
                            text = {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        imageVector = icon,
                                        contentDescription = null,
                                        modifier = Modifier.size(15.dp)
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text(
                                        text = label,
                                        fontSize = 12.sp,
                                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
                                    )
                                }
                            },
                            modifier = Modifier.testTag("sub_tab_${section.name.lowercase()}")
                        )
                    }
                }

                // 3. Main Subject Content
                AnimatedContent(
                    targetState = uiState.selectedSection,
                    transitionSpec = { fadeIn() togetherWith fadeOut() },
                    label = "section_transition",
                    modifier = Modifier.weight(1f)
                ) { section ->
                    when (section) {
                        SubjectSection.CHAPTER_NOTES -> {
                            ChapterNotesScreen(
                                chapters = viewModel.getCurrentChapters(),
                                medium = uiState.medium,
                                expandedChapterId = uiState.expandedChapterId,
                                onToggleExpand = { viewModel.toggleChapterExpanded(it) },
                                bookmarkedIds = uiState.bookmarkedIds,
                                onToggleBookmark = { viewModel.toggleBookmark(it) }
                            )
                        }

                        SubjectSection.IMP_PYQS -> {
                            PYQScreen(
                                pyqs = viewModel.getCurrentPYQs(),
                                medium = uiState.medium,
                                selectedYear = uiState.selectedYearFilter,
                                onSelectYear = { viewModel.setYearFilter(it) },
                                expandedPyqId = uiState.expandedPyqId,
                                onToggleExpand = { viewModel.togglePyqExpanded(it) },
                                bookmarkedIds = uiState.bookmarkedIds,
                                onToggleBookmark = { viewModel.toggleBookmark(it) }
                            )
                        }

                        SubjectSection.FORMULA_QUIZ -> {
                            FormulaAndQuizScreen(
                                flashcards = viewModel.getCurrentFlashcards(),
                                quizQuestions = viewModel.getCurrentQuizQuestions(),
                                medium = uiState.medium,
                                currentFlashcardIndex = uiState.currentFlashcardIndex,
                                isFlashcardFlipped = uiState.isFlashcardFlipped,
                                onFlipFlashcard = { viewModel.flipFlashcard() },
                                onNextFlashcard = { viewModel.nextFlashcard(viewModel.getCurrentFlashcards().size) },
                                onPrevFlashcard = { viewModel.prevFlashcard(viewModel.getCurrentFlashcards().size) },
                                quizState = uiState.quizState,
                                onSelectQuizOption = { viewModel.selectQuizOption(it) },
                                onSubmitQuizAnswer = { viewModel.submitQuizAnswer(it) },
                                onNextQuizQuestion = { viewModel.nextQuizQuestion(viewModel.getCurrentQuizQuestions().size) },
                                onResetQuiz = { viewModel.resetQuiz() },
                                bookmarkedIds = uiState.bookmarkedIds,
                                onToggleBookmark = { viewModel.toggleBookmark(it) }
                            )
                        }
                    }
                }
            }

            // Search Overlay (shows on live keyword search)
            if (uiState.isSearchActive) {
                SearchResultsOverlay(
                    results = uiState.searchResults,
                    medium = uiState.medium,
                    searchQuery = uiState.searchQuery,
                    onResultClick = { viewModel.navigateFromSearchResult(it) }
                )
            }
        }
    }

    // Bookmarks Dialog
    if (uiState.showBookmarksDialog) {
        BookmarksDialog(
            bookmarkedPyqs = viewModel.getAllBookmarkedPYQs(),
            bookmarkedCards = viewModel.getAllBookmarkedFlashcards(),
            medium = uiState.medium,
            onDismiss = { viewModel.setShowBookmarks(false) },
            onRemoveBookmark = { viewModel.toggleBookmark(it) }
        )
    }
}
