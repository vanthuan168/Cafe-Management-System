/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cafemanagementsystem;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.FontFactoryImp;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import common.OpenPdf;
import dao.BillDao;
import dao.CategoryDao;
import dao.CustomerDao;
import dao.ProductDao;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Bill;
import model.Category;
import model.Customer;
import model.Product;

/**
 *
 * @author thuan
 */
public class Order extends javax.swing.JInternalFrame {

    public int billId = 1;
    public int productPrice = 0;
    public int productTotal = 0;
    public int grandTotal = 0;
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPatern = "^[0-9]*$";
    public String userEmail;

    /**
     * Creates new form Product
     */
    public Order() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    public Order(String email) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);

        txtProductName.setEditable(false);
        txtProductPrice.setEditable(false);
        txtProductTotal.setEditable(false);
        btnAddToCart.setEnabled(false);
        btnGenerateBillPrint.setEnabled(false);
        JFormattedTextField tf = ((JSpinner.DefaultEditor) txtQuanlity.getEditor()).getTextField();
        tf.setEnabled(false);
        userEmail = email;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void productNameByCategory(String category) {
        DefaultTableModel dtm = (DefaultTableModel) rSTableMetro1.getModel();
        dtm.setRowCount(0);
        ArrayList<Product> list = ProductDao.getAllRecordByCategory(category);
        Iterator<Product> itr = list.iterator();
        while (itr.hasNext()) {
            Product producObj = itr.next();
            dtm.addRow(new Object[]{producObj.getName()});
        }
    }

    public void filterProductByName(String name, String category) {
        DefaultTableModel dtm = (DefaultTableModel) rSTableMetro1.getModel();
        dtm.setRowCount(0);
        ArrayList<Product> list = ProductDao.filterProductByName(name, category);
        Iterator<Product> itr = list.iterator();
        while (itr.hasNext()) {
            Product producObj = itr.next();
            dtm.addRow(new Object[]{producObj.getName()});
        }
    }
     public void filerCustomerByMobileNumber(String mobileNumber){
         DefaultTableModel dtm1 = (DefaultTableModel) rSTableMetro4.getModel();
        dtm1.setRowCount(0);
        ArrayList<Customer> list_customer = CustomerDao.filterCustomerByMobileNumber(mobileNumber);
        Iterator<Customer> itr_customer = list_customer.iterator();
        while (itr_customer.hasNext()) {
            Customer customerObj = itr_customer.next();
            dtm1.addRow(new Object[]{customerObj.getName(), customerObj.getMobileNumber(), customerObj.getEmail()});
//            txttest.setText(customerObj.getName());
        }
     }
    public void getAllRecordsOfCustomer() {
        DefaultTableModel dtm1 = (DefaultTableModel) rSTableMetro4.getModel();
        dtm1.setRowCount(0);
        ArrayList<Customer> list_customer = CustomerDao.getAllRecords();
        Iterator<Customer> itr_customer = list_customer.iterator();
        while (itr_customer.hasNext()) {
            Customer customerObj = itr_customer.next();
            dtm1.addRow(new Object[]{customerObj.getName(), customerObj.getMobileNumber(), customerObj.getEmail()});
//            txttest.setText(customerObj.getName());
        }
    }

    public void clearProductFields() {
        txtProductName.setText("");
        txtProductPrice.setText("");
        txtQuanlity.setValue(0);
        txtProductTotal.setText("");
        btnAddToCart.setEnabled(false);
    }

    public void validateFields() {
        String customerName = txtCustomerName.getText();
        String customerEmail = txtCustomerEmail.getText();
        String customerMobileNumber = txtCustomerMobileNumber.getText();

        if (!customerName.equals("") && !customerEmail.equals("") && customerEmail.matches(emailPattern) && !customerMobileNumber.equals("") && customerMobileNumber.matches(mobileNumberPatern) && customerMobileNumber.length() == 10 && grandTotal > 0) {
            btnGenerateBillPrint.setEnabled(true);
//            btnAddCustomer.setEnabled(true);
        } else {
            btnGenerateBillPrint.setEnabled(false);
//            btnAddCustomer.setEnabled(false);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbBillId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCustomerMobileNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCustomerEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbCategory = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        jLabel10 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        txtProductPrice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtQuanlity = new javax.swing.JSpinner();
        txtProductTotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnGenerateBillPrint = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        rSTableMetro2 = new rojeru_san.complementos.RSTableMetro();
        jLabel15 = new javax.swing.JLabel();
        lbGrandTotal = new javax.swing.JLabel();
        btnAddToCart = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCustomerSearch = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        rSTableMetro4 = new rojeru_san.complementos.RSTableMetro();
        btnAddCustomer = new javax.swing.JButton();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("ID hóa đơn:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 90, -1));

        lbBillId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbBillId.setText("----");
        jPanel1.add(lbBillId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 80, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Thông tin khách hàng:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 140, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("Tên khách hàng");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 120, -1));

        txtCustomerName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtCustomerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 190, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Số điện thoại");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 90, -1));

        txtCustomerMobileNumber.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtCustomerMobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerMobileNumberKeyReleased(evt);
            }
        });
        jPanel1.add(txtCustomerMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 190, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 90, -1));

        txtCustomerEmail.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtCustomerEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerEmailKeyReleased(evt);
            }
        });
        jPanel1.add(txtCustomerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 190, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setText("Tên danh mục");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 100, 20));

        cbCategory.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoryActionPerformed(evt);
            }
        });
        jPanel1.add(cbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, 200, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setText("Tìm kiếm");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 80, -1));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 200, -1));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sản phẩm"
            }
        ));
        rSTableMetro1.setAltoHead(30);
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setFuenteFilas(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSTableMetro1.setFuenteFilasSelect(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSTableMetro1.setFuenteHead(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSTableMetro1.setRowHeight(25);
        rSTableMetro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSTableMetro1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rSTableMetro1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 300, 170));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel10.setText("Tên sản phẩm");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 100, -1));

        txtProductName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jPanel1.add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 200, -1));

        txtProductPrice.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jPanel1.add(txtProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 200, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel11.setText("Giá sản phẩm");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 110, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel12.setText("Số lượng");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 80, -1));

        txtQuanlity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtQuanlity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtQuanlityStateChanged(evt);
            }
        });
        jPanel1.add(txtQuanlity, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 200, -1));

        txtProductTotal.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jPanel1.add(txtProductTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 200, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setText("Tổng tiền");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 80, -1));

        btnGenerateBillPrint.setBackground(new java.awt.Color(25, 118, 211));
        btnGenerateBillPrint.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGenerateBillPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateBillPrint.setText("IN HÓA ĐƠN");
        btnGenerateBillPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateBillPrintActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerateBillPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 560, 150, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel14.setText("Thông tin sản phẩm:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 170, -1));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnClear.setText("Làm mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 90, 30));

        rSTableMetro2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sản phẩm", "Đơn giá", "Số lượng", "Tổng tiền"
            }
        ));
        rSTableMetro2.setAltoHead(30);
        rSTableMetro2.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro2.setFuenteFilas(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSTableMetro2.setFuenteFilasSelect(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSTableMetro2.setFuenteHead(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSTableMetro2.setRowHeight(25);
        rSTableMetro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSTableMetro2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(rSTableMetro2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 650, 200));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setText("Tổng cộng:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 90, 30));

        lbGrandTotal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbGrandTotal.setText("000");
        jPanel1.add(lbGrandTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, 170, 30));

        btnAddToCart.setBackground(new java.awt.Color(25, 118, 211));
        btnAddToCart.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAddToCart.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToCart.setText("Thêm vào giỏ hàng");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 170, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(25, 118, 211));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ORDER");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 250, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("Tìm kiếm KH");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 100, -1));

        txtCustomerSearch.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtCustomerSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtCustomerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 190, -1));

        rSTableMetro4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên KH", "SĐT", "Email"
            }
        ));
        rSTableMetro4.setAltoHead(30);
        rSTableMetro4.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro4.setFuenteFilas(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSTableMetro4.setFuenteFilasSelect(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSTableMetro4.setFuenteHead(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSTableMetro4.setRowHeight(25);
        rSTableMetro4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSTableMetro4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(rSTableMetro4);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 340, 220));

        btnAddCustomer.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAddCustomer.setText("Thêm KH");
        btnAddCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCustomerMouseClicked(evt);
            }
        });
        jPanel1.add(btnAddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 260, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:\
        //        Customer
        getAllRecordsOfCustomer();

        billId = Integer.parseInt(BillDao.getId());
        lbBillId.setText(BillDao.getId());

        ArrayList<Category> list = CategoryDao.getAllRecords();
        Iterator<Category> itr = list.iterator();
        while (itr.hasNext()) {
            Category categoryObj = itr.next();
            cbCategory.addItem(categoryObj.getName());
        }

        String category = (String) cbCategory.getSelectedItem();
        productNameByCategory(category);

    }//GEN-LAST:event_formComponentShown

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String name = txtSearch.getText();
        String category = (String) cbCategory.getSelectedItem();
        filterProductByName(name, category);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void rSTableMetro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro1MouseClicked
        // TODO add your handling code here:
        int index = rSTableMetro1.getSelectedRow();
        TableModel model = rSTableMetro1.getModel();
        String productName = model.getValueAt(index, 0).toString();
        Product product = ProductDao.getProductByName(productName);
        txtProductName.setText(product.getName());
        txtProductPrice.setText(product.getPrice());
        txtQuanlity.setValue(1);
        txtProductTotal.setText(product.getPrice());
        productPrice = Integer.parseInt(product.getPrice());
        productTotal = Integer.parseInt(product.getPrice());
        btnAddToCart.setEnabled(true);
    }//GEN-LAST:event_rSTableMetro1MouseClicked

    private void txtQuanlityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtQuanlityStateChanged
        // TODO add your handling code here:
        int quanlity = (Integer) txtQuanlity.getValue();
        if (quanlity <= 1) {
            txtQuanlity.setValue(1);
            quanlity = 1;
        }
        productTotal = productPrice * quanlity;
        txtProductTotal.setText(String.valueOf(productTotal));
    }//GEN-LAST:event_txtQuanlityStateChanged

    private void cbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoryActionPerformed
        // TODO add your handling code here:
        String category = cbCategory.getSelectedItem().toString();
        productNameByCategory(category);
    }//GEN-LAST:event_cbCategoryActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        String name = txtProductName.getText();
        String price = txtProductPrice.getText();
        String quanlity = String.valueOf(txtQuanlity.getValue());
        String total = txtProductTotal.getText();
        DefaultTableModel dtm = (DefaultTableModel) rSTableMetro2.getModel();
        dtm.addRow(new Object[]{name, price, quanlity, total});
        grandTotal = grandTotal + productTotal;
        lbGrandTotal.setText(String.valueOf(grandTotal));

        clearProductFields();
        validateFields();
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearProductFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtCustomerNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerNameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtCustomerNameKeyReleased

    private void txtCustomerMobileNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerMobileNumberKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtCustomerMobileNumberKeyReleased

    private void txtCustomerEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerEmailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtCustomerEmailKeyReleased

    private void btnGenerateBillPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateBillPrintActionPerformed
        // TODO add your handling code here:
        String customerName = txtCustomerName.getText();
        String customerPhoneNumber = txtCustomerMobileNumber.getText();
        String customerEmail = txtCustomerEmail.getText();
