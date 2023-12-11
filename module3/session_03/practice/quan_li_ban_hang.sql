create database quan_li_ban_hang;
use quan_li_ban_hang;
create table accounts (
username varchar(50),
password_acc varchar(100),
date_create date,
primary key(username)
);
create table employees(
code_emp varchar(10),
name_emp varchar(100),
dob date,
position varchar(50),
salary double,
address varchar(100),
phone varchar(30),
username varchar(50) unique,
primary key(code_emp),
foreign key(username)references accounts(username)
);
create table customers(
code_cus varchar(10),
name_cus varchar(100),
dob date,
address varchar(100),
phone varchar(30),
type_cus varchar(10),
email varchar(45)unicode,
gender int,
username varchar(50) unique,
primary key(code_cus),
foreign key(username)references accounts(username)
);
create table products(
code_pro varchar(10),
name_pro varchar(100),
price double,
amount int,
date_of_manufacture date,
expiration_date text,
manufacturer varchar(50),
primary key(code_pro)
);
create table bills(
number_bill varchar(15),
purchase_date date not null,
status_bill int,
total_cost double,
code_emp varchar(10),
code_cus varchar(10),
primary key(number_bill),
foreign key(code_emp)references employees(code_emp),
foreign key(code_cus)references customers(code_cus)
);
create table bill_product(
code_pro varchar(10),
number_bill varchar(15),
amount_pro int,
primary key (code_pro,number_bill),
foreign key(code_pro) references products(code_pro),
foreign key(number_bill) references bills(number_bill)
);