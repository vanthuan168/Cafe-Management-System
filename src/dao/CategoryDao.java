/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;
/**
 *
 * @author thuan
 */
public class CategoryDao {
    
    public static void addCategory(Category category){
        String query = "insert into category(name, deleted) values('"+category.getName()+"','0')";
        DbOperations.setDataOrDelete(query, "Thêm Danh mục sản phẩm thành công!");
    }
    
    public static ArrayList<Category> getAllRecords(){
        ArrayList<Category> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from category");
            while(rs.next()){
                Category category = new Category();
                if(rs.getInt("deleted")==0){
                    category.setId(rs.getInt("id"));
                    category.setName(rs.getString("name"));
                    arrayList.add(category);
                }
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return arrayList;
    }
    
    public static void detele(String id){
//        String query = "delete from category where id='"+id+"'";
        String query = "update category set deleted='1' where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "Xóa Danh mục thành công!");
    }
    
    public static void update(String id, String name){
        String query = "update category set name='"+name+"' where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "Sửa danh mục thành công");
    }
}
