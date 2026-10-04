package com.example.data.repository

import com.example.data.model.ChapterNote
import com.example.data.model.Flashcard
import com.example.data.model.PYQuestion
import com.example.data.model.QuizQuestion

object MathsData {

    val chapters = listOf(
        ChapterNote(
            id = "math_ch1",
            chapterNumber = 1,
            chapterTitleEn = "Linear Equations in Two Variables",
            chapterTitleMr = "दोन चलांमधील रेषीय समीकरणे",
            summaryEn = "General form ax + by + c = 0. Solving methods: Elimination by equating coefficients, Cramer's Determinant Rule, and Graphical Method.",
            summaryMr = "सामान्य रूप ax + by + c = ०. सोडवण्याच्या पद्धती: सहगुणक समान करून चलाचा लोप, क्रॅमर्सची पद्धत (निश्चयक पद्धत) आणि आलेख पद्धत.",
            keyPointsEn = listOf(
                "Standard Form: ax + by + c = 0 (where a, b, c are real numbers and a, b ≠ 0 simultaneously).",
                "Determinant value: |a  b / c  d| = ad - bc.",
                "Cramer's Rule: x = D_x / D, y = D_y / D, provided D ≠ 0.",
                "Consistent with unique solution: a₁/a₂ ≠ b₁/b₂ (intersecting lines).",
                "Infinite solutions: a₁/a₂ = b₁/b₂ = c₁/c₂ (coincident lines).",
                "No solution: a₁/a₂ = b₁/b₂ ≠ c₁/c₂ (parallel lines)."
            ),
            keyPointsMr = listOf(
                "सामान्य रूप: ax + by + c = ० (येथे a, b, c वास्तव संख्या असून a, b एकाच वेळी शून्य नसतात).",
                "निश्चयकाची किंमत: |a  b / c  d| = ad - bc.",
                "क्रॅमर्सची पद्धत: x = D_x / D, y = D_y / D, (येथे D ≠ ०).",
                "एकमेव उकल (एकसंपाती रेषा): a₁/a₂ ≠ b₁/b₂.",
                "अनंत उकली (संपाती रेषा): a₁/a₂ = b₁/b₂ = c₁/c₂.",
                "उकल नाही (समांतर रेषा): a₁/a₂ = b₁/b₂ ≠ c₁/c₂."
            ),
            importantFormulasLawsEn = listOf(
                "D = |a₁ b₁; a₂ b₂| = a₁b₂ - a₂b₁",
                "D_x = |c₁ b₁; c₂ b₂| = c₁b₂ - c₂b₁",
                "D_y = |a₁ c₁; a₂ c₂| = a₁c₂ - a₂c₁",
                "x = D_x / D, y = D_y / D"
            ),
            importantFormulasLawsMr = listOf(
                "D = |a₁ b₁; a₂ b₂| = a₁b₂ - a₂b₁",
                "D_x = |c₁ b₁; c₂ b₂| = c₁b₂ - c₂b₁",
                "D_y = |a₁ c₁; a₂ c₂| = a₁c₂ - a₂c₁",
                "x = D_x / D, y = D_y / D"
            ),
            examWeightageMarks = "8-10 Marks"
        ),
        ChapterNote(
            id = "math_ch2",
            chapterNumber = 2,
            chapterTitleEn = "Quadratic Equations",
            chapterTitleMr = "वर्गसमीकरणे",
            summaryEn = "General form ax² + bx + c = 0 (a ≠ 0). Solution by Factorization, Completing the Square, and Formula Method. Nature of roots using Discriminant (Δ).",
            summaryMr = "सामान्य रूप ax² + bx + c = ० (a ≠ ०). सोडवण्याच्या पद्धती: अवयव पद्धत, पूर्ण वर्ग पद्धत, सूत्र पद्धत. विवेचकावरून (Δ) मुळांचे स्वरूप ठरवणे.",
            keyPointsEn = listOf(
                "Standard Form: ax² + bx + c = 0, where a ≠ 0.",
                "Quadratic Formula: x = [-b ± √(b² - 4ac)] / (2a).",
                "Discriminant: Δ = b² - 4ac.",
                "Nature of roots: If Δ = 0 (roots are real and equal); If Δ > 0 (roots are real and unequal); If Δ < 0 (roots are not real).",
                "Relation between roots α, β and coefficients: α + β = -b/a, α * β = c/a.",
                "Equation with given roots: x² - (α + β)x + αβ = 0."
            ),
            keyPointsMr = listOf(
                "सामान्य रूप: ax² + bx + c = ०, जिथे a ≠ ०.",
                "सूत्र पद्धत: x = [-b ± √(b² - ४ac)] / (२a).",
                "विवेचक (Discriminant): Δ = b² - ४ac.",
                "मुळांचे स्वरूप: जर Δ = ० (मुळे वास्तव व समान); जर Δ > ० (मुळे वास्तव व असमान); जर Δ < ० (मुळे वास्तव संख्या नाहीत).",
                "मुळांमधील संबंध: α + β = -b/a, α * β = c/a.",
                "मुळांवरून समीकरण: x² - (α + β)x + αβ = ०."
            ),
            importantFormulasLawsEn = listOf(
                "x = [-b ± √(b² - 4ac)] / 2a",
                "Δ = b² - 4ac",
                "α + β = -b/a, αβ = c/a"
            ),
            importantFormulasLawsMr = listOf(
                "x = [-b ± √(b² - ४ac)] / २a",
                "Δ = b² - ४ac",
                "α + β = -b/a, αβ = c/a"
            ),
            examWeightageMarks = "7-9 Marks"
        ),
        ChapterNote(
            id = "math_ch3",
            chapterNumber = 3,
            chapterTitleEn = "Arithmetic Progression (A.P.)",
            chapterTitleMr = "अंकगणिती श्रेढी (A.P.)",
            summaryEn = "Sequence with constant common difference d. Formula for n-th term (t_n) and sum of first n terms (S_n). Practical applications in word problems.",
            summaryMr = "क्रमागत पदांमधील फरक 'd' स्थिर असणारी क्रमिका. n वे पद (t_n) आणि पहिल्या n पदांची बेरीज (S_n) काढण्याची सूत्रे.",
            keyPointsEn = listOf(
                "First term is 'a', common difference d = t_{n} - t_{n-1}.",
                "n-th term formula: t_n = a + (n - 1)d.",
                "Sum of n terms: S_n = (n/2) * [2a + (n - 1)d] = (n/2) * [t₁ + t_n].",
                "Three consecutive terms in A.P.: (a - d), a, (a + d).",
                "Four consecutive terms: (a - 3d), (a - d), (a + d), (a + 3d)."
            ),
            keyPointsMr = listOf(
                "पहिले पद 'a', सामान्य फरक d = t_{n} - t_{n-१}.",
                "n वे पद काढण्याचे सूत्र: t_n = a + (n - १)d.",
                "पहिल्या n पदांची बेरीज: S_n = (n/२) * [२a + (n - १)d] किंवा S_n = (n/२) * [पहिले पद + शेवटचे पद].",
                "तीन क्रमागत पदे: (a - d), a, (a + d).",
                "चार क्रमागत पदे: (a - ३d), (a - d), (a + d), (a + ३d)."
            ),
            importantFormulasLawsEn = listOf(
                "t_n = a + (n - 1)d",
                "S_n = (n / 2) [2a + (n - 1)d]",
                "S_n = (n / 2) [t₁ + t_n]"
            ),
            importantFormulasLawsMr = listOf(
                "t_n = a + (n - १)d",
                "S_n = (n / २) [२a + (n - १)d]",
                "S_n = (n / २) [t₁ + t_n]"
            ),
            examWeightageMarks = "6-8 Marks"
        ),
        ChapterNote(
            id = "math_ch4",
            chapterNumber = 4,
            chapterTitleEn = "Similarity & Pythagoras Theorem",
            chapterTitleMr = "समरूपता आणि पायथागोरसचे प्रमेय",
            summaryEn = "Ratio of areas of two triangles, Basic Proportionality Theorem (BPT), Tests of similarity (AAA, SAS, SSS), Pythagoras theorem and Geometric Mean theorem.",
            summaryMr = "दोन त्रिकोणांच्या क्षेत्रफळांचे गुणोत्तर, प्रमाणाचे मूलभूत प्रमेय (BPT), समरूपतेच्या कसोट्या, पायथागोरसचे प्रमेय आणि भूमितीमध्याचे प्रमेय.",
            keyPointsEn = listOf(
                "Ratio of areas of two triangles = (b₁ × h₁) / (b₂ × h₂).",
                "If heights are equal: A₁ / A₂ = b₁ / b₂. If bases are equal: A₁ / A₂ = h₁ / h₂.",
                "Basic Proportionality Theorem (BPT): If a line is parallel to a side of a triangle intersecting other two sides, it divides them in the same ratio: AP/PB = AQ/QC.",
                "Theorem of Areas of Similar Triangles: A₁ / A₂ = (s₁ / s₂)².",
                "Pythagoras Theorem: In a right-angled triangle, (Hypotenuse)² = (Base)² + (Height)².",
                "Geometric Mean Theorem: In a right angled triangle, altitude on hypotenuse BD² = AD × DC."
            ),
            keyPointsMr = listOf(
                "दोन त्रिकोणांच्या क्षेत्रफळांचे गुणोत्तर = (पाया₁ × उंची₁) / (पाया₂ × उंची₂).",
                "उंची समान असल्यास: A₁ / A₂ = b₁ / b₂. पाया समान असल्यास: A₁ / A₂ = h₁ / h₂.",
                "प्रमाणाचे मूलभूत प्रमेय (BPT): त्रिकोणाच्या एका बाजूला समांतर असणारी रेषा इतर दोन बाजूंना प्रमाणात विभागते: AP/PB = AQ/QC.",
                "समरूप त्रिकोणांच्या क्षेत्रफळांचे प्रमेय: A₁ / A₂ = (बाजू₁ / बाजू₂)². क्षेत्रफळांचे गुणोत्तर बाजूंच्या वर्गांच्या गुणोत्तराइतके असते.",
                "पायथागोरसचे प्रमेय: काटकोन त्रिकोणात, (कर्ण)² = (पाया)² + (उंची)².",
                "भूमितीमध्याचे प्रमेय: कर्णावर काढलेल्या शिरोलंबाचा वर्ग: BD² = AD × DC."
            ),
            importantFormulasLawsEn = listOf(
                "c² = a² + b² (Pythagoras)",
                "BD² = AD × DC (Geometric Mean)",
                "A₁ / A₂ = (side₁)² / (side₂)²"
            ),
            importantFormulasLawsMr = listOf(
                "कर्ण² = बाजू₁² + बाजू₂² (पायथागोरस)",
                "BD² = AD × DC (भूमितीमध्य)",
                "A₁ / A₂ = (बाजू₁)² / (बाजू₂)²"
            ),
            examWeightageMarks = "10-12 Marks"
        ),
        ChapterNote(
            id = "math_ch5",
            chapterNumber = 5,
            chapterTitleEn = "Trigonometry & Coordinate Geometry",
            chapterTitleMr = "त्रिकोणमिती आणि निर्देशांक भूमिती",
            summaryEn = "Trigonometric ratios, fundamental identities, angle of elevation & depression, Distance formula, Section formula, and Slope of a line.",
            summaryMr = "त्रिकोणमितीय गुणोत्तरे, मूलभूत नित्यसमानता, उन्नत व अवनत कोन, अंतराचे सूत्र, विभाजन सूत्र आणि रेषेचा चढ.",
            keyPointsEn = listOf(
                "Fundamental Identities: sin²θ + cos²θ = 1, 1 + tan²θ = sec²θ, 1 + cot²θ = cosec²θ.",
                "Values: sin 30° = 1/2, cos 30° = √3/2, tan 45° = 1, sin 60° = √3/2, cos 60° = 1/2.",
                "Distance Formula: d = √[(x₂ - x₁)² + (y₂ - y₁)²].",
                "Section Formula: x = (mx₂ + nx₁) / (m + n), y = (my₂ + ny₁) / (m + n).",
                "Midpoint Formula: x = (x₁ + x₂) / 2, y = (y₁ + y₂) / 2.",
                "Slope of a Line: m = (y₂ - y₁) / (x₂ - x₁) = tan θ."
            ),
            keyPointsMr = listOf(
                "मूलभूत नित्यसमानता: sin²θ + cos²θ = १, १ + tan²θ = sec²θ, १ + cot²θ = cosec²θ.",
                "कोनांची मूल्ये: sin ३०° = १/२, cos ३०° = √३/२, tan ४५° = १, sin ६०° = √३/२.",
                "अंतराचे सूत्र: d = √[(x₂ - x₁)² + (y₂ - y₁)²].",
                "विभाजन सूत्र: x = (mx₂ + nx₁) / (m + n), y = (my₂ + ny₁) / (m + n).",
                "मध्यबिंदूचे सूत्र: x = (x₁ + x₂) / २, y = (y₁ + y₂) / २.",
                "रेषेचा चढ: m = (y₂ - y₁) / (x₂ - x₁) = tan θ."
            ),
            importantFormulasLawsEn = listOf(
                "sin²θ + cos²θ = 1",
                "Distance = √[(x₂-x₁)² + (y₂-y₁)²]",
                "Slope m = (y₂-y₁) / (x₂-x₁)"
            ),
            importantFormulasLawsMr = listOf(
                "sin²θ + cos²θ = १",
                "अंतर = √[(x₂-x₁)² + (y₂-y₁)²]",
                "चढ m = (y₂-y₁) / (x₂-x₁)"
            ),
            examWeightageMarks = "7-9 Marks"
        )
    )

