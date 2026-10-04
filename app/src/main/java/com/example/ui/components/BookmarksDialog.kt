package com.example.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.Flashcard
import com.example.data.model.Medium
import com.example.data.model.PYQuestion
import com.example.ui.theme.AccentAmber
import com.example.ui.theme.BluePrimary
import com.example.ui.theme.LightBlueBorder
import com.example.ui.theme.LightBlueContainer

@Composable
fun BookmarksDialog(
    bookmarkedPyqs: List<PYQuestion>,
    bookmarkedCards: List<Flashcard>,
    medium: Medium,
    onDismiss: () -> Unit,
    onRemoveBookmark: (String) -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.85f)
            .testTag("bookmarks_dialog"),
        shape = RoundedCornerShape(20.dp),
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Bookmark,
                        contentDescription = null,
                        tint = AccentAmber
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = if (medium == Medium.ENGLISH) "Saved Bookmarks" else "जतन केलेले महत्त्वाचे मुद्दे",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                }
                IconButton(onClick = onDismiss) {
                    Icon(Icons.Default.Close, contentDescription = "Close")
                }
            }
        },
        text = {
            if (bookmarkedPyqs.isEmpty() && bookmarkedCards.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = if (medium == Medium.ENGLISH)
                            "No bookmarks yet! Tap the bookmark icon on any PYQ or formula card to save it here for rapid offline revision."
                        else
                            "अद्याप कोणतेही बुकमार्क केलेले नाही! कोणत्याही प्रश्नावरील बुकमार्क आयकॉनवर टॅप करा.",
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 13.sp
                    )
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    contentPadding = PaddingValues(vertical = 8.dp)
                ) {
                    if (bookmarkedPyqs.isNotEmpty()) {
                        item {
                            Text(
                                text = if (medium == Medium.ENGLISH) "Bookmarked PYQs (${bookmarkedPyqs.size}):" else "बुकमार्क केलेले प्रश्न (${bookmarkedPyqs.size}):",
                                fontWeight = FontWeight.Bold,
                                color = BluePrimary,
                                fontSize = 13.sp
                            )
                        }
                        items(bookmarkedPyqs, key = { "pyq_${it.id}" }) { pyq ->
                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(12.dp),
                                border = androidx.compose.foundation.BorderStroke(1.dp, LightBlueBorder),
                                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
                            ) {
                                Row(
                                    modifier = Modifier.padding(12.dp),
                                    verticalAlignment = Alignment.Top,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Column(modifier = Modifier.weight(1f)) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                                        ) {
                                            Surface(
                                                shape = RoundedCornerShape(4.dp),
                                                color = Color(0xFFFFF8E1)
                                            ) {
                                                Text(
                                                    text = pyq.yearTag,
                                                    fontSize = 10.sp,
                                                    fontWeight = FontWeight.Bold,
                                                    color = Color(0xFFE65100),
                                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                                )
                                            }
                                            Text(
                                                text = "${pyq.marks}M",
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 11.sp,
                                                color = BluePrimary
                                            )
                                        }
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(
                                            text = if (medium == Medium.ENGLISH) pyq.questionEn else pyq.questionMr,
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.Medium,
                                            lineHeight = 17.sp,
                                            color = MaterialTheme.colorScheme.onSurface
                                        )
                                    }
                                    IconButton(
                                        onClick = { onRemoveBookmark(pyq.id) },
                                        modifier = Modifier.size(28.dp)
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Bookmark,
                                            contentDescription = "Remove",
                                            tint = AccentAmber,
                                            modifier = Modifier.size(18.dp)
                                        )
                                    }
                                }
                            }
                        }
                    }

                    if (bookmarkedCards.isNotEmpty()) {
                        item {
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = if (medium == Medium.ENGLISH) "Bookmarked Formulas (${bookmarkedCards.size}):" else "बुकमार्क केलेली सूत्रे (${bookmarkedCards.size}):",
                                fontWeight = FontWeight.Bold,
                                color = BluePrimary,
                                fontSize = 13.sp
                            )
                        }
                        items(bookmarkedCards, key = { "fc_${it.id}" }) { card ->
                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(12.dp),
                                border = androidx.compose.foundation.BorderStroke(1.dp, LightBlueBorder),
                                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
                            ) {
                                Row(
                                    modifier = Modifier.padding(12.dp),
                                    verticalAlignment = Alignment.Top,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Column(modifier = Modifier.weight(1f)) {
                                        Text(
                                            text = if (medium == Medium.ENGLISH) card.frontEn else card.frontMr,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 13.sp,
                                            color = MaterialTheme.colorScheme.onSurface
                                        )
                                        Spacer(modifier = Modifier.height(2.dp))
                                        Text(
                                            text = if (medium == Medium.ENGLISH) card.backEn else card.backMr,
                                            fontSize = 11.sp,
                                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                                            lineHeight = 16.sp
                                        )
                                    }
                                    IconButton(
                                        onClick = { onRemoveBookmark(card.id) },
                                        modifier = Modifier.size(28.dp)
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Bookmark,
                                            contentDescription = "Remove",
                                            tint = AccentAmber,
                                            modifier = Modifier.size(18.dp)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        },
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text(if (medium == Medium.ENGLISH) "Close" else "बंद करा")
            }
        }
    )
}
