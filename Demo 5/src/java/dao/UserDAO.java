/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import model.User;

public class UserDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/demo_mvc";
    private String jdbcUsername = "root";
    private String jdbcPassword = "your_password"; // sửa lại cho đúng

    private static final String LOGIN_QUERY = 
        "SELECT * FROM users WHERE username=? AND password=?";

    public boolean validate(User user) {
        boolean status = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            PreparedStatement ps = conn.prepareStatement(LOGIN_QUERY);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());

            ResultSet rs = ps.executeQuery();
            status = rs.next();

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