    val pyqs = listOf(
        PYQuestion(
            id = "math_pyq_2026",
            chapterNumber = 1,
            chapterTitleEn = "Linear Equations",
            chapterTitleMr = "दोन चलांमधील रेषीय समीकरणे",
            yearTag = "March 2026 Model",
            yearInt = 2026,
            marks = 3,
            questionType = "Determinant / Cramer's Rule",
            questionEn = "Solve the following simultaneous equations using Cramer's rule:\n3x - 4y = 10\n4x + 3y = 5",
            questionMr = "क्रॅमर्सच्या नियमाने खालील एकसामायिक समीकरणे सोडवा:\n३x - ४y = १०\n४x + ३y = ५",
            answerEn = "Given equations:\n3x - 4y = 10\n4x + 3y = 5\n\nD = |3  -4 / 4   3| = (3 × 3) - (-4 × 4) = 9 - (-16) = 9 + 16 = 25 ≠ 0\nD_x = |10  -4 / 5   3| = (10 × 3) - (-4 × 5) = 30 - (-20) = 30 + 20 = 50\nD_y = |3  10 / 4   5| = (3 × 5) - (10 × 4) = 15 - 40 = -25\n\nBy Cramer's rule:\nx = D_x / D = 50 / 25 = 2\ny = D_y / D = -25 / 25 = -1\n\nSolution: (x, y) = (2, -1).",
            answerMr = "दिलेली समीकरणे:\n३x - ४y = १०\n४x + ३y = ५\n\nD = |३  -४ / ४   ३| = (३ × ३) - (-४ × ४) = ९ - (-१६) = ९ + १६ = २५ ≠ ०\nD_x = |१०  -४ / ५   ३| = (१० × ३) - (-४ × ५) = ३० + २० = ५०\nD_y = |३  १० / ४   ५| = (३ × ५) - (१० × ४) = १५ - ४० = -२५\n\nक्रॅमर्सच्या पद्धतीनुसार:\nx = D_x / D = ५० / २५ = २\ny = D_y / D = -२५ / २५ = -१\n\nउकल: (x, y) = (२, -१).",
            stepByStepEn = listOf(
                "Step 1: Write D determinant and compute cross-multiplication: D = 25.",
                "Step 2: Replace x-coefficients with constants to compute D_x = 50.",
                "Step 3: Replace y-coefficients with constants to compute D_y = -25.",
                "Step 4: Apply x = D_x / D = 2 and y = D_y / D = -1.",
                "Step 5: Write final solution set (x, y) = (2, -1)."
            ),
            stepByStepMr = listOf(
                "पायरी १: D चे निश्चयक मांडून तिरकस गुणाकार करा: D = २५.",
                "पायरी २: x च्या जागी स्थिरपदे ठेवून D_x काढा: D_x = ५०.",
                "पायरी ३: y च्या जागी स्थिरपदे ठेवून D_y काढा: D_y = -२५.",
                "पायरी ४: x = D_x / D = २ आणि y = D_y / D = -१ मिळवा.",
                "पायरी ५: अंतिम उकल संच (x, y) = (२, -१) लिहा."
            ),
            examinerTipEn = "Be careful with double minus signs in determinants: 9 - (-16) = +25.",
            examinerTipMr = "वजा आणि वजा चिन्ह मिळून अधिक होते (९ - (-१६) = २५), चिन्हांची विशेष काळजी घ्या."
        ),
        PYQuestion(
            id = "math_pyq_2025",
            chapterNumber = 2,
            chapterTitleEn = "Quadratic Equations",
            chapterTitleMr = "वर्गसमीकरणे",
            yearTag = "March 2025",
            yearInt = 2025,
            marks = 3,
            questionType = "Formula Method",
            questionEn = "Solve the quadratic equation using formula method:\nx² + 10x + 2 = 0",
            questionMr = "खालील वर्गसमीकरण सूत्र पद्धतीने सोडवा:\nx² + १०x + २ = ०",
            answerEn = "Comparing x² + 10x + 2 = 0 with ax² + bx + c = 0:\na = 1, b = 10, c = 2\n\nDiscriminant (b² - 4ac) = (10)² - 4(1)(2) = 100 - 8 = 92\n\nFormula: x = [-b ± √(b² - 4ac)] / (2a)\nx = [-10 ± √92] / [2(1)]\nSince √92 = √(4 × 23) = 2√23:\nx = [-10 ± 2√23] / 2\nx = 2(-5 ± √23) / 2\nx = -5 + √23  or  x = -5 - √23\n\nRoots are (-5 + √23) and (-5 - √23).",
            answerMr = "x² + १०x + २ = ० ची तुलना ax² + bx + c = ० शी करून:\na = १, b = १०, c = २\n\nविवेचक (b² - ४ac) = (१०)² - ४(१)(२) = १०० - ८ = ९२\n\nसूत्र: x = [-b ± √(b² - ४ac)] / (२a)\nx = [-१० ± √९२] / २\n√९२ = √(४ × २३) = २√२३\nx = [-१० ± २√२३] / २ = -५ ± √२३\n\nसमीकरणाची मुळे (-५ + √२३) आणि (-५ - √२३) आहेत.",
            stepByStepEn = listOf(
                "Identify a=1, b=10, c=2.",
                "Calculate Δ = b² - 4ac = 92.",
                "Simplify surd √92 = 2√23.",
                "Divide numerator and denominator by 2 to get simplest radical form."
            ),
            stepByStepMr = listOf(
                "a=१, b=१०, c=२ ओळखा.",
                "Δ = b² - ४ac = ९२ काढा.",
                "√९२ = २√२३ सोपे रूप द्या.",
                "अंश व छेदाला २ ने भागून अंतिम मुळे लिहा."
            ),
            examinerTipEn = "Do not leave √92 unsimplified; factoring out 2 is required for full credit.",
            examinerTipMr = "√९२ ला २√२३ असे सोपे रूप न दिल्यास अर्धा गुण कापला जाऊ शकतो."
        ),
        PYQuestion(
            id = "math_pyq_2024",
            chapterNumber = 3,
            chapterTitleEn = "Arithmetic Progression",
            chapterTitleMr = "अंकगणिती श्रेढी",
            yearTag = "March 2024",
            yearInt = 2024,
            marks = 3,
            questionType = "Sum of n terms",
            questionEn = "Find the sum of all natural numbers between 1 and 140 which are divisible by 4.",
            questionMr = "१ ते १४० च्या दरम्यान असणाऱ्या ४ ने भाग जाणाऱ्या सर्व नैसर्गिक संख्यांची बेरीज काढा.",
            answerEn = "Numbers divisible by 4 between 1 and 140 are:\n4, 8, 12, ..., 136\n(Note: 'between 1 and 140' excludes 140 itself).\n\nHere, a = 4, d = 4, last term t_n = 136\nt_n = a + (n - 1)d\n136 = 4 + (n - 1)4\n132 = (n - 1)4\nn - 1 = 33 => n = 34\n\nSum formula: S_n = (n / 2) [t₁ + t_n]\nS₃₄ = (34 / 2) [4 + 136]\nS₃₄ = 17 × 140 = 2380.\n\nHence, the required sum is 2380.",
            answerMr = "१ ते १४० दरम्यान ४ ने भाग जाणाऱ्या संख्या:\n४, ८, १२, ..., १३६ (१४० च्या 'दरम्यान' विचारल्याने १४० वगळले जाईल).\n\nयेथे a = ४, d = ४, शेवटचे पद t_n = १३६\nt_n = a + (n - १)d\n१३६ = ४ + (n - १)४ => n = ३४\n\nबेरजेचे सूत्र: S_n = (n / २) [t₁ + t_n]\nS₃४ = (३४ / २) [४ + १३६]\nS₃४ = १७ × १४० = २३८०.\n\nम्हणून आवश्यक बेरीज २३८० आहे.",
            stepByStepEn = listOf(
                "Identify sequence: 4, 8, ..., 136 (strictly between 1 and 140).",
                "Find number of terms n = 34 using t_n = a + (n-1)d.",
                "Compute S₃₄ = 17 * 140 = 2380."
            ),
            stepByStepMr = listOf(
                "क्रमिका तयार करा: ४, ८, ..., १३६.",
                "t_n सूत्राने पदांची संख्या n = ३४ शोधा.",
                "S₃४ = १७ × १४० = २३८० बेरीज काढा."
            ),
            examinerTipEn = "Pay close attention to 'between' vs 'from... to'. Between 1 and 140 ends at 136.",
            examinerTipMr = "'दरम्यान' (Between) म्हटले की शेवटची संख्या १४० धरायची नसते, १३६ हे शेवटचे पद असते."
        ),
        PYQuestion(
            id = "math_pyq_2023",
            chapterNumber = 4,
            chapterTitleEn = "Similarity",
            chapterTitleMr = "समरूपता",
            yearTag = "July 2023",
            yearInt = 2023,
            marks = 3,
            questionType = "Theorem Application",
            questionEn = "In ΔABC, DE || BC. If AD = 1.8 cm, DB = 5.4 cm, and AE = 1.2 cm, find the length of EC.",
            questionMr = "ΔABC मध्ये, बाजू BC || रेषा DE. जर AD = १.८ सेमी, DB = ५.४ सेमी आणि AE = १.२ सेमी असेल, तर EC ची लांबी काढा.",
            answerEn = "In ΔABC, line DE is parallel to side BC.\nBy Basic Proportionality Theorem (BPT):\nAD / DB = AE / EC\n\nSubstituting given values:\n1.8 / 5.4 = 1.2 / EC\n1 / 3 = 1.2 / EC\nEC = 1.2 × 3 = 3.6 cm.\n\nTherefore, the length of EC is 3.6 cm.",
            answerMr = "ΔABC मध्ये DE || BC.\nप्रमाणाच्या मूलभूत प्रमेयानुसार (BPT):\nAD / DB = AE / EC\n\nकिमती भरून:\n१.८ / ५.४ = १.२ / EC\n१ / ३ = १.२ / EC\nEC = १.२ × ३ = ३.६ सेमी.\n\nम्हणून EC ची लांबी ३.६ सेमी आहे.",
            stepByStepEn = listOf(
                "State Basic Proportionality Theorem.",
                "Substitute AD=1.8, DB=5.4, AE=1.2.",
                "Cross multiply to find EC = 3.6 cm."
            ),
            stepByStepMr = listOf(
                "प्रमाणाचे मूलभूत प्रमेय लिहा.",
                "किमती भरा आणि EC = ३.६ सेमी काढा."
            ),
            examinerTipEn = "Do not forget to write unit 'cm' at the end.",
            examinerTipMr = "उत्तराच्या शेवटी 'सेमी' (cm) एकक आवर्जून लिहा."
        ),
        PYQuestion(
            id = "math_pyq_2022",
            chapterNumber = 4,
            chapterTitleEn = "Pythagoras Theorem",
            chapterTitleMr = "पायथागोरसचे प्रमेय",
            yearTag = "March 2022",
            yearInt = 2022,
            marks = 2,
            questionType = "Direct Computation",
            questionEn = "Find the diagonal of a rectangle whose length is 35 cm and breadth is 12 cm.",
            questionMr = "एका आयताची लांबी ३५ सेमी व रुंदी १२ सेमी आहे, तर त्या आयताच्या कर्णाची लांबी काढा.",
            answerEn = "Let ABCD be the rectangle with length l = 35 cm and breadth b = 12 cm.\nEach angle of a rectangle is 90°.\nIn right-angled ΔABC, by Pythagoras theorem:\n(Diagonal AC)² = AB² + BC²\nAC² = (35)² + (12)²\nAC² = 1225 + 144 = 1369\nAC = √1369 = 37 cm.\n\nHence, the diagonal of the rectangle is 37 cm.",
            answerMr = "समजा आयताची लांबी l = ३५ सेमी व रुंदी b = १२ सेमी आहे.\nआयताचा प्रत्येक कोन ९०° चा असतो.\nकाटकोन त्रिकोणात पायथागोरसच्या प्रमेयानुसार:\n(कर्ण)² = (लांबी)² + (रुंदी)²\nकर्ण² = (३५)² + (१२)² = १२२५ + १४४ = १३६९\nकर्ण = √१३६९ = ३७ सेमी.\n\nम्हणून आयताच्या कर्णाची लांबी ३७ सेमी आहे.",
            stepByStepEn = listOf(
                "Formula: d = √(l² + b²).",
                "Substitute 35² = 1225 and 12² = 144.",
                "√1369 = 37 cm."
            ),
            stepByStepMr = listOf(
                "सूत्र: कर्ण = √(लांबी² + रुंदी²).",
                "३५² = १२२५ आणि १२² = १४४.",
                "√१३६९ = ३७ सेमी."
            ),
            examinerTipEn = "35-12-37 forms a standard Pythagorean triplet.",
            examinerTipMr = "१२-३५-३७ हे पायथागोरसचे त्रिकूट आहे."
        ),
        PYQuestion(
            id = "math_pyq_2021",
            chapterNumber = 5,
            chapterTitleEn = "Trigonometry",
            chapterTitleMr = "त्रिकोणमिती",
            yearTag = "March 2021",
            yearInt = 2021,
            marks = 2,
            questionType = "Trigonometric Identity",
            questionEn = "If sin θ = 7/25, find the values of cos θ and tan θ using trigonometric identities.",
            questionMr = "जर sin θ = ७/२५ असेल, तर नित्यसमानतेचा वापर करून cos θ आणि tan θ च्या किमती काढा.",
            answerEn = "We know the identity: sin²θ + cos²θ = 1\ncos²θ = 1 - sin²θ = 1 - (7/25)² = 1 - 49/625 = (625 - 49) / 625 = 576 / 625\ncos θ = √(576 / 625) = 24 / 25\n\nNow, tan θ = sin θ / cos θ = (7/25) / (24/25) = 7 / 24.\n\nTherefore, cos θ = 24/25 and tan θ = 7/24.",
            answerMr = "नित्यसमानतेनुसार: sin²θ + cos²θ = १\ncos²θ = १ - sin²θ = १ - (७/२५)² = १ - ४९/६२५ = ५७६/६२५\ncos θ = √(५७६/६२५) = २४/२५\n\ntan θ = sin θ / cos θ = (७/२५) / (२४/२५) = ७/२४.\n\nम्हणून cos θ = २४/२५ आणि tan θ = ७/२४.",
            stepByStepEn = listOf("cos²θ = 1 - sin²θ", "cos θ = 24/25", "tan θ = sin θ / cos θ = 7/24"),
            stepByStepMr = listOf("cos²θ = १ - sin²θ", "cos θ = २४/२५", "tan θ = ७/२४"),
            examinerTipEn = "When question says 'using trigonometric identities', do not use triangle ratio method.",
            examinerTipMr = "'नित्यसमानतेचा वापर करून' विचारल्यास त्रिकोण न काढता sin²θ + cos²θ = १ या सूत्रानेच सोडवा."
        ),
        PYQuestion(
            id = "math_pyq_2020",
            chapterNumber = 1,
            chapterTitleEn = "Linear Equations",
            chapterTitleMr = "दोन चलांमधील रेषीय समीकरणे",
            yearTag = "March 2020",
            yearInt = 2020,
            marks = 2,
            questionType = "Determinant Value",
            questionEn = "Find the value of the following determinant: |5  3 / -7  -4|",
            questionMr = "खालील निश्चयकाची किंमत काढा: |५  ३ / -७  -४|",
            answerEn = "|5  3 / -7  -4| = (5 × -4) - (3 × -7)\n= -20 - (-21)\n= -20 + 21\n= 1.\n\nValue of determinant is 1.",
            answerMr = "|५  ३ / -७  -४| = (५ × -४) - (३ × -७)\n= -२० - (-२१)\n= -२० + २१\n= १.\n\nनिश्चयकाची किंमत १ आहे.",
            stepByStepEn = listOf("Cross multiply (5 × -4) and (3 × -7)", "-20 - (-21) = 1"),
            stepByStepMr = listOf("तिरकस गुणाकार (५ × -४) आणि (३ × -७)", "-२० + २१ = १"),
            examinerTipEn = "Sign errors in minus minus are common. Work carefully.",
            examinerTipMr = "ऋण चिन्हांची वजाबाकी करताना काळजी घ्या."
        ),
        PYQuestion(
            id = "math_pyq_2019",
            chapterNumber = 3,
            chapterTitleEn = "Arithmetic Progression",
            chapterTitleMr = "अंकगणिती श्रेढी",
            yearTag = "March 2019",
            yearInt = 2019,
            marks = 2,
            questionType = "n-th Term",
            questionEn = "For an A.P., if a = 3.5, d = 0, find t_n.",
            questionMr = "एका अंकगणिती श्रेढीसाठी जर a = ३.५, d = ० असेल, तर t_n काढा.",
            answerEn = "Formula: t_n = a + (n - 1)d\nt_n = 3.5 + (n - 1)(0)\nt_n = 3.5 + 0 = 3.5.\n\nTherefore, t_n = 3.5 for all n.",
            answerMr = "सूत्र: t_n = a + (n - १)d\nt_n = ३.५ + (n - १)(०) = ३.५.\n\nम्हणून सर्व n साठी t_n = ३.५ असेल.",
            stepByStepEn = listOf("Write formula", "Substitute d = 0", "Conclude t_n = 3.5"),
            stepByStepMr = listOf("सूत्र लिहा", "d = ० ठेवा", "t_n = ३.५ उत्तर"),
            examinerTipEn = "When common difference is 0, every term of A.P. is equal to the first term.",
            examinerTipMr = "सामान्य फरक शून्य असल्यास सर्व पदे पहिल्या पदाएवढीच असतात."
        ),
        PYQuestion(
            id = "math_pyq_2018",
            chapterNumber = 2,
            chapterTitleEn = "Quadratic Equations",
            chapterTitleMr = "वर्गसमीकरणे",
            yearTag = "March 2018",
            yearInt = 2018,
            marks = 2,
            questionType = "Discriminant Nature",
            questionEn = "Determine the nature of roots for the quadratic equation: 2x² - 5x + 7 = 0.",
            questionMr = "२x² - ५x + ७ = ० या वर्गसमीकरणाच्या मुळांचे स्वरूप ठरवा.",
            answerEn = "Comparing with ax² + bx + c = 0:\na = 2, b = -5, c = 7\nΔ = b² - 4ac = (-5)² - 4(2)(7) = 25 - 56 = -31\n\nSince Δ < 0, the roots of the quadratic equation are not real.",
            answerMr = "ax² + bx + c = ० शी तुलना करून:\na = २, b = -५, c = ७\nΔ = b² - ४ac = (-५)² - ४(२)(७) = २५ - ५६ = -३१\n\nयेथे Δ < ० असल्याने या वर्गसमीकरणाची मुळे वास्तव संख्या नाहीत.",
            stepByStepEn = listOf("Find Δ = -31", "State condition Δ < 0 means roots are not real"),
            stepByStepMr = listOf("Δ = -३१ शोधा", "Δ < ० असल्याने मुळे वास्तव नाहीत"),
            examinerTipEn = "Do not attempt to solve for roots when only 'nature of roots' is asked.",
            examinerTipMr = "फक्त मुळांचे स्वरूप विचारल्यास समीकरण सोडवत बसू नका, केवळ Δ वरून निष्कर्ष लिहा."
        ),
        PYQuestion(
            id = "math_pyq_2017",
            chapterNumber = 4,
            chapterTitleEn = "Similarity",
            chapterTitleMr = "समरूपता",
            yearTag = "March 2017",
            yearInt = 2017,
            marks = 3,
            questionType = "Areas of Similar Triangles",
            questionEn = "ΔABC ~ ΔPQR. If Area(ΔABC) = 81 cm² and Area(ΔPQR) = 121 cm², and BC = 6.3 cm, find the length of QR.",
            questionMr = "ΔABC ~ ΔPQR. जर Area(ΔABC) = ८१ सेमी² आणि Area(ΔPQR) = १२१ सेमी², तसेच BC = ६.३ सेमी असेल, तर QR ची लांबी काढा.",
            answerEn = "By Theorem of Areas of Similar Triangles:\nArea(ΔABC) / Area(ΔPQR) = (BC)² / (QR)²\n81 / 121 = (6.3)² / (QR)²\n\nTaking square root on both sides:\n9 / 11 = 6.3 / QR\n9 × QR = 11 × 6.3\n9 × QR = 69.3\nQR = 69.3 / 9 = 7.7 cm.\n\nTherefore, length of QR = 7.7 cm.",
            answerMr = "समरूप त्रिकोणांच्या क्षेत्रफळांच्या प्रमेयानुसार:\nArea(ΔABC) / Area(ΔPQR) = (BC)² / (QR)²\n८१ / १२१ = (६.३)² / (QR)²\n\nदोन्ही बाजूंचे वर्गमूळ घेऊन:\n९ / ११ = ६.३ / QR\nQR = (११ × ६.३) / ९ = ७.७ सेमी.\n\nम्हणून QR ची लांबी ७.७ सेमी आहे.",
            stepByStepEn = listOf("Write theorem formula", "Take square root first (9/11)", "Solve QR = 7.7 cm"),
            stepByStepMr = listOf("प्रमेयाचे सूत्र लिहा", "दोन्ही बाजूंचे वर्गमूळ घ्या (९/११)", "QR = ७.७ सेमी उत्तर"),
            examinerTipEn = "Taking square root before multiplying saves huge calculation time.",
            examinerTipMr = "आधी दोन्ही बाजूंचे वर्गमूळ घेतल्यास आकडेमोड खूप सोपी होते."
        )
    )

