/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Account;
import Model.HoaDon;
import Model.KhachHang;
import Utilities.SQLServerConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Huy PC
 */
public class HoaDonRepository {

    public List<HoaDon> getAll() {
        String query = "SELECT dbo.HoaDon.Id, dbo.HoaDon.IdAcc, dbo.Account.TrangThai, dbo.Account.HoTen, dbo.HoaDon.IdKH, dbo.KhachHang.HoTen AS Expr1, dbo.KhachHang.SDT, dbo.KhachHang.Email, dbo.HoaDon.IdTT, dbo.HoaDon.Ten, dbo.HoaDon.NgayTao, \n"
                + "                  dbo.HoaDon.NgayThanhToan, dbo.HoaDon.NgayShip, dbo.HoaDon.NgayKhachNhan, dbo.HoaDon.TongTien/1000000, dbo.HoaDon.NgayChinhSua, dbo.HoaDon.NguoiChinhSua\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.Account ON dbo.HoaDon.IdAcc = dbo.Account.Id INNER JOIN\n"
                + "                  dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDon> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Account account = new Account(rs.getInt(2), rs.getShort(3), rs.getString(4));
                KhachHang kh = new KhachHang(rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                list.add(new HoaDon(rs.getString(1), account, kh, rs.getInt(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getBigDecimal(15), rs.getString(16), rs.getString(17)));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
