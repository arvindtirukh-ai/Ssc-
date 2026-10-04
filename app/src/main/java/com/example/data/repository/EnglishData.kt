package com.example.data.repository

import com.example.data.model.ChapterNote
import com.example.data.model.Flashcard
import com.example.data.model.PYQuestion
import com.example.data.model.QuizQuestion

object EnglishData {

    val chapters = listOf(
        ChapterNote(
            id = "eng_ch1",
            chapterNumber = 1,
            chapterTitleEn = "Language Study & Grammar Rules",
            chapterTitleMr = "भाषा अभ्यास आणि व्याकरण नियम",
            summaryEn = "Mastering 10-mark Language Study Q1: Punctuation, Compound words, Hidden words, Infinitives/Gerunds/Participles, Direct-Indirect speech, Voice, and Clauses.",
            summaryMr = "प्रश्न १ (१० गुण) भाषा अभ्यास: विरामचिन्हे, जोडशब्द, लपलेले शब्द, इन्फिनिटिव्ह/जेरंड, प्रत्यक्ष-अप्रत्यक्ष कथन, व्हॉइस आणि उपवाक्ये.",
            keyPointsEn = listOf(
                "Active to Passive Voice: Subject becomes Object (with 'by'), Object becomes Subject. Always use third form of verb (V3).",
                "Direct to Indirect Speech: Remove quotation marks, change pronouns, change tense (Present -> Past, Past -> Past Perfect), change time words (now -> then, today -> that day).",
                "Degrees of Comparison: Positive (as... as), Comparative (...-er than / more... than), Superlative (the ...-est / the most...).",
                "Clauses: Main Clause (independent sense), Subordinate Clause (Noun clause, Adjective/Relative clause modifying a noun, Adverb clause showing time/reason/condition).",
                "Modal Auxiliaries: Can (ability), May (permission/possibility), Must (compulsion/obligation), Should (advice), Would (past habit/polite request)."
            ),
            keyPointsMr = listOf(
                "प्रयोग (Voice): कर्माला पुढे आणून क्रियापदाचे तिसरे रूप (V३) वापरा आणि कर्त्यापूर्वी 'by' जोडा.",
                "प्रत्यक्ष व अप्रत्यक्ष कथन (Direct-Indirect): अवतरण चिन्हे काढून सर्वनाम, काळ व स्थल-कालदर्शक शब्दांत योग्य बदल करा (now -> then, here -> there).",
                "डिग्री (Degrees of Comparison): Positive (as/so... as), Comparative (...than), Superlative (the... est/most...).",
                "उपवाक्ये (Clauses): मुख्य उपवाक्य (Main clause) आणि गौण उपवाक्य (Subordinate clause: Noun, Adjective, Adverb).",
                "मोडल ऑक्झिलरी: Can (क्षमता), May (परवानगी), Must (सक्ती), Should (सल्ला/कर्तव्य)."
            ),
            importantFormulasLawsEn = listOf(
                "Passive Voice = Object + Auxiliary Verb + V3 + by + Subject",
                "No sooner... than (Replace 'As soon as')",
                "Hardly had... when"
            ),
            importantFormulasLawsMr = listOf(
                "Passive = कर्म + सहाय्यकारी क्रियापद + V३ + by + कर्ता",
                "As soon as च्या जागी No sooner... than",
                "Hardly had... when रचना"
            ),
            examWeightageMarks = "10 Marks"
        ),
        ChapterNote(
            id = "eng_ch2",
            chapterNumber = 2,
            chapterTitleEn = "Appreciation of Poetry (Format & Tips)",
            chapterTitleMr = "कवितेचे रसग्रहण (Appreciation)",
            summaryEn = "Standard Maharashtra Board 5-mark poetry appreciation marking scheme: Title (½), Poet (½), Rhyme Scheme (1), Figures of Speech (1), Theme/Central Idea (2).",
            summaryMr = "महाराष्ट्र राज्य मंडळाचे ५ गुणांचे अधिकृत स्वरूप: Title (½), Poet (½), Rhyme Scheme (१), Figures of Speech (१), Theme/Central Idea (२).",
            keyPointsEn = listOf(
                "1. Title (½ mark): Exact title of the poem from textbook.",
                "2. Poet (½ mark): Exact name of the poet/poetess (e.g., Rudyard Kipling, Rabindranath Tagore, Robert Frost).",
                "3. Rhyme Scheme (1 mark): Write the exact stanza rhyme pattern (e.g., aabb, abab, or Free Verse if unrhymed).",
                "4. Figures of Speech (1 mark): Name at least one figure of speech (Alliteration, Metaphor, Simile, Personification, Inversion) with one line as an example.",
                "5. Theme / Central Idea (2 marks): Write 3-4 meaningful sentences explaining what the poem teaches or inspires."
            ),
            keyPointsMr = listOf(
                "१. कवितेचे नाव (Title): अचूक नाव (अर्धा गुण).",
                "२. कवीचे नाव (Poet): अचूक नाव (अर्धा गुण).",
                "३. यमक योजना (Rhyme Scheme): उदा. aabb, abab किंवा Free Verse (१ गुण).",
                "४. भाषिक अलंकार (Figures of Speech): कमीत कमी एक अलंकार व कवितेतील ओळ (१ गुण).",
                "५. मध्यवर्ती कल्पना (Theme / Central Idea): कवितेचा संदेश व आशय ३-४ ओळींत (२ गुण)."
            ),
            importantFormulasLawsEn = listOf(
                "Title (½) + Poet (½) + Rhyme (1) + Figure of Speech (1) + Theme (2) = 5 Marks",
                "Common Figures of Speech: Simile (like/as), Metaphor (direct comparison), Personification (human qualities)"
            ),
            importantFormulasLawsMr = listOf(
                "एकूण गुण: ५ (Title ½ + Poet ½ + Rhyme १ + Figure of Speech १ + Theme २)",
                "अलंकार: उपमा (Simile), रूपक (Metaphor), चेतनागुणोक्ती (Personification)"
            ),
            examWeightageMarks = "5 Marks"
        ),
        ChapterNote(
            id = "eng_ch3",
            chapterNumber = 3,
            chapterTitleEn = "Writing Skills Mastery",
            chapterTitleMr = "उपयोजित लेखन (Writing Skills)",
            summaryEn = "Detailed structure for scoring maximum marks in Formal Letter Writing, Dialogue Writing, Speech Drafting, Information Transfer, and Expansion of Theme.",
            summaryMr = "औपचारिक पत्रलेखन, संवाद लेखन / भाषण, माहितीचे हस्तांतरण (Information Transfer) आणि विचार विस्तार यामध्ये पैकीच्या पैकी गुण मिळवण्याचे तंत्र.",
            keyPointsEn = listOf(
                "Formal Letter (5 Marks): Sender's address & date on top-left, Receiver's designation & address, Subject line, Salutation (Respected Sir/Madam), Body (3 paragraphs), Subscription (Yours faithfully), Name.",
                "Dialogue Writing (5 Marks): (a) Jumbled sentences (1M), (b) Complete dialogue (1M), (c) Meaningful 3-exchange dialogue on a given theme (3M).",
                "Information Transfer (5 Marks): Non-Verbal to Verbal (converting tree-diagram/flowchart/table into continuous text) OR Verbal to Non-Verbal (factsheet/tree diagram).",
                "Speech Writing (5 Marks): Honorable chief guest, respected teachers and friends, introduction, core message with quotes/facts, vote of thanks."
            ),
            keyPointsMr = listOf(
                "औपचारिक पत्र (५ गुण): डाव्या बाजूला प्रेषकाचा पत्ता व दिनांक, प्रति (Receiver), विषय, महोदय, मुख्य आशय (३ परिच्छेद), आपला नम्र / विश्वासू.",
                "संवाद लेखन (५ गुण): क्रमवार वाक्ये (१ गुण), रिकाम्या जागा (१ गुण), दिलेल्या विषयावर ३ देवाणघेवाण (३ गुण).",
                "माहिती हस्तांतरण: तक्त्यावरून परिच्छेद किंवा परिच्छेदावरून ट्री-डायग्राम.",
                "भाषण लेखन: आदरणीय प्रमुख पाहुणे, शिक्षक व मित्रमैत्रिणींनो... आकर्षक सुरुवात, मुद्द्यांचे स्पष्टीकरण आणि शेवटी आभार."
            ),
            importantFormulasLawsEn = listOf(
                "Formal Letter layout: Strict Left-alignment format as per modern SSC pattern",
                "Non-Verbal to Verbal: Write a suitable Title (1 Mark) + 2 paragraphs"
            ),
            importantFormulasLawsMr = listOf(
                "पत्राचे सर्व घटक डाव्या बाजूस संरेखित (Left-aligned) ठेवा",
                "माहिती हस्तांतरणासाठी समर्पक शीर्षक (Title) देणे अनिवार्य"
            ),
            examWeightageMarks = "20 Marks"
        )
    )

