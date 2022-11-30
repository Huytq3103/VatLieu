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
public class KhachHangRepository {

    public List<KhachHang> getAll() {
        String query = "SELECT [Id]\n"
                + "      ,[HoTen]\n"
                + "      ,[NgaySinh]\n"
                + "      ,[GioiTinh]\n"
                + "      ,[SDT]\n"
                + "      ,[DiaChi]\n"
                + "      ,[Email]\n"
                + "      ,[NgayTao]\n"
                + "      ,[NguoiTao]\n"
                + "      ,[NgayChinhSua]\n"
                + "      ,[NguoiChinhSua]\n"
                + "  FROM [dbo].[KhachHang]";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<KhachHang> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new KhachHang(rs.getString(1), rs.getString(2), rs.getBoolean(4), rs.getString(3), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
