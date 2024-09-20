CREATE DATABASE Hotel;

use hotel;

CREATE TABLE Reservation(ID INT, Name VARCHAR(30), ReserveDate DATE, RoomNum INT);
INSERT INTO Reservation(ID, Name, ReserveDate, RoomNum) VALUES(1, '홍길동', '2016-01-05', 2014);
INSERT INTO Reservation(ID, Name, ReserveDate, RoomNum) VALUES(2, '임꺽정', '2016-02-12', 918);
INSERT INTO Reservation(ID, Name, ReserveDate, RoomNum) VALUES(3, '장길산', '2016-01-16', 1208);
INSERT INTO Reservation(ID, Name, ReserveDate, RoomNum) VALUES(4, '홍길동', '2016-03-17', 504);

CREATE TABLE Customer (ID INT, Name VARCHAR(30), Age INT, Address VARCHAR(20));
INSERT INTO Customer (ID, Name, Age, Address) VALUES (1, '홍길동', 17, '서울');
INSERT INTO Customer (ID, Name, Age, Address) VALUES (2, '임꺽정', 11, '인천');
INSERT INTO Customer (ID, Name, Age, Address) VALUES (3, '장길산', 13, '서울');
INSERT INTO Customer (ID, Name, Age, Address) VALUES (4, '전우치', 17, '수원');

CREATE TABLE Test(
	ID int,
    Name VARCHAR(30),
    ReserveDate DATE,
    RoomNum int
);

alter table Reservation add Phone INT;

Alter Table Reservation DROP RoomNum;

ALTER TABLE Reservation MODIFY COLUMN ReserveDate VARCHAR(20);

drop table Reservation;

desc Reservation;

Insert into Reservation(ID, NAme, ReserveDate, RoomNum)
Values(5, '이순신', '2016-02-16', 1108);

INSERT INTO Reservation(ID, Name)
VALUES (6, '김유신');

update Reservation Set RoomNum = 2002 Where Name = '홍길동';
update Reservation Set RoomNum = 2002;

delete from Reservation Where Name = '홍길동';

Select * from Reservation;
Select * from Reservation where name = '홍길동';
Select * from Reservation where ID <= 3 And ReserveDate > '2016-02-01';
SELECT Name, RoomNum FROM Reservation;

SELECT Name, ReserveDate FROM Reservation
WHERE ID <= 3 AND ReserveDate > '2016-02-01';

Select Distinct Name From Reservation;

Select * From Reservation Order By ReserveDate;

Select * From Reservation Order By ReserveDate DESC;

Select * From Reservation Order By ReserveDate DESC, RoomNum ASC;