package com.example.data.repository

import com.example.data.model.ChapterNote
import com.example.data.model.Flashcard
import com.example.data.model.PYQuestion
import com.example.data.model.QuizQuestion

object SocialScienceData {

    val chapters = listOf(
        ChapterNote(
            id = "soc_ch1",
            chapterNumber = 1,
            chapterTitleEn = "Historiography: Development in the West",
            chapterTitleMr = "इतिहासलेखन: पाश्चात्त्य परंपरा",
            summaryEn = "Critical examination of historical sources, dialectics, Enlightenment thinkers: René Descartes, Voltaire (father of modern historiography), Karl Marx, Leopold von Ranke.",
            summaryMr = "ऐतिहासिक साधनांची चिकित्सक तपासणी, द्वंद्ववाद, प्रबोधन काळातील विचारवंत: रेने देकार्त, व्हॉल्तेअर (आधुनिक इतिहासलेखनाचा जनक), कार्ल मार्क्स, लेओपॉल्ड फॉन रांके.",
            keyPointsEn = listOf(
                "Modern Historiography: Based on scientific principles, uses anthropocentric questions, supported by reliable historical evidence.",
                "Voltaire (François-Marie Arouet): Considered the founder of modern historiography; emphasized human relations, society, trade, and agriculture along with chronology.",
                "René Descartes: Wrote 'Discourse on the Method'; rule: 'Never accept anything as true unless all grounds of doubt are excluded'.",
                "Georg Wilhelm Friedrich Hegel: Introduced 'Dialectics' (Thesis, Antithesis, Synthesis) to understand historical reality.",
                "Leopold von Ranke: Emphasized original documents and critical examination; opposed romanticising history.",
                "Karl Marx: 'Das Kapital'; historical development is driven by class struggle between bourgeoisie and proletariat."
            ),
            keyPointsMr = listOf(
                "आधुनिक इतिहासलेखन: वैज्ञानिक पद्धतीवर आधारलेले, मानवकेन्द्री प्रश्न, आणि विश्वासार्ह पुराव्यांचा आधार.",
                "व्हॉल्तेअर: आधुनिक इतिहासलेखनाचा जनक; फक्त राजे-लढाया नव्हे तर समाज, शेती, व्यापार आणि मानवी संबंधांचा अभ्यास महत्त्वाचा मानला.",
                "रेने देकार्त: 'डिस्कॉर्स ऑन द मेथड' ग्रंथ; 'सत्यतेची खात्री झाल्याशिवाय कोणत्याही गोष्टीचा स्वीकार करू नका'.",
                "गेऑर्ग हेगेल: 'द्वंद्ववाद' (Dialectics) संकल्पना मांडली (प्रवाद, प्रतिवाद आणि समन्वय).",
                "लेओपॉल्ड फॉन रांके: मूळ ऐतिहासिक कागदपत्रांच्या चिकित्सेवर भर दिला.",
                "कार्ल मार्क्स: 'दास कॅपिटल' ग्रंथ; मानवी इतिहास हा वर्गसंघर्षाचा इतिहास आहे."
            ),
            importantFormulasLawsEn = listOf(
                "Dialectics: Thesis + Antithesis -> Synthesis",
                "Voltaire = Father of Modern Historiography",
                "Annales School: Shifted focus from politics to climate, trade, and people"
            ),
            importantFormulasLawsMr = listOf(
                "द्वंद्ववाद: प्रवाद + प्रतिवाद -> समन्वय",
                "व्हॉल्तेअर = आधुनिक इतिहासलेखनाचा जनक",
                "अ‍ॅनल्स प्रणाली: केवळ राजकारणाऐवजी हवामान, स्थानिक लोक, शेती यांच्यावर भर"
            ),
            examWeightageMarks = "4-6 Marks"
        ),
        ChapterNote(
            id = "soc_ch2",
            chapterNumber = 2,
            chapterTitleEn = "Applied History & Cultural Heritage",
            chapterTitleMr = "उपयोजित इतिहास आणि सांस्कृतिक वारसा",
            summaryEn = "Public history, preservation of cultural (tangible & intangible) and natural heritage, UNESCO World Heritage sites in Maharashtra and India.",
            summaryMr = "लोकांसाठी इतिहास (Public History), सांस्कृतिक वारसा (मूर्त व अमूर्त) आणि नैसर्गिक वारसा यांचे जतन व संवर्धन, युनेस्कोची भारतातील जागतिक वारसा स्थळे.",
            keyPointsEn = listOf(
                "Applied History (Public History): Application of historical knowledge for the benefit of people in present and future times.",
                "Tangible Cultural Heritage: Ancient monuments, historic buildings, inscriptions, manuscripts, artefacts.",
                "Intangible Cultural Heritage: Oral traditions, performing arts, rituals, traditional craftsmanship, Kalbelia dance, Vedic chanting.",
                "UNESCO World Heritage Sites in Maharashtra: Ajanta Caves, Ellora Caves, Elephanta Caves, Chhatrapati Shivaji Maharaj Terminus (CSMT), Western Ghats (Kaas Plateau).",
                "Archives: National Archives of India is in New Delhi; preserves government records and historical documents."
            ),
            keyPointsMr = listOf(
                "उपयोजित इतिहास: वर्तमानातील आणि भविष्यातील मानवाच्या हितासाठी इतिहासाच्या ज्ञानाचा उपयोग करणे.",
                "मूर्त सांस्कृतिक वारसा: प्राचीन वास्तू, किल्ले, नाणी, शिलालेख, हस्तलिखिते.",
                "अमूर्त सांस्कृतिक वारसा: मौखिक परंपरा, सण-उत्सव, लोककला, वैदिक पठण परंपरा, कालबेलिया नृत्य.",
                "महाराष्ट्रातील युनेस्को वारसा स्थळे: अजिंठा लेणी, वेरूळ लेणी, घारापुरी (एलिफंटा) लेणी, छत्रपती शिवाजी महाराज टर्मिनस, पश्चिम घाट (कास पठार).",
                "राष्ट्रीय अभिलेखागार: नवी दिल्ली येथे असून आशिया खंडातील सर्वात मोठे दस्तऐवज केंद्र आहे."
            ),
            importantFormulasLawsEn = listOf(
                "ICOMOS: International Council on Monuments and Sites",
                "National Archives of India: Located in New Delhi"
            ),
            importantFormulasLawsMr = listOf(
                "युनेस्को (UNESCO): जागतिक वारसा स्थळांची यादी जाहीर करते",
                "भारतीय राष्ट्रीय अभिलेखागार: नवी दिल्ली"
            ),
            examWeightageMarks = "5-6 Marks"
        ),
        ChapterNote(
            id = "soc_ch3",
            chapterNumber = 3,
            chapterTitleEn = "Working of Constitution & Electoral Process",
            chapterTitleMr = "संविधानाची वाटचाल आणि निवडणूक प्रक्रिया",
            summaryEn = "Democracy, social justice, equality, Right to Information (RTI 2005), 73rd and 74th Amendments (Panchayati Raj), Election Commission of India, EVM, and VVPAT.",
            summaryMr = "लोकशाही, सामाजिक न्याय, समता, माहितीचा अधिकार (RTI २००५), ७३ वी व ७४ वी घटनादुरुस्ती (स्थानिक शासन), भारतीय निवडणूक आयोग, ईव्हीएम व व्हीव्हीपॅट.",
            keyPointsEn = listOf(
                "Right to Information (RTI Act 2005): Brought transparency and accountability to government operations, curbing secrecy.",
                "Women's Political Representation: 73rd & 74th Constitutional Amendments reserved 33% (now 50% in Maharashtra) seats for women in local self-governments.",
                "Election Commission of India (Article 324): Autonomous constitutional body headed by Chief Election Commissioner; conducts free and fair elections.",
                "Voting Age Reform: 61st Constitutional Amendment (1988) reduced voting age from 21 years to 18 years.",
                "EVM (Electronic Voting Machine) & VVPAT: Ensures accurate tally, saves paper, protects secret ballot, and allows voter verification."
            ),
            keyPointsMr = listOf(
                "माहितीचा अधिकार (RTI कायदा २००५): शासकीय कारभारात पारदर्शकता व उत्तरदायित्व आणून गोपनीयता संपवली.",
                "महिलांचे राजकीय प्रतिनिधित्व: ७३ व ७४ व्या घटनादुरुस्तीने स्थानिक स्वराज्य संस्थांत ३३% (महाराष्ट्रात ५०%) जागा आरक्षित केल्या.",
                "भारतीय निवडणूक आयोग (कलम ३२४): स्वायत्त घटनात्मक संस्था; मुख्य निवडणूक आयुक्त आणि इतर आयुक्तांची राष्ट्रपतींद्वारे नियुक्ती.",
                "मतदानाचे वय: ६१ व्या घटनादुरुस्तीने (१९८८) मतदानाचे वय २१ वरून १८ वर्षे केले.",
                "EVM आणि VVPAT: कागदाची बचत, जलद व पारदर्शक निकाल आणि मतदाराला पोचपावती."
            ),
            importantFormulasLawsEn = listOf(
                "RTI Act enacted in 2005",
                "First Chief Election Commissioner of India: Sukumar Sen"
            ),
            importantFormulasLawsMr = listOf(
                "माहितीचा अधिकार: २००५ साली लागू",
                "भारताचे पहिले मुख्य निवडणूक आयुक्त: सुकुमार सेन"
            ),
            examWeightageMarks = "5-7 Marks"
        ),
        ChapterNote(
            id = "soc_ch4",
            chapterNumber = 4,
            chapterTitleEn = "Geography: India & Brazil Comparison",
            chapterTitleMr = "भूगोल: भारत आणि ब्राझील तुलना",
            summaryEn = "Comparative study of physiography, rivers (Ganga vs Amazon), climate, monsoon, vegetation (Evergreen, Pantanal swamps), and wildlife.",
            summaryMr = "प्राकृतिक रचना, नद्या (गंगा व अमेझॉन), हवामान, मान्सून पर्जन्य, नैसर्गिक वनस्पती आणि वन्यजीव यांचा तुलनात्मक अभ्यास.",
            keyPointsEn = listOf(
                "Location: India is in Northern & Eastern hemispheres (Asian continent); Brazil is mostly in Southern & Western hemispheres (South America).",
                "Physiography of India: The Himalayas, North Indian Plains, The Peninsular Plateau, Coastal Plains, Island Groups (Andaman & Nicobar, Lakshadweep).",
                "Physiography of Brazil: The Highlands (Guyana & Brazilian), The Great Escarpment, The Plains (Amazon & Pantanal), The Coastal Plains.",
                "River Comparison: Amazon has highest discharge (200,000 m³/s) and almost no sediment at mouth; Ganga has vast sediment deposition creating the world's largest delta (Sundarbans).",
                "Climate: India has tropical monsoon climate; Brazil has equatorial humid climate in the north and temperate in the south."
            ),
            keyPointsMr = listOf(
                "स्थान: भारत उत्तर व पूर्व गोलार्धात (आशिया खंड); ब्राझील प्रामुख्याने दक्षिण व पश्चिम गोलार्धात (दक्षिण अमेरिका खंड).",
                "भारताची प्राकृतिक रचना: हिमालय, उत्तर भारतीय मैदाने, द्वीपकल्पीय पठार, किनारपट्टीची मैदाने, द्वीपसमूह (अंदमान-निकोबार व लक्षद्वीप).",
                "ब्राझीलची प्राकृतिक रचना: उच्चभूमी (गियाना व ब्राझील), अजस्त्र कडा, मैदाने (अमेझॉन व पँटानल), किनारपट्टीचे प्रदेश.",
                "नद्यांची तुलना: अमेझॉन नदीचे विसर्जन सर्वाधिक (२,००,००० m³/s), मुखाशी गाळ साचत नाही; गंगा नदीच्या मुखाशी जगातील सर्वात मोठा सुंदरबन त्रिभुज प्रदेश तयार होतो.",
                "हवामान: भारताचे हवामान मोसमी (मान्सून) आहे; ब्राझीलमध्ये उत्तरेस उष्ण कटिबंधीय विषुववृत्तीय तर दक्षिणेस समशीतोष्ण हवामान आढळते."
            ),
            importantFormulasLawsEn = listOf(
                "World's largest delta: Sundarbans (formed by Ganga & Brahmaputra)",
                "Pantanal: World's largest tropical wetland situated in Brazil"
            ),
            importantFormulasLawsMr = listOf(
                "जगातील सर्वात मोठा त्रिभुज प्रदेश: सुंदरबन (गंगा व ब्रह्मपुत्रा)",
                "पँटानल: जगातील सर्वात मोठे दलदलीचे प्रदेश (ब्राझील)"
            ),
            examWeightageMarks = "8-10 Marks"
        )
    )

