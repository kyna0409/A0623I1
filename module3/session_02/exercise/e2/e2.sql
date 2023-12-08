create database quan_li_ban_hang;
use quan_li_ban_hang;
create table customer(
c_Id int not null,
c_name varchar(50),
c_age date,
primary key(c_Id)
);
create table `order`(
o_Id int not null,
o_date date,
o_total_price double,
c_Id int not null,
primary key(o_Id),
foreign key(c_Id) references customer(c_Id)
);
create table product(
p_Id int not null,
p_name varchar(50),
p_price double,
primary key(p_Id)
);
create table order_detail(
o_Id int not null,
p_Id int not null,
odQTY int,
primary key(o_Id,p_Id),
foreign key(o_Id) references `order`(o_Id),
foreign key(p_Id) references product(p_Id)
);
