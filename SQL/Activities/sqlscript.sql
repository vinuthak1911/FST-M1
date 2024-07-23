REM   Script: Session1 - Activity 1 to 5 - 18 June 2024
REM   Session1 - Activity 1 to 5 - 18 June 2024

CREATE TABLE salesman(salesman_id int, salesman_name varchar2(20), salesman_city varchar2(20), commission int );

DESCRIBE salesman


CREATE TABLE salesman(salesman_id int, salesman_name varchar2(20), salesman_city varchar2(20), commission int );

DESCRIBE salesman 


DROP salesman 
--Activity 2 
;

CREATE TABLE salesman(salesman_id int, salesman_name varchar2(20), salesman_city varchar2(20), commission int );

DESCRIBE salesman 


INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

CREATE TABLE salesman(salesman_id int, salesman_name varchar2(20), salesman_city varchar2(20), commission int );

DESCRIBE salesman


CREATE TABLE salesman(salesman_id int, salesman_name varchar2(20), salesman_city varchar2(20), commission int );

DESCRIBE salesman 


DROP salesman 
--Activity 2 
;

CREATE TABLE salesman(salesman_id int, salesman_name varchar2(20), salesman_city varchar2(20), commission int );

DESCRIBE salesman 


INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int, salesman_name varchar2(20), salesman_city varchar2(20), commission int );

DESCRIBE salesman


INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id and salesman_city from salesman;

SELECT * from salesman WHERE salesman_city = "Paris";

SELECT salesman_id and commission WHERE salesman_name = "Paul Adam";

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int, salesman_name varchar2(20), salesman_city varchar2(20), commission int );

DESCRIBE salesman


INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city from salesman;

SELECT * from salesman WHERE salesman_city = "Paris";

SELECT salesman_id, commission from salesman WHERE salesman_name = "Paul Adam";

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int, salesman_name varchar2(20), salesman_city varchar2(20), commission int );

DESCRIBE salesman


INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city from salesman;

SELECT * from salesman WHERE salesman_city = 'Paris';

SELECT salesman_id, commission from salesman WHERE salesman_name = 'Paul Adam';

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar2(20), salesman_city varchar2(20), commission int );

DESCRIBE salesman


INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)  
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)  
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city from salesman;

SELECT * from salesman WHERE salesman_city = 'Paris';

SELECT salesman_id, commission from salesman where salesman_name = 'Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade = 100;

SELECT * FROM salesman;

UPDATE salesman SET grade = 200 WHERE salesman_city = 'ROME' ;

UPDATE salesman SET grade = 300 WHERE salesman_name = 'James Hoog' ;

UPDATE salesman SET salesman_name = 'Pierre' WHERE salesman_name = 'McLyon' ;

SELECT * FROM salesman;

UPDATE salesman SET grade = 200 WHERE salesman_city = 'ROME' ;

UPDATE salesman SET grade = 300 WHERE salesman_name = 'James Hoog' ;

UPDATE salesman SET salesman_name = 'Pierre' WHERE salesman_name = 'McLyon' ;

SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar2(20), salesman_city varchar2(20), commission int );

DESCRIBE salesman


INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)  
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)  
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city from salesman;

SELECT * from salesman WHERE salesman_city = 'Paris';

SELECT salesman_id, commission from salesman where salesman_name = 'Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade = 100;

SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog' ;

UPDATE salesman SET salesman_name ='Pierre' WHERE salesman_name='McLyon' ;

SELECT * FROM salesman;

