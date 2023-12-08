/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafemanagementsystem;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author thuan
 */
public class Home extends javax.swing.JFrame {
    Color defaultColor, clickedColor;
    private String email;
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
        defaultColor = new Color(25,118,211);
        clickedColor = new Color(0,51,153);
        
//        set 
        jpDashboard.setBackground(clickedColor);
        jpOrder.setBackground(defaultColor);
        jpBill.setBackground(defaultColor);
        jpProduct.setBackground(defaultColor);
        jpUser.setBackground(defaultColor);
        jpAccount.setBackground(defaultColor);
        jpChart.setBackground(defaultColor);
    }

    @Override
    public void setLocationRelativeTo(Component c) {
        super.setLocationRelativeTo(c); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public Home(String userEmail) {
        initComponents();
        setLocationRelativeTo(null);
        defaultColor = new Color(25,118,211);
        clickedColor = new Color(0,51,153);
        email = userEmail;
        if(!email.equals("admin@gmail.com")){
            btnDashboard.setVisible(false);
            jpDashboard.setVisible(false);
            btnProduct.setVisible(false);
            jpProduct.setVisible(false);
            btnUser.setVisible(false);
            jpUser.setVisible(false);
            jpChart.setVisible(false);
            btnChart.setVisible(false);
        } else {
            jpDashboard.setBackground(clickedColor);
//            menuName.setText("DASHBOARD");
            Dashboard dashboardMenu = new Dashboard();
            jDesktopPane.removeAll();
            jDesktopPane.add(dashboardMenu).setVisible(true);
        }
            
        
       
//        jpDashboard.setBackground(clickedColor);
        jpOrder.setBackground(defaultColor);
        jpBill.setBackground(defaultColor);
        jpProduct.setBackground(defaultColor);
        jpUser.setBackground(defaultColor);
        jpAccount.setBackground(defaultColor);
        jpChart.setBackground(defaultColor);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSMaterialButtonCircleBeanInfo1 = new rojerusan.RSMaterialButtonCircleBeanInfo();
        jPanel3 = new javax.swing.JPanel();
        rSFotoCircle1 = new rojerusan.RSFotoCircle();
        jLabel8 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        jpDashboard = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JLabel();
        jpProduct = new javax.swing.JPanel();
        btnProduct = new javax.swing.JLabel();
        jpOrder = new javax.swing.JPanel();
        btnOrder = new javax.swing.JLabel();
        jpBill = new javax.swing.JPanel();
        btnBill = new javax.swing.JLabel();
        jpUser = new javax.swing.JPanel();
        btnUser = new javax.swing.JLabel();
        jpChart = new javax.swing.JPanel();
        btnChart = new javax.swing.JLabel();
        jpAccount = new javax.swing.JPanel();
        btnAccount = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(25, 118, 211));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(rSFotoCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 80, 77));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Welcome !!");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 230, 30));

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/exit_30px.png"))); // NOI18N
        btnLogout.setText("   ĐĂNG XUẤT");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        jPanel3.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 160, 30));

        jpDashboard.setBackground(new java.awt.Color(25, 118, 211));
        jpDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpDashboardMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpDashboardMousePressed(evt);
            }
        });

        btnDashboard.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/home_30px.png"))); // NOI18N
        btnDashboard.setText("   DASHBOARD");
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpDashboardLayout = new javax.swing.GroupLayout(jpDashboard);
        jpDashboard.setLayout(jpDashboardLayout);
        jpDashboardLayout.setHorizontalGroup(
            jpDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDashboardLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jpDashboardLayout.setVerticalGroup(
            jpDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDashboardLayout.createSequentialGroup()
                .addComponent(btnDashboard)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jpDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 230, 30));

        jpProduct.setBackground(new java.awt.Color(25, 118, 211));
        jpProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpProductMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpProductMousePressed(evt);
            }
        });

        btnProduct.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnProduct.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/product_30px.png"))); // NOI18N
        btnProduct.setText("   SẢN PHẨM");
        btnProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProductMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpProductLayout = new javax.swing.GroupLayout(jpProduct);
        jpProduct.setLayout(jpProductLayout);
        jpProductLayout.setHorizontalGroup(
            jpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProductLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnProduct)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jpProductLayout.setVerticalGroup(
            jpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProductLayout.createSequentialGroup()
                .addComponent(btnProduct)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jpProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 230, 30));

        jpOrder.setBackground(new java.awt.Color(25, 118, 211));
        jpOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpOrderMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpOrderMousePressed(evt);
            }
        });

        btnOrder.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/create_order_30px.png"))); // NOI18N
        btnOrder.setText("   ORDER");
        btnOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpOrderLayout = new javax.swing.GroupLayout(jpOrder);
        jpOrder.setLayout(jpOrderLayout);
        jpOrderLayout.setHorizontalGroup(
            jpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOrderLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jpOrderLayout.setVerticalGroup(
            jpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOrderLayout.createSequentialGroup()
                .addComponent(btnOrder)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jpOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 230, 30));

        jpBill.setBackground(new java.awt.Color(25, 118, 211));
        jpBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpBillMousePressed(evt);
            }
        });

        btnBill.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnBill.setForeground(new java.awt.Color(255, 255, 255));
        btnBill.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/purchase_order_30px.png"))); // NOI18N
        btnBill.setText("   HÓA ĐƠN");
        btnBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpBillLayout = new javax.swing.GroupLayout(jpBill);
        jpBill.setLayout(jpBillLayout);
        jpBillLayout.setHorizontalGroup(
            jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBillLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnBill, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jpBillLayout.setVerticalGroup(
            jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBillLayout.createSequentialGroup()
                .addComponent(btnBill)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jpBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 230, 30));

        jpUser.setBackground(new java.awt.Color(25, 118, 211));
        jpUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpUserMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpUserMousePressed(evt);
            }
        });

        btnUser.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnUser.setForeground(new java.awt.Color(255, 255, 255));
        btnUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/user_30px.png"))); // NOI18N
        btnUser.setText("   USER");
        btnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpUserLayout = new javax.swing.GroupLayout(jpUser);
        jpUser.setLayout(jpUserLayout);
        jpUserLayout.setHorizontalGroup(
            jpUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUserLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jpUserLayout.setVerticalGroup(
            jpUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUserLayout.createSequentialGroup()
                .addComponent(btnUser)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jpUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 230, 30));

        jpChart.setBackground(new java.awt.Color(25, 118, 211));
        jpChart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpChartMousePressed(evt);
            }
        });

        btnChart.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnChart.setForeground(new java.awt.Color(255, 255, 255));
        btnChart.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnChart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/chart_30px.png"))); // NOI18N
        btnChart.setText("   THỐNG KÊ");
        btnChart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpChartLayout = new javax.swing.GroupLayout(jpChart);
        jpChart.setLayout(jpChartLayout);
        jpChartLayout.setHorizontalGroup(
            jpChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpChartLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnChart, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jpChartLayout.setVerticalGroup(
            jpChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpChartLayout.createSequentialGroup()
                .addComponent(btnChart)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jpChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 230, 30));

        jpAccount.setBackground(new java.awt.Color(25, 118, 211));
        jpAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpAccountMousePressed(evt);
            }
        });

        btnAccount.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnAccount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/edit_account_30px.png"))); // NOI18N
        btnAccount.setText("   TÀI KHOẢN");
        btnAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpAccountLayout = new javax.swing.GroupLayout(jpAccount);
        jpAccount.setLayout(jpAccountLayout);
        jpAccountLayout.setHorizontalGroup(
            jpAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAccountLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jpAccountLayout.setVerticalGroup(
            jpAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAccountLayout.createSequentialGroup()
                .addComponent(btnAccount)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jpAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 230, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 660));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 50, 43));

        jDesktopPane.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        jPanel2.add(jDesktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1080, 620));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1080, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProductMousePressed
        // TODO add your handling code here:
        jpDashboard.setBackground(defaultColor);
        jpOrder.setBackground(defaultColor);
        jpBill.setBackground(defaultColor);
        jpProduct.setBackground(clickedColor);
        jpUser.setBackground(defaultColor);
        jpAccount.setBackground(defaultColor);
        jpChart.setBackground(defaultColor);
        
