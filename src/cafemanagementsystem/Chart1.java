/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cafemanagementsystem;

import dao.BillDao;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import static model.ChartRevenue.createChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.SlidingCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.TextAnchor;

/**
 *
 * @author thuan
 */
public class Chart1 extends javax.swing.JInternalFrame {

    private DefaultCategoryDataset dataset;
    private JFreeChart barChart;
    private CategoryPlot categoryPlot;
    private ChartPanel chartPanel;

    /**
     * Creates new form chart
     */
    public Chart1() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        rdMonth.setSelected(true);
//        Date date = new Date();
//
//        jDateChooser3.setDateFormatString("dd-MM-yyyy");
//        jDateChooser2.setDateFormatString("dd-MM-yyyy");
//        jDateChooser3.setDate(date);
//        jDateChooser2.setDate(date);
        ButtonGroup group = new ButtonGroup();
        group.add(rdDate);
        group.add(rdMonth);

        // ActionListener to toggle the state when the button is clicked
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton source = (JRadioButton) e.getSource();
                source.setSelected(!source.isSelected());
            }
        };

        rdDate.addActionListener(listener);
        rdMonth.addActionListener(listener);
    }

    public void validate() {
        if (rdMonth.isSelected() == true) {
            cbMonth.setEnabled(true);
            cbYear.setEnabled(true);
            txtFromDate.setEnabled(false);
            txtToDate.setEnabled(false);
        } else {
            cbMonth.setEnabled(false);
            cbYear.setEnabled(false);
            txtFromDate.setEnabled(true);
            txtToDate.setEnabled(true);
        }
    }

    public void getAllRecordsMonth() {
        ArrayList<Object[]> list = BillDao.getAllRecordsMonth();
        for (Object[] item : list) {
            cbMonth.addItem(item[0].toString());
        }
    }

    public void getAllRecordsYear() {
        ArrayList<Object[]> list = BillDao.getAllRecordsYear();
        for (Object[] item : list) {
            cbYear.addItem(item[0].toString());
        }
    }

    public JFreeChart createChart(Date fromDate, Date toDate) {
        JFreeChart barChart = ChartFactory.createBarChart(
                "DOANH THU CỬA HÀNG",
                "Ngày", "Doanh thu (đồng)",
                createDataset(fromDate, toDate), PlotOrientation.VERTICAL, true, false, true);

        CategoryPlot plot = (CategoryPlot) barChart.getPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();

        // Hiển thị giá trị trên mỗi cột
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setBaseItemLabelsVisible(true);

        // Định dạng giá trị thành số có dấu phẩy ngăn cách hàng nghìn
        NumberFormat format = new DecimalFormat("#,###.##");
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator("{2}", format));
        renderer.setBaseItemLabelsVisible(true);

        // Điều chỉnh vị trí và hình dạng của nhãn
        renderer.setBasePositiveItemLabelPosition(new ItemLabelPosition(
                ItemLabelAnchor.OUTSIDE12, TextAnchor.BOTTOM_CENTER));
        renderer.setItemLabelAnchorOffset(10);

        // Đặt font cho tiêu đề biểu đồ
        Font titleFont = new Font("Arial", Font.BOLD, 18);
        barChart.getTitle().setFont(titleFont);

        // Đặt font cho nhãn trục x và y
        Font axisLabelFont = new Font("Arial", Font.PLAIN, 14);
        plot.getDomainAxis().setLabelFont(axisLabelFont);
        plot.getRangeAxis().setLabelFont(axisLabelFont);

        // Đặt font cho nhãn trục x và y
        Font tickLabelFont = new Font("Arial", Font.PLAIN, 12);
        plot.getDomainAxis().setTickLabelFont(tickLabelFont);
        plot.getRangeAxis().setTickLabelFont(tickLabelFont);

        return barChart;
    }

    private static CategoryDataset createDataset(Date fromDate, Date toDate) {
        ArrayList<Object[]> revenueList = BillDao.getRevenueByDate(fromDate, toDate);
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Object[] categoryObj : revenueList) {
            dataset.addValue(Integer.parseInt(categoryObj[1].toString()), "Doanh thu (đồng)", categoryObj[0].toString());
        }

        return dataset;
    }

    public static CategoryDataset createDatasetByMonthYear(String month, String year) {
        ArrayList<Object[]> revenueList = BillDao.getRevenueByMonthYear(month, year);
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Object[] categoryObj : revenueList) {
            dataset.addValue(Integer.parseInt(categoryObj[1].toString()), "Doanh thu (đồng)", categoryObj[0].toString());
        }

        return dataset;
    }

    public JFreeChart createChartByMonthYear(String month, String year) {
        JFreeChart barChart = ChartFactory.createBarChart(
                "DOANH THU CỬA HÀNG",
                "Ngày", "Doanh thu (đồng)",
                createDatasetByMonthYear(month, year), PlotOrientation.VERTICAL, true, false, true);

        CategoryPlot plot = (CategoryPlot) barChart.getPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();

        // Hiển thị giá trị trên mỗi cột
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setBaseItemLabelsVisible(true);

        // Định dạng giá trị thành số có dấu phẩy ngăn cách hàng nghìn
        NumberFormat format = new DecimalFormat("#,###.##");
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator("{2}", format));
        renderer.setBaseItemLabelsVisible(true);

        // Điều chỉnh vị trí và hình dạng của nhãn
        renderer.setBasePositiveItemLabelPosition(new ItemLabelPosition(
                ItemLabelAnchor.OUTSIDE12, TextAnchor.BOTTOM_CENTER));
        renderer.setItemLabelAnchorOffset(10);

        // Đặt font cho tiêu đề biểu đồ
        Font titleFont = new Font("Arial", Font.BOLD, 18);
        barChart.getTitle().setFont(titleFont);

        // Đặt font cho nhãn trục x và y
        Font axisLabelFont = new Font("Arial", Font.PLAIN, 14);
        plot.getDomainAxis().setLabelFont(axisLabelFont);
        plot.getRangeAxis().setLabelFont(axisLabelFont);

        // Đặt font cho nhãn trục x và y
        Font tickLabelFont = new Font("Arial", Font.PLAIN, 12);
        plot.getDomainAxis().setTickLabelFont(tickLabelFont);
        plot.getRangeAxis().setTickLabelFont(tickLabelFont);

        return barChart;
    }

    public JScrollPane createTable() {
        // Dữ liệu mẫu cho bảng
        ArrayList<Object[]> list;
        if (rdMonth.isSelected()) {
            String month = cbMonth.getSelectedItem().toString();
            String year = cbYear.getSelectedItem().toString();

            list = BillDao.getRevenueByMonthYear(month, year);
        } else{
            Date fromDate = txtFromDate.getDate();
            Date toDate = txtToDate.getDate();
            list = BillDao.getRevenueByDate(fromDate, toDate);
        }
        int size = list.size();
        Object[][] data = new Object[size][];
        
        for (int i = 0; i < size; i++) {
            // Lấy mảng con từ ArrayList
            Object[] originalArray = list.get(i);
            
            // Tạo mảng mới có độ dài lớn hơn để chứa giá trị mới
            Object[] newArray = new Object[originalArray.length + 1];
            // Thêm giá trị mới vào đầu mảng mới
            newArray[0] = i + 1;
            // Sao chép dữ liệu từ mảng cũ sang mảng mới
            System.arraycopy(originalArray, 0, newArray, 1, originalArray.length);

            data[i] = newArray;
        }

        // Định nghĩa tên cột
        String[] columnNames = {"STT", "Ngày", "Doanh thu"};
        
        // Tạo DefaultTableModel với dữ liệu và tên cột
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Tạo JTable với DefaultTableModel
        JTable table = new JTable(model);
        // Đặt bảng vào JScrollPane để hỗ trợ cuộn
        JScrollPane scrollPane = new JScrollPane(table);
        
        return scrollPane;
    }

    public void showRevenueChartByDate(Date fromDate, Date toDate) {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtFromDate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdDate = new javax.swing.JRadioButton();
        rdMonth = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        cbYear = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbMonth = new javax.swing.JComboBox<>();
        btnChart = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtToDate = new com.toedter.calendar.JDateChooser();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtFromDate.setBackground(new java.awt.Color(255, 255, 255));
        txtFromDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFromDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Từ Ngày");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Đến Ngày");

        rdDate.setBackground(new java.awt.Color(255, 255, 255));
        rdDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdDate.setText("Khoảng thời gian");
        rdDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdDateActionPerformed(evt);
            }
        });

        rdMonth.setBackground(new java.awt.Color(255, 255, 255));
        rdMonth.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdMonth.setText("Tháng");
        rdMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMonthActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Năm");

        cbYear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbYearActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Tháng");

        cbMonth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbMonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnChart.setBackground(new java.awt.Color(25, 118, 211));
        btnChart.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChart.setForeground(new java.awt.Color(255, 255, 255));
        btnChart.setText("Xem Biểu đồ");
        btnChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChartActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 118, 211));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("THỐNG KÊ DOANH THU");

        txtToDate.setBackground(new java.awt.Color(255, 255, 255));
        txtToDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtToDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFromDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtToDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(291, 291, 291))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdMonth)
                    .addComponent(jLabel4)
                    .addComponent(cbMonth, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdDate)
                    .addComponent(jLabel1)
                    .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(275, 275, 275))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChart, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        rdMonth.setSelected(true);
        validate();
        getAllRecordsMonth();
        getAllRecordsYear();
    }//GEN-LAST:event_formComponentShown

    private void btnChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChartActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        if (rdDate.isSelected()) {
            Date fromDate = txtFromDate.getDate();
            Date toDate = txtToDate.getDate();
            ChartPanel chartPanel = new ChartPanel(createChart(fromDate, toDate));
            chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
            JFrame frame = new JFrame();
            frame.setLayout(new BorderLayout());
            frame.add(chartPanel, BorderLayout.WEST);
            frame.setTitle("Biểu đồ thống kê doanh thu");
            
            frame.add(createTable(), BorderLayout.EAST);
            frame.setSize(1040, 600);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setVisible(true);
        } else {
            String month = cbMonth.getSelectedItem().toString();
            String year = cbYear.getSelectedItem().toString();
            ChartPanel chartPanel = new ChartPanel(createChartByMonthYear(month, year));
            chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
            JFrame frame = new JFrame();
            frame.setLayout(new BorderLayout());
            frame.add(chartPanel, BorderLayout.WEST);
            frame.setTitle("Biểu đồ thống kê doanh thu");
            
            frame.add(createTable(), BorderLayout.EAST);
            frame.setSize(1040, 600);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setVisible(true);
        }

    }//GEN-LAST:event_btnChartActionPerformed

    private void rdMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMonthActionPerformed
        // TODO add your handling code here:
        validate();
        ArrayList<Object[]> list = BillDao.getAllRecordsMonth();
        for (Object[] item : list) {
            cbMonth.addItem(item[0].toString());
        }
    }//GEN-LAST:event_rdMonthActionPerformed

    private void rdDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdDateActionPerformed
        // TODO add your handling code here:
        validate();

        Date date = new Date();
        txtFromDate.setDateFormatString("dd-MM-yyyy");
        txtToDate.setDateFormatString("dd-MM-yyyy");
        txtFromDate.setDate(date);
        txtToDate.setDate(date);
    }//GEN-LAST:event_rdDateActionPerformed

    private void cbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbYearActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbYearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChart;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cbMonth;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdDate;
    private javax.swing.JRadioButton rdMonth;
    private com.toedter.calendar.JDateChooser txtFromDate;
    private com.toedter.calendar.JDateChooser txtToDate;
    // End of variables declaration//GEN-END:variables
}
