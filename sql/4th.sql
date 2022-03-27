use xworkz;

create table students(
id int(10),
name varchar(20),
roll_n0 int(10),
age int(3)
);

select * from students;

insert into students values(1,'shrishial',101,25);
insert into students values(2,'praveen',102,26);
insert into students values(3,'pradeep',103,22);
insert into students values(4,'ganesh',104,23);
insert into students values(5,'shivukumar',105,27);
insert into students values(6,'anand',106,28);
select * from students;

alter table students add column(clg_name varchar(20));
alter table students drop column clg_name;

select * from students order by name;

insert into students values
(7,'muskan',107,21),
(8,'pooja',108,24),
(9,'anisha',109,27);
select * from students;

insert into students values(1,'ueit'); #gives an error
insert into students(id,name) values(10,'ueit');

insert into students values(1,'shrishial',101,25);
insert into students values(1,'shrishial',101,25);

#to delete the records

delete from students where id=1;
select * from students;

update students set roll_n0=110,age=29 where id =10;
select * from students;

update students set roll_n0=111 where id =10;