package com.example.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.Medium
import com.example.data.model.PYQuestion
import com.example.ui.theme.AccentAmber
import com.example.ui.theme.BluePrimary
import com.example.ui.theme.BluePrimaryVariant
import com.example.ui.theme.LightBlueBorder
import com.example.ui.theme.LightBlueContainer
import com.example.ui.theme.SuccessGreen

@Composable
fun PYQScreen(
    pyqs: List<PYQuestion>,
    medium: Medium,
    selectedYear: Int?,
    onSelectYear: (Int?) -> Unit,
    expandedPyqId: String?,
    onToggleExpand: (String) -> Unit,
    bookmarkedIds: Set<String>,
    onToggleBookmark: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val years = listOf(null, 2026, 2025, 2024, 2023, 2022, 2021, 2020, 2019, 2018, 2017)

    Column(modifier = modifier.fillMaxSize()) {
        // Horizontal Year Filter Bar
        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = MaterialTheme.colorScheme.surface,
            tonalElevation = 1.dp
        ) {
            Column(modifier = Modifier.padding(vertical = 8.dp)) {
                Text(
                    text = if (medium == Medium.ENGLISH)
                        "10-Year IMP Past Papers (2017 - 2026)"
                    else
                        "१० वर्षांचे महत्त्वाचे बोर्ड प्रश्न (२०१७ - २०२६)",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = BluePrimary,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 2.dp)
                )

                LazyRow(
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.testTag("pyq_year_filter_row")
                ) {
                    items(years) { year ->
                        val isSelected = (selectedYear == year)
                        val label = if (year == null) {
                            if (medium == Medium.ENGLISH) "All (2017-26)" else "सर्व (२०१७-२६)"
                        } else {
                            "$year"
                        }

                        FilterChip(
                            selected = isSelected,
                            onClick = { onSelectYear(year) },
                            label = {
                                Text(
                                    text = label,
                                    fontSize = 12.sp,
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
                                )
                            },
                            colors = FilterChipDefaults.filterChipColors(
                                selectedContainerColor = BluePrimary,
                                selectedLabelColor = Color.White,
                                containerColor = LightBlueContainer.copy(alpha = 0.5f),
                                labelColor = MaterialTheme.colorScheme.onSurface
                            ),
                            border = FilterChipDefaults.filterChipBorder(
                                enabled = true,
                                selected = isSelected,
                                borderColor = if (isSelected) BluePrimary else LightBlueBorder
                            )
                        )
                    }
                }
            }
        }

        // List of PYQ Cards
        if (pyqs.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(32.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = if (medium == Medium.ENGLISH)
                        "No past questions found for selected year filter."
                    else
                        "निवडलेल्या वर्षासाठी कोणतेही प्रश्न आढळले नाहीत.",
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .testTag("pyq_list"),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                items(pyqs, key = { it.id }) { pyq ->
                    val isExpanded = expandedPyqId == pyq.id
                    val isBookmarked = bookmarkedIds.contains(pyq.id)

                    PYQCard(
                        pyq = pyq,
                        medium = medium,
                        isExpanded = isExpanded,
                        isBookmarked = isBookmarked,
                        onToggleExpand = { onToggleExpand(pyq.id) },
                        onToggleBookmark = { onToggleBookmark(pyq.id) }
                    )
                }
            }
        }
    }
}

