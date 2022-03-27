#drop command is used to delete the database ,table

use xworkz;

create table sql_student(id int(20),name varchar(50));

drop table sql_student;

drop database xworkz;

insert into sql_student values (21,'raja');
insert into sql_student values (2,'rani');
insert into sql_student values (3,'ramesh');

select * from sql_student;

#truncate command is used to delete table conetents or values in the database
truncate table sql_student;
select * from sql_student;
select * from person;


