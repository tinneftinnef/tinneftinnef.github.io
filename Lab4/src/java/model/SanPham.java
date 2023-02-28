/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author GangsterCao
 */
public class SanPham {

    /*
    SanPhamID nvarchar(10),
TenSanPham nvarchar(50),
GiaSanPham float,
primary key (SanPhamID)
)
     */
    private int SanPhamID;
    private String TenSanPham;
    private float GiaSanPham;

    public int getSanPhamID() {
        return SanPhamID;
    }

    public void setSanPhamID(int SanPhamID) {
        this.SanPhamID = SanPhamID;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public float getGiaSanPham() {
        return GiaSanPham;
    }

    public void setGiaSanPham(float GiaSanPham) {
        this.GiaSanPham = GiaSanPham;
    }

    public SanPham(int SanPhamID, String TenSanPham, float GiaSanPham) {
        this.SanPhamID = SanPhamID;
        this.TenSanPham = TenSanPham;
        this.GiaSanPham = GiaSanPham;
    }

    public SanPham() {
    }

}
