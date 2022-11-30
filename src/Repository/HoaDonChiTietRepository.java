/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.HoaDonChiTiet;
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
public class HoaDonChiTietRepository {

    public List<HoaDonChiTiet> getAll() {
        String query = "SELECT IdCTSP, IdHoaDon, TenSP, Hang, Loai, DonViTinh, SoLuong, DonGia\n"
                + "FROM     dbo.HoaDonChiTiet";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDonChiTiet> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham(rs.getString(1), null, null);
                list.add(new HoaDonChiTiet(sp, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getBigDecimal(9)));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<HoaDonChiTiet> getOneHD(String idHD) {
        String query = "SELECT IdCTSP, IdHoaDon, TenSP, Hang, Loai, DonViTinh, SoLuong, DonGia\n"
                + "FROM     dbo.HoaDonChiTiet WHERE IdHoaDon = ?";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDonChiTiet> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            ps.setObject(1, idHD);
            while (rs.next()) {
                SanPham sp = new SanPham(rs.getString(1), null, null);
                list.add(new HoaDonChiTiet(sp, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getBigDecimal(9)));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