    val pyqs = listOf(
        PYQuestion(
            id = "soc_pyq_2026",
            chapterNumber = 1,
            chapterTitleEn = "Historiography",
            chapterTitleMr = "इतिहासलेखन",
            yearTag = "March 2026 Model",
            yearInt = 2026,
            marks = 3,
            questionType = "Answer in Detail",
            questionEn = "Why is Voltaire considered the founder of modern historiography?",
            questionMr = "व्हॉल्तेअरला आधुनिक इतिहासलेखनाचा जनक असे का म्हटले जाते?",
            answerEn = "Voltaire (François-Marie Arouet) is considered the founder of modern historiography because:\n1. He opined that along with objective truth and chronology of historical events, considering social traditions, trade, economy, and agriculture was equally important in historiography.\n2. He brought to the fore the understanding that all aspects of human life are important for history writing.\n3. He moved history beyond merely recounting kings, wars, and dynastic politics.",
            answerMr = "व्हॉल्तेअरला आधुनिक इतिहासलेखनाचा जनक मानले जाते, कारण:\n१. केवळ वस्तुनिष्ठ सत्य आणि घटनांची कालक्रमानुसार नोंद करणे एवढेच इतिहासलेखनाचे उद्दिष्ट नसून तत्कालीन समाज, व्यापार, अर्थव्यवस्था आणि शेती यांचा विचार करणे आवश्यक आहे असे त्याने मांडले.\n२. मानवी जीवनाचे सर्व पैलू इतिहासलेखनात महत्त्वाचे आहेत हा विचार त्याने पुढे आणला.\n३. इतिहासाला केवळ राजे आणि युद्धांच्या वर्णनातून बाहेर काढून सामान्य माणसाच्या जीवनाशी जोडले.",
            stepByStepEn = listOf(
                "Mention Voltaire's emphasis on trade, agriculture, and society.",
                "Explain the transition from royal dynasties to holistic human life.",
                "Conclude with title 'Father of Modern Historiography'."
            ),
            stepByStepMr = listOf(
                "व्यापार, शेती, सामाजिक परंपरा यांवरील भर स्पष्ट करा.",
                "केवळ युद्धांऐवजी सर्वांगीण मानवी जीवनाचा अभ्यास.",
                "आधुनिक इतिहासलेखनाचा जनक म्हणून निष्कर्ष."
            ),
            examinerTipEn = "State at least 3 distinct conceptual points to earn full 3 marks.",
            examinerTipMr = "३ गुणांसाठी तिन्ही मुद्दे स्पष्ट आणि प्रभावी भाषेत लिहा."
        ),
        PYQuestion(
            id = "soc_pyq_2025",
            chapterNumber = 3,
            chapterTitleEn = "Working of Constitution",
            chapterTitleMr = "संविधानाची वाटचाल",
            yearTag = "March 2025",
            yearInt = 2025,
            marks = 2,
            questionType = "Explain the Concept",
            questionEn = "Explain the concept: Right to Information (RTI Act 2005).",
            questionMr = "संकल्पना स्पष्ट करा: माहितीचा अधिकार (RTI कायदा २००५).",
            answerEn = "1. Citizen Empowerment: RTI Act was enacted in 2005 to promote transparency and accountability in governance.\n2. Secrecy Reduced: It dismantled the culture of bureaucratic secrecy and empowered citizens to question governmental decisions and curb corruption.\n3. Strengthened Democracy: It turned governance into a two-way communication between citizens and the state.",
            answerMr = "१. नागरिकांचे सक्षमीकरण: प्रशासनात पारदर्शकता आणि उत्तरदायित्व आणण्यासाठी २००५ मध्ये माहितीचा अधिकार कायदा संमत झाला.\n२. गोपनीयतेला आळा: शासकीय कारभारातील अनावश्यक गोपनीयता संपुष्टात आणून भ्रष्टाचाराला आळा घालण्यास मदत झाली.\n३. लोकशाहीची बळकटी: नागरिक आणि शासन यांच्यातील संवाद वाढवून लोकशाही अधिक सक्षम केली.",
            stepByStepEn = listOf("Year of enactment (2005)", "Transparency and accountability purpose", "Impact on democracy"),
            stepByStepMr = listOf("२००५ सालचा उल्लेख", "पारदर्शकता व उत्तरदायित्व हे मुख्य उद्दिष्ट", "लोकशाहीवरील परिणाम"),
            examinerTipEn = "Mention the year 2005 without fail.",
            examinerTipMr = "२००५ हे वर्ष न विसरता लिहा."
        ),
        PYQuestion(
            id = "soc_pyq_2024",
            chapterNumber = 4,
            chapterTitleEn = "Geography: India & Brazil",
            chapterTitleMr = "भूगोल: भारत आणि ब्राझील",
            yearTag = "March 2024",
            yearInt = 2024,
            marks = 3,
            questionType = "Give Geographical Reason",
            questionEn = "Give geographical reasons: The plains of Amazon Basin are relatively sparsely populated.",
            questionMr = "भौगोलिक कारणे द्या: अमेझॉन नदीच्या खोऱ्यात लोकसंख्येची घनता विरळ आहे.",
            answerEn = "1. Dense Equator Forests: The Amazon Basin has dense, impenetrable rainforests (Selvas) due to high heat and heavy daily convectional rainfall.\n2. Inhospitable Climate: The climate is hot and humid, leading to disease-prone conditions.\n3. Poor Accessibility: Lack of transportation and road infrastructure makes communication extremely difficult.\nHence, human settlement is restricted, leading to sparse population.",
            answerMr = "१. अतिदाट वने: उष्ण व दमट हवामान आणि दररोज पडणारा मुसळधार पाऊस यांमुळे अमेझॉन खोऱ्यात सदाहरित वर्षावने (सेल्व्हाज) पसरली आहेत.\n२. प्रतिकूल हवामान: हवामान उष्ण, दमट आणि आरोग्यास प्रतिकूल आहे.\n३. वाहतुकीच्या साधनांचा अभाव: दाट जंगलांमुळे रस्ते व लोहमार्गांचा विकास मर्यादित झाला आहे.\nम्हणून या भागात मानवी वस्त्यांचे प्रमाण खूप कमी असून लोकसंख्या विरळ आहे.",
            stepByStepEn = listOf("Equatorial dense forest condition", "Unhealthy humid climate", "Lack of transport infrastructure"),
            stepByStepMr = listOf("सदाहरित वर्षावने व दलदल", "रोगट व दमट हवामान", "वाहतूक सुविधांचा अभाव"),
            examinerTipEn = "Use proper terms like 'Selvas' (rainforests) to show subject mastery.",
            examinerTipMr = "'वर्षावने' किंवा 'सेल्व्हाज' असा उल्लेख आवर्जून करा."
        ),
        PYQuestion(
            id = "soc_pyq_2023",
            chapterNumber = 2,
            chapterTitleEn = "Applied History",
            chapterTitleMr = "उपयोजित इतिहास",
            yearTag = "July 2023",
            yearInt = 2023,
            marks = 2,
            questionType = "Identify & Name",
            questionEn = "Name any two UNESCO World Heritage Cultural Sites situated in Maharashtra.",
            questionMr = "महाराष्ट्रातील कोणत्याही दोन युनेस्को जागतिक सांस्कृतिक वारसा स्थळांची नावे लिहा.",
            answerEn = "1. Ajanta Caves (Chhatrapati Sambhajinagar district).\n2. Ellora Caves (Chhatrapati Sambhajinagar district).\n3. Chhatrapati Shivaji Maharaj Terminus (CSMT), Mumbai.\n4. Elephanta Caves, Mumbai.",
            answerMr = "१. अजिंठा लेणी (छत्रपती संभाजीनगर).\n२. वेरूळ लेणी (छत्रपती संभाजीनगर).\n३. छत्रपती शिवाजी महाराज टर्मिनस (CSMT), मुंबई.\n४. घारापुरी (एलिफंटा) लेणी.",
            stepByStepEn = listOf("List two accurate sites with correct districts."),
            stepByStepMr = listOf("जिल्ह्यासह दोन अचूक वारसा स्थळे लिहा."),
            examinerTipEn = "Do not name natural sites (like Kaas) when 'Cultural' site is specifically asked.",
            examinerTipMr = "सांस्कृतिक वारसा विचारल्यास कास पठार (नैसर्गिक) लिहू नका; अजिंठा, वेरूळ किंवा CSMT लिहा."
        ),
        PYQuestion(
            id = "soc_pyq_2022",
            chapterNumber = 3,
            chapterTitleEn = "Electoral Process",
            chapterTitleMr = "निवडणूक प्रक्रिया",
            yearTag = "March 2022",
            yearInt = 2022,
            marks = 2,
            questionType = "Short Note",
            questionEn = "Write a short note on: Code of Conduct in Elections.",
            questionMr = "टीप लिहा: आचारसंहिता (Code of Conduct).",
            answerEn = "1. Definition: The Model Code of Conduct is a set of rules issued by the Election Commission to ensure free, fair, and peaceful elections.\n2. Binding on All: It applies to political parties, candidates, and government officials from the announcement of election dates until results.\n3. Restrictions: Prevents abuse of government power, official vehicles, bribery, hate speech, and unfair campaigning.",
            answerMr = "१. व्याख्या: निवडणुका निष्पक्ष, शांततापूर्ण वातावरणात पार पाडण्यासाठी निवडणूक आयोगाने लागू केलेली नियमावली म्हणजे आचारसंहिता.\n२. सर्वांवर बंधनकारक: निवडणुका जाहीर झाल्यापासून निकाल लागेपर्यंत सर्व राजकीय पक्ष, उमेदवार आणि प्रशासनावर ती लागू असते.\n३. गैरवापरावर बंदी: सरकारी यंत्रणा, गाड्यांचा गैरवापर, पैशांचे आमिष किंवा प्रक्षोभक भाषणे यांवर कडक बंदी घातली जाते.",
            stepByStepEn = listOf("Issuing authority (Election Commission)", "Time duration", "Prohibitions and purpose"),
            stepByStepMr = listOf("निवडणूक आयोगाचा अधिकार", "कालावधी", "उद्दिष्ट व बंधने"),
            examinerTipEn = "Emphasize that it prevents ruling parties from misusing state machinery.",
            examinerTipMr = "सत्तारूढ पक्षाकडून सत्तेचा गैरवापर टाळणे हा मुख्य उद्देश स्पष्ट करा."
        ),
        PYQuestion(
            id = "soc_pyq_2021",
            chapterNumber = 4,
            chapterTitleEn = "Geography: Climate",
            chapterTitleMr = "भूगोल: हवामान",
            yearTag = "March 2021",
            yearInt = 2021,
            marks = 3,
            questionType = "Distinguish Between",
            questionEn = "Distinguish between the river systems of Ganga (India) and Amazon (Brazil).",
            questionMr = "गंगा नदी खोरे (भारत) आणि अमेझॉन नदी खोरे (ब्राझील) यांमधील फरक स्पष्ट करा.",
            answerEn = "Ganga River Basin:\n1. Originates in the Gangotri glacier in the Himalayas.\n2. Discharges into Bay of Bengal, forming the world's largest delta (Sundarbans).\n3. Discharge is around 16,650 m³/s.\n\nAmazon River Basin:\n1. Originates on the eastern slopes of the Andes mountains in Peru.\n2. Discharges into the Atlantic Ocean with no delta at its mouth due to enormous flow.\n3. Discharges massive 200,000 m³/s of water.",
            answerMr = "गंगा नदी खोरे:\n१. हिमालयातील गंगोत्री हिमनदीतून उगम पावते.\n२. बंगालच्या उपसागराला मिळते व जगातील सर्वात मोठा सुंदरबन त्रिभुज प्रदेश तयार करते.\n३. विसर्जनाचे प्रमाण सुमारे १६,६५० m³/s आहे.\n\nअमेझॉन नदी खोरे:\n१. पेरू देशातील अँडीज पर्वतरांगेत उगम पावते.\n२. प्रचंड वेगाने अटलांटिक महासागराला मिळते; मुखाशी गाळ न साचल्याने त्रिभुज प्रदेश तयार होत नाही.\n३. पाण्याचा विसर्ग तब्बल २,००,००० m³/s आहे.",
            stepByStepEn = listOf("Origin point", "Delta formation vs no delta", "Volume of water discharge"),
            stepByStepMr = listOf("उगमस्थान", "त्रिभुज प्रदेश निर्मिती", "विसर्जनाचे प्रमाण"),
            examinerTipEn = "The absence of delta in Amazon is a favorite question of board examiners.",
            examinerTipMr = "अमेझॉनच्या मुखाशी त्रिभुज प्रदेश का तयार होत नाही हा बोर्डाचा आवडीचा प्रश्न आहे."
        ),
        PYQuestion(
            id = "soc_pyq_2020",
            chapterNumber = 1,
            chapterTitleEn = "Historiography",
            chapterTitleMr = "इतिहासलेखन",
            yearTag = "March 2020",
            yearInt = 2020,
            marks = 2,
            questionType = "Concept Map",
            questionEn = "Explain Karl Marx's theory of Class Struggle.",
            questionMr = "कार्ल मार्क्सचा वर्गसंघर्षाचा सिद्धांत थोडक्यात स्पष्ट करा.",
            answerEn = "According to Karl Marx:\n1. History is not about abstract ideas; it is about living human beings.\n2. Human relationships are shaped by the fundamental needs of people and ownership of the means of production.\n3. Society gets divided into two classes: the rich who own means of production (Bourgeoisie) and the workers (Proletariat), leading to inevitable class struggle.",
            answerMr = "कार्ल मार्क्सच्या मते:\n१. इतिहास अमूर्त कल्पनांचा नसून जिवंत माणसांचा असतो.\n२. मानवी नातेसंबंध मूलभूत गरजा आणि उत्पादन साधनांच्या मालकीवर आधारलेले असतात.\n३. उत्पादन साधने असणारा वर्ग (भांडवलदार) आणि कष्टकरी वर्ग (सर्वहारा) यांच्यात निर्माण होणारी विषमतेतून वर्गसंघर्ष पेटतो.",
            stepByStepEn = listOf("Concrete human relations", "Ownership of means of production", "Exploiter vs exploited classes"),
            stepByStepMr = listOf("जिवंत माणसांचा इतिहास", "उत्पादन साधनांची मालकी", "शोषक व शोषित वर्ग"),
            examinerTipEn = "Mention Marx's seminal book 'Das Kapital'.",
            examinerTipMr = "मार्क्सच्या 'दास कॅपिटल' ग्रंथाचा उल्लेख नक्की करा."
        ),
        PYQuestion(
            id = "soc_pyq_2019",
            chapterNumber = 3,
            chapterTitleEn = "Working of Constitution",
            chapterTitleMr = "संविधानाची वाटचाल",
            yearTag = "March 2019",
            yearInt = 2019,
            marks = 2,
            questionType = "True or False with Reason",
            questionEn = "State with reason whether the statement is True or False: 'The Election Commission lays down the code of conduct during elections.'",
            questionMr = "खालील विधान सकारण स्पष्ट करा: 'निवडणूक आयोग निवडणुकीदरम्यान आचारसंहिता लागू करतो.'",
            answerEn = "The statement is TRUE.\nReason: To ensure free, fair, transparent, and fearless elections, the Election Commission of India exercises powers under Article 324 to lay down and strictly enforce the Model Code of Conduct.",
            answerMr = "हे विधान बरोबर आहे.\nकारण: निवडणुका खुल्या, निष्पक्ष व भयमुक्त वातावरणात पार पाडण्यासाठी कलम ३२४ अंतर्गत निवडणूक आयोगाला आचारसंहिता लागू करण्याचे पूर्ण अधिकार दिलेले आहेत.",
            stepByStepEn = listOf("State True/False (1 Mark)", "Provide constitutional reason (1 Mark)"),
            stepByStepMr = listOf("विधान चूक की बरोबर लिहा (१ गुण)", "सकारण स्पष्टीकरण द्या (१ गुण)"),
            examinerTipEn = "Always write 'The statement is TRUE' first, then give the reason.",
            examinerTipMr = "आधी 'विधान बरोबर आहे' असे लिहून खाली कारण लिहा."
        ),
        PYQuestion(
            id = "soc_pyq_2018",
            chapterNumber = 4,
            chapterTitleEn = "Geography: Physiography",
            chapterTitleMr = "भूगोल: प्राकृतिक रचना",
            yearTag = "March 2018",
            yearInt = 2018,
            marks = 2,
            questionType = "Short Answer",
            questionEn = "What is the Great Escarpment in Brazil and how does it affect climate?",
            questionMr = "ब्राझीलमधील अजस्त्र कडा म्हणजे काय व त्याचा हवामानावर काय परिणाम होतो?",
            answerEn = "1. The Great Escarpment: A steep eastern highland edge that demarcates the Brazilian highland towards the Atlantic coast.\n2. Climate Effect: It acts as an orographic barrier to south-east trade winds, causing heavy rain on the coastal side and creating a rain-shadow region (Drought Quadrilateral) on the leeward side.",
            answerMr = "१. अजस्त्र कडा: ब्राझील उच्चभूमीचा पूर्वेकडील अत्यंत तीव्र उताराचा भाग जो समुद्राकडील बाजूला कड्यासारखा दिसतो.\n२. परिणाम: आग्नेय व्यापारी वाऱ्यांना अडवून किनारपट्टीवर प्रतिरोध पाऊस पाडतो, तर त्याच्या विरुद्ध बाजूला पर्जन्यछायेचा प्रदेश (अवर्षण चतुष्कोण) निर्माण होतो.",
            stepByStepEn = listOf("Definition of Escarpment", "Barrier effect causing Drought Quadrilateral"),
            stepByStepMr = listOf("अजस्त्र कड्याची व्याख्या", "पर्जन्यछायेचा प्रदेश (अवर्षण चतुष्कोण)"),
            examinerTipEn = "Mention the Drought Quadrilateral (Drought Polygon).",
            examinerTipMr = "अवर्षण चतुष्कोण या शब्दाचा आवर्जून वापर करा."
        ),
        PYQuestion(
            id = "soc_pyq_2017",
            chapterNumber = 2,
            chapterTitleEn = "Applied History",
            chapterTitleMr = "उपयोजित इतिहास",
            yearTag = "March 2017",
            yearInt = 2017,
            marks = 2,
            questionType = "Definition & Scope",
            questionEn = "What is meant by 'Public History' (Applied History)?",
            questionMr = "'लोकांसाठी इतिहास' (Public History) किंवा उपयोजित इतिहास म्हणजे काय?",
            answerEn = "Public History is a field of study concerned with the application of history for the benefit of general public in contemporary and future times. It overcomes the misconception that history is only for academics, integrating historic conservation with modern economic projects, tourism, and media.",
            answerMr = "इतिहासाच्या ज्ञानाचा उपयोग सर्वसामान्य लोकांच्या वर्तमान व भविष्यातील हितासाठी कसा करता येईल, यावर संशोधन करणाऱ्या शाखेला 'लोकांसाठी इतिहास' किंवा उपयोजित इतिहास म्हणतात. यात पर्यटन, वारसा जतन व प्रसारमाध्यमांचा समावेश होतो.",
            stepByStepEn = listOf("Definition of practical application", "Connection with general public & tourism"),
            stepByStepMr = listOf("लोकोपयोगी उपयोजनाची व्याख्या", "पर्यटन व वारसा जतन"),
            examinerTipEn = "Simple 2-point answer is sufficient for 2 marks.",
            examinerTipMr = "दोन स्पष्ट मुद्दे पुरेसे आहेत."
        )
    )