    val pyqs = listOf(
        PYQuestion(
            id = "eng_pyq_2026",
            chapterNumber = 1,
            chapterTitleEn = "Language Study",
            chapterTitleMr = "भाषा अभ्यास",
            yearTag = "March 2026 Model",
            yearInt = 2026,
            marks = 2,
            questionType = "Transformation of Sentences",
            questionEn = "Transform the sentence as directed:\n(1) As soon as the bell rang, the students ran out of the classroom. (Rewrite using 'No sooner... than')\n(2) He was too weak to walk fast. (Rewrite removing 'too')",
            questionMr = "निर्देशांनुसार वाक्यात बदल करा:\n(१) As soon as the bell rang, the students ran out of the classroom. ('No sooner... than' वापरा)\n(२) He was too weak to walk fast. ('too' काढून पुन्हा लिहा)",
            answerEn = "(1) No sooner did the bell ring than the students ran out of the classroom.\n(2) He was so weak that he could not walk fast.",
            answerMr = "(१) No sooner did the bell ring than the students ran out of the classroom.\n(२) He was so weak that he could not walk fast.",
            stepByStepEn = listOf(
                "Rule 1: 'As soon as' -> 'No sooner did... V1... than...'",
                "Rule 2: 'too... to' -> 'so... that + subject + cannot/could not + V1'."
            ),
            stepByStepMr = listOf(
                "नियम १: As soon as ऐवजी No sooner did + क्रियापदाचे पहिले रूप + than.",
                "नियम २: too... to ऐवजी so... that + could not + V१."
            ),
            examinerTipEn = "Do not use 'then' or 'when' with No sooner; always use 'than'.",
            examinerTipMr = "No sooner सोबत नेहमी 'than' येते, 'then' किंवा 'when' लिहू नका."
        ),
        PYQuestion(
            id = "eng_pyq_2025",
            chapterNumber = 1,
            chapterTitleEn = "Language Study",
            chapterTitleMr = "भाषा अभ्यास",
            yearTag = "March 2025",
            yearInt = 2025,
            marks = 2,
            questionType = "Voice & Speech",
            questionEn = "(1) Change the voice: 'The teacher guided the young students.'\n(2) Change to Indirect speech: Rohit said, 'I have completed my homework today.'",
            questionMr = "(१) प्रयोग बदला (Change Voice): 'The teacher guided the young students.'\n(२) अप्रत्यक्ष कथन करा (Indirect Speech): Rohit said, 'I have completed my homework today.'",
            answerEn = "(1) Passive Voice: The young students were guided by the teacher.\n(2) Indirect Speech: Rohit said that he had completed his homework that day.",
            answerMr = "(१) कर्मणी प्रयोग (Passive): The young students were guided by the teacher.\n(२) अप्रत्यक्ष कथन: Rohit said that he had completed his homework that day.",
            stepByStepEn = listOf(
                "Voice: Simple Past ('guided') changes to 'were guided by'.",
                "Speech: 'have completed' -> 'had completed', 'today' -> 'that day'."
            ),
            stepByStepMr = listOf(
                "व्हॉइस: भूतकाळ असल्याने 'were guided by' वापरा.",
                "कथन: 'have completed' चे 'had completed' आणि 'today' चे 'that day' करा."
            ),
            examinerTipEn = "Remember to change time references: today -> that day, yesterday -> previous day.",
            examinerTipMr = "स्थल-कालदर्शक शब्दांत बदल करणे विसरू नका (today -> that day)."
        ),
        PYQuestion(
            id = "eng_pyq_2024",
            chapterNumber = 2,
            chapterTitleEn = "Poetry Appreciation",
            chapterTitleMr = "कवितेचे रसग्रहण",
            yearTag = "March 2024",
            yearInt = 2024,
            marks = 5,
            questionType = "Complete Appreciation",
            questionEn = "Write an appreciation of the poem 'If' by Rudyard Kipling with the help of the given points:\n- Title\n- Poet\n- Rhyme Scheme\n- Figure of Speech (Any one)\n- Theme / Central Idea",
            questionMr = "दिलेल्या मुद्द्यांच्या आधारे 'If' (रुडयार्ड किपलिंग) या कवितेचे रसग्रहण (Appreciation) लिहा.",
            answerEn = "Appreciation of the poem 'If':\n\n1. Title: The title of the poem is 'If'.\n2. Poet: The poem is composed by Rudyard Kipling.\n3. Rhyme Scheme: The rhyme scheme of the first stanza is 'aaaabcbc' and the subsequent stanzas have 'ababcdcd'.\n4. Figure of Speech: Personification - 'If you can meet with Triumph and Disaster and treat those two impostors just the same.' (Triumph and Disaster are personified as impostors).\n5. Theme / Central Idea: The poem is a father's heartfelt advice to his son on the essential virtues of life. It emphasizes emotional stability, patience, integrity, perseverance, and treating both success and failure with equanimity to become a complete human being.",
            answerMr = "'If' कवितेचे रसग्रहण:\n\n१. Title: 'If'\n२. Poet: Rudyard Kipling\n३. Rhyme Scheme: पहिल्या कडव्याची यमक योजना 'aaaabcbc' असून पुढील कडव्यांत 'ababcdcd' आहे.\n४. Figure of Speech: Personification (चेतनागुणोक्ती) - 'If you can meet with Triumph and Disaster and treat those two impostors just the same.'\n५. Theme / Central Idea: ही कविता म्हणजे एका पित्याने आपल्या पुत्राला परिपूर्ण व आदर्श मनुष्य बनण्यासाठी दिलेला जीवनाचा मौलिक सल्ला आहे. संयम, धैर्य, सत्यनिष्ठा आणि यश-अपयशाला समान दृष्टीने सामोरे जाणे हा या कवितेचा मुख्य संदेश आहे.",
            stepByStepEn = listOf(
                "Title: 0.5 Mark",
                "Poet: 0.5 Mark",
                "Rhyme scheme: 1 Mark",
                "Figure of speech with quoted example: 1 Mark",
                "Theme/central idea in 4 meaningful lines: 2 Marks"
            ),
            stepByStepMr = listOf(
                "शीर्षक: अर्धा गुण",
                "कवी: अर्धा गुण",
                "यमक योजना: १ गुण",
                "अलंकार व ओळ: १ गुण",
                "मध्यवर्ती कल्पना: २ गुण"
            ),
            examinerTipEn = "Writing the point headings clearly fetches all 5 marks easily.",
            examinerTipMr = "मुद्द्यांची शीर्षके ठळक अक्षरात लिहिल्यास तपासणाऱ्यास गुण देणे सुलभ होते."
        ),
        PYQuestion(
            id = "eng_pyq_2023",
            chapterNumber = 1,
            chapterTitleEn = "Language Study",
            chapterTitleMr = "भाषा अभ्यास",
            yearTag = "July 2023",
            yearInt = 2023,
            marks = 2,
            questionType = "Degree & Clauses",
            questionEn = "(1) Change the degree: 'Mount Everest is the highest peak in the world.' (Change to Positive degree)\n(2) Identify the clause and state its kind: 'I know the girl who won the first prize.'",
            questionMr = "(१) डिग्री बदला: 'Mount Everest is the highest peak in the world.' (Positive degree मध्ये करा)\n(२) उपवाक्य ओळखून प्रकार सांगा: 'I know the girl who won the first prize.'",
            answerEn = "(1) Positive Degree: No other peak in the world is as high as Mount Everest.\n(2) Subordinate Clause: 'who won the first prize' - Adjective Clause (modifying the noun 'girl').",
            answerMr = "(१) Positive Degree: No other peak in the world is as high as Mount Everest.\n(२) गौण उपवाक्य: 'who won the first prize' - Adjective Clause (विशेषण उपवाक्य).",
            stepByStepEn = listOf(
                "Superlative ('the highest') -> 'No other... as high as'.",
                "Clause introduced by 'who' qualifies noun 'girl', hence Adjective Clause."
            ),
            stepByStepMr = listOf(
                "Superlative चे Positive करताना 'No other... as high as' वापरा.",
                "'who won the first prize' हे girl या नामाबद्दल माहिती देत असल्याने Adjective Clause आहे."
            ),
            examinerTipEn = "When superlative has 'the highest', start positive with 'No other'.",
            examinerTipMr = "केवळ 'the highest' असल्यास Positive ची सुरुवात 'No other' ने होते."
        ),
        PYQuestion(
            id = "eng_pyq_2022",
            chapterNumber = 3,
            chapterTitleEn = "Writing Skills",
            chapterTitleMr = "उपयोजित लेखन",
            yearTag = "March 2022",
            yearInt = 2022,
            marks = 5,
            questionType = "Formal Letter",
            questionEn = "Write a formal letter to the Municipal Commissioner complaining about the irregular water supply in your locality.",
            questionMr = "आपल्या परिसरातील अनियमित पाणीपुरवठ्याबाबत महानगरपालिका आयुक्तांना तक्रार पत्र लिहा.",
            answerEn = "Model Letter Layout:\n\nFrom:\nAman Sharma,\nFlat No. 102, Shanti Niwas,\nM.G. Road, Pune - 411001.\n15th March 2022.\n\nTo:\nThe Municipal Commissioner,\nPune Municipal Corporation,\nPune - 411005.\n\nSubject: Complaint regarding irregular and inadequate water supply in M.G. Road locality.\n\nRespected Sir,\n\nI am writing to bring to your kind attention the acute problem of erratic water supply in our locality for the past three weeks.\n\nWater is released only for half an hour early in the morning with very low pressure. Moreover, the water is muddy and unfit for drinking. School children, office goers, and senior citizens are facing tremendous hardship daily.\n\nDespite repeated oral complaints to the local ward office, no corrective measures have been taken. I earnestly request you to personally look into this issue and restore regular, clean water supply at the earliest.\n\nThanking you,\n\nYours faithfully,\nAman Sharma",
            answerMr = "औपचारिक पत्राचा नमुना:\n\nप्रेषक: अमन शर्मा, पुणे.\nप्रति: मा. आयुक्त, पुणे महानगरपालिका.\nविषय: अनियमित व अपुऱ्या पाणीपुरवठ्याबाबत तक्रार.\nमहोदय,\nगेल्या तीन आठवड्यांपासून आमच्या परिसरात पाणीपुरवठा अत्यंत अनियमित झाला आहे. सकाळी केवळ अर्धा तास कमी दाबाने पाणी येते व ते गढूळ असते. यामुळे नागरिकांचे प्रचंड हाल होत आहेत. तरी या प्रकरणात लक्ष घालून त्वरित नियमित पाणीपुरवठा सुरू करावा ही नम्र विनंती.\nआपला विश्वासू,\nअमन शर्मा",
            stepByStepEn = listOf(
                "Sender details & date on left (1 Mark)",
                "Receiver designation & subject (1 Mark)",
                "Main body in 3 structured paragraphs (2 Marks)",
                "Subscription & sign off (1 Mark)"
            ),
            stepByStepMr = listOf(
                "प्रेषक पत्ता व दिनांक (१ गुण)",
                "प्रति व विषय (१ गुण)",
                "मुख्य आशय (२ गुण)",
                "समारोप व विश्वासू (१ गुण)"
            ),
            examinerTipEn = "Do not write your real name if an imaginary name like 'Aman/Anita' is given in the question.",
            examinerTipMr = "प्रश्नपत्रिकेत दिलेले काल्पनिक नावच वापरा."
        ),
        PYQuestion(
            id = "eng_pyq_2021",
            chapterNumber = 1,
            chapterTitleEn = "Language Study",
            chapterTitleMr = "भाषा अभ्यास",
            yearTag = "March 2021",
            yearInt = 2021,
            marks = 2,
            questionType = "Grammar MCQ & Tense",
            questionEn = "(1) Identify the non-finite verb and state whether it is an Infinitive, Gerund, or Participle: 'Swimming is a very good exercise.'\n(2) Change to Past Continuous Tense: 'The birds sing melodiously.'",
            questionMr = "(१) Non-finite क्रियापद ओळखून प्रकार सांगा: 'Swimming is a very good exercise.'\n(२) चालू भूतकाळात (Past Continuous) करा: 'The birds sing melodiously.'",
            answerEn = "(1) 'Swimming' is a Gerund (verbal noun ending in -ing acting as a subject).\n(2) Past Continuous: The birds were singing melodiously.",
            answerMr = "(१) 'Swimming' हे Gerund (क्रियावाचक नाम) आहे.\n(२) Past Continuous: The birds were singing melodiously.",
            stepByStepEn = listOf("Identify 'Swimming' as Gerund", "Convert 'sing' to 'were singing'"),
            stepByStepMr = listOf("Swimming हे Gerund आहे", "sing चे were singing करा"),
            examinerTipEn = "Birds is plural, so use 'were', not 'was'.",
            examinerTipMr = "Birds अनेकवचन असल्याने 'were' वापरा."
        ),
        PYQuestion(
            id = "eng_pyq_2020",
            chapterNumber = 1,
            chapterTitleEn = "Language Study",
            chapterTitleMr = "भाषा अभ्यास",
            yearTag = "March 2020",
            yearInt = 2020,
            marks = 2,
            questionType = "Modal Auxiliaries",
            questionEn = "(1) Rewrite using modal auxiliary showing 'obligation': 'You must respect your elders.'\n(2) Spot the error and rewrite correctly: 'One of my friend are an engineer.'",
            questionMr = "(१) 'Obligation/सक्ती' दर्शवणारे मोडल ऑक्झिलरी: You ought to / must respect your elders.\n(२) चूक दुरुस्त करून पुन्हा लिहा: 'One of my friend are an engineer.'",
            answerEn = "(1) 'must' or 'ought to' shows moral obligation: 'You ought to / must respect your elders.'\n(2) Corrected sentence: 'One of my friends is an engineer.' (Error: 'friend' should be 'friends' and 'are' should be 'is').",
            answerMr = "(१) You must / ought to respect your elders.\n(२) दुरुस्त वाक्य: 'One of my friends is an engineer.' (चूक: friend चे friends आणि are चे is).",
            stepByStepEn = listOf("Modal rule for obligation", "Subject-verb agreement: 'One of + plural noun + singular verb'"),
            stepByStepMr = listOf("सक्ती/कर्तव्यासाठी must किंवा ought to", "'One of' नंतर अनेकवचन नाम पण एकवचनी क्रियापद (is) येते"),
            examinerTipEn = "'One of the...' always takes singular verb 'is/was'.",
            examinerTipMr = "'One of my friends is' ही रचना लक्षात ठेवा."
        ),
        PYQuestion(
            id = "eng_pyq_2019",
            chapterNumber = 1,
            chapterTitleEn = "Language Study",
            chapterTitleMr = "भाषा अभ्यास",
            yearTag = "March 2019",
            yearInt = 2019,
            marks = 2,
            questionType = "Punctuation & Word Chain",
            questionEn = "Punctuate the following sentence correctly:\nwhats that said kamal kishore",
            questionMr = "विरामचिन्हे योग्य ठिकाणी वापरा:\nwhats that said kamal kishore",
            answerEn = "\"What's that?\" said Kamal Kishore.",
            answerMr = "\"What's that?\" said Kamal Kishore.",
            stepByStepEn = listOf(
                "Capitalize W in What's and include apostrophe.",
                "Insert question mark inside inverted commas.",
                "Capitalize proper names Kamal and Kishore."
            ),
            stepByStepMr = listOf(
                "अवतरण चिन्हे वापरा (\"What's that?\").",
                "Kamal Kishore या विशेष नामांची आद्याक्षरे कॅपिटल करा."
            ),
            examinerTipEn = "Do not miss the apostrophe in What's.",
            examinerTipMr = "What's मधील अपॉस्ट्रॉफी (') चिन्ह द्यायला विसरू नका."
        ),
        PYQuestion(
            id = "eng_pyq_2018",
            chapterNumber = 3,
            chapterTitleEn = "Writing Skills",
            chapterTitleMr = "उपयोजित लेखन",
            yearTag = "March 2018",
            yearInt = 2018,
            marks = 5,
            questionType = "Expansion of Theme",
            questionEn = "Expand the theme in about 100 words: 'Where there is a will, there is a way.'",
            questionMr = "'Where there is a will, there is a way' (इच्छा तिथे मार्ग) या सुविचाराचा १०० शब्दांत विस्तार करा.",
            answerEn = "Expansion of Theme:\n\n'Where there is a will, there is a way'\n\nThis famous proverb highlights the immense power of strong willpower, determination, and persistence. Life is full of obstacles, difficulties, and failures. A faint-hearted person gives up when faced with hardship. However, a person with unwavering resolution always finds a way forward.\n\nHistory is filled with inspiring examples of individuals who proved this truth. Dr. A.P.J. Abdul Kalam rose from humble beginnings to become India's foremost missile scientist and President through sheer dedication. Thomas Edison failed thousands of times before inventing the electric bulb, but his will never wavered.\n\nIn conclusion, destiny does not decide our success; our dedicated will does. If we have the courage to dream and the determination to work tirelessly, no goal is impossible.",
            answerMr = "'Where there is a will, there is a way' (इच्छा तिथे मार्ग)\n\nहा सुविचार मानवी इच्छाशक्तीचे महत्त्व अधोरेखित करतो. संकटे आणि अडचणी जीवनाचा भाग आहेत. परंतु ज्याच्या मनात जिद्द आणि ध्यास आहे, तो संकटांवर मात करून यशाचा मार्ग शोधून काढतोच. डॉ. ए.पी.जे. अब्दुल कलाम यांनी गरिबीवर मात करून भारताचे राष्ट्रपतीपद भूषवले. थॉमस एडिसनने हजारो अपयशानंतरही विजेचा दिवा लावला. म्हणून दृढ निश्चयाने प्रयत्न केल्यास अशक्यही शक्य होते.",
            stepByStepEn = listOf(
                "Catchy title & explanation of proverb (1 Mark)",
                "Real life examples or illustrations (2.5 Marks)",
                "Strong uplifting conclusion (1.5 Marks)"
            ),
            stepByStepMr = listOf(
                "सुविचाराचा अर्थ व शीर्षक (१ गुण)",
                "उदाहरणे व स्पष्टीकरण (२.५ गुण)",
                "निष्कर्ष (१.५ गुण)"
            ),
            examinerTipEn = "Always give at least one renowned historical or real-life personality example.",
            examinerTipMr = "किमान एका प्रेरणादायी व्यक्तिमत्त्वाचे उदाहरण दिल्यास निबंध आकर्षक होतो."
        ),
        PYQuestion(
            id = "eng_pyq_2017",
            chapterNumber = 1,
            chapterTitleEn = "Language Study",
            chapterTitleMr = "भाषा अभ्यास",
            yearTag = "March 2017",
            yearInt = 2017,
            marks = 2,
            questionType = "Question Tag & Tense",
            questionEn = "(1) Add a question tag: 'Students are preparing for the SSC board exams.'\n(2) Frame a 'Wh-' question to get the underlined part as answer: 'Sarthak achieved first rank in Mathematics.' (Underlined: 'in Mathematics')",
            questionMr = "(१) Question Tag जोडा: 'Students are preparing for the SSC board exams.'\n(२) Wh- प्रश्न तयार करा: 'Sarthak achieved first rank in Mathematics.' ('in Mathematics' उत्तरासाठी)",
            answerEn = "(1) Students are preparing for the SSC board exams, aren't they?\n(2) Wh- Question: In which subject did Sarthak achieve first rank?",
            answerMr = "(१) Students are preparing for the SSC board exams, aren't they?\n(२) In which subject did Sarthak achieve first rank?",
            stepByStepEn = listOf(
                "Positive sentence takes negative question tag: 'aren't they?'.",
                "Frame question with 'In which subject did...' and end with question mark."
            ),
            stepByStepMr = listOf(
                "होकारार्थी वाक्यासाठी नकारार्थी टॅग: aren't they?",
                "Wh- प्रश्न तयार करून शेवटी प्रश्नचिन्ह द्या."
            ),
            examinerTipEn = "Do not forget the question mark at the end of both tag and Wh- question.",
            examinerTipMr = "शेवटी प्रश्नचिन्ह (?) देण्यास विसरू नका."
        )
    )