//        menuName.setText("SẢN PHẨM");
    }//GEN-LAST:event_jpProductMousePressed

    private void jpOrderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpOrderMousePressed
        // TODO add your handling code here:
        jpDashboard.setBackground(defaultColor);
        jpOrder.setBackground(clickedColor);
        jpBill.setBackground(defaultColor);
        jpProduct.setBackground(defaultColor);
        jpUser.setBackground(defaultColor);
        jpAccount.setBackground(defaultColor);
        jpChart.setBackground(defaultColor);
        
//        menuName.setText("ORDER");
    }//GEN-LAST:event_jpOrderMousePressed

    private void jpBillMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBillMousePressed
        // TODO add your handling code here:
        jpDashboard.setBackground(defaultColor);
        jpOrder.setBackground(defaultColor);
        jpBill.setBackground(clickedColor);
        jpProduct.setBackground(defaultColor);
        jpUser.setBackground(defaultColor);
        jpAccount.setBackground(defaultColor);
        jpChart.setBackground(defaultColor);
        
//        menuName.setText("HÓA ĐƠN");
    }//GEN-LAST:event_jpBillMousePressed

    private void jpUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUserMousePressed
        // TODO add your handling code here:
        jpDashboard.setBackground(defaultColor);
        jpOrder.setBackground(defaultColor);
        jpBill.setBackground(defaultColor);
        jpProduct.setBackground(defaultColor);
        jpUser.setBackground(clickedColor);
        jpAccount.setBackground(defaultColor);
        jpChart.setBackground(defaultColor);
        
