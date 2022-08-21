show databases;

CREATE DATABASE simplilearn;

USE simplilearn;

CREATE TABLE Employees(
     id int NOT NULL PRIMARY KEY,
     age int NOT NULL,
     firstName varchar (255),
     lastName varchar (255)
     );
     
     SELECT * FROM Employees;
     
INSERT INTO Employees VALUES (100, 21, 'JACK', 'EDITION');
INSERT INTO Employees VALUES (101, 22, 'RUSTY', 'COLTONS');
INSERT INTO Employees VALUES (102, 23, 'MOHAN', 'P');
INSERT INTO Employees VALUES (103, 24, 'PALANI', 'K');
INSERT INTO Employees VALUES (104, 25, 'SHRI', 'KANTA');
INSERT INTO Employees VALUES (105, 26, 'WILMAN', 'KALA');
INSERT INTO Employees VALUES (106, 69, 'anil', 'rawat');


CREATE TABLE STUDENT(
     STU_ID int NOT NULL PRIMARY KEY,
     STU_AGE int NOT NULL,
     STU_FName varchar (255),
     STU_LName varchar (255)
     );
	
SELECT * FROM STUDENT;
    
INSERT INTO STUDENT VALUES (200, 11, 'Ali', 'Asghari');
INSERT INTO STUDENT VALUES (201, 12, 'Subhash', 'Jain');
INSERT INTO STUDENT VALUES (202, 13, 'Harsh', 'Sharma');
INSERT INTO STUDENT VALUES (203, 14, 'Kassoum', 'Traore');
INSERT INTO STUDENT VALUES (204, 15, 'Rohit', 'Verma');

