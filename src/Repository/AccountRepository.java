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

/**
 *
 * @author Huy PC
 */
public class AccountRepository {

    public Account getOne(String username, String password) {
        String query = "SELECT [ID]\n"
                + "      ,[Username]\n"
                + "      ,[Password]\n"
                + "      ,[Role]\n"
                + "  FROM [dbo].[Account] WHERE [Username] = ? and [Password] = ?";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            Account acc = new Account();
            ps.setObject(1, username);
            ps.setObject(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                acc = new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
            return acc;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
