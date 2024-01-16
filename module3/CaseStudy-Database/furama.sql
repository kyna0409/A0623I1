-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select * from nhan_vien where char_length(ho_ten)<=15 and (ho_ten like "H%" or ho_ten like"K%"or ho_ten like "T%");
-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select ho_ten , datediff(curdate(),ngay_sinh)/365 as age from khach_hang ;
select * from khach_hang where (( datediff(curdate(),ngay_sinh)/365 ) between 18 and 50 )and (dia_chi like"%Đà Nẵng" or dia_chi like"%Quảng Trị");
-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select K.ma_khach_hang,K.ho_ten,L.ten_loai_khach, count(H.ma_khach_hang) as SLDH from khach_hang K
join loai_khach L on L.ma_loai_khach = K.ma_loai_khach
join hop_dong H on H.ma_khach_hang=K.ma_khach_hang
where  L.ten_loai_khach = 'Diamond' 
group by K.ma_khach_hang,K.ho_ten,L.ten_loai_khach
order by SLDH asc;
-- 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select K.ma_khach_hang, K.ho_ten, L.ten_loai_khach,H.ma_hop_dong, D.ten_dich_vu, H.ngay_lam_hop_dong, H.ngay_ket_thuc ,sum(D.chi_phi_thue+HDCT.so_luong*DVDK.gia)as tong_tien from khach_hang K
left join hop_dong H on H.ma_khach_hang = K.ma_khach_hang
left join loai_khach L on L.ma_loai_khach = K.ma_loai_khach
left join dich_vu D on D.ma_dich_vu = H.ma_dich_vu
left join hop_dong_chi_tiet HDCT on HDCT.ma_hop_dong= H.ma_hop_dong
left join dich_vu_di_kem DVDK on DVDK.ma_dich_vu_di_kem = HDCT.ma_dich_vu_di_kem
group by  K.ma_khach_hang, K.ho_ten,H.ma_hop_dong;
-- 6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
-- select  DV.ma_dich_vu, DV.ten_dich_vu, DV.dien_tich, DV.chi_phi_thue, LDV.ten_loai_dich_vu from dich_vu DV
-- join loai_dich_vu LDV on LDV.ma_loai_dich_vu = DV.ma_loai_dich_vu
-- where  exists (select 1 from hop_dong_chi_tiet HDCT 
-- join hop_dong H on HDCT.ma_hop_dong = H.ma_hop_dong
-- where H.ma_dich_vu = DV.ma_dich_vu
--             and year(H.ngay_lam_hop_dong) = 2021
--             and (month(H.ngay_lam_hop_dong) between 1 and 3)
-- ) 
-- order by ma_dich_vu asc;
select  DV.ma_dich_vu, DV.ten_dich_vu, DV.dien_tich, DV.chi_phi_thue, LDV.ten_loai_dich_vu from dich_vu DV
 join loai_dich_vu LDV on LDV.ma_loai_dich_vu = DV.ma_loai_dich_vu where DV.ma_dich_vu not in(select H.ma_dich_vu from hop_dong H
 where year(H.ngay_lam_hop_dong) = 2021
  and (month(H.ngay_lam_hop_dong) between 1 and 3)
 );
-- 7.	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021.
select DV.ma_dich_vu, DV.ten_dich_vu, DV.dien_tich, DV.so_nguoi_toi_da, DV.chi_phi_thue, LDV.ten_loai_dich_vu   from dich_vu DV
 join loai_dich_vu LDV on LDV.ma_loai_dich_vu = DV.ma_loai_dich_vu 
 where DV.ma_dich_vu not in(select H.ma_dich_vu from hop_dong H where year(H.ngay_lam_hop_dong) = 2021);
--  8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- c1
select distinct ho_ten from khach_hang;
-- c2
select ho_ten from khach_hang
group by ho_ten;
-- c3
select ho_ten from khach_hang where ho_ten not in (select ho_ten from khach_hang group by ho_ten having count(ho_ten) > 1);
-- c3 
SELECT ho_ten
FROM khach_hang K1
WHERE NOT EXISTS (
    SELECT 1
    FROM khach_hang K2
    WHERE K2.ho_ten = K1.ho_ten AND K2.ma_khach_hang < K1.ma_khach_hang
);
select c1.ho_ten from khach_hang c1 where c1.ho_ten not in(select c2.ho_ten from khach_hang c2 where (c1.ho_ten=c2.ho_ten) and (c2.ma_khach_hang<c1.ma_khach_hang));
-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(ngay_lam_hop_dong)as thang,count(ma_khach_hang) from hop_dong where year(ngay_lam_hop_dong)=2021
group by thang
order by thang asc;
-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).
select H.ma_hop_dong, H.ngay_lam_hop_dong, H.ngay_ket_thuc, H.tien_dat_coc,  sum(HDCT.so_luong)as so_luong_dich_vu_di_kem from hop_dong H
left join hop_dong_chi_tiet HDCT on HDCT.ma_hop_dong = H.ma_hop_dong;
-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.

