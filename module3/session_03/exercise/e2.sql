create database product_manager;

use product_manager;

create table customer (
	id_c int primary key auto_increment,
	`name` VARCHAR(50),
	age_c int
);

create table `order` (
	id_o int primary key auto_increment,
	id_c int,
	`date` datetime,
	total_price float,
	FOREIGN KEY (id_c) REFERENCES customer (id_c)
);

create table product (
	id_p int primary key auto_increment,
	`name` varchar(50),
	price double
);

create table order_detail (
	id_o int,
	id_p int,
	quantity int,
	primary key (id_o, id_p),
    foreign key (id_o) references `order`(id_o),
    foreign key (id_p) references product(id_p)
);


-- insert data customer
insert into customer (`name`, age_c) value('Minhh Quan', 10);
insert into customer (`name`, age_c) value('Ngoc Oanh', 20);
insert into customer (`name`, age_c) value('Hong Ha', 50);


-- insert data order
insert into `order` (id_c, `date`) value(1, '2006-03-21');
insert into `order` (id_c, `date`) value(2, '2006-03-23');
insert into `order` (id_c, `date`) value(1, '2006-03-21');

-- insert data product
insert into product (`name`, price) value('may giat', 3);
insert into product (`name`, price) value('tu lanh', 5);
insert into product (`name`, price) value('dieu hoa', 7);
insert into product (`name`, price) value('quat', 1);
insert into product (`name`, price) value('bep dien', 2);

-- insert data order detail
insert into order_detail (id_o, id_p, quantity) value(1,1,3);
insert into order_detail (id_o, id_p, quantity) value(1,3,7);
insert into order_detail (id_o, id_p, quantity) value(1,4,2);
insert into order_detail (id_o, id_p, quantity) value(3,1,8);
insert into order_detail (id_o, id_p, quantity) value(2,5,4);
insert into order_detail (id_o, id_p, quantity) value(2,3,3);

-----------------
-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order 
select * from `order`;
-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách 
select c.name,p.name from  customer c
join `order` o on c.id_c = o.id_c
join order_detail od on o.id_o = od.id_o
join product p on od.id_p = p.id_p ;
-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào 
select * from customer c where not exists (select 1 from `order` o where o.id_c = c.id_c);
select * from customer where id_c not in (select id_c FROM `order`);

select*from customer c
left join `order` o on o.id_c= c.id_c
where id_o is null;
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
select o.id_o as `code`, o.date as `date`, sum(p.price* d.quantity) as total from `order` o
join order_detail d on d.id_o= o.id_o
join product p on p.id_p= d.id_p
group by o.id_o;
