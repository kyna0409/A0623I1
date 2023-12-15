delimiter //
create procedure customer_procedure (in name_customer varchar(50))
begin
select * from customers where customers.customername like concat("%",name_customer,"%");
end //
delimiter ;
call customer_procedure("h");

delimiter //
create procedure total_order(out total int)
begin
set total = (select count(*) from orders);
end //
delimiter ;

call total_order(@total);
select @total;

delimiter //
create procedure sales_total_procedure (inout sales_total int)
begin
set sales_total = (select count(*) from customers where salesRepEmployeeNumber = sales_total );
end //
delimiter ;
set @sales_total = 1166;
call sales_total_procedure(@sales_total);
select @sales_total;