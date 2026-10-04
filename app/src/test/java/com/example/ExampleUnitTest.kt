package com.example

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.example.data.model.Medium
import com.example.data.model.SubjectType
import com.example.data.repository.EnglishData
import com.example.data.repository.MathsData
import com.example.data.repository.ScienceData
import com.example.data.repository.SocialScienceData
import com.example.data.repository.StudyRepository
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [34])
class ExampleUnitTest {

    private lateinit var repository: StudyRepository

    @Before
    fun setup() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        repository = StudyRepository(context)
    }

    @Test
    fun testAllSubjectsHaveChaptersAndPYQs() {
        SubjectType.values().forEach { subject ->
            val chapters = repository.getChapters(subject)
            val pyqs = repository.getPYQs(subject)
            val flashcards = repository.getFlashcards(subject)
            val quiz = repository.getQuizQuestions(subject)

            assertTrue("Subject $subject should have chapters", chapters.isNotEmpty())
            assertTrue("Subject $subject should have PYQs", pyqs.isNotEmpty())
            assertTrue("Subject $subject should have flashcards", flashcards.isNotEmpty())
            assertEquals("Subject $subject should have exactly 5 quiz questions", 5, quiz.size)
        }
    }

    @Test
    fun testPYQsSpanFrom2017To2026() {
        val allPyqs = SubjectType.values().flatMap { repository.getPYQs(it) }
        val years = allPyqs.map { it.yearInt }.toSet()

        // Verify years 2017 through 2026 are represented
        for (year in 2017..2026) {
            assertTrue("Past Year Questions should include year $year", years.contains(year))
        }
    }

    @Test
    fun testOfflineKeywordSearch() {
        val resultsEnglish = repository.searchAll("Newton", Medium.ENGLISH)
        assertTrue("Search for 'Newton' in English should yield results", resultsEnglish.isNotEmpty())

        val resultsMarathi = repository.searchAll("गुरुत्वाकर्षण", Medium.MARATHI)
        assertTrue("Search for 'गुरुत्वाकर्षण' in Marathi should yield results", resultsMarathi.isNotEmpty())

        val resultsYear = repository.searchAll("2024", Medium.ENGLISH)
        assertTrue("Search for '2024' should find 2024 PYQs", resultsYear.isNotEmpty())
    }

    @Test
    fun testBookmarkToggle() {
        val testId = "test_bookmark_id_1"
        assertFalse(repository.bookmarkedIds.value.contains(testId))

        repository.toggleBookmark(testId)
        assertTrue(repository.bookmarkedIds.value.contains(testId))

        repository.toggleBookmark(testId)
        assertFalse(repository.bookmarkedIds.value.contains(testId))
    }

    @Test
    fun testMediumSwitch() {
        repository.setMedium(Medium.MARATHI)
        assertEquals(Medium.MARATHI, repository.currentMedium.value)

        repository.setMedium(Medium.ENGLISH)
        assertEquals(Medium.ENGLISH, repository.currentMedium.value)
    }
}
