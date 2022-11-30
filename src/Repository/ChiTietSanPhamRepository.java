/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.ChiTietSanPham;
import Model.Hang;
import Model.Loai;
import Model.SanPham;
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
public class ChiTietSanPhamRepository {

    public List<ChiTietSanPham> getAll() {
        String query = "SELECT dbo.ChiTietSanPham.Id, dbo.ChiTietSanPham.IdSP, dbo.SanPham.Ma, dbo.SanPham.TenSP, dbo.ChiTietSanPham.IdHang, dbo.Hang.Ma AS Expr1, dbo.Hang.Ten, dbo.ChiTietSanPham.IdLoai, dbo.Loai.Ma AS Expr2, dbo.Loai.Ten AS Expr3, \n"
                + "                             dbo.ChiTietSanPham.DonViTinh, dbo.ChiTietSanPham.SoLuongTon, dbo.ChiTietSanPham.GiaNhap, dbo.ChiTietSanPham.GiaBan, dbo.ChiTietSanPham.NgayNhap, dbo.ChiTietSanPham.NgayChinhSua\n"
                + "                FROM     dbo.ChiTietSanPham INNER JOIN\n"
                + "                                 dbo.Loai ON dbo.ChiTietSanPham.IdLoai = dbo.Loai.Id INNER JOIN\n"
                + "                                dbo.Hang ON dbo.Hang.Id = dbo.ChiTietSanPham.IdHang AND dbo.Loai.Id = dbo.ChiTietSanPham.IdLoai INNER JOIN\n"
                + "                               dbo.SanPham ON dbo.ChiTietSanPham.IdSP = dbo.SanPham.Id";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<ChiTietSanPham> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham(rs.getString(2), rs.getString(3), rs.getString(4));
                Hang hang = new Hang(rs.getString(5), rs.getString(6), rs.getString(7));
                Loai loai = new Loai(rs.getString(8), rs.getString(9), rs.getString(10));
                list.add(new ChiTietSanPham(rs.getString(1), sp, hang, loai, rs.getString(11), rs.getDouble(12), rs.getBigDecimal(13), rs.getBigDecimal(14), rs.getString(15), rs.getString(16)));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
