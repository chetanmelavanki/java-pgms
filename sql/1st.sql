create database xworkz;
create table xworkz.student(
id int(20),
name varchar(50),
roll_no int(20),
college_name varchar(50));

insert into xworkz.student values(12,'chetan',20,'BASAVESHWAR');

select * from xworkz.student;
insert into xworkz.student values(10,'Praveen',11,'BASAVESHWAR');
select * from xworkz.student;
select * from xworkz.student where id=10;
insert into xworkz.student values(1,'Shambu',2,'BASAVESHWAR');
select * from xworkz.student;
select * from xworkz.student where roll_no=20 ;


