create database praveen;

create table praveen.student(
studId int(20),
name varchar(50),
rollNO int(20)
);

use praveen;

select * from student;

insert into student values(1,'akasmika',30);
insert into student values(1,'akasmika',30);
insert into student values(1,'akasmika',30);

desc student;

alter table student add(adress varchar(20));

alter table student rename column studId to student_Id;

alter table student drop column adress;

#modify 
insert into student values(1,'akasmikauuuuucuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuudvvnbvnvnbvn bnbvn',30);

alter table student modify column name varchar(150);

truncate student;

insert into student(student_Id,name) values(1,'name');

insert into student values
(1,'name1',29),
(2,'name2',29),
(3,'name3',29),
(4,'name4',29),
(5,'name5',29);

update student set rollNo=30 where student_Id=1;

delete from student where student_Id =1;

delete from student;