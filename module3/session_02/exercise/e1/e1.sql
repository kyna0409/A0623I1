create database relation_data_model;
use  relation_data_model;
create table phieu_xuat(
SoPX int not null,
NgayXuat date,
primary key(SoPX)
);
create table vat_tu(
MaVTU int not null,
TenVTU varchar(50),
primary key(MaVTU)
);
create table phieu_xuat_detail(
SoPX int not null,
MaVTU int not null,
DGXuat varchar(50),
SLXuat int,
primary key(SoPX,MaVTU),
foreign key (SoPX)references phieu_xuat(SoPX),
foreign key (MaVTU)references vat_tu(MaVTU)
);
create table phieu_nhap(
SoPN int not null,
NgayNhap date,
primary key(SoPN)
);
create table  phieu_nhap_detail(
MaVTU int not null,
SoPN int not null,
DGNhap varchar(50),
SLNhap int,
primary key(SoPN,MaVTU),
foreign key (SoPN)references phieu_nhap(SoPN),
foreign key (MaVTU)references vat_tu(MaVTU)
);
create table nha_cung_cap(
MaNCC int not null,
TenNCC varchar(50),
DiaChi varchar(50),
primary key(MaNCC)
);
create table SDT(
MaSDT int not null,
so_dien_thoai  varchar(45),
MaNCC int not null,
primary key(MaSDT),
foreign key (MaNCC) references nha_cung_cap(MaNCC)
);

create table don_dat_hang (
SoDH int not null,
NgayDH date,
MaNCC int not null,
primary key(SoDH),
foreign key (MaNCC)references nha_cung_cap(MaNCC)
);
create table don_dat_hang_detail(
MaVTU int not null,
SoDH int not null,
primary key(SoDH,MaVTU),
foreign key (SoDH)references don_dat_hang(SoDH),
foreign key (MaVTU)references vat_tu(MaVTU)
);