//        

        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        String todayDate = dFormat.format(date);
        String total = String.valueOf(grandTotal);
        String createdBy = userEmail;
        Bill bill = new Bill();
        bill.setId(billId);
        bill.setName(customerName);
        bill.setEmail(customerEmail);
        bill.setMobileNumber(customerPhoneNumber);
        bill.setDate(todayDate);
        bill.setTotal(total);
        bill.setCreatedBy(createdBy);
        BillDao.save(bill);

//        custom font for vietnamese
        FontFactory.register("font/SVN-Arial.ttf");
        com.itextpdf.text.Font textFont = FontFactory.getFont("font/SVN-Arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 12);
        //        Created document

        String path = "D:\\BillOfCafeManagementSystem\\Bill_";
        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + "" + billId + ".pdf"));
            doc.open();
            Paragraph cafeName = new Paragraph("							UIT Cafe\n");
            doc.add(cafeName);
            Paragraph starLine = new Paragraph("***************************************************************************************************************");
            doc.add(starLine);
            Paragraph paragraph3 = new Paragraph("\tID Hóa Đơn: " + billId
                    + "\nKhách hàng: " + customerName + " - " + customerPhoneNumber
                    
                    + "\nNhân viên: " + createdBy, textFont);

            doc.add(paragraph3);
            doc.add(starLine);
            PdfPTable tb1 = new PdfPTable(4);
            doc.add(tb1);
            tb1.addCell(new Phrase("Tên sản phẩm", textFont));
            tb1.addCell(new Phrase("Đơn giá", textFont));
            tb1.addCell(new Phrase("Số lượng", textFont));
            tb1.addCell(new Phrase("Tổng tiền", textFont));
            for (int i = 0; i < rSTableMetro2.getRowCount(); i++) {
                String n = rSTableMetro2.getValueAt(i, 0).toString();
                String d = rSTableMetro2.getValueAt(i, 1).toString();
                String r = rSTableMetro2.getValueAt(i, 2).toString();
                String q = rSTableMetro2.getValueAt(i, 3).toString();
                tb1.addCell(n);
                tb1.addCell(d);
                tb1.addCell(r);
                tb1.addCell(q);

            }
            doc.add(tb1);
            Paragraph paragraph4 = new Paragraph("\nTổng thanh toán: " + grandTotal, textFont);
            doc.add(paragraph4);
            doc.add(starLine);
            Paragraph thankMsg = new Paragraph("\nCảm ơn quý khách!", textFont);
            doc.add(thankMsg);

