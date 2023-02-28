/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import model.DonHang;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author GangsterCao
 */
public class DonHangDAO extends DBContext {

    //đọc tất cả các bản ghi từ table đơn hàng
    public List<DonHang> getAll() {
        List<DonHang> list = new ArrayList<>();
        String sql = "Select * from DonHang";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                DonHang d = new DonHang(rs.getInt("DonHangID"),
                        rs.getString("TenDonHang"), rs.getDate("NgayDatHang"),
                        rs.getString("TenKhachDat"), rs.getString("DiaChiGiao"));
                list.add(d);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public DonHang getDonHangById(int id) {
        String sql = "Select * from DonHang where id=?";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                DonHang d = new DonHang(rs.getInt("DonHangID"),
                        rs.getString("TenDonHang"), rs.getDate("NgayDatHang"),
                        rs.getString("TenKhachDat"), rs.getString("DiaChiGiao"));
                return d;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public void insert(DonHang u) {
        String sql = "INSERT INTO [dbo].[DonHang]\n"
                + "           ([DonHangID]\n"
                + "           ,[TenDonHang]\n"
                + "           ,[NgayDatHang]\n"
                + "           ,[TenKhachDat]\n"
                + "           ,[DiaChiGiao])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        //String sql = "INSERT INTO Users(account, password) values ('abc','xxxx')";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, u.getDonhangid());
            st.setString(2, u.getTendonhang());
            st.setDate(3, (Date) u.getNgaydathang());
            st.setString(4, u.getTenkhachdat());
            st.setString(5, u.getDiachigiao());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        DonHangDAO c = new DonHangDAO();
        List<DonHang> list = c.getAll();
        System.out.println(list.get(0).getNgaydathang());
    }
}
