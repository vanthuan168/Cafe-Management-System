/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Customer;
import java.sql.*;

/**
 *
 * @author thuan
 */
public class CustomerDao {

    public static void addCustomer(Customer customer) {
        String query = "insert into customer(name, mobileNumber, email) values('" + customer.getName() + "','" + customer.getMobileNumber() + "','" + customer.getEmail() + "')";
        DbOperations.setDataOrDelete(query, "Thêm khách hàng thành công!");
    }

    public static ArrayList getAllRecords() {
        ArrayList<Customer> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select* from customer");
            while (rs.next()) {
                Customer custormer = new Customer();
                custormer.setId(rs.getInt("id"));
                custormer.setName(rs.getString("name"));
                custormer.setMobileNumber(rs.getString("mobileNumber"));
                custormer.setEmail(rs.getString("email"));
                arrayList.add(custormer);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static ArrayList filterCustomerByMobileNumber(String mobileNumber){
        ArrayList<Customer> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from customer where mobileNumber like'%"+mobileNumber+"%'");
            while (rs.next()){
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setName(rs.getString("name"));
                customer.setMobileNumber(rs.getString("mobileNumber"));
                customer.setEmail(rs.getString("email"));
                arrayList.add(customer);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
