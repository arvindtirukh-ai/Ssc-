package com.example.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Flip
import androidx.compose.material.icons.filled.HelpOutline
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.Flashcard
import com.example.data.model.Medium
import com.example.data.model.QuizQuestion
import com.example.ui.QuizUiState
import com.example.ui.theme.AccentAmber
import com.example.ui.theme.BluePrimary
import com.example.ui.theme.BluePrimaryVariant
import com.example.ui.theme.ErrorRed
import com.example.ui.theme.LightBlueBorder
import com.example.ui.theme.LightBlueContainer
import com.example.ui.theme.SuccessGreen

@Composable
fun FormulaAndQuizScreen(
    flashcards: List<Flashcard>,
    quizQuestions: List<QuizQuestion>,
    medium: Medium,
    currentFlashcardIndex: Int,
    isFlashcardFlipped: Boolean,
    onFlipFlashcard: () -> Unit,
    onNextFlashcard: () -> Unit,
    onPrevFlashcard: () -> Unit,
    quizState: QuizUiState,
    onSelectQuizOption: (Int) -> Unit,
    onSubmitQuizAnswer: (Int) -> Unit,
    onNextQuizQuestion: () -> Unit,
    onResetQuiz: () -> Unit,
    bookmarkedIds: Set<String>,
    onToggleBookmark: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedSubTab by remember { mutableIntStateOf(0) } // 0: Flashcards, 1: Quiz

    Column(modifier = modifier.fillMaxSize()) {
        // Sub-tabs: Flashcards vs 5-Question Quiz
        TabRow(
            selectedTabIndex = selectedSubTab,
            containerColor = MaterialTheme.colorScheme.surface,
            contentColor = BluePrimary,
            divider = { HorizontalDivider(color = LightBlueBorder.copy(alpha = 0.5f)) }
        ) {
            Tab(
                selected = selectedSubTab == 0,
                onClick = { selectedSubTab = 0 },
                text = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.Flip,
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = if (medium == Medium.ENGLISH) "Formula Flashcards" else "सूत्रे फ्लॅशकार्ड्स",
                            fontWeight = if (selectedSubTab == 0) FontWeight.Bold else FontWeight.Medium
                        )
                    }
                },
                modifier = Modifier.testTag("tab_flashcards")
            )
            Tab(
                selected = selectedSubTab == 1,
                onClick = { selectedSubTab = 1 },
                text = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.Quiz,
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = if (medium == Medium.ENGLISH) "5-Question Quiz" else "५ प्रश्नांची चाचणी",
                            fontWeight = if (selectedSubTab == 1) FontWeight.Bold else FontWeight.Medium
                        )
                    }
                },
                modifier = Modifier.testTag("tab_quiz")
            )
        }

        if (selectedSubTab == 0) {
            FlashcardSection(
                flashcards = flashcards,
                medium = medium,
                currentIndex = currentFlashcardIndex,
                isFlipped = isFlashcardFlipped,
                onFlip = onFlipFlashcard,
                onNext = onNextFlashcard,
                onPrev = onPrevFlashcard,
                bookmarkedIds = bookmarkedIds,
                onToggleBookmark = onToggleBookmark
            )
        } else {
            QuizSection(
                quizQuestions = quizQuestions,
                medium = medium,
                quizState = quizState,
                onSelectOption = onSelectQuizOption,
                onSubmitAnswer = onSubmitQuizAnswer,
                onNextQuestion = onNextQuizQuestion,
                onReset = onResetQuiz
            )
        }
    }
}