    val flashcards = listOf(
        Flashcard(
            id = "soc_fc1",
            chapterTitleEn = "Historiography",
            chapterTitleMr = "इतिहासलेखन",
            frontEn = "Father of Modern Historiography",
            frontMr = "आधुनिक इतिहासलेखनाचा जनक",
            backEn = "Voltaire (François-Marie Arouet)\n\nEmphasized all aspects of human life: society, agriculture, trade, economy.",
            backMr = "व्हॉल्तेअर (François-Marie Arouet)\n\nकेवळ युद्धे नव्हे तर समाज, शेती, व्यापार व मानवी संबंधांवर भर दिला.",
            tagEn = "Historian",
            tagMr = "इतिहासकार"
        ),
        Flashcard(
            id = "soc_fc2",
            chapterTitleEn = "Constitution",
            chapterTitleMr = "संविधान",
            frontEn = "Right to Information (RTI)",
            frontMr = "माहितीचा अधिकार (RTI)",
            backEn = "Enacted in: 2005\n\nObjective: Transparency, accountability, citizen empowerment, curbing corruption.",
            backMr = "लागू झालेले वर्ष: २००५\n\nउद्दिष्ट: पारदर्शकता, उत्तरदायित्व आणि भ्रष्टाचाराला आळा.",
            tagEn = "Key Act",
            tagMr = "महत्त्वाचा कायदा"
        ),
        Flashcard(
            id = "soc_fc3",
            chapterTitleEn = "Elections",
            chapterTitleMr = "निवडणूक",
            frontEn = "Voting Age Reform (61st Amendment)",
            frontMr = "मतदानाचे वय (६१ वी घटनादुरुस्ती)",
            backEn = "61st Constitutional Amendment (1988)\n\nReduced voting age in India from 21 years to 18 years.",
            backMr = "६१ वी घटनादुरुस्ती (१९८८)\n\nभारतात मतदानाचे वय २१ वरून १८ वर्षे करण्यात आले.",
            tagEn = "Constitutional Law",
            tagMr = "घटनादुरुस्ती"
        ),
        Flashcard(
            id = "soc_fc4",
            chapterTitleEn = "Geography",
            chapterTitleMr = "भूगोल",
            frontEn = "Pantanal Wetland",
            frontMr = "पँटानल दलदल प्रदेश",
            backEn = "World's largest tropical wetland situated in south-western Brazil.\nHome to huge biodiversity, caimans, and anacondas.",
            backMr = "जगातील सर्वात मोठे उष्णकटिबंधीय दलदलीचे प्रदेश.\nब्राझीलच्या नैऋत्य भागात स्थित, विविध वन्यजीवांचे माहेरघर.",
            tagEn = "Geography Fact",
            tagMr = "भौगोलिक वैशिष्ट्य"
        ),
        Flashcard(
            id = "soc_fc5",
            chapterTitleEn = "Historiography",
            chapterTitleMr = "इतिहासलेखन",
            frontEn = "Karl Marx: 'Das Kapital'",
            frontMr = "कार्ल मार्क्स: 'दास कॅपिटल'",
            backEn = "Propounded the theory of 'Class Struggle'.\nStated that human history is the history of struggle between classes.",
            backMr = "'वर्गसंघर्षाचा सिद्धांत' मांडला.\nमानवी इतिहास हा उत्पादन साधने असणारा व नसणारा यांमधील संघर्षाचा इतिहास आहे.",
            tagEn = "Philosophy",
            tagMr = "तत्त्वज्ञान"
        )
    )

