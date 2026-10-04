package com.example.data.repository

import com.example.data.model.ChapterNote
import com.example.data.model.Flashcard
import com.example.data.model.PYQuestion
import com.example.data.model.QuizQuestion

object ScienceData {

    val chapters = listOf(
        ChapterNote(
            id = "sci_ch1",
            chapterNumber = 1,
            chapterTitleEn = "Gravitation",
            chapterTitleMr = "गुरुत्वाकर्षण",
            summaryEn = "Study of universal gravitational force, Kepler's laws of planetary motion, acceleration due to gravity (g), free fall, and escape velocity.",
            summaryMr = "विश्वव्यापी गुरुत्वाकर्षण बल, केप्लरचे ग्रहांच्या गतीविषयक तीन नियम, गुरुत्वत्वरण (g), मुक्‍त पतन व मुक्ती वेग यांचा सखोल अभ्यास.",
            keyPointsEn = listOf(
                "Kepler's 1st Law: The orbit of a planet is an ellipse with the Sun at one of the foci.",
                "Kepler's 2nd Law: The line joining the planet and the Sun sweeps equal areas in equal intervals of time.",
                "Kepler's 3rd Law: The square of orbital period (T²) is proportional to the cube of mean distance (r³): T²/r³ = constant.",
                "Newton's Universal Law: F = G * (m1 * m2) / r², where G = 6.67 × 10⁻¹¹ N m²/kg².",
                "Acceleration due to gravity: g = GM/R². Value on Earth surface ≈ 9.8 m/s² (maximum at poles 9.83 m/s², minimum at equator 9.78 m/s²).",
                "Escape Velocity on Earth: v_esc = √(2GM/R) = √(2gR) ≈ 11.2 km/s."
            ),
            keyPointsMr = listOf(
                "केप्लरचा पहिला नियम: ग्रहाची कक्षा लंबवर्तुळाकार असून सूर्य त्या कक्षेच्या एका नाभीवर असतो.",
                "केप्लरचा दुसरा नियम: ग्रहाला सूर्याशी जोडणारी सरळ रेषा समान कालावधीत समान क्षेत्रफळ व्यापन करते.",
                "केप्लरचा तिसरा नियम: सूर्याभोवती प्रदक्षिणा करणाऱ्या ग्रहाच्या आवर्तकालाचा वर्ग (T²) हा सूर्यापासूनच्या सरासरी अंतराच्या घनाला (r³) समानुपाती असतो (T²/r³ = स्थिरांक).",
                "न्यूटनचा वैश्विक गुरुत्वाकर्षणाचा सिद्धांत: F = G * (m1 * m2) / r², G = ६.६७ × १०⁻¹¹ N m²/kg².",
                "गुरुत्वत्वरण: g = GM/R². पृथ्वीच्या पृष्ठभागावर सरासरी मूल्य ≈ ९.८ m/s² (ध्रुवावर ९.८३ m/s², विषुववृत्तावर ९.७८ m/s²).",
                "पृथ्वीवरील मुक्ती वेग (Escape Velocity): v_esc = √(२GM/R) ≈ ११.२ km/s."
            ),
            importantFormulasLawsEn = listOf(
                "F = G * (m1 * m2) / r²",
                "g = GM / R²",
                "v_esc = √(2GM / R) = 11.2 km/s",
                "Kinematic Eq 1: v = u + gt",
                "Kinematic Eq 2: s = ut + ½gt²",
                "Kinematic Eq 3: v² = u² + 2gs"
            ),
            importantFormulasLawsMr = listOf(
                "F = G * (m१ * m२) / r²",
                "g = GM / R²",
                "v_esc = √(२GM / R) = ११.२ km/s",
                "गतिविषयक समीकरण १: v = u + gt",
                "गतिविषयक समीकरण २: s = ut + ½gt²",
                "गतिविषयक समीकरण ३: v² = u² + २gs"
            ),
            examWeightageMarks = "5-7 Marks"
        ),
        ChapterNote(
            id = "sci_ch2",
            chapterNumber = 2,
            chapterTitleEn = "Periodic Classification of Elements",
            chapterTitleMr = "मूलद्रव्यांचे आवर्ती वर्गीकरण",
            summaryEn = "Evolution of classification: Dobereiner's Triads, Newlands' Octaves, Mendeleev's Periodic Table, and Modern Periodic Table based on atomic number.",
            summaryMr = "मूलद्रव्यांच्या वर्गीकरणाचा इतिहास: डोबेरायनरची त्रिके, न्यूलँड्सचे अष्टकांचे तत्त्व, मेंडेलीव्हची आवर्तसारणी आणि अणुअंकावर आधारलेली आधुनिक आवर्तसारणी.",
            keyPointsEn = listOf(
                "Dobereiner's Triad: Elements arranged in groups of 3 with similar chemical properties; middle element atomic mass ≈ mean of other two (e.g., Li, Na, K).",
                "Newlands' Octaves: Every eighth element had properties similar to the first (like musical notes).",
                "Mendeleev's Periodic Law: Properties of elements are periodic function of their atomic masses.",
                "Modern Periodic Law (Henry Moseley 1913): Properties of elements are periodic function of their atomic numbers (Z).",
                "Modern Table structure: 7 horizontal periods, 18 vertical groups. Blocks: s-block (Gr 1-2), p-block (Gr 13-18), d-block (Gr 3-12 transition), f-block (Lanthanides & Actinides).",
                "Periodic Trends: Atomic radius decreases across a period (left to right) and increases down a group (top to bottom)."
            ),
            keyPointsMr = listOf(
                "डोबेरायनरची त्रिके: तीन रासायनिक साधर्म्य असलेल्या मूलद्रव्यांच्या मांडणीत मधल्या मूलद्रव्याचे अणुवस्तुमान हे उर्वरित दोघांच्या सरासरीइतके असते (उदा. Li, Na, K).",
                "न्यूलँड्सचे अष्टकांचे तत्त्व: प्रत्येक आठव्या मूलद्रव्याचे गुणधर्म पहिल्या मूलद्रव्यासारखे असतात (सप्तसुरांप्रमाणे).",
                "मेंडेलीव्हचा आवर्ती नियम: मूलद्रव्यांचे गुणधर्म हे त्यांच्या अणुवस्तुमानांचे आवर्ती फल असतात.",
                "आधुनिक आवर्ती नियम (मोस्ले १९१३): मूलद्रव्यांचे गुणधर्म हे त्यांच्या अणुअंकांचे आवर्ती फल असतात.",
                "आधुनिक आवर्तसारणीची रचना: ७ आडव्या ओळी (आवर्त), १८ उभे स्तंभ (गण). s, p, d, f असे चार खंड.",
                "आवर्ती कल: आवर्तात डावीकडून उजवीकडे जाताना अणुत्रिज्या कमी होते, तर गणात वरून खाली जाताना वाढते."
            ),
            importantFormulasLawsEn = listOf(
                "Mendeleev: Periodic function of Atomic Mass",
                "Modern Law: Periodic function of Atomic Number (Z)",
                "Valency trend: 1 to 4 then 4 to 0 in periods; Constant in groups"
            ),
            importantFormulasLawsMr = listOf(
                "मेंडेलीव्ह: अणुवस्तुमानांचे आवर्ती फल",
                "आधुनिक नियम: अणुअंकांचे (Z) आवर्ती फल",
                "संयुजा कल: आवर्तात १ ते ४ मग ४ ते ०; गणात संयुजा समान राहते"
            ),
            examWeightageMarks = "6-8 Marks"
        ),
        ChapterNote(
            id = "sci_ch3",
            chapterNumber = 3,
            chapterTitleEn = "Chemical Reactions & Equations",
            chapterTitleMr = "रासायनिक अभिक्रिया आणि समीकरणे",
            summaryEn = "Balancing chemical equations, types of reactions (Combination, Decomposition, Displacement, Double Displacement), Redox, Endothermic vs Exothermic, Corrosion and Rancidity.",
            summaryMr = "रासायनिक समीकरण संतुलित करणे, अभिक्रियांचे प्रकार (संयोग, अपघटन, विस्थापन, दुहेरी विस्थापन), रेडॉक्स अभिक्रिया, उष्मादायी व उष्माग्राही अभिक्रिया, क्षरण व खवटपणा.",
            keyPointsEn = listOf(
                "Combination Reaction: Two or more reactants combine to form a single product. (e.g., 2Mg + O₂ → 2MgO).",
                "Decomposition Reaction: Single reactant breaks down into two or more products. (e.g., CaCO₃ + Heat → CaO + CO₂).",
                "Displacement Reaction: More reactive element displaces a less reactive element from its solution. (e.g., Fe + CuSO₄ → FeSO₄ + Cu).",
                "Double Displacement: Ions of reactants are exchanged to form a precipitate. (e.g., AgNO₃ + NaCl → AgCl↓ + NaNO₃).",
                "Oxidation: Gain of oxygen or loss of hydrogen/electrons. Reduction: Gain of hydrogen/electrons or loss of oxygen.",
                "Redox Reaction: Simultaneous oxidation and reduction. (e.g., CuO + H₂ → Cu + H₂O)."
            ),
            keyPointsMr = listOf(
                "संयोग अभिक्रिया: दोन किंवा अधिक अभिक्रियाकारकांपासून एकच उत्पादित तयार होते. (उदा. २Mg + O₂ → २MgO).",
                "अपघटन अभिक्रिया: एकाच अभिक्रियाकारकाचे विभाजन होऊन दोन किंवा अधिक उत्पादिते मिळतात. (उदा. CaCO₃ + उष्णता → CaO + CO₂).",
                "विस्थापन अभिक्रिया: जास्त क्रियाशील मूलद्रव्य कमी क्रियाशील मूलद्रव्याला त्याच्या संयुगातून विस्थापित करते. (उदा. Fe + CuSO₄ → FeSO₄ + Cu).",
                "दुहेरी विस्थापन: अभिक्रियाकारकांमधील आयनांची अदलाबदल होऊन अवक्षेप तयार होतो. (उदा. AgNO₃ + NaCl → AgCl↓ + NaNO₃).",
                "ऑक्सिडीकरण: ऑक्सिजन मिळवणे किंवा हायड्रोजन/इलेक्ट्रॉन गमावणे. क्षपण: हायड्रोजन मिळवणे किंवा ऑक्सिजन गमावणे.",
                "रेडॉक्स अभिक्रिया: एकाच वेळी ऑक्सिडीकरण व क्षपण घडणे. (उदा. CuO + H₂ → Cu + H₂O)."
            ),
            importantFormulasLawsEn = listOf(
                "Law of Conservation of Mass: Mass of reactants = Mass of products",
                "Catalyst: Increases rate of reaction without taking part chemically"
            ),
            importantFormulasLawsMr = listOf(
                "द्रव्यअक्षय्यतेचा नियम: अभिक्रियाकारकांचे एकूण वस्तुमान = उत्पादितांचे एकूण वस्तुमान",
                "उत्प्रेरक: अभिक्रियेचा दर वाढवणारा घटक जो स्वतः रासायनिक बदल पावत नाही"
            ),
            examWeightageMarks = "5-6 Marks"
        ),
        ChapterNote(
            id = "sci_ch4",
            chapterNumber = 4,
            chapterTitleEn = "Effects of Electric Current",
            chapterTitleMr = "विद्युतधारेचे परिणाम",
            summaryEn = "Heating effect of electric current (Joule's Law), magnetic effect, Right-Hand Thumb Rule, Fleming's Left-Hand and Right-Hand Rules, Electric Motor & AC Generator.",
            summaryMr = "विद्युतधारेचा औष्णिक परिणाम (ज्यूलचा नियम), चुंबकीय परिणाम, उजव्या हाताच्या अंगठ्याचा नियम, फ्लेमिंगचा डाव्या व उजव्या हाताचा नियम, विद्युत मोटर व जनित्र.",
            keyPointsEn = listOf(
                "Joule's Law of Heating: Heat produced H = I²Rt = VIt = (V²/R)t Joules.",
                "Electrical Power: P = VI = I²R = V²/R Watts. Commercial unit: 1 kWh = 3.6 × 10⁶ Joules = 1 unit.",
                "Right-Hand Thumb Rule: Curl fingers around conductor; thumb points along current, fingers show magnetic field direction.",
                "Fleming's Left-Hand Rule (Electric Motor): Thumb = Motion/Force, Forefinger = Magnetic Field, Middle finger = Current.",
                "Fleming's Right-Hand Rule (Electric Generator): Thumb = Motion, Forefinger = Field, Middle finger = Induced Current.",
                "Fuse wire has low melting point, connected in series with live wire for circuit safety."
            ),
            keyPointsMr = listOf(
                "ज्यूलचा उष्णताविषयक नियम: निर्माण होणारी उष्णता H = I²Rt = VIt ज्यूल.",
                "विद्युत शक्ती: P = VI = I²R वॅट. व्यावसायिक एकक: १ kWh = ३.६ × १०⁶ ज्यूल = १ युनिट.",
                "उजव्या हाताच्या अंगठ्याचा नियम: अंगठा विद्युतधारेची दिशा दर्शवतो, तर वळलेली बोटे चुंबकीय क्षेत्राची दिशा दर्शवतात.",
                "फ्लेमिंगचा डाव्या हाताचा नियम (विद्युत मोटर): अंगठा = बल/गती, तर्जनी = चुंबकीय क्षेत्र, मधले बोट = विद्युतधारा.",
                "फ्लेमिंगचा उजव्या हाताचा नियम (जनित्र): अंगठा = वाहकाची गती, तर्जनी = चुंबकीय क्षेत्र, मधले बोट = प्रवर्तित विद्युतधारा.",
                "विद्युत वितळतार (Fuse wire) चा वितळणबिंदू कमी असतो व ती वीजयुक्त तारेला एकसर जोडणीत जोडतात."
            ),
            importantFormulasLawsEn = listOf(
                "H = I² * R * t",
                "P = V * I = I²R",
                "1 Unit = 1 kWh = 3.6 × 10⁶ J"
            ),
            importantFormulasLawsMr = listOf(
                "H = I² * R * t",
                "P = V * I = I²R",
                "१ युनिट = १ किलोवॅट तास = ३.६ × १०⁶ ज्यूल"
            ),
            examWeightageMarks = "5-7 Marks"
        ),
        ChapterNote(
            id = "sci_ch5",
            chapterNumber = 5,
            chapterTitleEn = "Heredity and Evolution (Part 2)",
            chapterTitleMr = "आनुवंशिकता आणि उत्क्रांती (भाग २)",
            summaryEn = "Transcription, Translation, Translocation, Evidences of evolution, Darwin's Natural Selection, Lamarckism, and human evolution milestones.",
            summaryMr = "प्रतिलेखन, भाषांतरण, स्थानांतरण, उत्क्रांतीचे पुरावे, डार्विनचा नैसर्गिक निवडीचा सिद्धांत, लॅमार्कवाद आणि मानवी उत्क्रांतीचे टप्पे.",
            keyPointsEn = listOf(
                "Central Dogma: DNA produces mRNA (Transcription) in nucleus, mRNA translates into proteins (Translation & Translocation) on ribosomes.",
                "Evidences of Evolution: Morphological (outer structure), Anatomical (bone structure), Vestigial organs (appendix, wisdom teeth, coccyx), Paleontological (fossils, carbon dating C-14), Embryological.",
                "Darwin's Theory: 'Survival of the fittest' and Natural selection.",
                "Lamarckism: Use and disuse of organs and inheritance of acquired characters.",
                "Human Evolution: Dryopithecus → Ramapithecus → Australopithecus → Homo habilis → Homo erectus → Neanderthal man → Homo sapiens (Cro-Magnon)."
            ),
            keyPointsMr = listOf(
                "सेंट्रल डोग्मा: DNA कडून mRNA ची निर्मिती (प्रतिलेखन), त्यानंतर रायबोसोमवर प्रथिनांची निर्मिती (भाषांतरण व स्थानांतरण).",
                "उत्क्रांतीचे पुरावे: बाह्यरूपकीय, शरीरशास्त्रीय (हाडांची रचना), अवशेषांगे (आंत्रपुच्छ, अक्कलदाढ, माकडहाड), जीवाश्म (कार्बन वयमापन C-१४), भ्रूणविज्ञान पुरावे.",
                "डार्विनचा सिद्धांत: 'सक्षम तेच जगतील' आणि नैसर्गिक निवडीचा तत्त्व.",
                "लॅमार्कवाद: अवयवांचा वापर किंवा न वापर आणि मिळवलेल्या गुणधर्मांचे संक्रमण.",
                "मानवी उत्क्रांती: ड्रायोपिथिकस → रामापिथिकस → ऑस्ट्रॅलोपिथिकस → होमो हॅबिलिस → होमो इरेक्टस → निअँडरथल मानव → होमो सेपियन्स."
            ),
            importantFormulasLawsEn = listOf(
                "Carbon Dating: Ratio of C-14 to C-12 in dead organisms",
                "Triplet Codon: Sequence of 3 nucleotides coding for one amino acid"
            ),
            importantFormulasLawsMr = listOf(
                "कार्बन वयमापन: मृत सजीवातील C-१४ आणि C-१२ चे गुणोत्तर",
                "ट्रिप्लेट कोडॉन: एका अमिनो आम्लासाठी ३ न्यूक्लिओटाइडचा संच"
            ),
            examWeightageMarks = "4-6 Marks"
        )
    )

