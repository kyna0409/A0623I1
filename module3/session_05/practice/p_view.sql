CREATE VIEW customer_views AS

SELECT customerNumber, customerName, phone

FROM  customers;

select * from customer_views;

CREATE OR REPLACE VIEW customer_views AS

SELECT customerNumber, customerName, contactFirstName, contactLastName, phone

FROM customers

WHERE city = 'Nantes';

insert into customer_views value(123,"meo","mimi","momo","1234");

create view student_view as
select studentname,address
from student;
create or replace view student_view as
select  studentname,address,phone
from student;

DROP VIEW customer_views;

SET SQL_SAFE_UPDATES = 0;
update student_view
set phone="0893843894"
where studentname="hoa";
SET SQL_SAFE_UPDATES = 1;
