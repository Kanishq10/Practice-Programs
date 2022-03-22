CREATE TABLE STUDENTS(
NAME VARCHAR(10),
DOB DATE,
SADDRESS VARCHAR2(15),
STUID NUMBER(10),
PHONENO NUMBER(10)
);

INSERT INTO STUDENTS VALUES('ARTHUR','30-10-2002','SAINT DANIS',101,8046732856);
INSERT INTO STUDENTS VALUES('DUTCH','12-02-2003','VALENTINE',102,8046732943);
INSERT INTO STUDENTS VALUES('JOHN','20-11-2001','SIBERIA',103,8046732936);
INSERT INTO STUDENTS VALUES('JARVIS','06-02-2003','DELHI',104,3924732856);
INSERT INTO STUDENTS VALUES('ROBERT','10-08-1985','HYDERABAAD',105,8046736736);
INSERT INTO STUDENTS VALUES('SANYA','03-05-2005','RHODES',106,68046732859);
INSERT INTO STUDENTS VALUES('GOBLET','12-05-2006','PARIS',107,8046732784);
INSERT INTO STUDENTS VALUES('ODRISCALL','15-07-2020','SAINT CHRISTNALDO',108,8046732725);
INSERT INTO STUDENTS VALUES('MAGMEN','08-01-1986','GHUMARWIN',109,8046732856);
INSERT INTO STUDENTS VALUES('MARSTON','30-10-2002','BILASPUR',110,8746732856);
INSERT INTO STUDENTS VALUES('SEAN','10-05-2003','LAS VEGAS',111,8046732768);
INSERT INTO STUDENTS VALUES('YOSHIMITSU','03-02-2007','HELL KITCHEN',112,8046738932);

DESCRIBE STUDENTS;
SELECT * FROM STUDENTS;

ALTER TABLE STUDENTS ADD(SRNO NUMBER(2));
ALTER TABLE STUDENTS MODIFY(SRNO NUMBER(3));

ALTER TABLE STUDENTS DROP(SRNO);

SELECT TABLE_NAME FROM USER_TABLES;

CREATE USER C##LOCALUSER IDENTIFIED BY KANI123;
GRANT UNLIMITED TABLESPACE TO C##LOCALUSER;
GRANT RESOURCE,CONNECT,DBA TO C##LOCALUSER;
