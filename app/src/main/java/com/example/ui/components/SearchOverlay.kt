package com.example.ui.components

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.Flip
import androidx.compose.material.icons.filled.HistoryEdu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.Medium
import com.example.data.model.SearchResultItem
import com.example.data.model.SubjectSection
import com.example.ui.theme.AccentAmber
import com.example.ui.theme.BluePrimary
import com.example.ui.theme.LightBlueBorder
import com.example.ui.theme.LightBlueContainer

@Composable
fun SearchResultsOverlay(
    results: List<SearchResultItem>,
    medium: Medium,
    searchQuery: String,
    onResultClick: (SearchResultItem) -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .fillMaxSize()
            .testTag("search_results_overlay"),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = if (medium == Medium.ENGLISH)
                        "Search Results for '$searchQuery'"
                    else
                        "'$searchQuery' चे शोध निकाल",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = BluePrimary
                )
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = LightBlueContainer
                ) {
                    Text(
                        text = "${results.size} ${if (medium == Medium.ENGLISH) "found" else "सापडले"}",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = BluePrimary,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            if (results.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = if (medium == Medium.ENGLISH)
                            "No matching notes, formulas, or PYQs found.\nTry keywords like 'Newton', 'Pythagoras', 'RTI', 'Cramer', '2024'."
                        else
                            "कोणतीही जुळणारी नोंद किंवा प्रश्न आढळला नाही.\n'न्यूटन', 'पायथागोरस', '२०२४' अशा शब्दांनी शोधा.",
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 13.sp,
                        lineHeight = 20.sp
                    )
                }
            } else {
                LazyColumn(
                    modifier = Modifier.weight(1f),
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    contentPadding = PaddingValues(bottom = 24.dp)
                ) {
                    items(results, key = { "${it.subject.id}_${it.section.name}_${it.id}" }) { item ->
                        SearchResultCard(
                            item = item,
                            medium = medium,
                            onClick = { onResultClick(item) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun SearchResultCard(
    item: SearchResultItem,
    medium: Medium,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .border(1.dp, LightBlueBorder, RoundedCornerShape(14.dp))
            .clickable { onClick() }
            .testTag("search_result_item_${item.id}"),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(38.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(LightBlueContainer),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = when (item.section) {
                        SubjectSection.CHAPTER_NOTES -> Icons.Default.Description
                        SubjectSection.IMP_PYQS -> Icons.Default.HistoryEdu
                        SubjectSection.FORMULA_QUIZ -> Icons.Default.Flip
                    },
                    contentDescription = null,
                    tint = BluePrimary,
                    modifier = Modifier.size(20.dp)
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = item.subtitle,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = BluePrimary
                    )
                    if (item.yearTag != null) {
                        Spacer(modifier = Modifier.width(6.dp))
                        Surface(
                            shape = RoundedCornerShape(4.dp),
                            color = Color(0xFFFFF8E1)
                        ) {
                            Text(
                                text = item.yearTag,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFFE65100),
                                modifier = Modifier.padding(horizontal = 4.dp, vertical = 1.dp)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = item.title,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(modifier = Modifier.height(3.dp))

                Text(
                    text = item.previewText,
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    lineHeight = 16.sp
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "Go",
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.size(18.dp)
            )
        }
    }
}
