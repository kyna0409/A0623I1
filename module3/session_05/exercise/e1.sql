create database demo;
use demo;
create table products(
p_id int not null primary key auto_increment,
p_code varchar(45) unique,
p_name varchar(45) ,
p_price int,
p_amount int,
p_description text,
p_status bit(1)
);
insert into products value (2,"P002","apple",456565656,45,"red, usa",1)
,(3,"P003","strawberry",456656565,65,"big, canada",1)
,(4,"P004","cacao",344545454,32,"viet nam",0)
,(5,"P005","blueberry",60000,41,"paris,",1)
,(6,"P006","cherry",6546564,41,"usa",1)
,(7,"P007","plum",340000,40,"italy",1);
insert into products(p_code,p_name,p_price,p_amount,p_description,p_status) value("P008","pumkin",340000,95,"orange, usa",1);
-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
alter table products add unique index_p_code(p_code);
-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
alter table products add index index_name_price(p_name,p_price);
-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
explain select * from products where p_code ="P003";
explain select * from products where p_name= "orange" and p_price =738463746;
-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
create view products_view as
select p_code,p_name,p_price,p_status
from products;
-- Tiến hành sửa đổi view
update products_view 
set p_name="dragon fruit",p_price=100000
where p_code="P004";
-- Tiến hành xoá view
drop view products_view;
-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
create procedure findAllProduct()
begin
select * from products;
end //
delimiter ;

call findAllProduct();

-- Tạo store procedure thêm một sản phẩm mới
delimiter //
create procedure AddProduct(in p_code1 varchar(50),in p_name1 varchar(50),in p_price1 int, in p_amount1 int, p_description1 text,in p_status1 bit(1))
begin
insert into products (p_code,p_name,p_price,p_amount,p_description,p_status) value(p_code1,p_name1,p_price1,p_amount1,p_description1,p_status1);
end //
delimiter ;
call AddProduct("P009","chocolate",232333,23,"sweet,black",0);
-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure updateProductById(in id int,in p_code1 varchar(50),in p_name1 varchar(50),in p_price1 int, in p_amount1 int, p_description1 text,in p_status1 bit(1))
begin
update products 
set p_code=p_code1,p_name=p_name1,p_price=p_price1,p_amount=p_amount1,p_description=p_description1,p_status=p_status1 
where p_id = id;
end //
delimiter ;

call updateProductById (1,'P001','editname',9,9,'editdescription',1);

-- Tạo store procedure xoá sản phẩm theo id
delimiter //
create procedure deleteProductById(in id int)
begin
delete from products where p_id = id;
end //
delimiter ;

call deleteProductById(1);