select DVDK.ma_dich_vu_di_kem, DVDK.ten_dich_vu_di_kem from dich_vu_di_kem DVDK 
join hop_dong_chi_tiet HDCT on HDCT.ma_dich_vu_di_kem= DVDK.ma_dich_vu_di_kem
join hop_dong H on H.ma_hop_dong= HDCT.ma_hop_dong
join khach_hang K on K.ma_khach_hang = H.ma_khach_hang 
join loai_khach LK on LK.ma_loai_khach = K.ma_loai_khach
where LK.ten_loai_khach='Diamond' and (dia_chi like"%Vinh"or dia_chi like"%Quảng Ngãi");

-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
select  H.ma_hop_dong, N.ho_ten, K.ho_ten , K.so_dien_thoai , D.ten_dich_vu ,H.ngay_lam_hop_dong, count(HDCT.ma_hop_dong_chi_tiet) as so_luong_dich_vu_di_kem, H.tien_dat_coc from hop_dong H
join nhan_vien N on N.ma_nhan_vien = H.ma_nhan_vien 
join khach_hang K on K.ma_khach_hang = H.ma_khach_hang
join dich_vu D on D.ma_dich_vu = H.ma_dich_vu
left join hop_dong_chi_tiet HDCT on HDCT.ma_hop_dong = H.ma_hop_dong
where H.ngay_lam_hop_dong between '2020-10-01' and '2020-12-31' and H.ngay_lam_hop_dong not between '2021-01-01' and '2021-06-30'
group by H.ma_hop_dong, N.ho_ten, K.ho_ten;
-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select DVDK.ma_dich_vu_di_kem, DVDK.ten_dich_vu_di_kem,sum(so_luong)as so_luong_dich_vu_di_kem from hop_dong_chi_tiet HDCT
join dich_vu_di_kem DVDK on DVDK.ma_dich_vu_di_kem = HDCT.ma_dich_vu_di_kem
group by  DVDK.ma_dich_vu_di_kem, DVDK.ten_dich_vu_di_kem
having so_luong_dich_vu_di_kem >=all(select sum(so_luong) from hop_dong_chi_tiet HDCT
join dich_vu_di_kem DVDK on DVDK.ma_dich_vu_di_kem = HDCT.ma_dich_vu_di_kem
group by  DVDK.ma_dich_vu_di_kem, DVDK.ten_dich_vu_di_kem );
-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).
select  H.ma_hop_dong, LDV.ten_loai_dich_vu, DVDK.ten_dich_vu_di_kem , count(HDCT.ma_dich_vu_di_kem)as so_lan_su_dung from hop_dong H
join dich_vu D on H.ma_dich_vu = D.ma_dich_vu
join loai_dich_vu LDV on LDV.ma_loai_dich_vu= D.ma_loai_dich_vu
join hop_dong_chi_tiet HDCT on HDCT.ma_hop_dong = H.ma_hop_dong
join dich_vu_di_kem DVDK on DVDK.ma_dich_vu_di_kem = HDCT.ma_dich_vu_di_kem
where  HDCT.ma_dich_vu_di_kem not in (select HDCT.ma_dich_vu_di_kem from hop_dong_chi_tiet HDCT group by HDCT.ma_dich_vu_di_kem having count(HDCT.ma_dich_vu_di_kem)>1)
group by  H.ma_hop_dong, LDV.ten_loai_dich_vu, DVDK.ten_dich_vu_di_kem 
order by H.ma_hop_dong asc;
-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.
select N.ma_nhan_vien, N.ho_ten, T.ten_trinh_do, B.ten_bo_phan, N.so_dien_thoai, N.dia_chi from nhan_vien N
join trinh_do T on T.ma_trinh_do = N.ma_vi_tri
join bo_phan B on B.ma_bo_phan = N.ma_bo_phan
join hop_dong H on H.ma_nhan_vien = N.ma_nhan_vien
where H.ma_nhan_vien not in (select H.ma_nhan_vien from hop_dong H group by H.ma_nhan_vien having count(H.ma_nhan_vien)>3);
-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
select N.ma_nhan_vien, N.ho_ten from nhan_vien N 
where N.ma_nhan_vien not in (select N.ma_nhan_vien from nhan_vien N join hop_dong H on H.ma_nhan_vien = N.ma_nhan_vien);
-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.
SET SQL_SAFE_UPDATES = 0;
update khach_hang  set ma_loai_khach=(select LK.ma_loai_khach from loai_khach LK where LK.ten_loai_khach="Diamond")
where ma_khach_hang in( select ma_khach_hang from (
select K.ma_khach_hang from khach_hang K
join loai_khach LK on LK.ma_loai_khach=K.ma_loai_khach
join hop_dong H on H.ma_khach_hang = K.ma_khach_hang
join dich_vu D on D.ma_dich_vu = H.ma_dich_vu
left join hop_dong_chi_tiet HDCT on HDCT.ma_hop_dong= H.ma_hop_dong
left join dich_vu_di_kem DVDK on DVDK.ma_dich_vu_di_kem = HDCT.ma_dich_vu_di_kem
where year(H.ngay_lam_hop_dong)=2021 and LK.ten_loai_khach="Platinium"
group by K.ma_khach_hang,K.ho_ten,K.ma_loai_khach,H.ma_hop_dong
having sum(D.chi_phi_thue+HDCT.so_luong*DVDK.gia)>10000000
)as t
)
;
SET SQL_SAFE_UPDATES = 1;
-- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
select K.ma_khach_hang,K.ho_ten from khach_hang K
join hop_dong H on H.ma_khach_hang = K.ma_khach_hang
where year(H.ngay_lam_hop_dong)<2021;
-- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.
SET SQL_SAFE_UPDATES = 0;
update dich_vu_di_kem set gia=gia*2
where ma_dich_vu_di_kem in (
select ma_dich_vu_di_kem from(
select DVDK.ma_dich_vu_di_kem from hop_dong_chi_tiet HDCT
join dich_vu_di_kem DVDK on HDCT.ma_dich_vu_di_kem=DVDK.ma_dich_vu_di_kem
join hop_dong H on H.ma_hop_dong = HDCT.ma_hop_dong
where year(H.ngay_lam_hop_dong)=2020 
group by DVDK.ma_dich_vu_di_kem
having sum(so_luong)>10
)as t
);
SET SQL_SAFE_UPDATES = 1;
-- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.
select ma_nhan_vien as id, ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi from nhan_vien 
union 
select ma_khach_hang as id, ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi from khach_hang ;
-- 21.	Tạo khung nhìn có tên là v_nhan_vien để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Hải Châu” và đã từng lập hợp đồng cho một hoặc nhiều khách hàng bất kì với ngày lập hợp đồng là “12/12/2019”.
create view v_nhan_vien as
select N.ho_ten,N.ngay_sinh,N.so_cmnd,N.luong,N.so_dien_thoai,N.dia_chi from nhan_vien N
join hop_dong H on H.ma_nhan_vien=N.ma_nhan_vien
where N.dia_chi like "%Liên Chiểu%" and H.ngay_lam_hop_dong ="2019-12-12";
-- 22.	Thông qua khung nhìn v_nhan_vien thực hiện cập nhật địa chỉ thành “Liên Chiểu” đối với tất cả các nhân viên được nhìn thấy bởi khung nhìn này.
SET SQL_SAFE_UPDATES = 0;
update  v_nhan_vien set dia_chi = replace(dia_chi,'Hải Châu','Liên Chiểu');
SET SQL_SAFE_UPDATES = 1;
select * from v_nhan_vien
-- 23.	Tạo Stored Procedure sp_xoa_khach_hang dùng để xóa thông tin của một khách hàng nào đó với ma_khach_hang được truyền vào như là 1 tham số của sp_xoa_khach_hang.
delimiter //
create procedure sp_xoa_khach_hang(in id int)
begin
delete from khach_hang where ma_khach_hang =id;
end //
delimiter ;
call sp_xoa_khach_hang(11);

