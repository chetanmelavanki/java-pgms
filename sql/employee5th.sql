use xworkz;

create table employee(
empid int(10) primary key,
name varchar(20) not null,
salary float(20),
adress varchar(50),
emialid varchar(200) unique
 );

insert into employee values(101,'Rahul',69999.90,'Bagalkot','rahul@gmail.com');
insert into employee values(102,'Viashnavi',69999.90,'Bagalkot','Vaishnavi@gmail.com');
insert into employee values(103,'Dhanveer',99999.90,'Bengalur','Dhanveer@gmail.com');
insert into employee values(104,'Rahul dit o',999.90,'mangalore','Dito@gmail.com');
insert into employee values(105,'shivu',34999.90,'tumkur','shivu@gmail.com');


select * from employee;
desc employee;



