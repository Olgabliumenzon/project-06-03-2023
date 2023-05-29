DROP TABLE IF EXISTS STUDENTS;
CREATE TABLE STUDENTS
(
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(255) NOT NULL,
    SURNAME VARCHAR(255) NOT NULL,
    AGE INT NOT NULL DEFAULT 0, SEX VARCHAR(255));

INSERT INTO STUDENTS (NAME, SURNAME, SEX) VALUES ('Olek', 'S.', 'MALE');
INSERT INTO STUDENTS (NAME, SURNAME, AGE, SEX) VALUES ('Marek', 'W.', 25, 'MALE');
INSERT INTO STUDENTS (NAME, SURNAME, AGE, SEX) VALUES ('Alina', 'G.', 18, 'FEMALE');
INSERT INTO STUDENTS (NAME, SURNAME, AGE, SEX) VALUES ('Anna', 'F.', 35, 'FEMALE');
INSERT INTO STUDENTS (NAME, SURNAME, AGE, SEX) VALUES ('EWELINA', 'A.', 40, 'FEMALE');

DELETE FROM STUDENTS WHERE ID = 10;

ALTER TABLE STUDENTS ADD COLUMN GRADE INT NOT NULL USING 5;