-- 24.	Tạo Stored Procedure sp_them_moi_hop_dong dùng để thêm mới vào bảng hop_dong với yêu cầu sp_them_moi_hop_dong phải thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung, với nguyên tắc không được trùng khóa chính và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.
delimiter //
create procedure sp_them_moi_hop_dong(
p_ma_hop_dong int ,
p_ngay_lam_hop_dong datetime,
p_ngay_ket_thuc datetime,
p_tien_dat_coc double,
p_ma_nhan_vien int,
p_ma_khach_hang int,
p_ma_dich_vu int 
)
begin
declare v_count int;
-- kiểm tra tính hợp lệ của dữ liệu bổ sung
if p_ma_hop_dong is null or p_ngay_lam_hop_dong is null or p_ngay_ket_thuc is null or p_tien_dat_coc is null or p_ma_nhan_vien is null or p_ma_khach_hang is null or p_ma_dich_vu is null then
signal sqlstate '45000'
set message_text='Dữ liệu không hợp lệ. Vui lòng nhập đầy đủ thông tin.';
end if ;

 -- Kiểm tra khóa chính không trùng
 select count(*) into v_count from hop_dong where ma_hop_dong = p_ma_hop_dong;
 if v_count > 0 then 
 signal sqlstate '45000'
 set message_text ='Mã hợp đồng đã tồn tại. Vui lòng chọn mã hợp đồng khác.';
 end if ;
 
  -- Kiểm tra toàn vẹn tham chiếu đến các bảng liên quan
  
 if not exists (select 1 from hop_dong where ma_nhan_vien = p_ma_nhan_vien) then
 signal sqlstate '45000'
 set message_text ='Mã nhân viên không tồn tại.';
 end if ;
 
 if not exists(select 1 from hop_dong where ma_khach_hang=p_ma_khach_hang) then
 signal sqlstate '45000'
 set message_text ='Mã khách hàng không tồn tại';
 end if;
 
 if not exists(select 1 from hop_dong where ma_dich_vu =p_ma_dich_vu) then
 signal sqlstate '45000'
 set message_text ='Mã dịch vụ không tồn tại';
 end if;
 