//            Mở file pdf
            OpenPdf.openById(String.valueOf(billId));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        doc.close();
//        setVisible(false);
//        new Order(createdBy).setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnGenerateBillPrintActionPerformed

    private void rSTableMetro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro2MouseClicked
        // TODO add your handling code here:
        int index = rSTableMetro2.getSelectedRow();
        int a = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa sản phẩm ?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            TableModel model = rSTableMetro2.getModel();
            String total = model.getValueAt(index, 3).toString();
            grandTotal = grandTotal - Integer.parseInt(total);
            lbGrandTotal.setText(String.valueOf(grandTotal));
            ((DefaultTableModel) rSTableMetro2.getModel()).removeRow(index);

        }
    }//GEN-LAST:event_rSTableMetro2MouseClicked

    private void rSTableMetro4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro4MouseClicked
        // TODO add your handling code here:
        int index = rSTableMetro4.getSelectedRow();
        TableModel model = rSTableMetro4.getModel();
        String name = model.getValueAt(index, 0).toString();
        String mobileNumber = model.getValueAt(index, 1).toString();
        String email = model.getValueAt(index, 2).toString();

        txtCustomerName.setText(name);
        txtCustomerMobileNumber.setText(mobileNumber);
        txtCustomerEmail.setText(email);
