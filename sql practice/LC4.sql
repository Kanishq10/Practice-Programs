--Group By Clause--
SELECT * FROM STUDENTS;
UPDATE STUDENTS SET NAME='NULL' WHERE SADDRESS='LAS VEGAS';
UPDATE STUDENTS SET SADDRESS=NULL WHERE STUID BETWEEN 104 AND 109;
SELECT DOB FROM STUDENTS ORDER BY DOB;    --by default increasing order
SELECT DOB,COUNT(*) FROM STUDENTS GROUP BY DOB;     --FOR GROUP BY COLUMNNAMEx ,SELECT SHOULD HAVE COLUMNAMEx AS PARAMETER 
SELECT PHONENO,COUNT(*) FROM STUDENTS GROUP BY PHONENO;  --COUNT(*) FUNCTION GIVES COUNT OF REPEATED
SELECT DOB,COUNT(*) FROM STUDENTS GROUP BY DOB ORDER BY dob;    --group by and order them
SELECT PHONENO,COUNT(*) FROM STUDENTS WHERE NAME NOT LIKE '%N' GROUP BY PHONENO;   --giving a condition first
SELECT PHONENO,COUNT(*) FROM STUDENTS WHERE PHONENO!=8046732856 GROUP BY PHONENO;    
SELECT PHONENO,COUNT(*) FROM STUDENTS WHERE PHONENO<>8046732856 GROUP BY PHONENO; --<> IS EQUAL TO !=
SELECT NAME,COUNT(*) FROM STUDENTS WHERE NAME IS NOT NULL GROUP BY NAME;


--HAVING WITH GROUP--
SELECT STUID,COUNT(*) FROM STUDENTS GROUP BY STUID HAVING STUID BETWEEN 105 AND 111; --FIRST GROUP AND THEN CHECK CONDITION
SELECT STUID,COUNT(*) FROM STUDENTS WHERE STUID BETWEEN 105 AND 111 GROUP BY STUID;
SELECT DOB,COUNT(*) FROM STUDENTS GROUP BY DOB HAVING COUNT(*)>1;
--SELECT DOB,COUNT(*) FROM STUDENTS WHERE COUNT(*)>1 GROUP BY DOB;   --IT WILL NOT WORK HERE,SO HAVING CAN CHECK CONDITION WITH FUNCTION AS WELL VALUES WHILE WHERE CANNOT 
SELECT STUID FROM STUDENTS WHERE SADDRESS IS NOT NULL GROUP BY STUID HAVING STUID>105;