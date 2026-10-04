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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.example.data.model.ChapterNote
import com.example.data.model.Medium
import com.example.ui.theme.AccentAmber
import com.example.ui.theme.BluePrimary
import com.example.ui.theme.BluePrimaryVariant
import com.example.ui.theme.LightBlueBorder
import com.example.ui.theme.LightBlueContainer
import com.example.ui.theme.TextPrimaryDark

@Composable
fun ChapterNotesScreen(
    chapters: List<ChapterNote>,
    medium: Medium,
    expandedChapterId: String?,
    onToggleExpand: (String) -> Unit,
    bookmarkedIds: Set<String>,
    onToggleBookmark: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    if (chapters.isEmpty()) {
        Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = if (medium == Medium.ENGLISH) "No chapter notes available" else "कोणत्याही धड्याच्या नोंदी उपलब्ध नाहीत",
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
        return
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .testTag("chapter_notes_list"),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        items(chapters, key = { it.id }) { chapter ->
            val isExpanded = expandedChapterId == chapter.id
            val isBookmarked = bookmarkedIds.contains(chapter.id)

            ChapterCard(
                chapter = chapter,
                medium = medium,
                isExpanded = isExpanded,
                isBookmarked = isBookmarked,
                onToggleExpand = { onToggleExpand(chapter.id) },
                onToggleBookmark = { onToggleBookmark(chapter.id) }
            )
        }
    }
}

@Composable
fun ChapterCard(
    chapter: ChapterNote,
    medium: Medium,
    isExpanded: Boolean,
    isBookmarked: Boolean,
    onToggleExpand: () -> Unit,
    onToggleBookmark: () -> Unit,
    modifier: Modifier = Modifier
) {
    val rotationState by animateFloatAsState(targetValue = if (isExpanded) 180f else 0f, label = "rotate")
    val title = if (medium == Medium.ENGLISH) chapter.chapterTitleEn else chapter.chapterTitleMr
    val summary = if (medium == Medium.ENGLISH) chapter.summaryEn else chapter.summaryMr
    val points = if (medium == Medium.ENGLISH) chapter.keyPointsEn else chapter.keyPointsMr
    val formulas = if (medium == Medium.ENGLISH) chapter.importantFormulasLawsEn else chapter.importantFormulasLawsMr

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
            .testTag("chapter_card_${chapter.chapterNumber}"),
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
            // Header Row: Chapter Number, Title, Weightage badge, and Bookmark
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f)
                ) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(BluePrimary),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "${chapter.chapterNumber}",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(
                            text = title,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Surface(
                                shape = RoundedCornerShape(4.dp),
                                color = LightBlueContainer
                            ) {
                                Text(
                                    text = chapter.examWeightageMarks,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = BluePrimaryVariant,
                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                )
                            }
                            Text(
                                text = if (medium == Medium.ENGLISH) "Weightage" else "गुणभार",
                                fontSize = 11.sp,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(
                        onClick = onToggleBookmark,
                        modifier = Modifier.size(36.dp)
                    ) {
                        Icon(
                            imageVector = if (isBookmarked) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                            contentDescription = "Bookmark",
                            tint = if (isBookmarked) AccentAmber else MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    IconButton(
                        onClick = onToggleExpand,
                        modifier = Modifier.size(36.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.ExpandMore,
                            contentDescription = "Expand",
                            tint = BluePrimary,
                            modifier = Modifier.rotate(rotationState)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Short summary always visible
            Text(
                text = summary,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                lineHeight = 19.sp
            )

            // Expanded content: Revision Points & Formulas
            AnimatedVisibility(
                visible = isExpanded,
                enter = fadeIn() + expandVertically(),
                exit = fadeOut() + shrinkVertically()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 14.dp)
                ) {
                    // Key Revision Points Section
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.AutoAwesome,
                            contentDescription = null,
                            tint = BluePrimary,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = if (medium == Medium.ENGLISH) "Quick Revision Points" else "महत्त्वाचे उजळणी मुद्दे",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = BluePrimary
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    points.forEachIndexed { index, point ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp),
                            verticalAlignment = Alignment.Top
                        ) {
                            Box(
                                modifier = Modifier
                                    .padding(top = 2.dp)
                                    .size(18.dp)
                                    .clip(CircleShape)
                                    .background(LightBlueContainer),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "${index + 1}",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = BluePrimary
                                )
                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = point,
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurface,
                                lineHeight = 20.sp,
                                modifier = Modifier.weight(1f)
                            )
                        }
                    }

                    // Key Formulas / Laws Box if available
                    if (formulas.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(14.dp))
                        Surface(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp),
                            color = LightBlueContainer.copy(alpha = 0.6f),
                            border = androidx.compose.foundation.BorderStroke(1.dp, LightBlueBorder)
                        ) {
                            Column(
                                modifier = Modifier.padding(12.dp)
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        imageVector = Icons.Default.MenuBook,
                                        contentDescription = null,
                                        tint = BluePrimaryVariant,
                                        modifier = Modifier.size(16.dp)
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text(
                                        text = if (medium == Medium.ENGLISH) "Key Formulas & Board Laws" else "महत्त्वाची सूत्रे व नियम",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 13.sp,
                                        color = BluePrimaryVariant
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                formulas.forEach { formula ->
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier.padding(vertical = 2.dp)
                                    ) {
                                        Text(
                                            text = "•",
                                            fontWeight = FontWeight.Bold,
                                            color = BluePrimary,
                                            modifier = Modifier.padding(horizontal = 4.dp)
                                        )
                                        Text(
                                            text = formula,
                                            style = MaterialTheme.typography.bodyMedium,
                                            fontWeight = FontWeight.Medium,
                                            color = MaterialTheme.colorScheme.onSurface
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
}
