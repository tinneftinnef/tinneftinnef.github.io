create database Lab4
use Lab4
--drop table DonHang
--drop table SanPham
--drop table DonHangChiTiet
create table DonHang(
DonHangID int,
TenDonHang nvarchar(50),
NgayDatHang date,
TenKhachDat nvarchar(50),
DiaChiGiao nvarchar(100),
primary key (DonHangID)
)
--	delete from DonHang where DonHangID = 1
select * from DonHang
insert into DonHang values (1, 'GE1423','2022-03-20',N'Phạm Thanh Lâm', N'Hà Nội')
insert into DonHang values (2, 'MS1253','2021-09-27',N'Đào Thành Lập', N'Bạc Liêu')
insert into DonHang values (3, 'AG1823','2023-02-23',N'Tấn Sang', N'Hà Nội')
insert into DonHang values (4, 'GE1123','2020-05-01',N'Long', N'Cà Mau')
insert into DonHang values (5, 'IS4233','2022-03-14',N'Nguyễn Thị Thơ', N'Hồ Chí Minh')
insert into DonHang values (6, 'PA1653','2022-01-12',N'Nguyễn Bàng Lâm Song Anh', N'Hà Nội')
insert into DonHang values (7, 'FS7333','2021-08-05',N'Triệu Kiều Trang', N'Vinh')
create table SanPham(
SanPhamID int,
TenSanPham nvarchar(50),
GiaSanPham float,
primary key (SanPhamID)
)

create table DonHangChiTiet(
DonHangChiTiet nvarchar (50),
SoLuong int,
SanPhamID int foreign key references SanPham(SanPhamID),
DonHangID int foreign key references DonHang(DonHangID)
primary key (DonHangChiTiet)
)