/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Bill;
import model.Product;
/**
 *
 * @author thuan
 */
public class BillDao {
    public static String getId(){
        int id = 1;
        try {
            ResultSet rs = DbOperations.getData("select max(id) from bill");
            if(rs.next()){
                id = rs.getInt(1);
                id = id + 1;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    
    public static void save(Bill bill){
        String query = "insert into bill values('"+bill.getId()+"','"+bill.getName()+"','"+bill.getMobileNumber()+"','"+bill.getEmail()+"','"+bill.getDate()+"','"+bill.getTotal()+"','"+bill.getCreatedBy()+"')";
        DbOperations.setDataOrDelete(query, "Thêm hóa đơn thành công!");
    }
    
    public static ArrayList<Bill> getAllRecordsByInc(String startDate, String endDate){
        ArrayList<Bill> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from bill where date between '"+startDate+"' and '"+endDate+"' order by id ASC");
            while(rs.next()){
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobileNumber(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                arrayList.add(bill);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    public static ArrayList<Bill> getAllRecordsByDesc(String startDate, String endDate){
        ArrayList<Bill> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from bill where date between '"+startDate+"' and '"+endDate+"' order by id DESC");
            while(rs.next()){
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobileNumber(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                arrayList.add(bill);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
//    public static ArrayList<Bill> getAllRecordsByTotalDesc(String startDate, String endDate){
//        ArrayList<Bill> arrayList = new ArrayList<>();
//        try {
//            ResultSet rs = DbOperations.getData("select * from bill where date between '"+startDate+"' and '"+endDate+"' order by total DESC");
//            while(rs.next()){
//                Bill bill = new Bill();
//                bill.setId(rs.getInt("id"));
//                bill.setName(rs.getString("name"));
//                bill.setMobileNumber(rs.getString("mobileNumber"));
//                bill.setEmail(rs.getString("email"));
//                bill.setDate(rs.getString("date"));
//                bill.setTotal(rs.getString("total"));
//                bill.setCreatedBy(rs.getString("createdBy"));
//                arrayList.add(bill);
//                
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        return arrayList;
//    }
    public static int countBillByMonthYear(String month, String year) throws SQLException{
        ResultSet rs = DbOperations.getData("select COUNT(*) AS countBill from bill where month(STR_TO_DATE(date, '%d-%m-%Y')) = "+month+" and year(STR_TO_DATE(date, '%d-%m-%Y')) ="+year);
        int count = 0;
        if(rs.next()){
            count = rs.getInt("countBill");
        }
        return count;
    }
    
    public static int sumBillByMonthYear(String month, String year) throws SQLException{
        ResultSet rs = DbOperations.getData("select SUM(total) AS sumBill from bill where month(STR_TO_DATE(date, '%d-%m-%Y')) = "+month+" and year(STR_TO_DATE(date, '%d-%m-%Y')) ="+year);
        int count = 0;
        if(rs.next()){
            count = rs.getInt("sumBill");
        }
        return count;
    }
    
    public static ArrayList<Object[]> getRevenueByDate(Date fromDate, Date toDate){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String date1 = sdf.format(fromDate);
        String date2 = sdf.format(toDate);
        
        ArrayList<Object[]> arrayList = new ArrayList<>();
        ResultSet rs = DbOperations.getData("select date, sum(total) as sumRevenue "
                + "from bill "
                + "where date between '"+date1+"' and '"+date2+"'"
                        + " group by date"
                        + " order by date");
        try {
            while(rs.next()){
                arrayList.add(new Object[]{rs.getString("date"), rs.getInt("sumRevenue")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayList;
    }
    
    public static ArrayList<Object[]> getAllRecordsMonth(){
        ArrayList<Object[]> arrayList = new ArrayList<>();
        ResultSet rs = DbOperations.getData("select distinct month(str_to_date(date, '%d-%m-%y')) as unique_months from bill order by month(str_to_date(date, '%d-%m-%y'))");
        try {
            while(rs.next()){
                arrayList.add(new Object[]{rs.getString("unique_months")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return arrayList;
    }
    
    public static ArrayList<Object[]> getAllRecordsYear(){
        ArrayList<Object[]> arrayList = new ArrayList<>();
        ResultSet rs = DbOperations.getData("select distinct year(str_to_date(date, '%d-%m-%Y')) as unique_years from bill order by year(str_to_date(date, '%d-%m-%Y'))");
        try {
            while(rs.next()){
                arrayList.add(new Object[]{rs.getString("unique_years")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return arrayList;
    }
    
    public static ArrayList<Object[]> getRevenueByMonthYear(String month, String year){ /*Lấy doanh thu theo từng ngày của tháng*/
        int y = 2023; // Năm
        int m = 5;   // Tháng (1-12)

        // Lấy đối tượng Calendar cho tháng được chỉ định
        Calendar calendar = Calendar.getInstance();
        calendar.set(y, m - 1, 1); // Lưu ý: Tháng trong Calendar bắt đầu từ 0

        // Lấy ngày cuối cùng của tháng
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//        covet int to date
        String firstDate = "01-"+month+"-"+year;
        String lastDate = lastDay+"-"+month+"-"+year;

        ArrayList<Object[]> arrayList = new ArrayList<>();
        ResultSet rs = DbOperations.getData("select date, sum(total) as sumRevenue from bill where date BETWEEN '"+firstDate+"' AND '"+lastDate+"' group by date order by date");
        try {
            while(rs.next()){
                arrayList.add(new Object[]{rs.getString("date"), rs.getInt("sumRevenue")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayList ;
    }
}