//        menuName.setText("USER");
    }//GEN-LAST:event_jpUserMousePressed

    private void jpChartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpChartMousePressed
        // TODO add your handling code here:
        jpDashboard.setBackground(defaultColor);
        jpOrder.setBackground(defaultColor);
        jpBill.setBackground(defaultColor);
        jpProduct.setBackground(defaultColor);
        jpUser.setBackground(defaultColor);
        jpAccount.setBackground(defaultColor);
        jpChart.setBackground(clickedColor);
        
//        menuName.setText("THỐNG KÊ");
    }//GEN-LAST:event_jpChartMousePressed

    private void jpAccountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAccountMousePressed
        // TODO add your handling code here:
        jpDashboard.setBackground(defaultColor);
        jpOrder.setBackground(defaultColor);
        jpBill.setBackground(defaultColor);
        jpProduct.setBackground(defaultColor);
        jpUser.setBackground(defaultColor);
        jpAccount.setBackground(clickedColor);
        jpChart.setBackground(defaultColor);
        
//        menuName.setText("TÀI KHOẢN");
    }//GEN-LAST:event_jpAccountMousePressed

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn Đăng xuất?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if(a == 0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void jpDashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpDashboardMousePressed
        jpDashboard.setBackground(clickedColor);
        jpOrder.setBackground(defaultColor);
        jpBill.setBackground(defaultColor);
        jpProduct.setBackground(defaultColor);
        jpUser.setBackground(defaultColor);
        jpAccount.setBackground(defaultColor);
        jpChart.setBackground(defaultColor);
//        jpCategory.setBackground(defaultColor);
//        menuName.setText("DASHBOARD");
    }//GEN-LAST:event_jpDashboardMousePressed

    private void btnProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductMousePressed

    private void jpProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProductMouseClicked
        // TODO add your handling code here:
        Product productMenu = new Product();
        jDesktopPane.removeAll();
        jDesktopPane.add(productMenu).setVisible(true);
    }//GEN-LAST:event_jpProductMouseClicked

    private void btnProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductMouseClicked
        // TODO add your handling code here:
        jpDashboard.setBackground(defaultColor);
        jpOrder.setBackground(defaultColor);
        jpBill.setBackground(defaultColor);
        jpProduct.setBackground(clickedColor);
        jpUser.setBackground(defaultColor);
        jpAccount.setBackground(defaultColor);
        jpChart.setBackground(defaultColor);
//        jpCategory.setBackground(defaultColor);
//        menuName.setText("SẢN PHẨM");
        
        Product productMenu = new Product();
        jDesktopPane.removeAll();
        jDesktopPane.add(productMenu).setVisible(true);
    }//GEN-LAST:event_btnProductMouseClicked

    private void btnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseClicked
        // TODO add your handling code here:
        jpDashboard.setBackground(clickedColor);
        jpOrder.setBackground(defaultColor);
        jpBill.setBackground(defaultColor);
        jpProduct.setBackground(defaultColor);
        jpUser.setBackground(defaultColor);
        jpAccount.setBackground(defaultColor);
        jpChart.setBackground(defaultColor);
