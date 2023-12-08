create database practice;
use practice;
create table contracts(
contract_id int not null auto_increment ,
last_name varchar(50) not null,
first_name varchar(50),
constraint constract_pk primary key (contract_id)
-- Khoá chính của bảng này có tên là contacts_pk và được gán cho cột contact_id.
);
create table suppliers(
supplier_id int not null auto_increment, 
supplier_name varchar(50),
account_rep varchar(50) not null default 'TBD',
constraint supplier_pk primary key (supplier_id)
-- cột account_rep có kiểu dữ liệu là chuỗi (với tối đa 30 ký tự), không thể chứa giá trị NULL và mặc định thì giá trị của cột này là 'TBD'.
);

drop table contracts, suppliers;
-- add column on table
alter table contracts 
add last_contract varchar(50) not null
after contract_id;

alter table contracts
add decription text
after first_name;
-- Cú pháp để chỉnh sửa mô tả của một cột
alter table contracts
modify last_name varchar(20) not null;

alter table contracts 
modify last_name varchar(60) not null
after contract_id,
modify first_name varchar(100) not null
after last_name;

-- Cú pháp để xoá một cột trong bảng
alter table contracts 
drop column last_contract ;
-- Cú pháp để thay đổi tên cột
alter table contracts
change column decription content longtext;
-- Cú pháp để đổi tên bảng
alter table agreement
rename to contracts;