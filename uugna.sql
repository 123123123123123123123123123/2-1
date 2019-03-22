BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "details" (
	"id"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	"age"	INTEGER,
	"country"	TEXT,
	"superheroes_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "superheroes" (
	"id"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	"name"	TEXT,
	"power"	INTEGER,
	"gender"	TEXT
);
INSERT INTO "details" VALUES (1,20,'USA',1);
INSERT INTO "details" VALUES (2,23,'USA',2);
INSERT INTO "details" VALUES (3,54,'USA',3);
INSERT INTO "details" VALUES (4,45,'USA',4);
INSERT INTO "details" VALUES (5,54,'Mongolia',5);
INSERT INTO "details" VALUES (6,20,'Mongolia',6);
INSERT INTO "details" VALUES (7,23,'Korea',7);
INSERT INTO "details" VALUES (8,54,'Korea',8);
INSERT INTO "details" VALUES (9,80,'Japan',9);
INSERT INTO "details" VALUES (10,75,'China',10);
INSERT INTO "details" VALUES (11,77,'China',11);
INSERT INTO "superheroes" VALUES (1,'Superman',100,'M');
INSERT INTO "superheroes" VALUES (2,'Spider man',85,'M');
INSERT INTO "superheroes" VALUES (3,'Wonder woman',90,'F');
INSERT INTO "superheroes" VALUES (4,'Thor',95,'M');
INSERT INTO "superheroes" VALUES (5,'Black Panther',80,'M');
INSERT INTO "superheroes" VALUES (6,'Batman',92,'M');
INSERT INTO "superheroes" VALUES (7,'Cat',75,'F');
INSERT INTO "superheroes" VALUES (8,'Iron man',97,'M');
INSERT INTO "superheroes" VALUES (9,'Hulk',85,'M');
INSERT INTO "superheroes" VALUES (10,'Aquaman',75,'M');
INSERT INTO "superheroes" VALUES (11,'Invisible woman',92,'F');
COMMIT;
