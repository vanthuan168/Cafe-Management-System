/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;

/**
 *
 * @author thuan
 */
public class UserDao {

    public static void register(User user) {
        String query = "insert into user(name, email, mobileNumber, address, password, securityQuestion, answer, status) values('"
                + user.getName() + "','"
                + user.getEmail() + "','"
                + user.getMobileNumber() + "','"
                + user.getAddress() + "','"
                + user.getPassword() + "','"
                + user.getSecurityQuestion() + "','"
                + user.getAnswer() + "','"
                + "false')";
        System.out.println(query);
        DbOperations.setDataOrDelete(query, "Đăng ký tài khoản thành công! Vui lòng chờ Admin duyệt!");
    }

    public static User login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("select * from user where email='" + email + "' and password='" + password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return user;
    }

    public static User getSecurityQuestion(String email) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("select * from user where email='" + email + "'");
            while (rs.next()) {
                user = new User();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static void updatePassword(String email, String newPassword) {
        String query = "update user set password = '" + newPassword + "' where email='" + email + "'";
        DbOperations.setDataOrDelete(query, "Thay đổi mật khẩu thành công!");
    }
}
