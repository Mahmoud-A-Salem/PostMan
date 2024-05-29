CREATE DATABASE History;
use History;
go
CREATE TABLE _Login(
	username NVARCHAR(20) PRIMARY KEY
);
drop table Orders
CREATE TABLE Orders(
	username NVARCHAR(20),
	Destination NVARCHAR(20),
	Distance NVARCHAR(20),
	_Time NVARCHAR(20),
	Order_Status NVARCHAR(20) null,
	Order_ID INT PRIMARY KEY IDENTITY,
	CONSTRAINT FK_PersonOrder FOREIGN KEY (username)
    REFERENCES _Login(username)
); 
insert into _Login values('mahmoud');
insert into Orders (username, Destination, Distance, _Time) values('mahmoud','12 el naser city', '11 KM', '35 m');
UPDATE Orders
SET Order_Status = 'DONE'
WHERE Order_ID = 1;

SELECT Orders.Destination, Orders.Distance, Orders._Time, Orders.Order_ID, Orders.Order_Status
FROM Orders Where Orders.username ='Alpha';


