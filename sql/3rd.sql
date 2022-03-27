use xworkz;

create table person(id int(10),name varchar(20));

select * from person;

insert into person values(10,'chetan');

#select * from person;

alter table person add(roll_no int(50));
select * from person;

alter table person rename column roll_no to contact_num;
select * from person;

desc person;
insert into  person values(2,'praveen',903223637);

alter table person modify column name varchar(150);

select * from person;
insert into  person values(2,'pr895472jkjfsdddddbvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvaveen',903223637);

alter table person rename column name to first_name;
select * from person;

alter table person drop column contact_num;
select * from person;