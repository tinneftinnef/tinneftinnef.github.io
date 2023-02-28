/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author GangsterCao
 */
public class DonHangChiTiet {

    /*
    DonHangChiTiet nvarchar (50),
SoLuong int,
SanPhamID nvarchar(10) foreign key references SanPham(SanPhamID),
DonHangID nvarchar(10) foreign key references DonHang(DonHangID)
primary key (DonHangChiTiet)
     */
    private String DonHangChiTiet;
    private int SoLuong;
    private int SanPhamID, DonHangID;

    public DonHangChiTiet() {
    }

    public DonHangChiTiet(String DonHangChiTiet, int SoLuong, int SanPhamID, int DonHangID) {
        this.DonHangChiTiet = DonHangChiTiet;
        this.SoLuong = SoLuong;
        this.SanPhamID = SanPhamID;
        this.DonHangID = DonHangID;
    }

    public String getDonHangChiTiet() {
        return DonHangChiTiet;
    }

    public void setDonHangChiTiet(String DonHangChiTiet) {
        this.DonHangChiTiet = DonHangChiTiet;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getSanPhamID() {
        return SanPhamID;
    }

    public void setSanPhamID(int SanPhamID) {
        this.SanPhamID = SanPhamID;
    }

    public int getDonHangID() {
        return DonHangID;
    }

    public void setDonHangID(int DonHangID) {
        this.DonHangID = DonHangID;
    }

}
