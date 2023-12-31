/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cafemanagementsystem;

import dao.UserDao;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.User;
import cafemanagementsystem.Home;

/**
 *
 * @author thuan
 */
public class VerifyUser extends javax.swing.JInternalFrame {

    /**
     * Creates new form Product
     */
    public VerifyUser() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    public void getAllRecords(String email) {
        DefaultTableModel dtm = (DefaultTableModel) rSTableMetro1.getModel();
        dtm.setRowCount(0);
        ArrayList<User> list = UserDao.getAllRecords(email);
        Iterator<User> itr = list.iterator();
        while (itr.hasNext()) {
            User userObj = itr.next();
            if (!userObj.getEmail().equals("admin@gmail.com")) {
                String status = "";
                if (userObj.getStatus().equals("true")) {
                    status = "Đang hoạt động";
                } else {
                    status = "Không hoạt động";
                }
                dtm.addRow(new Object[]{userObj.getId(), userObj.getName(), userObj.getEmail(), userObj.getMobileNumber(), userObj.getAddress(), userObj.getSecurityQuestion(), status});
            }
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
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tìm kiếm");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 90, -1));

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 300, 30));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ và tên", "Email", "Số điện thoại", "Địa chỉ", "Câu hỏi bảo mật", "Trạng thái"
            }
        ));
        rSTableMetro1.setAltoHead(30);
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(25, 118, 211));
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(25, 118, 211));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(25, 118, 211));
        rSTableMetro1.setColorSelBackgound(new java.awt.Color(25, 118, 211));
        rSTableMetro1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 1040, 240));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 118, 211));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CẬP NHẬT TRẠNG THÁI TÀI KHOẢN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 490, 50));

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("* Click để thay đổi trạng thái tài khoản");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 380, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) rSTableMetro1.getModel();
        dtm.setRowCount(0);
        ArrayList<User> list = UserDao.getAllRecordsUser();
        Iterator<User> itr = list.iterator();
        while (itr.hasNext()) {
            User userObj = itr.next();
            if (!userObj.getEmail().equals("admin@gmail.com")) {
                String status = "";
                if (userObj.getStatus().equals("true")) {
                    status = "Đang hoạt động";
                } else {
                    status = "Không hoạt động";
                }
                dtm.addRow(new Object[]{userObj.getId(), userObj.getName(), userObj.getEmail(), userObj.getMobileNumber(), userObj.getAddress(), userObj.getSecurityQuestion(), status});
            }
        }
        

    }//GEN-LAST:event_formComponentShown

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        String email = txtEmail.getText();
        getAllRecords(email);
    }//GEN-LAST:event_txtEmailKeyReleased

    private void rSTableMetro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro1MouseClicked
        // TODO add your handling code here:
        int index = rSTableMetro1.getSelectedRow();
        TableModel model = rSTableMetro1.getModel();
        String email = model.getValueAt(index, 2).toString();
        String status = model.getValueAt(index, 6).toString();
        if (status.equals("Đang hoạt động")) {
            status = "false";
        } else {
            status = "true";
        }

        int a = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thay đổi trạng thái tài khoản " + email + " ?", "Xác minh", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            UserDao.changeStatus(email, status);
//            setVisible(false);
            DefaultTableModel dtm = (DefaultTableModel) rSTableMetro1.getModel();
            dtm.setRowCount(0);
            String email1 = txtEmail.getText();
            getAllRecords(email1);
//            getAllRecords(email);
//            revalidate();
//            repaint();
//            dispose();
//            new VerifyUser().setVisible(true);
//            done();
        }
    }//GEN-LAST:event_rSTableMetro1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