    val flashcards = listOf(
        Flashcard(
            id = "eng_fc1",
            chapterTitleEn = "Grammar",
            chapterTitleMr = "व्याकरण",
            frontEn = "No sooner... than Rule",
            frontMr = "No sooner... than नियम",
            backEn = "As soon as + Sub + V2...\n↓\nNo sooner did + Sub + V1... than...\n\nExample: No sooner did the bell ring than the students rushed.",
            backMr = "As soon as ऐवजी:\nNo sooner did + कर्ता + V१... than...\n\n(नेहमी 'than' वापरावे, 'then' नाही)",
            tagEn = "Grammar Rule",
            tagMr = "व्याकरण नियम"
        ),
        Flashcard(
            id = "eng_fc2",
            chapterTitleEn = "Grammar",
            chapterTitleMr = "व्याकरण",
            frontEn = "Figures of Speech: Personification",
            frontMr = "भाषिक अलंकार: चेतनागुणोक्ती (Personification)",
            backEn = "Giving human feelings, actions, or characteristics to non-human things or abstract ideas.\nExample: 'The wind whispered through the trees.'",
            backMr = "निर्जीव किंवा अमूर्त वस्तूंना सजीव मानवाप्रमाणे कृती करताना दाखवणे.\nउदा. 'वारा झाडांच्या पानांतून हळूच कुजबुजला.'",
            tagEn = "Poetic Device",
            tagMr = "काव्य अलंकार"
        ),
        Flashcard(
            id = "eng_fc3",
            chapterTitleEn = "Grammar",
            chapterTitleMr = "व्याकरण",
            frontEn = "Degrees of Comparison Rules",
            frontMr = "डिग्रीचे नियम",
            backEn = "Positive: as + positive + as (or so... as)\nComparative: comparative + than\nSuperlative: the + superlative",
            backMr = "Positive: as... as / so... as\nComparative: विशेषण-er + than\nSuperlative: the + विशेषण-est",
            tagEn = "Grammar Rule",
            tagMr = "व्याकरण नियम"
        ),
        Flashcard(
            id = "eng_fc4",
            chapterTitleEn = "Poetry",
            chapterTitleMr = "कविता",
            frontEn = "Poetry Appreciation 5-Mark Scheme",
            frontMr = "रसग्रहणाचे ५ गुण विभाजन",
            backEn = "• Title: ½ Mark\n• Poet: ½ Mark\n• Rhyme Scheme: 1 Mark\n• Figure of Speech: 1 Mark\n• Theme / Central Idea: 2 Marks",
            backMr = "• Title (शीर्षक): ½ गुण\n• Poet (कवी): ½ गुण\n• Rhyme Scheme (यमक): १ गुण\n• Figure of Speech (अलंकार): १ गुण\n• Central Idea (मध्यवर्ती कल्पना): २ गुण",
            tagEn = "Board Marking",
            tagMr = "बोर्ड गुण योजना"
        ),
        Flashcard(
            id = "eng_fc5",
            chapterTitleEn = "Grammar",
            chapterTitleMr = "व्याकरण",
            frontEn = "Direct to Indirect Time Words",
            frontMr = "प्रत्यक्ष ते अप्रत्यक्ष कथन शब्द बदल",
            backEn = "now → then\ntoday → that day\ntomorrow → next day\nyesterday → previous day\nhere → there\nthis → that",
            backMr = "now → then\ntoday → that day\ntomorrow → next day\nyesterday → previous day\nhere → there\nthis → that",
            tagEn = "Reported Speech",
            tagMr = "कथन नियम"
        )
    )