-- Thêm mới hợp đồng

insert into hop_dong value(p_ma_hop_dong,p_ngay_lam_hop_dong,p_ngay_ket_thuc,p_tien_dat_coc,p_ma_nhan_vien,p_ma_khach_hang,p_ma_dich_vu);

 
end //
delimiter ;
call sp_them_moi_hop_dong(16,'2023-05-09','2023-06-09',454656,3,2,1);
-- 25.	Tạo Trigger có tên tr_xoa_hop_dong khi xóa bản ghi trong bảng hop_dong thì hiển thị tổng số lượng bản ghi còn lại có trong bảng hop_dong ra giao diện console của database.
-- Lưu ý: Đối với MySQL thì sử dụng SIGNAL hoặc ghi log thay cho việc ghi ở console.
delimiter //
create trigger tr_xoa_hop_dong 
after delete on hop_dong
for each row
begin
declare v_remaining_records int ;
declare v_error_message varchar(225);
-- Tính toán tổng số lượng bản ghi còn lại
select count(*) into v_remaining_records from hop_dong ;
-- Hiển thị thông điệp về tổng số lượng bản ghi còn lại
-- if v_remaining_records > 0 then 
-- set v_error_message ='Tổng số lượng bản ghi còn lại trong hop_dong: '+cast(v_remaining_records as char);
signal sqlstate '45000'
set message_text = v_remaining_records;
-- end if ;
end //
delimiter ;
drop trigger tr_xoa_hop_dong ;
SELECT * FROM information_schema.triggers WHERE trigger_schema = 'furama';

DELIMITER //
CREATE TRIGGER tr_xoa_hop_dong
AFTER DELETE ON hop_dong
FOR EACH ROW
BEGIN
    DECLARE remaining_records INT;
    SELECT COUNT(*) INTO remaining_records FROM hop_dong;
    
    -- Nếu sử dụng SIGNAL
    -- SIGNAL SQLSTATE '45000'
--         SET MESSAGE_TEXT = 'Remaining records in hop_dong: ' + remaining_records;
    
    -- Hoặc nếu muốn ghi log
    INSERT INTO log_table (message) VALUES (concat('Remaining records in hop_dong: ' , remaining_records));
END;
//
DELIMITER ;