    val pyqs = listOf(
        PYQuestion(
            id = "sci_pyq_2026",
            chapterNumber = 1,
            chapterTitleEn = "Gravitation",
            chapterTitleMr = "गुरुत्वाकर्षण",
            yearTag = "March 2026 Model",
            yearInt = 2026,
            marks = 3,
            questionType = "Numerical Problem",
            questionEn = "An object takes 5 seconds to reach the ground from a height of 125 m on a planet. Calculate the value of 'g' on this planet. (Assume initial velocity u = 0)",
            questionMr = "एका ग्रहावर एका वस्तूची सुरुवातीची गती ० असताना तिला १२५ मीटर उंचीवरून जमिनीवर पोहोचण्यास ५ सेकंद लागतात. तर त्या ग्रहावरील 'g' चे मूल्य काढा.",
            answerEn = "Given: u = 0 m/s, s = 125 m, t = 5 s. Using Newton's second kinematic equation:\ns = ut + ½gt²\n125 = (0)(5) + ½ * g * (5)²\n125 = ½ * g * 25\n125 = 12.5 * g\ng = 125 / 12.5 = 10 m/s².\nTherefore, the acceleration due to gravity on that planet is 10 m/s².",
            answerMr = "दिलेले: u = ० m/s, s = १२५ m, t = ५ s. न्यूटनचे दुसरे गतिविषयक समीकरण:\ns = ut + ½gt²\n१२५ = (०)(५) + ½ * g * (५)²\n१२५ = १२.५ * g\ng = १२५ / १२.५ = १० m/s².\nम्हणून त्या ग्रहावरील गुरुत्वत्वरण १० m/s² आहे.",
            stepByStepEn = listOf(
                "Step 1: Write given parameters with proper SI units (s = 125 m, t = 5 s, u = 0).",
                "Step 2: Choose formula s = ut + ½gt².",
                "Step 3: Substitute values: 125 = 0 + 0.5 * g * 25.",
                "Step 4: Solve for g: g = 125 / 12.5 = 10 m/s².",
                "Step 5: Write final statement with correct units (m/s²)."
            ),
            stepByStepMr = listOf(
                "पायरी १: दिलेली माहिती एककांसह लिहा (s = १२५ m, t = ५ s, u = ०).",
                "पायरी २: योग्य सूत्र निवडा: s = ut + ½gt².",
                "पायरी ३: किमती भरा: १२५ = ० + ०.५ * g * २५.",
                "पायरी ४: g ची किंमत काढा: g = १२५ / १२.५ = १० m/s².",
                "पायरी ५: एककासह अंतिम उत्तर स्पष्ट लिहा (१० m/s²)."
            ),
            examinerTipEn = "Always write the formula and mention SI units in the final answer to secure full 3 marks.",
            examinerTipMr = "उत्तर लिहिताना शेवटी SI एकक (m/s²) न चुकता लिहा, अन्यथा अर्धा गुण कापला जातो."
        ),
        PYQuestion(
            id = "sci_pyq_2025",
            chapterNumber = 2,
            chapterTitleEn = "Periodic Classification",
            chapterTitleMr = "मूलद्रव्यांचे आवर्ती वर्गीकरण",
            yearTag = "March 2025",
            yearInt = 2025,
            marks = 2,
            questionType = "Give Scientific Reason",
            questionEn = "Atomic radius goes on decreasing while going from left to right within a period. Explain why.",
            questionMr = "एकाच आवर्तात डावीकडून उजवीकडे जाताना अणुत्रिज्या कमी होत जाते. शास्त्रीय कारण द्या.",
            answerEn = "1. Within a period, while going from left to right, the atomic number increases by one at a time, meaning positive charge on the nucleus increases.\n2. The newly added electron is accommodated in the same outermost shell.\n3. Due to increased nuclear charge, electrons are pulled closer to the nucleus, thereby decreasing the size of the atom (atomic radius).",
            answerMr = "१. एकाच आवर्तात डावीकडून उजवीकडे जाताना अणुअंक एकाने वाढतो, ज्यामुळे केंद्रकावरील धनप्रभार वाढतो.\n२. नव्याने येणारा इलेक्ट्रॉन त्याच बाह्यतम कवचात भरला जातो.\n३. वाढलेल्या केंद्रकीय प्रभारामुळे बाह्यतम इलेक्ट्रॉन केंद्रकाकडे अधिक आकर्षित होतात, त्यामुळे अणूचा आकार (अणुत्रिज्या) कमी होते.",
            stepByStepEn = listOf(
                "Point 1: Mention increase in nuclear charge (Z).",
                "Point 2: Mention that electrons enter the same principal shell.",
                "Point 3: Conclude that stronger electrostatic pull shrinks the atomic radius."
            ),
            stepByStepMr = listOf(
                "मुद्दा १: केंद्रकावरील धनप्रभार वाढतो हे स्पष्ट करा.",
                "मुद्दा २: इलेक्ट्रॉन एकाच कक्षेत भरले जातात हे सांगा.",
                "मुद्दा ३: केंद्रकीय आकर्षण वाढल्याने अणुत्रिज्या घटते हा निष्कर्ष नोंदवा."
            ),
            examinerTipEn = "Two concise scientific points are enough for 2 marks.",
            examinerTipMr = "२ गुणांसाठी दोन मुद्देसूद वैज्ञानिक कारणे पुरेशी असतात."
        ),
        PYQuestion(
            id = "sci_pyq_2024",
            chapterNumber = 4,
            chapterTitleEn = "Effects of Electric Current",
            chapterTitleMr = "विद्युतधारेचे परिणाम",
            yearTag = "March 2024",
            yearInt = 2024,
            marks = 3,
            questionType = "State Law & Application",
            questionEn = "State Fleming's Left-Hand Rule and name any two appliances based on it.",
            questionMr = "फ्लेमिंगचा डाव्या हाताचा नियम सांगा व या तत्त्वावर चालणाऱ्या कोणत्याही दोन उपकरणांची नावे लिहा.",
            answerEn = "Fleming's Left-Hand Rule: Stretch the thumb, index finger, and middle finger of the left hand mutually perpendicular to each other. If the index finger indicates the direction of the magnetic field and the middle finger indicates the direction of current, then the thumb points in the direction of the force (motion) acting on the conductor.\nAppliances based on it: 1. Electric Motor, 2. Electric Fan / Mixer / Washing Machine.",
            answerMr = "फ्लेमिंगचा डाव्या हाताचा नियम: डाव्या हाताचा अंगठा, तर्जनी आणि मधले बोट एकमेकांना लंबरूप राहतील असे ताणल्यास, जर तर्जनी चुंबकीय क्षेत्राची दिशा आणि मधले बोट विद्युतधारेची दिशा दर्शवत असेल, तर अंगठा विद्युत वाहकावरील बलाची (हालचालीची) दिशा दर्शवतो.\nउपकरणे: १. विद्युत मोटर, २. पंखा / मिक्सर / वॉशिंग मशीन.",
            stepByStepEn = listOf(
                "1. State the three mutually perpendicular fingers (Thumb, Index, Middle).",
                "2. Clearly identify what each finger represents (Index = Field, Middle = Current, Thumb = Force/Motion).",
                "3. List two correct appliances."
            ),
            stepByStepMr = listOf(
                "१. तीनही बोटे एकमेकांना लंबरूप असतात हे सांगा.",
                "२. प्रत्येक बोटाची दिशा स्पष्ट करा (तर्जनी = क्षेत्र, मधले बोट = धारा, अंगठा = बल).",
                "३. दोन उपकरणांची उदाहरणे लिहा."
            ),
            examinerTipEn = "Do not confuse Left-Hand Rule (Motor) with Right-Hand Rule (Generator).",
            examinerTipMr = "डाव्या हाताचा नियम मोटरसाठी आणि उजव्या हाताचा नियम जनित्रासाठी असतो, यात गल्लत करू नका."
        ),
        PYQuestion(
            id = "sci_pyq_2023",
            chapterNumber = 3,
            chapterTitleEn = "Chemical Reactions",
            chapterTitleMr = "रासायनिक अभिक्रिया",
            yearTag = "July 2023",
            yearInt = 2023,
            marks = 3,
            questionType = "Distinguish Between",
            questionEn = "Distinguish between Endothermic Reaction and Exothermic Reaction with one balanced chemical equation each.",
            questionMr = "उष्माग्राही अभिक्रिया आणि उष्मादायी अभिक्रिया यांमधील फरक प्रत्येकी एका संतुलित समीकरणासह स्पष्ट करा.",
            answerEn = "Endothermic Reaction:\n1. Heat is absorbed from surroundings during the reaction.\n2. Temperature of reaction mixture falls.\nExample: CaCO₃(s) + Heat → CaO(s) + CO₂(g)↑\n\nExothermic Reaction:\n1. Heat is released into surroundings during the reaction.\n2. Temperature of reaction mixture rises.\nExample: CaO(s) + H₂O(l) → Ca(OH)₂(aq) + Heat",
            answerMr = "उष्माग्राही अभिक्रिया:\n१. अभिक्रियेदरम्यान बाहेरील उष्णता शोषून घेतली जाते.\n२. पात्राचे तापमान कमी होते.\nउदाहरण: CaCO₃(s) + उष्णता → CaO(s) + CO₂(g)↑\n\nउष्मादायी अभिक्रिया:\n१. अभिक्रियेदरम्यान उष्णता बाहेर टाकली जाते.\n२. पात्राचे तापमान वाढते.\nउदाहरण: CaO(s) + H₂O(l) → Ca(OH)₂(aq) + उष्णता",
            stepByStepEn = listOf(
                "Definition of Endothermic with heat on reactant side.",
                "Definition of Exothermic with heat on product side.",
                "Two balanced chemical equations with state symbols."
            ),
            stepByStepMr = listOf(
                "उष्माग्राही अभिक्रियेची व्याख्या व तापमान परिणाम.",
                "उष्मादायी अभिक्रियेची व्याख्या व तापमान परिणाम.",
                "दोन्ही बाजूंची संतुलित उदाहरणे."
            ),
            examinerTipEn = "Always mention '+ Heat' correctly on the left side for endothermic and right side for exothermic.",
            examinerTipMr = "उष्माग्राहीसाठी डावीकडे '+ उष्णता' आणि उष्मादायीसाठी उजवीकडे '+ उष्णता' दाखवा."
        ),
        PYQuestion(
            id = "sci_pyq_2022",
            chapterNumber = 5,
            chapterTitleEn = "Heredity & Evolution",
            chapterTitleMr = "आनुवंशिकता आणि उत्क्रांती",
            yearTag = "March 2022",
            yearInt = 2022,
            marks = 2,
            questionType = "Short Answer",
            questionEn = "Define vestigial organs. Give any two examples found in the human body.",
            questionMr = "अवशेषांगे म्हणजे काय? मानवी शरीरात आढळणाऱ्या कोणत्याही दोन अवशेषांगांची नावे लिहा.",
            answerEn = "Definition: Degenerated or underdeveloped useless organs of organisms are called vestigial organs.\nExamples in humans: 1. Appendix, 2. Wisdom teeth, 3. Coccyx (tailbone), 4. Ear pinna muscles.",
            answerMr = "व्याख्या: सजीवातील ऱ्हास पावलेल्या किंवा अपूर्ण वाढ झालेल्या निरुपयोगी अवयवांना अवशेषांगे म्हणतात.\nमानवातील उदाहरणे: १. आंत्रपुच्छ (Appendix), २. अक्कलदाढ (Wisdom teeth), ३. माकडहाड (Coccyx).",
            stepByStepEn = listOf(
                "1. Clear definition of vestigial organ (1 Mark).",
                "2. Any two correct human examples (1 Mark)."
            ),
            stepByStepMr = listOf(
                "१. व्याख्या (१ गुण).",
                "२. दोन योग्य उदाहरणे (१ गुण)."
            ),
            examinerTipEn = "State that while appendix is useless in humans, it is functional in ruminants.",
            examinerTipMr = "आंत्रपुच्छ मानवात निरुपयोगी असले तरी रवंथ करणाऱ्या प्राण्यांत उपयुक्त असते हे नोंदवल्यास उत्तर प्रभावी ठरते."
        ),
        PYQuestion(
            id = "sci_pyq_2021",
            chapterNumber = 1,
            chapterTitleEn = "Gravitation",
            chapterTitleMr = "गुरुत्वाकर्षण",
            yearTag = "March 2021",
            yearInt = 2021,
            marks = 2,
            questionType = "Distinguish Between",
            questionEn = "Distinguish between Mass and Weight of an object.",
            questionMr = "वस्तुमान आणि वजन यांमधील फरक स्पष्ट करा.",
            answerEn = "Mass:\n1. Amount of matter present in an object.\n2. Scalar quantity.\n3. Value remains constant everywhere.\n4. SI Unit is kilogram (kg).\n\nWeight:\n1. Gravitational force with which earth attracts the object (W = mg).\n2. Vector quantity.\n3. Value changes from place to place depending on 'g'.\n4. SI Unit is Newton (N).",
            answerMr = "वस्तुमान:\n१. वस्तूमध्ये असलेल्या द्रव्यसंचयाचे प्रमाण.\n२. ही अदिश राशी आहे.\n३. याचे मूल्य सर्वत्र सारखेच राहते.\n४. SI एकक किलोग्रॅम (kg) आहे.\n\nवजन:\n१. पृथ्वी ज्या गुरुत्वीय बलाने वस्तूला आकर्षित करते ते बल (W = mg).\n२. ही सदिश राशी आहे.\n३. 'g' च्या मूल्यावर आधारित वजन बदलते.\n४. SI एकक न्यूटन (N) आहे.",
            stepByStepEn = listOf("Point 1: Definition", "Point 2: Scalar vs Vector", "Point 3: Constancy", "Point 4: SI Unit"),
            stepByStepMr = listOf("मुद्दा १: व्याख्या", "मुद्दा २: अदिश/सदिश", "मुद्दा ३: बदल/स्थिरता", "मुद्दा ४: एकक"),
            examinerTipEn = "Write at least 3 distinct comparison points in tabular format.",
            examinerTipMr = "किमान ३ मुद्दे तुलनात्मक स्वरूपात लिहा."
        ),
        PYQuestion(
            id = "sci_pyq_2020",
            chapterNumber = 4,
            chapterTitleEn = "Effects of Electric Current",
            chapterTitleMr = "विद्युतधारेचे परिणाम",
            yearTag = "March 2020",
            yearInt = 2020,
            marks = 2,
            questionType = "Give Reason",
            questionEn = "Tungsten metal is used to make a solenoid type coil in an electric bulb. Why?",
            questionMr = "विद्युत दिव्यामध्ये कुंडल तयार करण्यासाठी टंगस्टन धातूचा वापर का केला जातो?",
            answerEn = "1. Tungsten has a very high melting point (approx 3422 °C).\n2. When large electric current flows through it, it heats up to very high temperature and emits white light without melting.\nHence, tungsten is ideal for bulb filaments.",
            answerMr = "१. टंगस्टन धातूचा वितळणबिंदू अतिशय उच्च (सुमारे ३४२२ °C) असतो.\n२. यातून विद्युतधारा वाहिल्यावर प्रचंड उष्णता निर्माण होऊन ते वितळल्याशिवाय पांढरा प्रकाश उत्सर्जित करते.\nम्हणून विद्युत दिव्यामध्ये टंगस्टन वापरतात.",
            stepByStepEn = listOf("High melting point fact", "Emission of light without melting conclusion"),
            stepByStepMr = listOf("उच्च वितळणबिंदू", "न वितळता प्रकाश देण्याची क्षमता"),
            examinerTipEn = "Mention the high melting point property explicitly.",
            examinerTipMr = "उच्च वितळणबिंदू हा शब्द उत्तराचा मुख्य गाभा आहे."
        ),
        PYQuestion(
            id = "sci_pyq_2019",
            chapterNumber = 2,
            chapterTitleEn = "Periodic Classification",
            chapterTitleMr = "मूलद्रव्यांचे आवर्ती वर्गीकरण",
            yearTag = "March 2019",
            yearInt = 2019,
            marks = 2,
            questionType = "State Law",
            questionEn = "State Dobereiner's Law of Triads with one example.",
            questionMr = "डोबेरायनरचा त्रिकांचा नियम सांगून एक उदाहरण द्या.",
            answerEn = "Dobereiner's Law of Triads: When elements having similar chemical properties are arranged in increasing order of their atomic masses in a group of three (triad), the atomic mass of the middle element is approximately equal to the mean of the atomic masses of the other two elements.\nExample: Lithium (6.9), Sodium (23.0), Potassium (39.1). Mean = (6.9 + 39.1)/2 = 23.0.",
            answerMr = "डोबेरायनरचा त्रिकांचा नियम: समान रासायनिक गुणधर्म असणाऱ्या तीन मूलद्रव्यांची त्यांच्या अणुवस्तुमानाच्या चढत्या क्रमाने मांडणी केल्यास, मधल्या मूलद्रव्याचे अणुवस्तुमान हे अंदाजे इतर दोन मूलद्रव्यांच्या अणुवस्तुमानाच्या सरासरीइतके असते.\nउदाहरण: लिथियम (६.९), सोडियम (२३.०), पोटॅशियम (३९.१). सरासरी = (६.९ + ३९.१)/२ = २३.०.",
            stepByStepEn = listOf("1. Statement of law", "2. Correct triad example with calculation"),
            stepByStepMr = listOf("१. नियमाचे विधान", "२. अचूक उदाहरण व सरासरी दाखवणे"),
            examinerTipEn = "Li, Na, K is the best and easiest triad to write in exams.",
            examinerTipMr = "Li, Na, K हे सर्वात सोपे व अचूक उदाहरण आहे."
        ),
        PYQuestion(
            id = "sci_pyq_2018",
            chapterNumber = 3,
            chapterTitleEn = "Chemical Reactions",
            chapterTitleMr = "रासायनिक अभिक्रिया",
            yearTag = "March 2018",
            yearInt = 2018,
            marks = 2,
            questionType = "Definition & Prevention",
            questionEn = "What is rancidity? How can it be prevented in food products?",
            questionMr = "खवटपणा (Rancidity) म्हणजे काय? तो रोखण्यासाठी कोणते उपाय केले जातात?",
            answerEn = "When left-over edible oil or fat is kept for a long time, it undergoes slow air oxidation, developing a foul smell and unpleasant taste. This is called rancidity.\nPrevention: 1. Adding antioxidants, 2. Packaging food chips in an inert gas like Nitrogen, 3. Storing in airtight containers.",
            answerMr = "जेव्हा खाद्यतेल किंवा तूप दीर्घकाळ साठवले जाते, तेव्हा हवेतील ऑक्सिजनमुळे त्याचे मंद ऑक्सिडीकरण होऊन त्याला दुर्गंधी व कडवट चव येते. याला खवटपणा म्हणतात.\nप्रतिबंधात्मक उपाय: १. अँटीऑक्सिडंट्सचा वापर करणे, २. वेफर्स पाकिटात नायट्रोजन वायू भरणे, ३. हवाबंद डब्यात अन्न साठवणे.",
            stepByStepEn = listOf("Definition of oxidation of fats", "Two prevention methods"),
            stepByStepMr = listOf("चरबीयुक्त पदार्थांचे ऑक्सिडीकरण ही व्याख्या", "दोन प्रतिबंधक उपाय"),
            examinerTipEn = "Mention Nitrogen gas flushing as an industry standard method.",
            examinerTipMr = "नायट्रोजन वायूचा उल्लेख नक्की करा."
        ),
        PYQuestion(
            id = "sci_pyq_2017",
            chapterNumber = 1,
            chapterTitleEn = "Gravitation",
            chapterTitleMr = "गुरुत्वाकर्षण",
            yearTag = "March 2017",
            yearInt = 2017,
            marks = 3,
            questionType = "Derivation / Law",
            questionEn = "State Kepler's three laws of planetary motion with a neat labeled diagram.",
            questionMr = "ग्रहांच्या गतीविषयक केप्लरचे तिन्ही नियम आकृतीसह स्पष्ट करा.",
            answerEn = "1. First Law (Law of Orbits): The orbit of a planet is an ellipse with the Sun at one of the foci.\n2. Second Law (Law of Equal Areas): The line joining the planet and the Sun sweeps equal areas in equal intervals of time (Area ASB = Area CSD).\n3. Third Law (Law of Periods): The square of its period of revolution around the Sun is directly proportional to the cube of the mean distance of a planet from the Sun (T² ∝ r³, i.e., T²/r³ = constant).",
            answerMr = "१. पहिला नियम (कक्षेचा नियम): ग्रहाची कक्षा लंबवर्तुळाकार असून सूर्य त्या कक्षेच्या एका नाभीवर असतो.\n२. दुसरा नियम (समान क्षेत्रफळाचा नियम): ग्रहाला सूर्याशी जोडणारी सरळ रेषा समान कालावधीत समान क्षेत्रफळ व्यापन करते (क्षेत्रफळ ASB = क्षेत्रफळ CSD).\n३. तिसरा नियम (आवर्तकालाचा नियम): सूर्याची प्रदक्षिणा करणाऱ्या ग्रहाच्या आवर्तकालाचा वर्ग (T²) हा सूर्यापासूनच्या सरासरी अंतराच्या घनाशी (r³) समानुपाती असतो (T²/r³ = स्थिरांक).",
            stepByStepEn = listOf("Kepler 1st Law", "Kepler 2nd Law", "Kepler 3rd Law formula"),
            stepByStepMr = listOf("पहिला नियम", "दुसरा नियम", "तिसरा नियम सूत्र"),
            examinerTipEn = "Drawing the elliptical orbit with foci S and points A, B, C, D gives full marks.",
            examinerTipMr = "लंबवर्तुळाकार कक्षेची साधी नामनिर्देशित आकृती काढल्यास पूर्ण ३ गुण मिळतात."
        )
    )