    val flashcards = listOf(
        Flashcard(
            id = "math_fc1",
            chapterTitleEn = "Quadratic Equations",
            chapterTitleMr = "वर्गसमीकरणे",
            frontEn = "Quadratic Formula",
            frontMr = "वर्गसमीकरणाचे सूत्र",
            backEn = "x = [-b ± √(b² - 4ac)] / (2a)\n\nDiscriminant: Δ = b² - 4ac",
            backMr = "x = [-b ± √(b² - ४ac)] / (२a)\n\nविवेचक: Δ = b² - ४ac",
            tagEn = "Core Formula",
            tagMr = "महत्त्वाचे सूत्र"
        ),
        Flashcard(
            id = "math_fc2",
            chapterTitleEn = "Arithmetic Progression",
            chapterTitleMr = "अंकगणिती श्रेढी",
            frontEn = "Sum of n terms (S_n)",
            frontMr = "n पदांची बेरीज (S_n)",
            backEn = "S_n = (n/2) × [2a + (n - 1)d]\n\nor S_n = (n/2) × [t₁ + t_n]",
            backMr = "S_n = (n/२) × [२a + (n - १)d]\n\nकिंवा S_n = (n/२) × [t₁ + t_n]",
            tagEn = "A.P. Formula",
            tagMr = "श्रेढी सूत्र"
        ),
        Flashcard(
            id = "math_fc3",
            chapterTitleEn = "Pythagoras Theorem",
            chapterTitleMr = "पायथागोरसचे प्रमेय",
            frontEn = "Geometric Mean Theorem",
            frontMr = "भूमितीमध्याचे प्रमेय",
            backEn = "In right ΔABC with altitude BD on hypotenuse AC:\n\nBD² = AD × DC",
            backMr = "काटकोन त्रिकोणात कर्णावर टाकलेला शिरोलंब BD असल्यास:\n\nBD² = AD × DC",
            tagEn = "Theorem",
            tagMr = "भूमिती प्रमेय"
        ),
        Flashcard(
            id = "math_fc4",
            chapterTitleEn = "Trigonometry",
            chapterTitleMr = "त्रिकोणमिती",
            frontEn = "Fundamental Trigonometric Identities",
            frontMr = "मूलभूत त्रिकोणमितीय नित्यसमानता",
            backEn = "1. sin²θ + cos²θ = 1\n2. 1 + tan²θ = sec²θ\n3. 1 + cot²θ = cosec²θ",
            backMr = "१. sin²θ + cos²θ = १\n२. १ + tan²θ = sec²θ\n३. १ + cot²θ = cosec²θ",
            tagEn = "Identities",
            tagMr = "नित्यसमानता"
        ),
        Flashcard(
            id = "math_fc5",
            chapterTitleEn = "Linear Equations",
            chapterTitleMr = "रेषीय समीकरणे",
            frontEn = "Cramer's Rule for (x, y)",
            frontMr = "क्रॅमर्सची पद्धत (x, y)",
            backEn = "x = D_x / D\ny = D_y / D\n(Provided determinant D ≠ 0)",
            backMr = "x = D_x / D\ny = D_y / D\n(निश्चयक D ≠ ० असणे आवश्यक)",
            tagEn = "Determinant",
            tagMr = "निश्चयक"
        )
    )