select datediff(ngay_ket_thuc,ngay_lam_hop_dong) from hop_dong where ma_hop_dong =1;
-- 26.	Tạo Trigger có tên tr_cap_nhat_hop_dong khi cập nhật ngày kết thúc hợp đồng, cần kiểm tra xem thời gian cập nhật có phù hợp hay không, với quy tắc sau: Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày. Nếu dữ liệu hợp lệ thì cho phép cập nhật, nếu dữ liệu không hợp lệ thì in ra thông báo “Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày” trên console của database.
-- Lưu ý: Đối với MySQL thì sử dụng SIGNAL hoặc ghi log thay cho việc ghi ở console.
 delimiter //
 create trigger tr_cap_nhat_hop_dong
 before update on hop_dong
 for each row 
 begin
 declare t_ngay_lam_hop_dong datetime;
 declare t_ngay_ket_thuc datetime;
  -- Lấy ngày làm hợp đồng và ngày kết thúc hợp đồng trong ban ghi new
 select new.ngay_lam_hop_dong into t_ngay_lam_hop_dong;
 select new.ngay_ket_thuc into t_ngay_ket_thuc;
if datediff(t_ngay_ket_thuc,t_ngay_lam_hop_dong)< 2 then 
-- use signal
signal sqlstate '45000'
set message_text ='Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày';
end if ;
  -- Hoặc nếu muốn ghi log
        -- INSERT INTO log_table (message) VALUES ('Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày');
 -- Hủy bỏ cập nhật
 signal sqlstate '45000' set mysql_errno = 1644, message_text='Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày';
 end //
 delimiter ;
 drop trigger tr_cap_nhat_hop_dong;
 select*from information_schema.triggers where trigger_schema ='tr_cap_nhat_hop_dong';
-- 27.	Tạo Function thực hiện yêu cầu sau:
-- a.	Tạo Function func_dem_dich_vu: Đếm các dịch vụ đã được sử dụng với tổng tiền là > 2.000.000 VNĐ.
DELIMITER //

CREATE FUNCTION func_dem_dich_vu(so_tien INT)
RETURNS INT
DETERMINISTIC
READS SQL DATA
BEGIN
    DECLARE counter INT;

    SELECT COUNT(*) INTO counter
    FROM (
        SELECT D.ma_dich_vu,D.ten_dich_vu
        FROM dich_vu D
        JOIN hop_dong H ON H.ma_dich_vu = D.ma_dich_vu
        GROUP BY D.ma_dich_vu
        HAVING SUM(D.chi_phi_thue) > so_tien
    ) AS t;

    RETURN counter;
END //

DELIMITER ;

select func_dem_dich_vu(2000000);


-- example
delimiter //
create function sum_a_b( a int, b int)
returns int
deterministic
reads sql data
begin
declare sum int;
set sum = a+b;
return sum;
end //
delimiter ;
select sum_a_b(5,6);
-- b.	Tạo Function func_tinh_thoi_gian_hop_dong: Tính khoảng thời gian dài nhất tính từ lúc bắt đầu làm hợp đồng đến lúc kết thúc hợp đồng mà khách hàng đã thực hiện thuê dịch vụ (lưu ý chỉ xét các khoảng thời gian dựa vào từng lần làm hợp đồng thuê dịch vụ, không xét trên toàn bộ các lần làm hợp đồng). Mã của khách hàng được truyền vào như là 1 tham số của function này.



-- 28.	Tạo Stored Procedure sp_xoa_dich_vu_va_hd_room để tìm các dịch vụ được thuê bởi khách hàng với loại dịch vụ là “Room” từ đầu năm 2015 đến hết năm 2019 để xóa thông tin của các dịch vụ đó (tức là xóa các bảng ghi trong bảng dich_vu) và xóa những hop_dong sử dụng dịch vụ liên quan (tức là phải xóa những bản gi trong bảng hop_dong) và những bản liên quan khác.
delimiter //
create procedure sp_xoa_dich_vu_va_hd_room (in p_ma_loai_dich_vu int )
begin
select * from hop_dong_chi_tiet HDCT 
right join hop_dong H on H.ma_hop_dong = HDCT.ma_hop_dong
join dich_vu D on D.ma_dich_vu = H.ma_dich_vu
join loai_dich_vu LDV on LDV.ma_loai_dich_vu = D.ma_loai_dich_vu
where LDV.ma_loai_dich_vu = p_ma_loai_dich_vu and (H.ngay_lam_hop_dong between '2015-01-01' and '2019-12-31');
end //  
delimiter ;
call sp_xoa_dich_vu_va_hd_room (3 );