    val flashcards = listOf(
        Flashcard(
            id = "sci_fc1",
            chapterTitleEn = "Gravitation",
            chapterTitleMr = "गुरुत्वाकर्षण",
            frontEn = "Universal Gravitational Law Formula",
            frontMr = "वैश्विक गुरुत्वाकर्षणाचे सूत्र",
            backEn = "F = G × (m₁ × m₂) / r²\n\nG = 6.67 × 10⁻¹¹ N m²/kg²\n(Discovered by Henry Cavendish)",
            backMr = "F = G × (m₁ × m₂) / r²\n\nG = ६.६७ × १०⁻¹¹ N m²/kg²\n(कॅव्हेंडिशने शोधले)",
            tagEn = "Core Law",
            tagMr = "महत्त्वाचे सूत्र"
        ),
        Flashcard(
            id = "sci_fc2",
            chapterTitleEn = "Gravitation",
            chapterTitleMr = "गुरुत्वाकर्षण",
            frontEn = "Escape Velocity (v_esc)",
            frontMr = "मुक्ती वेग (v_esc)",
            backEn = "v_esc = √(2GM / R) = √(2gR)\n\nValue on Earth = 11.2 km/s\nValue on Moon = 2.37 km/s",
            backMr = "v_esc = √(२GM / R) = √(२gR)\n\nपृथ्वीवर मूल्य = ११.२ km/s\nचंद्रावर मूल्य = २.३७ km/s",
            tagEn = "Formula",
            tagMr = "भौतिक सूत्र"
        ),
        Flashcard(
            id = "sci_fc3",
            chapterTitleEn = "Effects of Electric Current",
            chapterTitleMr = "विद्युतधारेचे परिणाम",
            frontEn = "Joule's Law of Heating",
            frontMr = "ज्यूलचा उष्णतेचा नियम",
            backEn = "H = I² × R × t\n\nor H = V × I × t = (V² / R) × t\nUnit: Joule (J)",
            backMr = "H = I² × R × t\n\nकिंवा H = V × I × t\nएकक: ज्यूल (J)",
            tagEn = "Formula",
            tagMr = "विद्युत सूत्र"
        ),
        Flashcard(
            id = "sci_fc4",
            chapterTitleEn = "Periodic Classification",
            chapterTitleMr = "आवर्ती वर्गीकरण",
            frontEn = "Modern Periodic Law",
            frontMr = "आधुनिक आवर्ती नियम",
            backEn = "'Properties of elements are a periodic function of their atomic numbers (Z).'\nDiscovered by Henry Moseley (1913).",
            backMr = "'मूलद्रव्यांचे गुणधर्म हे त्यांच्या अणुअंकांचे (Z) आवर्ती फल असतात.'\nशोध: हेन्री मोस्ले (१९१३).",
            tagEn = "Definition",
            tagMr = "नियम व्याख्या"
        ),
        Flashcard(
            id = "sci_fc5",
            chapterTitleEn = "Refraction of Light",
            chapterTitleMr = "प्रकाशाचे अपवर्तन",
            frontEn = "Snell's Law of Refraction",
            frontMr = "स्नेलचा अपवर्तन नियम",
            backEn = "sin i / sin r = constant = n\n\nWhere 'n' is refractive index of medium 2 with respect to medium 1.",
            backMr = "sin i / sin r = स्थिरांक = n\n\nयेथे 'n' हा दुसऱ्या माध्यमाचा पहिल्या माध्यमाच्या सापेक्ष अपवर्तनांक आहे.",
            tagEn = "Optics Law",
            tagMr = "प्रकाशीय नियम"
        )
    )