    val quizQuestions = listOf(
        QuizQuestion(
            id = "soc_q1",
            chapterTitleEn = "Historiography",
            chapterTitleMr = "इतिहासलेखन",
            questionEn = "Who wrote the famous philosophical book 'Das Kapital'?",
            questionMr = "'दास कॅपिटल' हा जगप्रसिद्ध ग्रंथ कोणी लिहिला?",
            optionsEn = listOf("Karl Marx", "Voltaire", "René Descartes", "Leopold von Ranke"),
            optionsMr = listOf("कार्ल मार्क्स", "व्हॉल्तेअर", "रेने देकार्त", "लेओपॉल्ड फॉन रांके"),
            correctIndex = 0,
            explanationEn = "Karl Marx wrote 'Das Kapital' explaining the dynamics of capitalism and class struggle.",
            explanationMr = "कार्ल मार्क्स यांनी 'दास कॅपिटल' हा ग्रंथ लिहून वर्गसंघर्षाची मीमांसा केली."
        ),
        QuizQuestion(
            id = "soc_q2",
            chapterTitleEn = "Applied History",
            chapterTitleMr = "उपयोजित इतिहास",
            questionEn = "The National Archives of India is located at:",
            questionMr = "भारताचे राष्ट्रीय अभिलेखागार कोठे स्थित आहे?",
            optionsEn = listOf("Mumbai", "New Delhi", "Kolkata", "Chennai"),
            optionsMr = listOf("मुंबई", "नवी दिल्ली", "कोलकाता", "चेन्नई"),
            correctIndex = 1,
            explanationEn = "The National Archives of India is situated in New Delhi and is the largest in Asia.",
            explanationMr = "भारताचे राष्ट्रीय अभिलेखागार नवी दिल्ली येथे असून ते आशियातील सर्वात मोठे आहे."
        ),
        QuizQuestion(
            id = "soc_q3",
            chapterTitleEn = "Working of Constitution",
            chapterTitleMr = "संविधानाची वाटचाल",
            questionEn = "In Maharashtra, what percentage of seats are reserved for women in local self-governments?",
            questionMr = "महाराष्ट्रात स्थानिक स्वराज्य संस्थांमध्ये महिलांसाठी किती टक्के आरक्षण आहे?",
            optionsEn = listOf("33%", "50%", "25%", "40%"),
            optionsMr = listOf("३३%", "५०%", "२५%", "४०%"),
            correctIndex = 1,
            explanationEn = "While central constitution mandated 33%, Maharashtra and several states increased women's reservation to 50%.",
            explanationMr = "महाराष्ट्रात स्थानिक स्वराज्य संस्थांमध्ये महिलांना ५०% आरक्षण देण्यात आले आहे."
        ),
        QuizQuestion(
            id = "soc_q4",
            chapterTitleEn = "Electoral Process",
            chapterTitleMr = "निवडणूक प्रक्रिया",
            questionEn = "Who was the first Chief Election Commissioner of independent India?",
            questionMr = "स्वतंत्र भारताचे पहिले मुख्य निवडणूक आयुक्त कोण होते?",
            optionsEn = listOf("Dr. B. R. Ambedkar", "Sukumar Sen", "T. N. Seshan", "Sardar Patel"),
            optionsMr = listOf("डॉ. बाबासाहेब आंबेडकर", "सुकुमार सेन", "टी. एन. शेषन", "सरदार पटेल"),
            correctIndex = 1,
            explanationEn = "Sukumar Sen served as the first Chief Election Commissioner of India (1950-1958).",
            explanationMr = "सुकुमार सेन हे स्वतंत्र भारताचे पहिले मुख्य निवडणूक आयुक्त होते (१९५०-१९५८)."
        ),
        QuizQuestion(
            id = "soc_q5",
            chapterTitleEn = "Geography: India & Brazil",
            chapterTitleMr = "भूगोल: भारत आणि ब्राझील",
            questionEn = "Which river basin in Brazil contains the world's largest dense rainforests (Selvas)?",
            questionMr = "ब्राझीलमधील कोणत्या नदीच्या खोऱ्यात जगातील सर्वात मोठी वर्षावने (सेल्व्हाज) आढळतात?",
            optionsEn = listOf("Parana", "Amazon", "Sao Francisco", "Uruguay"),
            optionsMr = listOf("पराना", "अमेझॉन", "साओ फ्रान्सिस्को", "उरुग्वे"),
            correctIndex = 1,
            explanationEn = "The Amazon river basin contains dense tropical rainforests known as Selvas, the lungs of the earth.",
            explanationMr = "अमेझॉन नदीच्या खोऱ्यात विस्तीर्ण वर्षावने आढळतात, ज्यांना जगाची फुप्फुसे म्हटले जाते."
        )
    )
}
