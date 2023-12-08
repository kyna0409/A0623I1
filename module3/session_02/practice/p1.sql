create database QuanLiDiemThi;
use QuanLiDiemThi;
create table HocSinh(
MaHS int not null auto_increment ,
TenHS varchar(20) not null,
NgaySinh date,
Lop varchar(25),
GT varchar(20),
constraint MaHS_PK primary key(MaHS)
);
-- MonHoc(MaMH, TenMH, MaGV)
-- BangDiem(MaHS, MaMH, DiemThi, NgayKT)

-- GiaoVien(MaGV, TenGV, SDT)
create table MonHoc(
MaMH int not null auto_increment,
TenMH varchar(50),
primary key(MaMH)
);
create table BangDiem(
MaHS int not null  ,
MaMH int not null  ,
DiemThi double,
NgayKT date,
primary key(MaHS,MaMH),
foreign key (MaHS) references HocSinh(MaHS),
foreign key (MaMH) references MonHoc(MaMH)
);
-- GiaoVien(MaGV, TenGV, SDT)
create table GiaoVien(
MaGV int not null auto_increment ,
TenGV varchar(50),
primary key(MaGV)
);

create table SDT(
idSDT int not null ,
MaGV int not null,
primary key(idSDT),
foreign key (MaGV) references GiaoVien(MaGV)
);
ALTER TABLE MonHoc ADD MaGV int not null;
ALTER TABLE MonHoc ADD CONSTRAINT FK_MaGV FOREIGN KEY (MaGV) REFERENCES GiaoVien(MaGV);