//        jpCategory.setBackground(defaultColor);
//        menuName.setText("DASHBOARD");
        
        Dashboard dashboard = new Dashboard();
        jDesktopPane.removeAll();
        jDesktopPane.add(dashboard).setVisible(true);
    }//GEN-LAST:event_btnDashboardMouseClicked

    private void jpDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpDashboardMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpDashboardMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát chương trình ?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if(a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseClicked
        // TODO add your handling code here:
        jpDashboard.setBackground(defaultColor);
        jpOrder.setBackground(clickedColor);
        jpBill.setBackground(defaultColor);
        jpProduct.setBackground(defaultColor);
        jpUser.setBackground(defaultColor);
        jpAccount.setBackground(defaultColor);
        jpChart.setBackground(defaultColor);
//        jpCategory.setBackground(defaultColor);
//        menuName.setText("DASHBOARD");
        
        Order order = new Order(email);
        jDesktopPane.removeAll();
        jDesktopPane.add(order).setVisible(true);
    }//GEN-LAST:event_btnOrderMouseClicked

    private void jpOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpOrderMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        jpDashboard.setBackground(defaultColor);
        jpOrder.setBackground(clickedColor);
        jpBill.setBackground(defaultColor);
        jpProduct.setBackground(defaultColor);
        jpUser.setBackground(defaultColor);
        jpAccount.setBackground(defaultColor);
        jpChart.setBackground(defaultColor);
//        jpCategory.setBackground(defaultColor);
//        menuName.setText("DASHBOARD");
        
        Order order = new Order(email);
        jDesktopPane.removeAll();
        jDesktopPane.add(order).setVisible(true);
    }//GEN-LAST:event_jpOrderMouseClicked

    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseClicked
        // TODO add your handling code here:
        jpDashboard.setBackground(defaultColor);
        jpOrder.setBackground(defaultColor);
        jpBill.setBackground(defaultColor);
        jpProduct.setBackground(defaultColor);
        jpUser.setBackground(clickedColor);
        jpAccount.setBackground(defaultColor);
        jpChart.setBackground(defaultColor);
//        jpCategory.setBackground(defaultColor);
//        menuName.setText("DASHBOARD");
        
        VerifyUser verifyUser = new VerifyUser();
        jDesktopPane.removeAll();
        jDesktopPane.add(verifyUser).setVisible(true);
    }//GEN-LAST:event_btnUserMouseClicked

    private void jpUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUserMouseClicked
        // TODO add your handling code here:
        jpDashboard.setBackground(defaultColor);
        jpOrder.setBackground(defaultColor);
        jpBill.setBackground(defaultColor);
        jpProduct.setBackground(defaultColor);
        jpUser.setBackground(clickedColor);
        jpAccount.setBackground(defaultColor);
        jpChart.setBackground(defaultColor);
//        jpCategory.setBackground(defaultColor);
//        menuName.setText("DASHBOARD");
        
        VerifyUser verifyUser = new VerifyUser();
        jDesktopPane.removeAll();
        jDesktopPane.add(verifyUser).setVisible(true);
    }//GEN-LAST:event_jpUserMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAccount;
    private javax.swing.JLabel btnBill;
    private javax.swing.JLabel btnChart;
    private javax.swing.JLabel btnDashboard;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnOrder;
    private javax.swing.JLabel btnProduct;
    private javax.swing.JLabel btnUser;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jpAccount;
    private javax.swing.JPanel jpBill;
    private javax.swing.JPanel jpChart;
    private javax.swing.JPanel jpDashboard;
    private javax.swing.JPanel jpOrder;
    private javax.swing.JPanel jpProduct;
    private javax.swing.JPanel jpUser;
    private rojerusan.RSFotoCircle rSFotoCircle1;
    private rojerusan.RSMaterialButtonCircleBeanInfo rSMaterialButtonCircleBeanInfo1;
    // End of variables declaration//GEN-END:variables
}
