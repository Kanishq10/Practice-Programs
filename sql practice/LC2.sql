CREATE TABLE NEMESIS(IDNO NUMBER(10),FNAME VARCHAR(20),DOB DATE);
DESC NEMESIS;

INSERT INTO NEMESIS VALUES(1,'OSCAR ISSAC','12-10-2002');
INSERT INTO NEMESIS VALUES(2,'PROTOTYPE','19-05-2002');
INSERT INTO NEMESIS VALUES(3,'NEMEKIK','12-04-2002');
INSERT INTO NEMESIS VALUES(4,'ARTHUR','11-05-2002');
INSERT INTO NEMESIS VALUES(5,'MICHEAL','12-4-1234');
INSERT INTO NEMESIS VALUES(6,'LAMPH','12-03-1288');
INSERT INTO NEMESIS VALUES(7,'RIVEN','30-10-2002');
INSERT INTO NEMESIS VALUES(10,'PROXIMUS','11-56-5625');
INSERT INTO NEMESIS VALUES(8,'OPTIMUS','17-05-1997');
INSERT INTO NEMESIS VALUES(19,'CAP','20-04-1989');
INSERT INTO NEMESIS VALUES(17,'ALICE','11-02-2003');

SELECT * FROM TRIPPIN;
SELECT AVG(IDNO) FROM NEMESIS;
RENAME NEMESIS TO TRIPPIN;
ALTER TABLE TRIPPIN ADD(SALARY NUMBER(10));
ALTER TABLE TRIPPIN MODIFY(SALARY NUMBER(20));
DESC TRIPPIN;
ALTER TABLE TRIPPIN RENAME COLUMN IDNO TO SRNO;     --****--
ALTER TABLE TRIPPIN DROP COLUMN SRNO;
INSERT INTO TRIPPIN(SALARY)  VALUES(1000);
UPDATE TRIPPIN SET SALARY=0;
UPDATE  TRIPPIN SET SALARY=SALARY+3000 WHERE IDNO BETWEEN 1 AND 10;
SELECT * FROM trippin;
SELECT FNAME AS FULLNAME FROM TRIPPIN;
CREATE TABLE copycat AS(SELECT * FROM TRIPPIN WHERE FNAME='X');
DROP TABLE COPYCAT;
CREATE TABLE COPYCAT AS(SELECT FNAME AS fullname, salary AS SAL FROM TRIPPIN);
DESC COPYCAT;
SELECT * FROM copycat;
DELETE FROM COPYCAT WHERE SAL=0;

select TABLE_NAME from USER_TABLES;   