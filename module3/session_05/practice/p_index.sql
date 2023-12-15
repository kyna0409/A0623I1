SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.'; 
EXPLAIN SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.'; 
ALTER TABLE customers ADD INDEX idx_customerName(customerName);
ALTER TABLE customers ADD INDEX idx_full_name(contactFirstName, contactLastName);
EXPLAIN SELECT * FROM customers WHERE contactFirstName = 'Jean' or contactFirstName = 'King';
ALTER TABLE customers DROP INDEX idx_full_name;

-- Các lệnh thêm index:
-- Thêm index cho bảng, với index mang tính duy nhất và không thể null

-- ALTER TABLE tbl_name ADD PRIMARY KEY (column 1, column 2,..)
-- Thêm index cho bảng, với index mang tính duy nhất nhưng có thể null

-- ALTER TABLE tbl_name ADD UNIQUE index_name (column 1, column 2,..)
-- Thêm index cho bảng, có thể trùng lặp

-- ALTER TABLE tbl_name ADD INDEX index_name (column 1, column 2,..)
-- Thêm index đặc biệt thường cho tìm kiếm văn bản

-- ALTER TABLE tbl_name ADD FULLTEXT index_name (column 1, column 2,..)
-- Các lệnh xóa index:
-- Một chỉ mục có thể bị xóa bởi sử dụng lệnh DROP INDEX trong SQL. Cần phải cẩn thận trong khi xóa một chỉ mục, bởi vì khi đó hiệu suất có thể chậm hơn hoặc không được cải thiện.

-- Cú pháp cơ bản của lệnh DROP INDEX:


-- DROP INDEX index_name;