@Composable
fun FlashcardSection(
    flashcards: List<Flashcard>,
    medium: Medium,
    currentIndex: Int,
    isFlipped: Boolean,
    onFlip: () -> Unit,
    onNext: () -> Unit,
    onPrev: () -> Unit,
    bookmarkedIds: Set<String>,
    onToggleBookmark: (String) -> Unit
) {
    if (flashcards.isEmpty()) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("No flashcards available")
        }
        return
    }

    val card = flashcards[currentIndex.coerceIn(0, flashcards.size - 1)]
    val isBookmarked = bookmarkedIds.contains(card.id)

    // Flip animation angle
    val rotation by animateFloatAsState(
        targetValue = if (isFlipped) 180f else 0f,
        animationSpec = tween(durationMillis = 400, easing = FastOutSlowInEasing),
        label = "flashcard_flip"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Header info: Card Counter & Chapter Title
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = if (medium == Medium.ENGLISH)
                        "Card ${currentIndex + 1} of ${flashcards.size}"
                    else
                        "कार्ड ${currentIndex + 1} पैकी ${flashcards.size}",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = BluePrimary
                )
                Text(
                    text = if (medium == Medium.ENGLISH) card.chapterTitleEn else card.chapterTitleMr,
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            IconButton(onClick = { onToggleBookmark(card.id) }) {
                Icon(
                    imageVector = if (isBookmarked) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                    contentDescription = "Bookmark Flashcard",
                    tint = if (isBookmarked) AccentAmber else MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Interactive 3D Flip Card
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .graphicsLayer {
                    rotationY = rotation
                    cameraDistance = 12f * density
                }
                .clickable { onFlip() }
                .testTag("flashcard_flip_card"),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = if (isFlipped) Color(0xFFF0F9FF) else MaterialTheme.colorScheme.surface
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
            border = androidx.compose.foundation.BorderStroke(
                width = 2.dp,
                color = if (isFlipped) BluePrimary else LightBlueBorder
            )
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                contentAlignment = Alignment.Center
            ) {
                if (rotation <= 90f) {
                    // FRONT OF CARD
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = LightBlueContainer
                        ) {
                            Text(
                                text = if (medium == Medium.ENGLISH) card.tagEn else card.tagMr,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = BluePrimaryVariant,
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                            )
                        }

                        Spacer(modifier = Modifier.height(20.dp))

                        Text(
                            text = if (medium == Medium.ENGLISH) card.frontEn else card.frontMr,
                            style = MaterialTheme.typography.headlineSmall,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onSurface,
                            lineHeight = 32.sp
                        )

                        Spacer(modifier = Modifier.height(24.dp))

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .clip(RoundedCornerShape(20.dp))
                                .background(LightBlueContainer.copy(alpha = 0.5f))
                                .padding(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Flip,
                                contentDescription = null,
                                tint = BluePrimary,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = if (medium == Medium.ENGLISH) "Tap card to reveal formula" else "उत्तर / सूत्र पाहण्यासाठी टॅप करा",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = BluePrimary
                            )
                        }
                    }
                } else {
                    // BACK OF CARD (Rotated back to readable)
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.graphicsLayer { rotationY = 180f }
                    ) {
                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = BluePrimary
                        ) {
                            Text(
                                text = if (medium == Medium.ENGLISH) "Formula & Breakdown" else "सविस्तर सूत्र व स्पष्टीकरण",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                            )
                        }

                        Spacer(modifier = Modifier.height(20.dp))

                        Text(
                            text = if (medium == Medium.ENGLISH) card.backEn else card.backMr,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onSurface,
                            lineHeight = 26.sp
                        )

                        Spacer(modifier = Modifier.height(24.dp))

                        Text(
                            text = if (medium == Medium.ENGLISH) "Tap again to flip back" else "परत फिरवण्यासाठी टॅप करा",
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Navigation Controls: Prev, Flip, Next
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedButton(
                onClick = onPrev,
                shape = RoundedCornerShape(12.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, BluePrimary),
                modifier = Modifier.testTag("flashcard_prev_btn")
            ) {
                Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Previous")
                Spacer(modifier = Modifier.width(4.dp))
                Text(if (medium == Medium.ENGLISH) "Prev" else "मागे")
            }

            Button(
                onClick = onFlip,
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = BluePrimary),
                modifier = Modifier.testTag("flashcard_flip_btn")
            ) {
                Icon(Icons.Default.Flip, contentDescription = null, modifier = Modifier.size(16.dp))
                Spacer(modifier = Modifier.width(6.dp))
                Text(if (medium == Medium.ENGLISH) "Flip" else "उलटा")
            }

            OutlinedButton(
                onClick = onNext,
                shape = RoundedCornerShape(12.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, BluePrimary),
                modifier = Modifier.testTag("flashcard_next_btn")
            ) {
                Text(if (medium == Medium.ENGLISH) "Next" else "पुढे")
                Spacer(modifier = Modifier.width(4.dp))
                Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = "Next")
            }
        }
    }
}

