create database zomato;

use zomato;

create table customer(
customer_id int(10) primary key,
customer_name varchar(20)not null,
contact_num varchar(11)not null,
address varchar(20)
);

insert into customer values(101,'chetan','9035679479','rajajinagar');
insert into customer values(102,'vaishnavi','8935679479','dharwad');
insert into customer values(103,'pawl','9980267113','hubli');
insert into customer values(104,'kohli','9854579479','rajajinagar');

desc customer;

select * from customer;

create table restaurant(
restaurant_id int(10) primary key,
restaurant_name varchar(20)not null,
restaurant_loc varchar(20)
);

desc restaurant;

insert into restaurant values(1001,'pakwan','vidyagiri');
insert into restaurant values(1002,'panjurli','Navanagar');
insert into restaurant values(1003,'akshay','bagalkot');
insert into restaurant values(1004,'andra restaurant','guledgudda');

select * from restaurant;

create table zomato_employe(
employee_id int(10)primary key,
employee_name varchar(20),
emplyee_cont_num int(11)
);

insert into zomato_employe values(100001,'sudesh',905679470);
insert into zomato_employe values(100002,'ramesh',983679470);
insert into zomato_employe values(100003,'raja',803679470);

select * from zomato_employe;

create table foods(
food_id int(10)primary key,
food_name varchar(20),
price int(10)
);

insert into foods values(9999,'rice bath',40);
insert into foods values(9991,'chapati',45);
insert into foods values(9992,'veg biriyani',60);
insert into foods values(9993,'rice bath',70);

select * from foods;

create table order_details(
order_id int(10)not null primary key,
customer_id int(10) ,
restaurant_id int(10),
employee_id int(10),
order_status varchar(20),
foreign key(customer_id) references customer(customer_id),
foreign key(restaurant_id) references restaurant(restaurant_id),
foreign key(employee_id) references zomato_employe(employee_id)
);


select * from order_details;

insert into order_details values(1,101,1002,100002,'confirmed');
insert into order_details values(2,102,1003,100003,'confirmed');
insert into order_details values(3,103,1001,100001,'confirmed');

select * from order_details;                                                                                                                                             

create table payment_table(
 transaction_id int(8)primary key,
 order_id int(4),
 payment_type varchar(20),
 payment_status varchar(10), 
 foreign key (order_id) references order_details(order_id)
);

select * from payment_table; 

insert into payment_table values(25,1,'cod','unpaid');
insert into payment_table values(26,2,'online banking','paid');
insert into payment_table values(27,3,'upi','paid');

select * from payment_table; 

create table order_food(
 orderF_id int(10)primary key,
 order_id int(4),
 customer_id int(4),
 restaurant_id int(3),
 food_id int(7),
 quantity int(2),
 employee_id int(6),
foreign key (order_id) references payment_table(order_id),
foreign key (order_id) references order_details(order_id),
foreign key (food_id) references foods(food_id)
);

select * from order_food; 

insert into order_food values(11,1,101,1001,9999,2,100002);


select * from order_food; 

select count(*) as total_no_of_user from customer;

select * from zomato_employe;



