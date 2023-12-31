/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafemanagementsystem;

import dao.UserDao;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author thuan
 */
public class Login extends javax.swing.JFrame {
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    @Override
    public void setLocationRelativeTo(Component c) {
        super.setLocationRelativeTo(null); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        btnLogin.setEnabled(false);
//        txtEmail.setText("admin@gmail.com");
//        txtPassword.setText("admin");
//         btnLogin.setEnabled(true);
    }
    
    public void clear(){
        txtEmail.setText("");
        txtPassword.setText("");
        btnLogin.setEnabled(false);
    }
    
    public void validateFiels(){
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        if(email.matches(emailPattern) && !password.equals("")){
            btnLogin.setEnabled(true);
        } else{
            btnLogin.setEnabled(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();
        btnForgotPassword = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 118, 211));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/bg-login.png"))); // NOI18N
        jLabel1.setText("Welcome !");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        jPanel2.setBackground(new java.awt.Color(25, 118, 211));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đăng nhập");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 53, 420, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Xin chào! Vui lòng đăng nhập để bắt đầu");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 102, 420, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 346, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("_______________________________________________________");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 303, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 37, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mật Khẩu");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 346, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("_______________________________________________________");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 303, 20));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/icons8_eye_20px_1.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.setDisabledIcon(null);
        show.setDoubleBuffered(true);
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 40, 30));

        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/icons8_invisible_20px_1.png"))); // NOI18N
        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel2.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 40, 30));

        btnForgotPassword.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnForgotPassword.setForeground(new java.awt.Color(255, 255, 255));
        btnForgotPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnForgotPassword.setText("Quên mật khẩu?");
        btnForgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnForgotPasswordMouseClicked(evt);
            }
        });
        jPanel2.add(btnForgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 298, 100, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Bạn chưa có tài khoản?");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 382, -1, -1));

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(25, 118, 211));
        btnLogin.setText("ĐĂNG NHẬP");
        btnLogin.setBorderPainted(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 328, 334, 36));

        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnRegister.setText("Đăng Ký");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 382, 57, -1));

        txtEmail.setBackground(new java.awt.Color(25, 118, 211));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 290, 30));

        txtPassword.setBackground(new java.awt.Color(25, 118, 211));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 290, 30));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 40, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 420, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        txtPassword.setEchoChar((char)8226);
        show.setVisible(false);
        show.setEnabled(false);
        disable.setVisible(true);
        disable.setEnabled(true);
        
    }//GEN-LAST:event_showMouseClicked

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
       txtPassword.setEchoChar((char)0);
       disable.setVisible(false);
        disable.setEnabled(false);
        show.setVisible(true);
        show.setEnabled(true);
        
    }//GEN-LAST:event_disableMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
//        System.exit(0);
        int a = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát chương trình?","Xác nhận", JOptionPane.YES_NO_OPTION);
        if(a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        User user = null;
        user = UserDao.login(email, password);
        
        if(user == null){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color: red\">Email hoặc Mật Khẩu không đúng!!</b></html>", "Thông báo", JOptionPane.ERROR_MESSAGE);
            clear();
        } else {
            if(user.getStatus().equals("false")){
                ImageIcon icon = new ImageIcon("src/popupicon/wait.png");
                JOptionPane.showMessageDialog(null, "<html><b>Tài khoản chưa được duyệt!</b></html>", "Thông báo", JOptionPane.INFORMATION_MESSAGE, icon);
            } else if(user.getStatus().equals("true")){
                setVisible(false);
                new Home(email).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        validateFiels();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        validateFiels();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        setVisible(false);
        new Signup().setVisible(true);
    }//GEN-LAST:event_btnRegisterMouseClicked

    private void btnForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnForgotPasswordMouseClicked
        setVisible(false);
        new ForgotPassword().setVisible(true);
    }//GEN-LAST:event_btnForgotPasswordMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnForgotPassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel btnRegister;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel show;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
