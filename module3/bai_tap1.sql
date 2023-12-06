create database `student-management`;
create table `Student`(
id int not null,
name varchar(45),
age int,
country varchar(45),
primary key(id)
);
create table `Class`(
id int not null,
name varchar(45),
primary key(id)
);
create table `Teacher`(
id int not null,
name varchar(45),
age int,
country varchar(45),
primary key(id)
);