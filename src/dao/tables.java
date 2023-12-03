/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author thuan
 */
public class tables {
    public static void main(String[] args) {
        try {
//            String userTable = "create table user(id int AUTO_INCREMENT primary key, name varchar(200), email varchar(200), mobileNumber varchar(10), address varchar(200), password varchar(200), securityQuestion varchar(200), answer varchar(200), status varchar(20), UNIQUE(email))";
//            String adminDetails = "insert into user(name, email, mobileNumber, address, password, securityQuestion, answer, status) values('admin','admin@gmail.com','0123456789','TPHCM','admin','Bạn sinh năm nào?','2002','true')";
//            String categoryrTable = "create table category(id int AUTO_INCREMENT primary key, name varchar(200), deleted int)";
            String productTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200), price varchar(200))";
//            DbOperations.setDataOrDelete(userTable, "User table created successfully");
//            DbOperations.setDataOrDelete(adminDetails, "admin created successfully");
//            DbOperations.setDataOrDelete(categoryrTable, "Category table created successfully");
            DbOperations.setDataOrDelete(productTable, "Product table created successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
