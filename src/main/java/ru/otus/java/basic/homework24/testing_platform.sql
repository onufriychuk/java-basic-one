-- Дамп структуры для таблица public.tests
CREATE TABLE IF NOT EXISTS "tests" (
	"id" INTEGER NOT NULL DEFAULT 'nextval(''tests_id_seq''::regclass)',
	"title" VARCHAR(300) NOT NULL,
	PRIMARY KEY ("id")
);
-- Дамп структуры для таблица public.questions
CREATE TABLE IF NOT EXISTS "questions" (
	"id" INTEGER NOT NULL DEFAULT 'nextval(''questions_id_seq''::regclass)',
	"text" VARCHAR(1000) NOT NULL,
	"test_id" INTEGER NOT NULL,
	PRIMARY KEY ("id"),
	CONSTRAINT "FK_questions_tests" FOREIGN KEY ("test_id") REFERENCES "tests" ("id")
);
-- Дамп структуры для таблица public.answers
CREATE TABLE IF NOT EXISTS "answers" (
	"id" INTEGER NOT NULL DEFAULT 'nextval(''answers_id_seq''::regclass)',
	"text" VARCHAR(10000) NOT NULL,
	"is_correct" BOOLEAN NOT NULL DEFAULT 'false',
	"question_id" INTEGER NOT NULL,
	PRIMARY KEY ("id"),
	CONSTRAINT "FK__questions" FOREIGN KEY ("question_id") REFERENCES "questions" ("id")
);

-- Дамп данных таблицы public.tests: -1 rows
INSERT INTO "tests" ("id", "title") VALUES
	(1, 'Основы SQL'),
	(3, 'Основы Синтаксиса Java');
	
-- Дамп данных таблицы public.questions: -1 rows
INSERT INTO "questions" ("id", "text", "test_id") VALUES
	(1, 'Команда SELECT служит для', 1),
	(4, 'Команда Update служит для:', 1),
	(8, 'Многократного повторения какой-то части программы можно добиться с помощью операторв:', 3);

-- Дамп данных таблицы public.answers: 8 rows
/*!40000 ALTER TABLE "answers" DISABLE KEYS */;
INSERT INTO "answers" ("id", "text", "is_correct", "question_id") VALUES
	(14, 'Выборки данных', 'true', 1),
	(38, 'Обновления данных', 'true', 4),
	(31, 'Удаления данных', 'false', 4),
	(11, 'Обновления данных', 'false', 1),
	(9, 'Удаления данных', 'false', 1),
	(18, 'DO ... WHILE ...', 'true', 8),
	(67, 'IF (...) ...', 'false', 8),
	(23, 'FOR (...) ...', 'true', 8);
