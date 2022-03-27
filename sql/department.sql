use xworkz;

create table dept45(
depId int(20) primary key,
depName varchar(50) 
);



insert into dept45 values(101,'raja');
insert into dept45 values(102,'rani');

create table emp45(
empId int(20) primary key,
empName varchar(50) ,
dep_Id int(20),
foreign key(dep_Id) references dept45(depId)
);

select * from dept45;

select * from emp45;

insert into emp45 value(1,'shrishail',101);