@Composable
fun PYQCard(
    pyq: PYQuestion,
    medium: Medium,
    isExpanded: Boolean,
    isBookmarked: Boolean,
    onToggleExpand: () -> Unit,
    onToggleBookmark: () -> Unit,
    modifier: Modifier = Modifier
) {
    val rotationState by animateFloatAsState(targetValue = if (isExpanded) 180f else 0f, label = "rotate")
    val question = if (medium == Medium.ENGLISH) pyq.questionEn else pyq.questionMr
    val answer = if (medium == Medium.ENGLISH) pyq.answerEn else pyq.answerMr
    val chTitle = if (medium == Medium.ENGLISH) pyq.chapterTitleEn else pyq.chapterTitleMr
    val steps = if (medium == Medium.ENGLISH) pyq.stepByStepEn else pyq.stepByStepMr
    val tip = if (medium == Medium.ENGLISH) pyq.examinerTipEn else pyq.examinerTipMr

    Card(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .border(
                width = if (isExpanded) 1.5.dp else 1.dp,
                color = if (isExpanded) BluePrimary else LightBlueBorder,
                shape = RoundedCornerShape(16.dp)
            )
            .clickable { onToggleExpand() }
            .testTag("pyq_card_${pyq.id}"),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = if (isExpanded) 4.dp else 1.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            // Badges row: Year Tag, Marks, Question Type, Bookmark
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                    modifier = Modifier.weight(1f)
                ) {
                    // Year badge
                    Surface(
                        shape = RoundedCornerShape(6.dp),
                        color = Color(0xFFFFF8E1),
                        border = androidx.compose.foundation.BorderStroke(1.dp, AccentAmber)
                    ) {
                        Text(
                            text = pyq.yearTag,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFE65100),
                            modifier = Modifier.padding(horizontal = 7.dp, vertical = 2.dp)
                        )
                    }

                    // Marks badge
                    Surface(
                        shape = RoundedCornerShape(6.dp),
                        color = LightBlueContainer
                    ) {
                        Text(
                            text = "${pyq.marks} ${if (medium == Medium.ENGLISH) "Marks" else "गुण"}",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = BluePrimaryVariant,
                            modifier = Modifier.padding(horizontal = 7.dp, vertical = 2.dp)
                        )
                    }

                    // Question type tag
                    Text(
                        text = "• ${pyq.questionType}",
                        fontSize = 11.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontWeight = FontWeight.Medium
                    )
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(
                        onClick = onToggleBookmark,
                        modifier = Modifier.size(34.dp)
                    ) {
                        Icon(
                            imageVector = if (isBookmarked) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                            contentDescription = "Bookmark",
                            tint = if (isBookmarked) AccentAmber else MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    IconButton(
                        onClick = onToggleExpand,
                        modifier = Modifier.size(34.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.ExpandMore,
                            contentDescription = "Toggle answer",
                            tint = BluePrimary,
                            modifier = Modifier.rotate(rotationState)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(4.dp))

            // Chapter reference
            Text(
                text = "Ch ${pyq.chapterNumber}: $chTitle",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                color = BluePrimary
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Question Text
            Text(
                text = "Q: $question",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.onSurface,
                lineHeight = 22.sp
            )

            // Solution Trigger Bar
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = if (isExpanded) Icons.Default.VisibilityOff else Icons.Default.Visibility,
                        contentDescription = null,
                        tint = BluePrimary,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = if (isExpanded)
                            (if (medium == Medium.ENGLISH) "Hide Step-by-Step Answer" else "सविस्तर उत्तर लपवा")
                        else
                            (if (medium == Medium.ENGLISH) "View Step-by-Step Answer" else "सविस्तर पायऱ्यांसह उत्तर पहा"),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = BluePrimary
                    )
                }
            }

            // Expanded Step-by-Step Solution
            AnimatedVisibility(
                visible = isExpanded,
                enter = fadeIn() + expandVertically(),
                exit = fadeOut() + shrinkVertically()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 12.dp)
                ) {
                    // Full Model Answer Box
                    Surface(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        color = LightBlueContainer.copy(alpha = 0.4f),
                        border = androidx.compose.foundation.BorderStroke(1.dp, LightBlueBorder)
                    ) {
                        Column(modifier = Modifier.padding(14.dp)) {
                            Text(
                                text = if (medium == Medium.ENGLISH) "Model Answer:" else "आदर्श उत्तर:",
                                fontWeight = FontWeight.Bold,
                                fontSize = 13.sp,
                                color = BluePrimaryVariant
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(
                                text = answer,
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurface,
                                lineHeight = 21.sp
                            )
                        }
                    }

                    // Step by step breakdown if available
                    if (steps.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = if (medium == Medium.ENGLISH) "Step-by-step marking guide:" else "पायरीनुसार गुणदान पद्धत:",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        steps.forEachIndexed { index, step ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 3.dp),
                                verticalAlignment = Alignment.Top
                            ) {
                                Icon(
                                    imageVector = Icons.Default.CheckCircle,
                                    contentDescription = null,
                                    tint = SuccessGreen,
                                    modifier = Modifier
                                        .size(16.dp)
                                        .padding(top = 2.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = step,
                                    fontSize = 13.sp,
                                    color = MaterialTheme.colorScheme.onSurface,
                                    lineHeight = 18.sp,
                                    modifier = Modifier.weight(1f)
                                )
                            }
                        }
                    }

                    // Official Examiner Tip banner
                    if (tip.isNotBlank()) {
                        Spacer(modifier = Modifier.height(10.dp))
                        Surface(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(10.dp),
                            color = Color(0xFFFFF9C4),
                            border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFFFD54F))
                        ) {
                            Row(
                                modifier = Modifier.padding(10.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Lightbulb,
                                    contentDescription = null,
                                    tint = Color(0xFFF57F17),
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Column {
                                    Text(
                                        text = if (medium == Medium.ENGLISH) "Board Examiner Tip:" else "बोर्ड परीक्षक टीप:",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 12.sp,
                                        color = Color(0xFFE65100)
                                    )
                                    Text(
                                        text = tip,
                                        fontSize = 12.sp,
                                        color = Color(0xFF3E2723),
                                        lineHeight = 16.sp
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
