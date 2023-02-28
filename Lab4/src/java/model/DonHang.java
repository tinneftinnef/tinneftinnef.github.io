/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author GangsterCao
 */
public class DonHang {


    private int donhangid;
    private String tendonhang;
    private Date ngaydathang;
    private String tenkhachdat, diachigiao;

    public DonHang() {
    }

    public DonHang(int donhangid, String tendonhang, Date ngaydathang, String tenkhachdat, String diachigiao) {
        this.donhangid = donhangid;
        this.tendonhang = tendonhang;
        this.ngaydathang = ngaydathang;
        this.tenkhachdat = tenkhachdat;
        this.diachigiao = diachigiao;
    }

    public int getDonhangid() {
        return donhangid;
    }

    public void setDonhangid(int donhangid) {
        this.donhangid = donhangid;
    }

    public String getTendonhang() {
        return tendonhang;
    }

    public void setTendonhang(String tendonhang) {
        this.tendonhang = tendonhang;
    }

    public Date getNgaydathang() {
        return ngaydathang;
    }

    public void setNgaydathang(Date ngaydathang) {
        this.ngaydathang = ngaydathang;
    }

    public String getTenkhachdat() {
        return tenkhachdat;
    }

    public void setTenkhachdat(String tenkhachdat) {
        this.tenkhachdat = tenkhachdat;
    }

    public String getDiachigiao() {
        return diachigiao;
    }

    public void setDiachigiao(String diachigiao) {
        this.diachigiao = diachigiao;
    }
  
}
