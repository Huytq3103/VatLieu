/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Account;
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
public class AccountRepository {

    public Account getOne(String username, String password) {
        String query = "SELECT [ID]\n"
                + "      ,[TrangThai]\n"
                + "      ,[HoTen]\n"
                + "      ,[GioiTinh]\n"
                + "      ,[Username]\n"
                + "      ,[Password]\n"
                + "      ,[NgayTao]\n"
                + "      ,[NguoiTao]\n"
                + "      ,[NgayChinhSua]\n"
                + "      ,[NguoiChinhSua]\n"
                + "  FROM [dbo].[Account] WHERE [Username] = ? and [Password] = ?";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            Account acc = new Account();
            ps.setObject(1, username);
            ps.setObject(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                acc = new Account(rs.getInt(1), 2, rs.getInt(2), rs.getString(3), rs.getBoolean(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getInt(10));
            }
            return acc;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Account> getAll() {
        String query = "SELECT [ID]\n"
                + "      ,[TrangThai]\n"
                + "      ,[HoTen]\n"
                + "      ,[GioiTinh]\n"
                + "      ,[Username]\n"
                + "      ,[Password]\n"
                + "      ,[NgayTao]\n"
                + "      ,[NguoiTao]\n"
                + "      ,[NgayChinhSua]\n"
                + "      ,[NguoiChinhSua]\n"
                + "  FROM [dbo].[Account] ";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<Account> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1), 2, rs.getInt(2), rs.getString(3), rs.getBoolean(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getInt(10)));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(Account account) {
        String query = "INSERT INTO [dbo].[Account]\n"
                + "           ([TrangThai]\n"
                + "           ,[HoTen]\n"
                + "           ,[GioiTinh]\n"
                + "           ,[Username]\n"
                + "           ,[Password]\n"
                + "           ,[NgayTao]\n"
                + "           ,[NguoiTao]\n"
                + "           ,[NgayChinhSua]\n"
                + "           ,[NguoiChinhSua])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, account.getTrangThai());
            ps.setObject(2, account.getHoTen());
            ps.setObject(3, account.isGioiTinh());
            ps.setObject(4, account.getUsername());
            ps.setObject(5, account.getPassword());
            ps.setObject(6, account.getNgayTao());
            ps.setObject(7, account.getNguoiTao());
            ps.setObject(8, account.getNgayChinhSua());
            ps.setObject(9, account.getNguoiChinhSua());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(Account account) {
        String query = "UPDATE [dbo].[Account]\n"
                + "   SET [TrangThai] = ? \n"
                + "      ,[HoTen] = ? \n"
                + "      ,[GioiTinh] = ? \n"
                + "      ,[Username] = ? \n"
                + "      ,[Password] = ? \n"
                + "      ,[NgayTao] = ? \n"
                + "      ,[NguoiTao] = ? \n"
                + "      ,[NgayChinhSua] = ? \n"
                + "      ,[NguoiChinhSua] =? \n"
                + " WHERE [Id] = ?";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, account.getTrangThai());
            ps.setObject(2, account.getHoTen());
            ps.setObject(3, account.isGioiTinh());
            ps.setObject(4, account.getUsername());
            ps.setObject(5, account.getPassword());
            ps.setObject(6, account.getNgayTao());
            ps.setObject(7, account.getNguoiTao());
            ps.setObject(8, account.getNgayChinhSua());
            ps.setObject(9, account.getNguoiChinhSua());
            ps.setObject(10, account.getId());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(Account account) {
        String query = "DELETE [dbo].[Account]\n"
                + " WHERE [Id] = ?";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, account.getId());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }
}