    val quizQuestions = listOf(
        QuizQuestion(
            id = "math_q1",
            chapterTitleEn = "Quadratic Equations",
            chapterTitleMr = "वर्गसमीकरणे",
            questionEn = "If the discriminant Δ = b² - 4ac = 0, then the roots of the quadratic equation are:",
            questionMr = "जर विवेचक Δ = b² - ४ac = ० असेल, तर वर्गसमीकरणाची मुळे कशी असतात?",
            optionsEn = listOf("Real and unequal", "Real and equal", "Not real", "Zero"),
            optionsMr = listOf("वास्तव व असमान", "वास्तव व समान", "वास्तव संख्या नाहीत", "शून्य"),
            correctIndex = 1,
            explanationEn = "When Δ = 0, the formula yields x = -b / (2a), giving two identical real roots.",
            explanationMr = "जेव्हा विवेचक शून्य असतो, तेव्हा दोन्ही मुळे वास्तव व समान असतात (x = -b/२a)."
        ),
        QuizQuestion(
            id = "math_q2",
            chapterTitleEn = "Arithmetic Progression",
            chapterTitleMr = "अंकगणिती श्रेढी",
            questionEn = "What is the common difference 'd' for the A.P.: 2, -2, -6, -10, ...?",
            questionMr = "२, -२, -६, -१०, ... या अंकगणिती श्रेढीचा सामान्य फरक 'd' किती आहे?",
            optionsEn = listOf("4", "-4", "-2", "2"),
            optionsMr = listOf("४", "-४", "-२", "२"),
            correctIndex = 1,
            explanationEn = "d = t₂ - t₁ = -2 - 2 = -4.",
            explanationMr = "d = t₂ - t₁ = -२ - २ = -४."
        ),
        QuizQuestion(
            id = "math_q3",
            chapterTitleEn = "Similarity",
            chapterTitleMr = "समरूपता",
            questionEn = "If two triangles are similar, the ratio of their areas is equal to the ratio of:",
            questionMr = "दोन समरूप त्रिकोणांच्या क्षेत्रफळांचे गुणोत्तर हे त्यांच्या संगत बाजूंच्या कशाच्या बरोबर असते?",
            optionsEn = listOf("Sides", "Squares of corresponding sides", "Perimeters", "Altitudes"),
            optionsMr = listOf("बाजूंच्या गुणोत्तराच्या", "संगत बाजूंच्या वर्गांच्या गुणोत्तराच्या", "परिमितीच्या", "शिरोलंबाच्या"),
            correctIndex = 1,
            explanationEn = "Theorem of Areas of Similar Triangles: Area(Δ1)/Area(Δ2) = (s1/s2)².",
            explanationMr = "समरूप त्रिकोणांच्या क्षेत्रफळांचे गुणोत्तर हे त्यांच्या संगत बाजूंच्या वर्गांच्या गुणोत्तराइतके असते."
        ),
        QuizQuestion(
            id = "math_q4",
            chapterTitleEn = "Trigonometry",
            chapterTitleMr = "त्रिकोणमिती",
            questionEn = "What is the value of (1 + tan² 45°)?",
            questionMr = "(१ + tan² ४५°) चे मूल्य किती आहे?",
            optionsEn = listOf("1", "2", "3", "0"),
            optionsMr = listOf("१", "२", "३", "०"),
            correctIndex = 1,
            explanationEn = "tan 45° = 1, so 1 + (1)² = 1 + 1 = 2 (also sec² 45° = (√2)² = 2).",
            explanationMr = "tan ४५° = १, म्हणून १ + (१)² = २."
        ),
        QuizQuestion(
            id = "math_q5",
            chapterTitleEn = "Coordinate Geometry",
            chapterTitleMr = "निर्देशांक भूमिती",
            questionEn = "The distance of point P(3, 4) from the origin (0, 0) is:",
            questionMr = "बिंदू P(३, ४) चे आरंभबिंदू (०, ०) पासूनचे अंतर किती?",
            optionsEn = listOf("7", "5", "1", "25"),
            optionsMr = listOf("७", "५", "१", "२५"),
            correctIndex = 1,
            explanationEn = "Distance = √(x² + y²) = √(3² + 4²) = √(9 + 16) = √25 = 5 units.",
            explanationMr = "आरंभबिंदूपासून अंतर = √(x² + y²) = √(९ + १६) = √२५ = ५ एकक."
        )
    )
}
