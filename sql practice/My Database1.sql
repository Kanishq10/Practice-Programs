CREATE TABLE EMPL(SN NUMBER(10),NAME VARCHAR(10),SALARY NUMBER(10));
INSERT INTO EMPL VALUES(1,'ARTHUR',2000);
INSERT INTO EMPL VALUES(2,'MORGAN',3000);
INSERT INTO EMPL VALUES(3,'DUTCH',5000);
INSERT INTO EMPL VALUES(4,'JAVIER',4000);
INSERT INTO EMPL VALUES(5,'HORSEA',2000);

SELECT SALARY+2000 AS SALARY_NEW FROM EMPL;

