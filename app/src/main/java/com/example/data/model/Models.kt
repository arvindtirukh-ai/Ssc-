package com.example.data.model

enum class Medium(val displayName: String, val shortName: String) {
    ENGLISH("English Medium", "English"),
    MARATHI("मराठी माध्यम", "मराठी")
}

enum class SubjectType(val id: String, val titleEn: String, val titleMr: String) {
    SCIENCE("science", "Science & Tech", "विज्ञान आणि तंत्रज्ञान"),
    MATHEMATICS("mathematics", "Mathematics", "गणित"),
    SOCIAL_SCIENCE("social_science", "Social Science", "सामाजिक शास्त्रे"),
    ENGLISH("english", "English", "इंग्रजी")
}

enum class SubjectSection(val titleEn: String, val titleMr: String) {
    CHAPTER_NOTES("Chapter Notes", "धडा नोंदी"),
    IMP_PYQS("10-Year IMP PYQs", "१० वर्षांचे प्रश्न (PYQs)"),
    FORMULA_QUIZ("Formula & Quiz", "सूत्रे आणि क्विझ")
}

data class ChapterNote(
    val id: String,
    val chapterNumber: Int,
    val chapterTitleEn: String,
    val chapterTitleMr: String,
    val summaryEn: String,
    val summaryMr: String,
    val keyPointsEn: List<String>,
    val keyPointsMr: List<String>,
    val importantFormulasLawsEn: List<String> = emptyList(),
    val importantFormulasLawsMr: List<String> = emptyList(),
    val examWeightageMarks: String = "4-6 Marks"
)

data class PYQuestion(
    val id: String,
    val chapterNumber: Int,
    val chapterTitleEn: String,
    val chapterTitleMr: String,
    val yearTag: String,          // e.g. "March 2024", "July 2023", "March 2020", "March 2017", "Model 2026"
    val yearInt: Int,             // e.g. 2024
    val marks: Int,               // 1, 2, 3, 4, 5
    val questionType: String,     // "MCQ", "Short Answer", "Give Reason / Proof", "Numerical / Long"
    val questionEn: String,
    val questionMr: String,
    val answerEn: String,
    val answerMr: String,
    val stepByStepEn: List<String> = emptyList(),
    val stepByStepMr: List<String> = emptyList(),
    val examinerTipEn: String = "",
    val examinerTipMr: String = ""
)

data class Flashcard(
    val id: String,
    val chapterTitleEn: String,
    val chapterTitleMr: String,
    val frontEn: String,
    val frontMr: String,
    val backEn: String,
    val backMr: String,
    val tagEn: String = "Formula",
    val tagMr: String = "सूत्र"
)

data class QuizQuestion(
    val id: String,
    val chapterTitleEn: String,
    val chapterTitleMr: String,
    val questionEn: String,
    val questionMr: String,
    val optionsEn: List<String>,
    val optionsMr: List<String>,
    val correctIndex: Int,
    val explanationEn: String,
    val explanationMr: String
)

data class SearchResultItem(
    val id: String,
    val subject: SubjectType,
    val section: SubjectSection,
    val title: String,
    val subtitle: String,
    val previewText: String,
    val yearTag: String? = null,
    val marks: Int? = null
)