    val quizQuestions = listOf(
        QuizQuestion(
            id = "sci_q1",
            chapterTitleEn = "Gravitation",
            chapterTitleMr = "गुरुत्वाकर्षण",
            questionEn = "What is the value of acceleration due to gravity (g) at the center of the Earth?",
            questionMr = "पृथ्वीच्या केंद्रभागी गुरुत्वत्वरणाचे (g) मूल्य किती असते?",
            optionsEn = listOf("9.8 m/s²", "0 m/s²", "9.83 m/s²", "Infinity"),
            optionsMr = listOf("९.८ m/s²", "० m/s²", "९.८३ m/s²", "अनंत"),
            correctIndex = 1,
            explanationEn = "At the center of the Earth, the effective mass attracting an object is zero, so g = 0 m/s².",
            explanationMr = "पृथ्वीच्या केंद्रस्थानी वस्तुमान सर्व बाजूंनी संतुलित होत असल्याने प्रभावी गुरुत्वत्वरण शून्य (०) असते."
        ),
        QuizQuestion(
            id = "sci_q2",
            chapterTitleEn = "Periodic Classification",
            chapterTitleMr = "मूलद्रव्यांचे आवर्ती वर्गीकरण",
            questionEn = "In the modern periodic table, the elements in group 17 are known as:",
            questionMr = "आधुनिक आवर्तसारणीमध्ये गण १७ मधील मूलद्रव्यांना काय म्हणतात?",
            optionsEn = listOf("Alkali metals", "Noble gases", "Halogens", "Alkaline earth metals"),
            optionsMr = listOf("अल्कली धातू", "राजवायू", "हॅलोजन्स", "अल्कधर्मी मृदा धातू"),
            correctIndex = 2,
            explanationEn = "Group 17 elements (Fluorine, Chlorine, Bromine, Iodine) have 7 valence electrons and are called Halogens.",
            explanationMr = "गण १७ मधील मूलद्रव्यांना (F, Cl, Br, I) हॅलोजन्स म्हणतात. त्यांच्या बाह्यतम कक्षेत ७ इलेक्ट्रॉन असतात."
        ),
        QuizQuestion(
            id = "sci_q3",
            chapterTitleEn = "Chemical Reactions",
            chapterTitleMr = "रासायनिक अभिक्रिया",
            questionEn = "Rusting of iron is an example of which type of chemical process?",
            questionMr = "लोखंड गंजणे ही कोणत्या प्रकारची रासायनिक प्रक्रिया आहे?",
            optionsEn = listOf("Fast decomposition", "Slow oxidation / Corrosion", "Neutralization", "Thermal displacement"),
            optionsMr = listOf("जलद अपघटन", "मंद ऑक्सिडीकरण / क्षरण", "उदासीनीकरण", "उष्णता विस्थापन"),
            correctIndex = 1,
            explanationEn = "Rusting of iron (formation of Fe₂O₃·xH₂O) is a slow electrochemical oxidation reaction caused by moisture and oxygen.",
            explanationMr = "लोखंड गंजणे ही दमट हवा आणि ऑक्सिजनमुळे होणारी मंद ऑक्सिडीकरण (क्षरण) प्रक्रिया आहे."
        ),
        QuizQuestion(
            id = "sci_q4",
            chapterTitleEn = "Effects of Electric Current",
            chapterTitleMr = "विद्युतधारेचे परिणाम",
            questionEn = "1 commercial unit of electric energy (1 kWh) is equal to how many Joules?",
            questionMr = "विद्युत ऊर्जेचे १ युनिट (१ kWh) म्हणजे किती ज्यूल?",
            optionsEn = listOf("3.6 × 10³ J", "3.6 × 10⁵ J", "3.6 × 10⁶ J", "1000 J"),
            optionsMr = listOf("३.६ × १०³ J", "३.६ × १०⁵ J", "३.६ × १०⁶ J", "१००० J"),
            correctIndex = 2,
            explanationEn = "1 kWh = 1000 W × 3600 seconds = 3,600,000 Joules = 3.6 × 10⁶ Joules.",
            explanationMr = "१ kWh = १००० W × ३६०० सेकंद = ३६,००,००० ज्यूल = ३.६ × १०⁶ ज्यूल."
        ),
        QuizQuestion(
            id = "sci_q5",
            chapterTitleEn = "Heredity and Evolution",
            chapterTitleMr = "आनुवंशिकता आणि उत्क्रांती",
            questionEn = "The process of RNA synthesis from DNA is called:",
            questionMr = "DNA कडून RNA तयार होण्याच्या प्रक्रियेस काय म्हणतात?",
            optionsEn = listOf("Translation", "Transcription", "Translocation", "Mutation"),
            optionsMr = listOf("भाषांतरण", "प्रतिलेखन", "स्थानांतरण", "उत्परिवर्तन"),
            correctIndex = 1,
            explanationEn = "Synthesis of mRNA using information encoded in DNA is called Transcription (प्रतिलेखन).",
            explanationMr = "DNA वरील संकेतानुसार mRNA तयार करण्याच्या प्रक्रियेला प्रतिलेखन (Transcription) म्हणतात."
        )
    )
}