@Composable
fun QuizSection(
    quizQuestions: List<QuizQuestion>,
    medium: Medium,
    quizState: QuizUiState,
    onSelectOption: (Int) -> Unit,
    onSubmitAnswer: (Int) -> Unit,
    onNextQuestion: () -> Unit,
    onReset: () -> Unit
) {
    if (quizQuestions.isEmpty()) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("No quiz questions available")
        }
        return
    }

    // Finished Screen
    if (quizState.isQuizCompleted) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
                .testTag("quiz_completed_view"),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .size(90.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFFFF8E1)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.EmojiEvents,
                    contentDescription = "Trophy",
                    tint = AccentAmber,
                    modifier = Modifier.size(54.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = if (medium == Medium.ENGLISH) "Quiz Completed!" else "चाचणी पूर्ण झाली!",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = if (medium == Medium.ENGLISH)
                    "Your Score: ${quizState.score} / ${quizQuestions.size}"
                else
                    "तुमचे गुण: ${quizState.score} / ${quizQuestions.size}",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = BluePrimary
            )

            Spacer(modifier = Modifier.height(8.dp))

            val feedback = when {
                quizState.score == 5 -> if (medium == Medium.ENGLISH) "Outstanding! Excellent SSC Board Preparation!" else "उत्कृष्ट! १० वी बोर्ड परीक्षेची पूर्ण तयारी!"
                quizState.score >= 3 -> if (medium == Medium.ENGLISH) "Good Job! Revise tricky points to get 5/5." else "छान! पूर्ण ५ गुणांसाठी एकदा पुन्हा उजळणी करा."
                else -> if (medium == Medium.ENGLISH) "Keep practicing! Review chapter notes and try again." else "प्रयत्न चालू ठेवा! धड्याच्या नोंदी वाचून पुन्हा चाचणी द्या."
            }

            Text(
                text = feedback,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(28.dp))

            Button(
                onClick = onReset,
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(containerColor = BluePrimary),
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .testTag("quiz_retry_btn")
            ) {
                Icon(Icons.Default.Refresh, contentDescription = null)
                Spacer(modifier = Modifier.width(8.dp))
                Text(if (medium == Medium.ENGLISH) "Retake Quiz" else "पुन्हा चाचणी द्या")
            }
        }
        return
    }

    val currentIdx = quizState.currentQuestionIndex.coerceIn(0, quizQuestions.size - 1)
    val question = quizQuestions[currentIdx]
    val options = if (medium == Medium.ENGLISH) question.optionsEn else question.optionsMr
    val explanation = if (medium == Medium.ENGLISH) question.explanationEn else question.explanationMr
    val qText = if (medium == Medium.ENGLISH) question.questionEn else question.questionMr

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .testTag("quiz_active_view"),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            // Progress Bar & Header
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = if (medium == Medium.ENGLISH)
                            "Question ${currentIdx + 1} of ${quizQuestions.size}"
                        else
                            "प्रश्न ${currentIdx + 1} पैकी ${quizQuestions.size}",
                        fontWeight = FontWeight.Bold,
                        color = BluePrimary,
                        fontSize = 13.sp
                    )
                    Text(
                        text = if (medium == Medium.ENGLISH)
                            "Score: ${quizState.score}"
                        else
                            "गुण: ${quizState.score}",
                        fontWeight = FontWeight.Bold,
                        color = SuccessGreen,
                        fontSize = 13.sp
                    )
                }
                Spacer(modifier = Modifier.height(6.dp))
                LinearProgressIndicator(
                    progress = { (currentIdx + 1).toFloat() / quizQuestions.size.toFloat() },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(6.dp)
                        .clip(RoundedCornerShape(3.dp)),
                    color = BluePrimary,
                    trackColor = LightBlueContainer
                )
            }
        }

        item {
            // Question Card
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, LightBlueBorder),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Surface(
                        shape = RoundedCornerShape(6.dp),
                        color = LightBlueContainer
                    ) {
                        Text(
                            text = if (medium == Medium.ENGLISH) question.chapterTitleEn else question.chapterTitleMr,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = BluePrimaryVariant,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = qText,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface,
                        lineHeight = 24.sp
                    )
                }
            }
        }

        // 4 Options
        items(options.size) { optIdx ->
            val isSelected = quizState.selectedOptionIndex == optIdx
            val isSubmitted = quizState.isAnswerSubmitted
            val isCorrect = optIdx == question.correctIndex

            val backgroundColor = when {
                !isSubmitted && isSelected -> LightBlueContainer
                isSubmitted && isCorrect -> Color(0xFFE8F5E9)
                isSubmitted && isSelected && !isCorrect -> Color(0xFFFFEBEE)
                else -> MaterialTheme.colorScheme.surface
            }

            val borderColor = when {
                !isSubmitted && isSelected -> BluePrimary
                isSubmitted && isCorrect -> SuccessGreen
                isSubmitted && isSelected && !isCorrect -> ErrorRed
                else -> LightBlueBorder
            }

            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .border(1.5.dp, borderColor, RoundedCornerShape(12.dp))
                    .clickable(enabled = !isSubmitted) { onSelectOption(optIdx) }
                    .testTag("quiz_option_$optIdx"),
                color = backgroundColor,
                shape = RoundedCornerShape(12.dp)
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(28.dp)
                            .clip(CircleShape)
                            .background(
                                when {
                                    isSubmitted && isCorrect -> SuccessGreen
                                    isSubmitted && isSelected && !isCorrect -> ErrorRed
                                    isSelected -> BluePrimary
                                    else -> LightBlueContainer
                                }
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        if (isSubmitted && isCorrect) {
                            Icon(Icons.Default.Check, contentDescription = null, tint = Color.White, modifier = Modifier.size(16.dp))
                        } else if (isSubmitted && isSelected && !isCorrect) {
                            Icon(Icons.Default.Close, contentDescription = null, tint = Color.White, modifier = Modifier.size(16.dp))
                        } else {
                            Text(
                                text = ('A' + optIdx).toString(),
                                fontWeight = FontWeight.Bold,
                                fontSize = 13.sp,
                                color = if (isSelected) Color.White else BluePrimary
                            )
                        }
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Text(
                        text = options[optIdx],
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = if (isSelected || (isSubmitted && isCorrect)) FontWeight.Bold else FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }

        // Explanation & Next Button
        item {
            if (quizState.isAnswerSubmitted) {
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    color = Color(0xFFE8F5E9),
                    border = androidx.compose.foundation.BorderStroke(1.dp, SuccessGreen)
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.AutoAwesome,
                                contentDescription = null,
                                tint = SuccessGreen,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = if (medium == Medium.ENGLISH) "Explanation:" else "स्पष्टीकरण:",
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                color = SuccessGreen
                            )
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = explanation,
                            fontSize = 12.sp,
                            color = Color(0xFF1B5E20),
                            lineHeight = 18.sp
                        )
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                Button(
                    onClick = onNextQuestion,
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("quiz_next_btn"),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = BluePrimary)
                ) {
                    Text(
                        text = if (currentIdx == quizQuestions.size - 1)
                            (if (medium == Medium.ENGLISH) "View Final Result" else "अंतिम निकाल पहा")
                        else
                            (if (medium == Medium.ENGLISH) "Next Question" else "पुढील प्रश्न"),
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null)
                }
            } else {
                Button(
                    onClick = { onSubmitAnswer(question.correctIndex) },
                    enabled = quizState.selectedOptionIndex != null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("quiz_submit_btn"),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = BluePrimary)
                ) {
                    Text(
                        text = if (medium == Medium.ENGLISH) "Submit Answer" else "उत्तर तपासा",
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}
