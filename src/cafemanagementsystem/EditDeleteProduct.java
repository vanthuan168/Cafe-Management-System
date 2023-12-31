/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafemanagementsystem;

import dao.CategoryDao;
import dao.ProductDao;
import java.awt.Component;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Category;
import model.Product;

/**
 *
 * @author thuan
 */
public class EditDeleteProduct extends javax.swing.JFrame {

    /**
     * Creates new form DetailProduct
     */
    public EditDeleteProduct() {
        initComponents();
        setLocationRelativeTo(null);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        txtID.setText("----");
    }

    @Override
    public void setLocationRelativeTo(Component c) {
        super.setLocationRelativeTo(c); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void validateFields() {
        String name = txtName.getText();
        String category = cbCategory.getSelectedItem().toString();
        String price = txtPrice.getText();
        if (!name.equals("") && !category.equals("") && !price.equals("")) {
            btnEdit.setEnabled(true);
        } else {
            btnEdit.setEnabled(false);
        }
    }
    public String currencyToString(String currency) throws ParseException{
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());

        try {
            Number number = numberFormat.parse(currency.replaceAll("[^\\d.]", ""));

            // Lấy giá trị số nguyên từ số thực
            int intValue = number.intValue();

            System.out.println("Số nguyên đã chuyển đổi: " + intValue);
            return intValue+"";
        } catch (ParseException e) {
            System.err.println("Không thể chuyển đổi chuỗi tiền tệ thành số nguyên.");
            return null;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbCategory = new javax.swing.JComboBox<>();
        txtID = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtPrice = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Tên sản phẩm");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 102, 24));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 76, 24));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Danh mục sản phẩm");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 141, 24));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("Giá sản phẩm");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 141, 20));

        cbCategory.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jPanel1.add(cbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 217, 32));

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtID.setText("00");
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 217, 31));

        btnEdit.setBackground(new java.awt.Color(25, 118, 211));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 100, 34));

        btnDelete.setBackground(new java.awt.Color(25, 118, 211));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 100, 34));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnClear.setText("Làm mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 100, 34));

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
        });
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 217, 33));

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 217, 33));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 118, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DANH SÁCH SẢN PHẨM");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 340, 60));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên sản phẩm", "Danh mục", "Giá"
            }
        ));
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(25, 118, 211));
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(25, 118, 211));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(25, 118, 211));
        rSTableMetro1.setColorSelBackgound(new java.awt.Color(25, 118, 211));
        rSTableMetro1.setFuenteFilas(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSTableMetro1.setFuenteFilasSelect(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSTableMetro1.setFuenteHead(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rSTableMetro1.setRowHeight(30);
        rSTableMetro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSTableMetro1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rSTableMetro1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 620, 270));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1278, 0, 50, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1098, 0, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        Product product = new Product();
        product.setId(Integer.parseInt(txtID.getText()));
        product.setName(txtName.getText());
        product.setCategory(cbCategory.getSelectedItem().toString());
        product.setPrice(txtPrice.getText());

        ProductDao.update(product);
        setVisible(false);
        new EditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String id = txtID.getText();
        int a = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa sản phẩm: " + txtName.getText() + " ?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            ProductDao.delete(id);
            setVisible(false);
            new EditDeleteProduct().setVisible(true);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new EditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) rSTableMetro1.getModel();
        ArrayList<Product> list = ProductDao.getAllRecords();
        Iterator<Product> itr = list.iterator();

        Locale locale = new Locale("vi", "VN");
//        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        while (itr.hasNext()) {
            Product productObj = itr.next();
            dtm.addRow(new Object[]{productObj.getId(), productObj.getName(), productObj.getCategory(), formatter.format(Double.parseDouble(productObj.getPrice()))});
//            dtm.addRow(new Object[]{productObj.getId(), productObj.getName(), productObj.getCategory(), productObj.getPrice()});

        }

    }//GEN-LAST:event_formComponentShown

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtPriceKeyReleased

    private void rSTableMetro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro1MouseClicked
        // TODO add your handling code here:
        int index = rSTableMetro1.getSelectedRow();
        TableModel model = rSTableMetro1.getModel();
        String id = model.getValueAt(index, 0).toString();
        String name = model.getValueAt(index, 1).toString();
        String category = model.getValueAt(index, 2).toString();
        String price = model.getValueAt(index, 3).toString();

        txtID.setText(id);
        txtName.setText(name);
        cbCategory.removeAllItems();
        cbCategory.addItem(category);
        try {
            txtPrice.setText(currencyToString(price));
        } catch (ParseException ex) {
            Logger.getLogger(EditDeleteProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
//        txtPrice.setText(price);
        ArrayList<Category> list = CategoryDao.getAllRecords();
        Iterator<Category> itr = list.iterator();
        while (itr.hasNext()) {
            Category categoryObj = itr.next();
            if (!categoryObj.getName().equals(category)) {
                cbCategory.addItem(categoryObj.getName());
            }

        }
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_rSTableMetro1MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditDeleteProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