//        btnAddCustomer.setEnabled(false);

    }//GEN-LAST:event_rSTableMetro4MouseClicked

    private void btnAddCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCustomerMouseClicked
        // TODO add your handling code here:
        String customerName = txtCustomerName.getText();
        String customerPhoneNumber = txtCustomerMobileNumber.getText();
        String customerEmail = txtCustomerEmail.getText();

        Customer customer = new Customer();
        customer.setName(customerName);
        customer.setMobileNumber(customerPhoneNumber);
        customer.setEmail(customerEmail);
        CustomerDao.addCustomer(customer);
        getAllRecordsOfCustomer();
    }//GEN-LAST:event_btnAddCustomerMouseClicked

    private void txtCustomerSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerSearchKeyReleased
        // TODO add your handling code here:
        String mobileNumber = txtCustomerSearch.getText();
        filerCustomerByMobileNumber(mobileNumber);
    }//GEN-LAST:event_txtCustomerSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnGenerateBillPrint;
    private javax.swing.JComboBox<String> cbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbBillId;
    private javax.swing.JLabel lbGrandTotal;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    private rojeru_san.complementos.RSTableMetro rSTableMetro2;
    private rojeru_san.complementos.RSTableMetro rSTableMetro4;
    private javax.swing.JTextField txtCustomerEmail;
    private javax.swing.JTextField txtCustomerMobileNumber;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtCustomerSearch;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductPrice;
    private javax.swing.JTextField txtProductTotal;
    private javax.swing.JSpinner txtQuanlity;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
