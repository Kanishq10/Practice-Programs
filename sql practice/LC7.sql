--CONSTRAINTS 
CREATE TABLE STU
(
ROLL_NO NUMBER(3) CONSTRAINT X1 UNIQUE,
NAME VARCHAR2(15) CONSTRAINT X2 NOT NULL,
PER NUMBER(5,2),
AGE NUMBER(4) CONSTRAINT X3 CHECK(AGE>10),
CITY VARCHAR2(10) CONSTRAINT X4 CHECK(CITY IN ('BADDI','RAJPURA'))
);

--INSERT INTO STU VALUES(1,'AB',21.34334,5,'GOGO'); ERROR CONSTRAINT VIOLATED
INSERT INTO STU VALUES(1,'AB',21.4454,20,'BADDI');
INSERT INTO STU VALUES(2,'AC',23.3,25,'RAJPURA');
INSERT INTO STU VALUES(3,'BC',34.77,28,'BADDI');
INSERT INTO STU VALUES(4,'CD',45.55,34,'BADDI');
INSERT INTO STU VALUES(5,'AB',21.4454,20,'BADDI');
INSERT INTO STU VALUES(6,'AB',21.4454,20,'BADDI');
INSERT INTO STU VALUES(7,'AB',21.4454,20,'BADDI');
SELECT * FROM STU;
DELETE FROM STU WHERE CITY='BADDI';

ALTER TABLE STU ADD CONSTRAINT F4 UNIQUE(CITY);
ALTER TABLE STU MODIFY AGE CONSTRAINT F3 CHECK(AGE>15);
SELECT * FROM USER_CONS_COLUMNS WHERE TABLE_NAME='STU';
ALTER TABLE STU DROP CONSTRAINT X2;


--REFERENTIAL CONSTRAINT AT COLUMN LEVEL

CREATE TABLE P1(
PRO_ID NUMBER(5) CONSTRAINT C1 PRIMARY KEY,
PRO_NAME CHAR(20),
UNIT_PRICE NUMBER(10)
);
DESC P1;


CREATE TABLE O1(
ORDER_ID NUMBER(5) CONSTRAINT C2 PRIMARY KEY,
PRO_ID NUMBER(5) CONSTRAINT C3 REFERENCES P1(PRO_ID)
);
DESC O1;

SELECT * FROM USER_CONS_COLUMNS WHERE TABLE_NAME='P1';
DROP TABLE O1;