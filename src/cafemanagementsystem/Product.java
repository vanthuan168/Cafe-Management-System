/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cafemanagementsystem;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author thuan
 */
public class Product extends javax.swing.JInternalFrame {

    /**
     * Creates new form Product
     */
    public Product() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
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
        btnDeleteProduct = new javax.swing.JLabel();
        btnCategory = new javax.swing.JLabel();
        btnAddproduct = new javax.swing.JLabel();
        btnUpdateProduct = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDeleteProduct.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteProduct.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnDeleteProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDeleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/delete_bin_50px.png"))); // NOI18N
        btnDeleteProduct.setText("Xóa sản phẩm");
        btnDeleteProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(25, 118, 211)));
        btnDeleteProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteProductMouseClicked(evt);
            }
        });
        jPanel1.add(btnDeleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 208, 64));

        btnCategory.setBackground(new java.awt.Color(255, 255, 255));
        btnCategory.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/category_50px.png"))); // NOI18N
        btnCategory.setText("Quản lý Danh mục");
        btnCategory.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(25, 118, 211)));
        btnCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoryMouseClicked(evt);
            }
        });
        jPanel1.add(btnCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 208, 64));

        btnAddproduct.setBackground(new java.awt.Color(255, 255, 255));
        btnAddproduct.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAddproduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddproduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/add_50px.png"))); // NOI18N
        btnAddproduct.setText("Thêm sản phẩm");
        btnAddproduct.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(25, 118, 211)));
        btnAddproduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddproduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddproductMouseClicked(evt);
            }
        });
        jPanel1.add(btnAddproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 208, 64));

        btnUpdateProduct.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateProduct.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnUpdateProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUpdateProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/update_50px.png"))); // NOI18N
        btnUpdateProduct.setText("Cập nhật sản phẩm");
        btnUpdateProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(25, 118, 211)));
        btnUpdateProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateProductMouseClicked(evt);
            }
        });
        jPanel1.add(btnUpdateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 208, 64));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoryMouseClicked
        // TODO add your handling code here:
        ManageCategory category = new ManageCategory();
        category.setVisible(true);
    }//GEN-LAST:event_btnCategoryMouseClicked

    private void btnAddproductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddproductMouseClicked
        // TODO add your handling code here:
        AddProduct addProduct = new AddProduct();
        addProduct.setVisible(true);
    }//GEN-LAST:event_btnAddproductMouseClicked

    private void btnUpdateProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateProductMouseClicked
        // TODO add your handling code here:
        EditDeleteProduct editDeleteProduct = new EditDeleteProduct();
        editDeleteProduct.setVisible(true);
    }//GEN-LAST:event_btnUpdateProductMouseClicked

    private void btnDeleteProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteProductMouseClicked
        // TODO add your handling code here:
        EditDeleteProduct editDeleteProduct = new EditDeleteProduct();
        editDeleteProduct.setVisible(true);
    }//GEN-LAST:event_btnDeleteProductMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddproduct;
    private javax.swing.JLabel btnCategory;
    private javax.swing.JLabel btnDeleteProduct;
    private javax.swing.JLabel btnUpdateProduct;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