    val quizQuestions = listOf(
        QuizQuestion(
            id = "eng_q1",
            chapterTitleEn = "Grammar",
            chapterTitleMr = "व्याकरण",
            questionEn = "Identify the correct question tag: 'We should protect our environment, ________?'",
            questionMr = "योग्य Question Tag निवडा: 'We should protect our environment, ________?'",
            optionsEn = listOf("should we", "shouldn't we", "shall we", "don't we"),
            optionsMr = listOf("should we", "shouldn't we", "shall we", "don't we"),
            correctIndex = 1,
            explanationEn = "Since the main statement is affirmative with auxiliary 'should', the tag must be negative: 'shouldn't we?'.",
            explanationMr = "वाक्य होकारार्थी असून सहाय्यकारी क्रियापद 'should' असल्याने टॅग नकारार्थी 'shouldn't we?' असा येईल."
        ),
        QuizQuestion(
            id = "eng_q2",
            chapterTitleEn = "Poetry",
            chapterTitleMr = "कविता",
            questionEn = "'Life is like a box of chocolates.' Which figure of speech is used in this line?",
            questionMr = "'Life is like a box of chocolates.' या ओळीत कोणता अलंकार वापरला आहे?",
            optionsEn = listOf("Metaphor", "Simile", "Personification", "Hyperbole"),
            optionsMr = listOf("रूपक (Metaphor)", "उपमा (Simile)", "चेतनागुणोक्ती (Personification)", "अतिशयोक्ती (Hyperbole)"),
            correctIndex = 1,
            explanationEn = "A direct comparison between life and a box of chocolates using the word 'like' is a Simile.",
            explanationMr = "'like' शब्दाचा वापर करून थेट साधर्म्य दाखवल्याने हा Simile (उपमा) अलंकार आहे."
        ),
        QuizQuestion(
            id = "eng_q3",
            chapterTitleEn = "Grammar",
            chapterTitleMr = "व्याकरण",
            questionEn = "What is the passive voice of: 'She wrote an inspiring essay'?",
            questionMr = "'She wrote an inspiring essay' चे Passive Voice काय होईल?",
            optionsEn = listOf(
                "An inspiring essay is written by her.",
                "An inspiring essay was written by her.",
                "An inspiring essay had been written by her.",
                "An inspiring essay has written by her."
            ),
            optionsMr = listOf(
                "An inspiring essay is written by her.",
                "An inspiring essay was written by her.",
                "An inspiring essay had been written by her.",
                "An inspiring essay has written by her."
            ),
            correctIndex = 1,
            explanationEn = "In Simple Past tense ('wrote'), passive auxiliary is 'was/were' + V3 ('written'). Hence: 'An inspiring essay was written by her.'",
            explanationMr = "Simple Past काळ असल्याने 'was' + 'written' वापरले जाते."
        ),
        QuizQuestion(
            id = "eng_q4",
            chapterTitleEn = "Language Study",
            chapterTitleMr = "भाषा अभ्यास",
            questionEn = "Which modal auxiliary expresses 'moral duty or advice'?",
            questionMr = "नैतिक कर्तव्य किंवा सल्ला दर्शवण्यासाठी कोणते मोडल ऑक्झिलरी वापरले जाते?",
            optionsEn = listOf("May", "Should / Ought to", "Can", "Might"),
            optionsMr = listOf("May", "Should / Ought to", "Can", "Might"),
            correctIndex = 1,
            explanationEn = "'Should' and 'Ought to' are used to give advice or express moral duty and obligation.",
            explanationMr = "'Should' व 'Ought to' सल्ला किंवा नैतिक कर्तव्य व्यक्त करतात."
        ),
        QuizQuestion(
            id = "eng_q5",
            chapterTitleEn = "Grammar",
            chapterTitleMr = "व्याकरण",
            questionEn = "Identify the clause type in: 'The boy who won the gold medal is my friend.'",
            questionMr = "'The boy who won the gold medal is my friend.' यातील उपवाक्य प्रकार ओळखा.",
            optionsEn = listOf("Noun Clause", "Adjective (Relative) Clause", "Adverb Clause of time", "Adverb Clause of reason"),
            optionsMr = listOf("नाम उपवाक्य (Noun Clause)", "विशेषण उपवाक्य (Adjective Clause)", "कालवाचक क्रियाविशेषण", "कारणवाचक क्रियाविशेषण"),
            correctIndex = 1,
            explanationEn = "The clause 'who won the gold medal' describes and qualifies the noun 'boy', so it is an Adjective Clause.",
            explanationMr = "'who won the gold medal' हे 'boy' या नामाबद्दल विशेष माहिती सांगत असल्याने ते Adjective Clause आहे."
        )
    )
}
