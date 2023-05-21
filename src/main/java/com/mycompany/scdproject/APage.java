package com.mycompany.scdproject;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.toedter.calendar.JDayChooser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;

public class APage extends javax.swing.JFrame {

    public APage() {
        initComponents();

        similarOps2();
        showLineChart();
        showBarChart();
    }
    
    public void similarOps2()
    {
        
        //Layers = new javax.swing.JLayeredPane();
        OrderPanel = new javax.swing.JPanel();
        Manage1 = new javax.swing.JPanel();
        CalenderPanel = new javax.swing.JPanel();
        OrderDate = new javax.swing.JLabel();
        JDayChooser jDayChooser2 = new com.toedter.calendar.JDayChooser();
        Formpanel1 = new javax.swing.JPanel();
        ManageInv1 = new javax.swing.JPanel();
        InvType1 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        Name1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        Category1 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        Quantity1 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        Price1 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        CNIC = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        InvHeadingP1 = new javax.swing.JPanel();
        Heading2 = new javax.swing.JLabel();
        MButtonsP2 = new javax.swing.JPanel();
        ButtonsInv2 = new javax.swing.JPanel();
        AddOrder = new javax.swing.JButton();
        EditOrder = new javax.swing.JButton();
        DeleteOrder = new javax.swing.JButton();
        PrintOrder = new javax.swing.JButton();
        ClearOrder = new javax.swing.JButton();
        ViewInv1 = new javax.swing.JPanel();
        HeadingPanel1 = new javax.swing.JPanel();
        Heading3 = new javax.swing.JLabel();
        TablePanel1 = new javax.swing.JPanel();
        PTable1 = new javax.swing.JScrollPane();
        Tables1 = new javax.swing.JTable();
        MailPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jButton6 = new javax.swing.JButton();
        InventoryPanel = new javax.swing.JPanel();
        Manage = new javax.swing.JPanel();
        MButtonsP = new javax.swing.JPanel();
        ButtonsInv = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        InvHeadingP = new javax.swing.JPanel();
        Heading1 = new javax.swing.JLabel();
        ManageInv = new javax.swing.JPanel();
        InvType = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Name = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        Category = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Quantity = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        Price = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        ViewInv = new javax.swing.JPanel();
        HeadingPanel = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        TablePanel = new javax.swing.JPanel();
        PTable = new javax.swing.JScrollPane();
        Tables = new javax.swing.JTable();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        //Layers.setLayout(new java.awt.CardLayout());

        OrderPanel.setBackground(new java.awt.Color(255, 255, 255));
        OrderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Manage1.setBackground(new java.awt.Color(255, 255, 255));
        Manage1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        CalenderPanel.setBackground(new java.awt.Color(255, 255, 255));
        CalenderPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        OrderDate.setBackground(new java.awt.Color(255, 255, 255));
        OrderDate.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        OrderDate.setForeground(new java.awt.Color(153, 0, 0));
        OrderDate.setText("Date");
        OrderDate.setPreferredSize(new java.awt.Dimension(130, 50));
        CalenderPanel.add(OrderDate);

        jDayChooser2.setBackground(new java.awt.Color(255, 255, 255));
        CalenderPanel.add(jDayChooser2);

        Formpanel1.setBackground(new java.awt.Color(255, 255, 255));
        Formpanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        ManageInv1.setBackground(new java.awt.Color(255, 255, 255));
        ManageInv1.setLayout(new java.awt.GridLayout(3, 4, 15, 30));

        InvType1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        InvType1.setForeground(new java.awt.Color(153, 0, 0));
        InvType1.setText("Select Type");
        ManageInv1.add(InvType1);

        jComboBox3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(153, 0, 0));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fruit Trees", "Trees", "Shrubs", "Herbs", "Climbers", "Creepers", "None" }));
        ManageInv1.add(jComboBox3);

        Name1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Name1.setForeground(new java.awt.Color(153, 0, 0));
        Name1.setText("Name");
        ManageInv1.add(Name1);

        jTextField5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(153, 0, 0));
        ManageInv1.add(jTextField5);

        Category1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Category1.setForeground(new java.awt.Color(153, 0, 0));
        Category1.setText("Category");
        ManageInv1.add(Category1);

        jComboBox4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(153, 0, 0));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plants", "Seeds", "Tools" }));
        ManageInv1.add(jComboBox4);

        Quantity1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Quantity1.setForeground(new java.awt.Color(153, 0, 0));
        Quantity1.setText("Quantity");
        ManageInv1.add(Quantity1);

        jTextField6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(153, 0, 0));
        ManageInv1.add(jTextField6);

        Price1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Price1.setForeground(new java.awt.Color(153, 0, 0));
        Price1.setText("Price");
        ManageInv1.add(Price1);

        jTextField7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(153, 0, 0));
        ManageInv1.add(jTextField7);

        CNIC.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CNIC.setForeground(new java.awt.Color(153, 0, 0));
        CNIC.setText("CNIC");
        ManageInv1.add(CNIC);

        jTextField8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(153, 0, 0));
        ManageInv1.add(jTextField8);

        Formpanel1.add(ManageInv1);

        InvHeadingP1.setBackground(new java.awt.Color(255, 255, 255));

        Heading2.setBackground(new java.awt.Color(153, 0, 0));
        Heading2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Heading2.setForeground(new java.awt.Color(153, 0, 0));
        Heading2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading2.setText("Manage Orders");
        InvHeadingP1.add(Heading2);

        MButtonsP2.setBackground(new java.awt.Color(255, 255, 255));
        MButtonsP2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        ButtonsInv2.setBackground(new java.awt.Color(255, 255, 255));
        ButtonsInv2.setLayout(new java.awt.GridLayout(1, 0, 30, 0));

        AddOrder.setBackground(new java.awt.Color(153, 0, 0));
        AddOrder.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddOrder.setForeground(new java.awt.Color(255, 255, 255));
        AddOrder.setText("Add");
        ButtonsInv2.add(AddOrder);

        EditOrder.setBackground(new java.awt.Color(153, 0, 0));
        EditOrder.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        EditOrder.setForeground(new java.awt.Color(255, 255, 255));
        EditOrder.setText("Edit");
        EditOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditOrderActionPerformed(evt);
            }
        });
        ButtonsInv2.add(EditOrder);

        DeleteOrder.setBackground(new java.awt.Color(153, 0, 0));
        DeleteOrder.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DeleteOrder.setForeground(new java.awt.Color(255, 255, 255));
        DeleteOrder.setText("Delete");
        DeleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteOrderActionPerformed(evt);
            }
        });
        ButtonsInv2.add(DeleteOrder);

        PrintOrder.setBackground(new java.awt.Color(153, 0, 0));
        PrintOrder.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        PrintOrder.setForeground(new java.awt.Color(255, 255, 255));
        PrintOrder.setText("Print");
        PrintOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintOrderActionPerformed(evt);
            }
        });
        ButtonsInv2.add(PrintOrder);

        ClearOrder.setBackground(new java.awt.Color(153, 0, 0));
        ClearOrder.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ClearOrder.setForeground(new java.awt.Color(255, 255, 255));
        ClearOrder.setText("Clear");
        ButtonsInv2.add(ClearOrder);

        MButtonsP2.add(ButtonsInv2);

        javax.swing.GroupLayout Manage1Layout = new javax.swing.GroupLayout(Manage1);
        Manage1.setLayout(Manage1Layout);
        Manage1Layout.setHorizontalGroup(
            Manage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InvHeadingP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MButtonsP2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1126, Short.MAX_VALUE)
            .addGroup(Manage1Layout.createSequentialGroup()
                .addComponent(Formpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(CalenderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Manage1Layout.setVerticalGroup(
            Manage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Manage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InvHeadingP1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Manage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Formpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalenderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(MButtonsP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        OrderPanel.add(Manage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 410));

        ViewInv1.setBackground(new java.awt.Color(255, 255, 255));
        ViewInv1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        HeadingPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Heading3.setBackground(new java.awt.Color(153, 0, 0));
        Heading3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Heading3.setForeground(new java.awt.Color(153, 0, 0));
        Heading3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading3.setText("Inventory List");

        javax.swing.GroupLayout HeadingPanel1Layout = new javax.swing.GroupLayout(HeadingPanel1);
        HeadingPanel1.setLayout(HeadingPanel1Layout);
        HeadingPanel1Layout.setHorizontalGroup(
            HeadingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading3, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        HeadingPanel1Layout.setVerticalGroup(
            HeadingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        TablePanel1.setBackground(new java.awt.Color(255, 255, 255));
        TablePanel1.setForeground(new java.awt.Color(153, 0, 0));

        PTable1.setBackground(new java.awt.Color(153, 0, 0));
        PTable1.setBorder(null);
        PTable1.setForeground(new java.awt.Color(255, 255, 255));
        PTable1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        Tables1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Tables1.setForeground(new java.awt.Color(153, 0, 0));
        Tables1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Type", "Name", "Date", "CNIC", "Quantity", "Price", "Category"
            }
        ));
        Tables1.setGridColor(new java.awt.Color(153, 0, 0));
        Tables1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Tables1.setSelectionForeground(new java.awt.Color(255, 153, 204));
        PTable1.setViewportView(Tables1);

        javax.swing.GroupLayout TablePanel1Layout = new javax.swing.GroupLayout(TablePanel1);
        TablePanel1.setLayout(TablePanel1Layout);
        TablePanel1Layout.setHorizontalGroup(
            TablePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        TablePanel1Layout.setVerticalGroup(
            TablePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout ViewInv1Layout = new javax.swing.GroupLayout(ViewInv1);
        ViewInv1.setLayout(ViewInv1Layout);
        ViewInv1Layout.setHorizontalGroup(
            ViewInv1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeadingPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TablePanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ViewInv1Layout.setVerticalGroup(
            ViewInv1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewInv1Layout.createSequentialGroup()
                .addComponent(HeadingPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TablePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        OrderPanel.add(ViewInv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 407, 1130, 300));

        jLayeredPane1.add(OrderPanel, "card3");

        MailPanel.setBackground(new java.awt.Color(255, 255, 255));
        MailPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MailPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAlignmentX(5.0F);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setAlignmentX(5.0F);
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 550));

        jLabel2.setBackground(new java.awt.Color(153, 0, 0));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Subject");

        jTextField9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(153, 0, 0));

        jLabel4.setBackground(new java.awt.Color(153, 0, 0));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("From");

        jTextField11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(153, 0, 0));
        jTextField11.setText("l201283@lhr.nu.edu.pk");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 0, 0));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Content");

        jTextField12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(153, 0, 0));

        jLabel6.setBackground(new java.awt.Color(153, 0, 0));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select Attachment");

        jLabel3.setBackground(new java.awt.Color(153, 0, 0));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Send To");

        jTextField10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(153, 0, 0));

        jLabel7.setBackground(new java.awt.Color(153, 0, 0));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Send To");

        jButton6.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(153, 0, 0));
        jButton6.setText("Send");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }

            private void jButton6ActionPerformed(ActionEvent evt){
                System.out.println("yeah"); //To change body of generated methods, choose Tools | Templates.
              
                String recipient  = jTextField9.getText();
                System.out.println("this is the jTextField9: " + recipient);
                
                String subject = jTextField10.getText();
                System.out.println("this is the jTextField10: " + subject);

                String content = jTextField17.getText();
                System.out.println("this is the jTextField17: " + content);
                
                Properties properties = new Properties();
                properties.put("mail.smtp.auth","true");
                properties.put("mail.smtp.starttls.enable","true");
                properties.put("mail.smtp.host","smtp.gmail.com");
                properties.put("mail.smtp.port","587");
                
                String myAccountEmail = "l201283@lhr.nu.edu.pk";
                String password = "03009445888";
                
                Session session = Session.getInstance(properties, new Authenticator()
                {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication()
                    {
                        return new PasswordAuthentication(myAccountEmail, password);
                    }
                }
                );
                
                Message message = new MimeMessage(session);
                try 
                {
                    message.setFrom(new InternetAddress(myAccountEmail));
                    message.setRecipient(Message.RecipientType.TO,new InternetAddress(recipient));
                    message.setSubject(subject);
                    
                    MimeMultipart multipart = new MimeMultipart();
                    
                    //message with mimebodypart
                    MimeBodyPart msgBodyPart = new MimeBodyPart();
                    msgBodyPart.setContent(content,"text/html");
                    
                    //attachment with mimebodypart
                    MimeBodyPart attachment = new MimeBodyPart();
                    try 
                    {
                        attachment.attachFile(new File(jFileChooser1.getSelectedFile().getAbsolutePath()) );
                    }
                    catch (IOException ex) 
                    {
                        System.out.println("Unable to add attachement to mail");
                    }
                    //adding both to multipart
                    multipart.addBodyPart(msgBodyPart);
                    multipart.addBodyPart(attachment);
                    
                    //adding both to message
                    message.setContent(multipart);
                    
                    
                    
                }
                catch (MessagingException ex)
                {
                    System.out.println("Check Mail Part");
                    //Logger.getLogger(APage.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try
                {
                    Transport.send(message);
                    System.out.println("\nSent successfully\n");
                
                } 
                catch (MessagingException ex) {
                    System.out.println("Check Mail Transport part");
                    //Logger.getLogger(APage.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(165, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );

        MailPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 1130, -1));

        jLayeredPane1.add(MailPanel, "card4");

        InventoryPanel.setBackground(new java.awt.Color(51, 51, 51));
        InventoryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Manage.setBackground(new java.awt.Color(255, 255, 255));
        Manage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Manage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MButtonsP.setBackground(new java.awt.Color(255, 255, 255));

        ButtonsInv.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 0, 0));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");

        javax.swing.GroupLayout ButtonsInvLayout = new javax.swing.GroupLayout(ButtonsInv);
        ButtonsInv.setLayout(ButtonsInvLayout);
        ButtonsInvLayout.setHorizontalGroup(
            ButtonsInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsInvLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton3)
                .addGap(0, 0, 0)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ButtonsInvLayout.setVerticalGroup(
            ButtonsInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1)
            .addComponent(jButton2)
            .addComponent(jButton3)
            .addComponent(jButton4)
        );

        javax.swing.GroupLayout MButtonsPLayout = new javax.swing.GroupLayout(MButtonsP);
        MButtonsP.setLayout(MButtonsPLayout);
        MButtonsPLayout.setHorizontalGroup(
            MButtonsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MButtonsPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ButtonsInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        MButtonsPLayout.setVerticalGroup(
            MButtonsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MButtonsPLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(ButtonsInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Manage.add(MButtonsP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 371, -1, -1));

        InvHeadingP.setBackground(new java.awt.Color(255, 255, 255));

        Heading1.setBackground(new java.awt.Color(153, 0, 0));
        Heading1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Heading1.setForeground(new java.awt.Color(153, 0, 0));
        Heading1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading1.setText("Manage Inventory");

        javax.swing.GroupLayout InvHeadingPLayout = new javax.swing.GroupLayout(InvHeadingP);
        InvHeadingP.setLayout(InvHeadingPLayout);
        InvHeadingPLayout.setHorizontalGroup(
            InvHeadingPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvHeadingPLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(Heading1)
                .addContainerGap(826, Short.MAX_VALUE))
        );
        InvHeadingPLayout.setVerticalGroup(
            InvHeadingPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvHeadingPLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Heading1))
        );

        Manage.add(InvHeadingP, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 13, -1, -1));

        ManageInv.setBackground(new java.awt.Color(255, 255, 255));
        ManageInv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InvType.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        InvType.setForeground(new java.awt.Color(153, 0, 0));
        InvType.setText("Select Type");
        ManageInv.add(InvType, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 29));

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(153, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fruit Trees", "Trees", "Shrubs", "Herbs", "Climbers", "Creepers", "None" }));
        ManageInv.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        Name.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(153, 0, 0));
        Name.setText("Name");
        ManageInv.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 59, 120, 29));

        jTextField3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(153, 0, 0));
        ManageInv.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 59, 120, -1));

        Category.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Category.setForeground(new java.awt.Color(153, 0, 0));
        Category.setText("Category");
        ManageInv.add(Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 118, 120, 29));

        jComboBox2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(153, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plants", "Seeds", "Tools" }));
        ManageInv.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 118, 120, -1));

        Quantity.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Quantity.setForeground(new java.awt.Color(153, 0, 0));
        Quantity.setText("Quantity");
        ManageInv.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 177, 120, 29));

        jTextField2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 0, 0));
        ManageInv.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 177, 120, -1));

        Price.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Price.setForeground(new java.awt.Color(153, 0, 0));
        Price.setText("Price");
        ManageInv.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 236, 120, 29));

        jTextField4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(153, 0, 0));
        ManageInv.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 236, 120, -1));

        Manage.add(ManageInv, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 88, 510, -1));

        InventoryPanel.add(Manage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 420));

        ViewInv.setBackground(new java.awt.Color(255, 255, 255));
        ViewInv.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ViewInv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeadingPanel.setBackground(new java.awt.Color(255, 255, 255));

        Heading.setBackground(new java.awt.Color(153, 0, 0));
        Heading.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Heading.setForeground(new java.awt.Color(153, 0, 0));
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("Inventory List");

        javax.swing.GroupLayout HeadingPanelLayout = new javax.swing.GroupLayout(HeadingPanel);
        HeadingPanel.setLayout(HeadingPanelLayout);
        HeadingPanelLayout.setHorizontalGroup(
            HeadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
        );
        HeadingPanelLayout.setVerticalGroup(
            HeadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        ViewInv.add(HeadingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 7, 1240, 50));

        TablePanel.setBackground(new java.awt.Color(255, 255, 255));
        TablePanel.setForeground(new java.awt.Color(153, 0, 0));

        PTable.setBackground(new java.awt.Color(153, 0, 0));
        PTable.setBorder(null);
        PTable.setForeground(new java.awt.Color(255, 255, 255));
        PTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        Tables.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Tables.setForeground(new java.awt.Color(153, 0, 0));
        Tables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Type", "Name", "Quantity", "Price", "Category"
            }
        ));
        Tables.setGridColor(new java.awt.Color(153, 0, 0));
        Tables.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Tables.setSelectionForeground(new java.awt.Color(255, 153, 204));
        PTable.setViewportView(Tables);

        javax.swing.GroupLayout TablePanelLayout = new javax.swing.GroupLayout(TablePanel);
        TablePanel.setLayout(TablePanelLayout);
        TablePanelLayout.setHorizontalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PTable, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TablePanelLayout.setVerticalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablePanelLayout.createSequentialGroup()
                .addComponent(PTable, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ViewInv.add(TablePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1240, 320));

        InventoryPanel.add(ViewInv, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 420, 1250, 380));

        jLayeredPane1.add(InventoryPanel, "card2");

        //getContentPane().add(Layers, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1130, 710));

        pack();
    }
                                                                               
    public void showLineChart(){
        //create dataset for the graph
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(200, "Amount", "january");
        dataset.setValue(150, "Amount", "february");
        dataset.setValue(18, "Amount", "march");
        dataset.setValue(100, "Amount", "april");
        dataset.setValue(80, "Amount", "may");
        dataset.setValue(250, "Amount", "june");
        
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("contribution","monthly","amount", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        //create plot object
        CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204,0,51);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        
         //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        panelBarChart1.removeAll();
        panelBarChart1.add(lineChartPanel, BorderLayout.CENTER);
        panelBarChart1.validate();
    }
    
    public void showBarChart(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(200, "Amount", "january");
        dataset.setValue(150, "Amount", "february");
        dataset.setValue(18, "Amount", "march");
        dataset.setValue(100, "Amount", "april");
        dataset.setValue(80, "Amount", "may");
        dataset.setValue(250, "Amount", "june");
        
        JFreeChart chart = ChartFactory.createBarChart("contribution","monthly","amount", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204,0,51);
        renderer.setSeriesPaint(0, clr3);
        
        ChartPanel barpChartPanel = new ChartPanel(chart);
        panelBarChart3.removeAll();
        panelBarChart3.add(barpChartPanel, BorderLayout.CENTER);
        panelBarChart3.validate();
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DashBoardBtn = new javax.swing.JButton();
        MyProfileBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        DEOsBtn = new javax.swing.JButton();
        ManageShipmentsBtn = new javax.swing.JButton();
        Inventory = new javax.swing.JButton();
        Orders = new javax.swing.JButton();
        Mails = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        DashBoardPanel = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        panelBarChart1 = new javax.swing.JPanel();
        panelBarChart3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        MyProfilePanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        DEOPanel = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        MButtonsP = new javax.swing.JPanel();
        ButtonsInv = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        ManageShipmentsPanel = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        MButtonsP1 = new javax.swing.JPanel();
        ButtonsInv1 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        MailPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jFileChooser1 = new javax.swing.JFileChooser();
        jButton10 = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        InventoryPanel = new javax.swing.JPanel();
        Manage = new javax.swing.JPanel();
        MButtonsP2 = new javax.swing.JPanel();
        ButtonsInv2 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        InvHeadingP = new javax.swing.JPanel();
        Heading1 = new javax.swing.JLabel();
        ManageInv = new javax.swing.JPanel();
        InvType = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Name = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        Category = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Quantity = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        Price = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        ViewInv = new javax.swing.JPanel();
        HeadingPanel = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        TablePanel = new javax.swing.JPanel();
        PTable = new javax.swing.JScrollPane();
        Tables = new javax.swing.JTable();
        OrderPanel = new javax.swing.JPanel();
        Manage1 = new javax.swing.JPanel();
        CalenderPanel = new javax.swing.JPanel();
        OrderDate = new javax.swing.JLabel();
        Formpanel1 = new javax.swing.JPanel();
        ManageInv1 = new javax.swing.JPanel();
        InvType1 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        Name1 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        Category1 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        Quantity1 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        Price1 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        CNIC = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        InvHeadingP1 = new javax.swing.JPanel();
        Heading2 = new javax.swing.JLabel();
        MButtonsP3 = new javax.swing.JPanel();
        ButtonsInv3 = new javax.swing.JPanel();
        AddOrder = new javax.swing.JButton();
        EditOrder = new javax.swing.JButton();
        DeleteOrder = new javax.swing.JButton();
        PrintOrder = new javax.swing.JButton();
        ClearOrder = new javax.swing.JButton();
        ViewInv1 = new javax.swing.JPanel();
        HeadingPanel1 = new javax.swing.JPanel();
        Heading3 = new javax.swing.JLabel();
        TablePanel1 = new javax.swing.JPanel();
        PTable1 = new javax.swing.JScrollPane();
        Tables1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DashBoardBtn.setBackground(new java.awt.Color(153, 0, 0));
        DashBoardBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DashBoardBtn.setForeground(new java.awt.Color(255, 255, 255));
        DashBoardBtn.setText("DashBoard");
        DashBoardBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DashBoardBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashBoardBtnMouseClicked(evt);
            }
        });
        DashBoardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DashBoardBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DashBoardBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 200, 50));

        MyProfileBtn.setBackground(new java.awt.Color(153, 0, 0));
        MyProfileBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        MyProfileBtn.setForeground(new java.awt.Color(255, 255, 255));
        MyProfileBtn.setText("My Profile");
        MyProfileBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MyProfileBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MyProfileBtnMouseClicked(evt);
            }
        });
        MyProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyProfileBtnActionPerformed(evt);
            }
        });
        jPanel1.add(MyProfileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 50));

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Approve Order");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 200, 50));

        DEOsBtn.setBackground(new java.awt.Color(153, 0, 0));
        DEOsBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DEOsBtn.setForeground(new java.awt.Color(255, 255, 255));
        DEOsBtn.setText("Data Entry Operators");
        DEOsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DEOsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEOsBtnMouseClicked(evt);
            }
        });
        DEOsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEOsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DEOsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 200, 50));

        ManageShipmentsBtn.setBackground(new java.awt.Color(153, 0, 0));
        ManageShipmentsBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ManageShipmentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        ManageShipmentsBtn.setText("Manage Shipments");
        ManageShipmentsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ManageShipmentsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageShipmentsBtnMouseClicked(evt);
            }
        });
        ManageShipmentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageShipmentsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ManageShipmentsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 200, 50));

        Inventory.setBackground(new java.awt.Color(153, 0, 0));
        Inventory.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Inventory.setForeground(new java.awt.Color(255, 255, 255));
        Inventory.setText("Update Inventory");
        Inventory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Inventory.setPreferredSize(new java.awt.Dimension(120, 50));
        Inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventoryActionPerformed(evt);
            }
        });
        jPanel1.add(Inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 200, -1));

        Orders.setBackground(new java.awt.Color(153, 0, 0));
        Orders.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Orders.setForeground(new java.awt.Color(255, 255, 255));
        Orders.setText("Add Order");
        Orders.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Orders.setPreferredSize(new java.awt.Dimension(120, 50));
        Orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdersActionPerformed(evt);
            }
        });
        jPanel1.add(Orders, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 200, -1));

        Mails.setBackground(new java.awt.Color(153, 0, 0));
        Mails.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Mails.setForeground(new java.awt.Color(255, 255, 255));
        Mails.setText("Email");
        Mails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Mails.setPreferredSize(new java.awt.Dimension(120, 50));
        Mails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MailsActionPerformed(evt);
            }
        });
        jPanel1.add(Mails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 240, 740));

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setLayout(new java.awt.CardLayout());

        DashBoardPanel.setBackground(new java.awt.Color(153, 0, 0));
        DashBoardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField2.setText("  Search");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        DashBoardPanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 170, 30));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        DashBoardPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 20, 30, 30));

        panelBarChart1.setBackground(new java.awt.Color(255, 255, 255));
        panelBarChart1.setLayout(new java.awt.BorderLayout());
        DashBoardPanel.add(panelBarChart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 320, 250));

        panelBarChart3.setBackground(new java.awt.Color(255, 255, 255));
        panelBarChart3.setLayout(new java.awt.BorderLayout());
        DashBoardPanel.add(panelBarChart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 580, 250));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(153, 0, 0));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Orders Completed");
        jPanel2.add(jLabel3);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("12");
        jPanel2.add(jLabel12);

        DashBoardPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 260, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Orders Pending");
        jPanel3.add(jLabel7);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("2");
        jPanel3.add(jLabel13);

        DashBoardPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 260, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Orders InProgress");
        jPanel4.add(jLabel10);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("5");
        jPanel4.add(jLabel15);

        DashBoardPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 260, 100));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Target Orders");
        jPanel5.add(jLabel11);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("30");
        jPanel5.add(jLabel14);

        DashBoardPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 260, 100));

        jLayeredPane1.add(DashBoardPanel, "card5");

        MyProfilePanel.setBackground(new java.awt.Color(153, 0, 0));
        MyProfilePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setText("admin1@gmail.com");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        MyProfilePanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 250, -1));

        jTextField3.setText("admin");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        MyProfilePanel.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 250, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField4.setText("Rameen");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        MyProfilePanel.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 150, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Email");
        MyProfilePanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 120, 30));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("UserName");
        MyProfilePanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 120, 30));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Profile Picture");
        MyProfilePanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 120, 30));

        jTextField11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField11.setText("  Search");
        jTextField11.setBorder(null);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        MyProfilePanel.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 170, 30));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        MyProfilePanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 20, 30, 30));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Password");
        MyProfilePanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 120, 30));

        jTextField12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField12.setText("00000000");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        MyProfilePanel.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 150, -1));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Phone");
        MyProfilePanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 120, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerifyInputWhenFocusTarget(false);
        MyProfilePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 90, 70));

        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Name");
        MyProfilePanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 120, 30));

        jLayeredPane1.add(MyProfilePanel, "card3");

        DEOPanel.setBackground(new java.awt.Color(153, 0, 0));
        DEOPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        DEOPanel.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 200, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        DEOPanel.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 180, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        DEOPanel.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 180, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Email");
        DEOPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 100, 40));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("UserName");
        DEOPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 110, 40));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Name");
        DEOPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 110, 40));

        MButtonsP.setBackground(new java.awt.Color(255, 255, 255));
        MButtonsP.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        ButtonsInv.setBackground(new java.awt.Color(255, 255, 255));
        ButtonsInv.setLayout(new java.awt.GridLayout(1, 0, 30, 0));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        ButtonsInv.add(jButton1);

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        ButtonsInv.add(jButton2);

        jButton4.setBackground(new java.awt.Color(153, 0, 0));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        ButtonsInv.add(jButton4);

        jButton5.setBackground(new java.awt.Color(153, 0, 0));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        ButtonsInv.add(jButton5);

        MButtonsP.add(ButtonsInv);

        DEOPanel.add(MButtonsP, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Password");
        DEOPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 100, 40));

        jLayeredPane1.add(DEOPanel, "card4");

        ManageShipmentsPanel.setBackground(new java.awt.Color(153, 0, 0));
        ManageShipmentsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        ManageShipmentsPanel.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 200, -1));

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        ManageShipmentsPanel.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 180, -1));

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        ManageShipmentsPanel.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 180, -1));

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("OrderedBy:");
        ManageShipmentsPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 100, 40));

        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Quanitiy:");
        ManageShipmentsPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 110, 40));

        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("ID:");
        ManageShipmentsPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 110, 40));

        MButtonsP1.setBackground(new java.awt.Color(255, 255, 255));
        MButtonsP1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        ButtonsInv1.setBackground(new java.awt.Color(255, 255, 255));
        ButtonsInv1.setLayout(new java.awt.GridLayout(1, 0, 30, 0));

        jButton11.setBackground(new java.awt.Color(153, 0, 0));
        jButton11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("View");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        ButtonsInv1.add(jButton11);

        jButton6.setBackground(new java.awt.Color(153, 0, 0));
        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Add");
        ButtonsInv1.add(jButton6);

        jButton7.setBackground(new java.awt.Color(153, 0, 0));
        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Edit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        ButtonsInv1.add(jButton7);

        jButton8.setBackground(new java.awt.Color(153, 0, 0));
        jButton8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Delete");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        ButtonsInv1.add(jButton8);

        jButton9.setBackground(new java.awt.Color(153, 0, 0));
        jButton9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Save");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        ButtonsInv1.add(jButton9);

        MButtonsP1.add(ButtonsInv1);

        ManageShipmentsPanel.add(MButtonsP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Order Date:");
        ManageShipmentsPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 100, 40));

        jLayeredPane1.add(ManageShipmentsPanel, "card4");

        MailPanel.setBackground(new java.awt.Color(255, 255, 255));
        MailPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MailPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setAlignmentX(5.0F);

        jPanel7.setBackground(new java.awt.Color(153, 0, 0));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setAlignmentX(5.0F);
        jPanel7.setPreferredSize(new java.awt.Dimension(500, 550));

        jLabel2.setBackground(new java.awt.Color(153, 0, 0));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Subject");

        jTextField9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(153, 0, 0));

        jLabel4.setBackground(new java.awt.Color(153, 0, 0));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("From");

        jTextField16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(153, 0, 0));
        jTextField16.setText("l201283@lhr.nu.edu.pk");
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 0, 0));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Content");

        jLabel6.setBackground(new java.awt.Color(153, 0, 0));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select Attachment");

        jLabel8.setBackground(new java.awt.Color(153, 0, 0));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Send To");

        jTextField10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(153, 0, 0));

        jButton10.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(153, 0, 0));
        jButton10.setText("Send");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTextField17.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(153, 0, 0));
        jTextField17.setText("Mail is working fine");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(146, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(80, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1118, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
        );

        MailPanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 1130, -1));

        jLayeredPane1.add(MailPanel, "card4");

        InventoryPanel.setBackground(new java.awt.Color(51, 51, 51));
        InventoryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Manage.setBackground(new java.awt.Color(255, 255, 255));
        Manage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Manage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MButtonsP2.setBackground(new java.awt.Color(255, 255, 255));

        ButtonsInv2.setBackground(new java.awt.Color(255, 255, 255));

        jButton12.setBackground(new java.awt.Color(153, 0, 0));
        jButton12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Add");

        jButton13.setBackground(new java.awt.Color(153, 0, 0));
        jButton13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Edit");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(153, 0, 0));
        jButton14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Delete");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(153, 0, 0));
        jButton15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Clear");

        javax.swing.GroupLayout ButtonsInv2Layout = new javax.swing.GroupLayout(ButtonsInv2);
        ButtonsInv2.setLayout(ButtonsInv2Layout);
        ButtonsInv2Layout.setHorizontalGroup(
            ButtonsInv2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsInv2Layout.createSequentialGroup()
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton14)
                .addGap(0, 0, 0)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ButtonsInv2Layout.setVerticalGroup(
            ButtonsInv2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton12)
            .addComponent(jButton13)
            .addComponent(jButton14)
            .addComponent(jButton15)
        );

        javax.swing.GroupLayout MButtonsP2Layout = new javax.swing.GroupLayout(MButtonsP2);
        MButtonsP2.setLayout(MButtonsP2Layout);
        MButtonsP2Layout.setHorizontalGroup(
            MButtonsP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MButtonsP2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ButtonsInv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        MButtonsP2Layout.setVerticalGroup(
            MButtonsP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MButtonsP2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(ButtonsInv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Manage.add(MButtonsP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 371, -1, -1));

        InvHeadingP.setBackground(new java.awt.Color(255, 255, 255));

        Heading1.setBackground(new java.awt.Color(153, 0, 0));
        Heading1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Heading1.setForeground(new java.awt.Color(153, 0, 0));
        Heading1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading1.setText("Manage Inventory");

        javax.swing.GroupLayout InvHeadingPLayout = new javax.swing.GroupLayout(InvHeadingP);
        InvHeadingP.setLayout(InvHeadingPLayout);
        InvHeadingPLayout.setHorizontalGroup(
            InvHeadingPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvHeadingPLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(Heading1)
                .addContainerGap(826, Short.MAX_VALUE))
        );
        InvHeadingPLayout.setVerticalGroup(
            InvHeadingPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvHeadingPLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Heading1))
        );

        Manage.add(InvHeadingP, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 13, -1, -1));

        ManageInv.setBackground(new java.awt.Color(255, 255, 255));
        ManageInv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InvType.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        InvType.setForeground(new java.awt.Color(153, 0, 0));
        InvType.setText("Select Type");
        ManageInv.add(InvType, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 29));

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(153, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fruit Trees", "Trees", "Shrubs", "Herbs", "Climbers", "Creepers", "None" }));
        ManageInv.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        Name.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(153, 0, 0));
        Name.setText("Name");
        ManageInv.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 59, 120, 29));

        jTextField8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(153, 0, 0));
        ManageInv.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 59, 120, -1));

        Category.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Category.setForeground(new java.awt.Color(153, 0, 0));
        Category.setText("Category");
        ManageInv.add(Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 118, 120, 29));

        jComboBox2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(153, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plants", "Seeds", "Tools" }));
        ManageInv.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 118, 120, -1));

        Quantity.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Quantity.setForeground(new java.awt.Color(153, 0, 0));
        Quantity.setText("Quantity");
        ManageInv.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 177, 120, 29));

        jTextField18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(153, 0, 0));
        ManageInv.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 177, 120, -1));

        Price.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Price.setForeground(new java.awt.Color(153, 0, 0));
        Price.setText("Price");
        ManageInv.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 236, 120, 29));

        jTextField19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(153, 0, 0));
        ManageInv.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 236, 120, -1));

        Manage.add(ManageInv, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 88, 510, -1));

        InventoryPanel.add(Manage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 420));

        ViewInv.setBackground(new java.awt.Color(255, 255, 255));
        ViewInv.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ViewInv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeadingPanel.setBackground(new java.awt.Color(255, 255, 255));

        Heading.setBackground(new java.awt.Color(153, 0, 0));
        Heading.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Heading.setForeground(new java.awt.Color(153, 0, 0));
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("Inventory List");

        javax.swing.GroupLayout HeadingPanelLayout = new javax.swing.GroupLayout(HeadingPanel);
        HeadingPanel.setLayout(HeadingPanelLayout);
        HeadingPanelLayout.setHorizontalGroup(
            HeadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
        );
        HeadingPanelLayout.setVerticalGroup(
            HeadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        ViewInv.add(HeadingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 7, 1240, 50));

        TablePanel.setBackground(new java.awt.Color(255, 255, 255));
        TablePanel.setForeground(new java.awt.Color(153, 0, 0));

        PTable.setBackground(new java.awt.Color(153, 0, 0));
        PTable.setBorder(null);
        PTable.setForeground(new java.awt.Color(255, 255, 255));
        PTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        Tables.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Tables.setForeground(new java.awt.Color(153, 0, 0));
        Tables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Type", "Name", "Quantity", "Price", "Category"
            }
        ));
        Tables.setGridColor(new java.awt.Color(153, 0, 0));
        Tables.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Tables.setSelectionForeground(new java.awt.Color(255, 153, 204));
        PTable.setViewportView(Tables);

        javax.swing.GroupLayout TablePanelLayout = new javax.swing.GroupLayout(TablePanel);
        TablePanel.setLayout(TablePanelLayout);
        TablePanelLayout.setHorizontalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PTable, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TablePanelLayout.setVerticalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablePanelLayout.createSequentialGroup()
                .addComponent(PTable, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ViewInv.add(TablePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1240, 320));

        InventoryPanel.add(ViewInv, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 420, 1250, 380));

        jLayeredPane1.add(InventoryPanel, "card2");

        OrderPanel.setBackground(new java.awt.Color(255, 255, 255));
        OrderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Manage1.setBackground(new java.awt.Color(255, 255, 255));
        Manage1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        CalenderPanel.setBackground(new java.awt.Color(255, 255, 255));
        CalenderPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        OrderDate.setBackground(new java.awt.Color(255, 255, 255));
        OrderDate.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        OrderDate.setForeground(new java.awt.Color(153, 0, 0));
        OrderDate.setText("Date");
        OrderDate.setPreferredSize(new java.awt.Dimension(130, 50));
        CalenderPanel.add(OrderDate);

        Formpanel1.setBackground(new java.awt.Color(255, 255, 255));
        Formpanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        ManageInv1.setBackground(new java.awt.Color(255, 255, 255));
        ManageInv1.setLayout(new java.awt.GridLayout(3, 4, 15, 30));

        InvType1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        InvType1.setForeground(new java.awt.Color(153, 0, 0));
        InvType1.setText("Select Type");
        ManageInv1.add(InvType1);

        jComboBox3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(153, 0, 0));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fruit Trees", "Trees", "Shrubs", "Herbs", "Climbers", "Creepers", "None" }));
        ManageInv1.add(jComboBox3);

        Name1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Name1.setForeground(new java.awt.Color(153, 0, 0));
        Name1.setText("Name");
        ManageInv1.add(Name1);

        jTextField20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(153, 0, 0));
        ManageInv1.add(jTextField20);

        Category1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Category1.setForeground(new java.awt.Color(153, 0, 0));
        Category1.setText("Category");
        ManageInv1.add(Category1);

        jComboBox4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(153, 0, 0));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plants", "Seeds", "Tools" }));
        ManageInv1.add(jComboBox4);

        Quantity1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Quantity1.setForeground(new java.awt.Color(153, 0, 0));
        Quantity1.setText("Quantity");
        ManageInv1.add(Quantity1);

        jTextField21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(153, 0, 0));
        ManageInv1.add(jTextField21);

        Price1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Price1.setForeground(new java.awt.Color(153, 0, 0));
        Price1.setText("Price");
        ManageInv1.add(Price1);

        jTextField22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(153, 0, 0));
        ManageInv1.add(jTextField22);

        CNIC.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CNIC.setForeground(new java.awt.Color(153, 0, 0));
        CNIC.setText("CNIC");
        ManageInv1.add(CNIC);

        jTextField23.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(153, 0, 0));
        ManageInv1.add(jTextField23);

        Formpanel1.add(ManageInv1);

        InvHeadingP1.setBackground(new java.awt.Color(255, 255, 255));

        Heading2.setBackground(new java.awt.Color(153, 0, 0));
        Heading2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Heading2.setForeground(new java.awt.Color(153, 0, 0));
        Heading2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading2.setText("Manage Orders");
        InvHeadingP1.add(Heading2);

        MButtonsP3.setBackground(new java.awt.Color(255, 255, 255));
        MButtonsP3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        ButtonsInv3.setBackground(new java.awt.Color(255, 255, 255));
        ButtonsInv3.setLayout(new java.awt.GridLayout(1, 0, 30, 0));

        AddOrder.setBackground(new java.awt.Color(153, 0, 0));
        AddOrder.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddOrder.setForeground(new java.awt.Color(255, 255, 255));
        AddOrder.setText("Add");
        ButtonsInv3.add(AddOrder);

        EditOrder.setBackground(new java.awt.Color(153, 0, 0));
        EditOrder.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        EditOrder.setForeground(new java.awt.Color(255, 255, 255));
        EditOrder.setText("Edit");
        EditOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditOrderActionPerformed(evt);
            }
        });
        ButtonsInv3.add(EditOrder);

        DeleteOrder.setBackground(new java.awt.Color(153, 0, 0));
        DeleteOrder.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DeleteOrder.setForeground(new java.awt.Color(255, 255, 255));
        DeleteOrder.setText("Delete");
        DeleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteOrderActionPerformed(evt);
            }
        });
        ButtonsInv3.add(DeleteOrder);

        PrintOrder.setBackground(new java.awt.Color(153, 0, 0));
        PrintOrder.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        PrintOrder.setForeground(new java.awt.Color(255, 255, 255));
        PrintOrder.setText("Print");
        PrintOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintOrderActionPerformed(evt);
            }
        });
        ButtonsInv3.add(PrintOrder);

        ClearOrder.setBackground(new java.awt.Color(153, 0, 0));
        ClearOrder.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ClearOrder.setForeground(new java.awt.Color(255, 255, 255));
        ClearOrder.setText("Clear");
        ButtonsInv3.add(ClearOrder);

        MButtonsP3.add(ButtonsInv3);

        javax.swing.GroupLayout Manage1Layout = new javax.swing.GroupLayout(Manage1);
        Manage1.setLayout(Manage1Layout);
        Manage1Layout.setHorizontalGroup(
            Manage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InvHeadingP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MButtonsP3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1126, Short.MAX_VALUE)
            .addGroup(Manage1Layout.createSequentialGroup()
                .addComponent(Formpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(CalenderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Manage1Layout.setVerticalGroup(
            Manage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Manage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InvHeadingP1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Manage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Formpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalenderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(MButtonsP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        OrderPanel.add(Manage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 410));

        ViewInv1.setBackground(new java.awt.Color(255, 255, 255));
        ViewInv1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        HeadingPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Heading3.setBackground(new java.awt.Color(153, 0, 0));
        Heading3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Heading3.setForeground(new java.awt.Color(153, 0, 0));
        Heading3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading3.setText("Inventory List");

        javax.swing.GroupLayout HeadingPanel1Layout = new javax.swing.GroupLayout(HeadingPanel1);
        HeadingPanel1.setLayout(HeadingPanel1Layout);
        HeadingPanel1Layout.setHorizontalGroup(
            HeadingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading3, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        HeadingPanel1Layout.setVerticalGroup(
            HeadingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        TablePanel1.setBackground(new java.awt.Color(255, 255, 255));
        TablePanel1.setForeground(new java.awt.Color(153, 0, 0));

        PTable1.setBackground(new java.awt.Color(153, 0, 0));
        PTable1.setBorder(null);
        PTable1.setForeground(new java.awt.Color(255, 255, 255));
        PTable1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        Tables1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Tables1.setForeground(new java.awt.Color(153, 0, 0));
        Tables1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"a", "b", "c", "d", "e", "f", null},
                {"a", "b", "c", "d", "e", "f", "g"}
            },
            new String [] {
                "Type", "Name", "Date", "CNIC", "Quantity", "Price", "Category"
            }
        ));
        Tables1.setGridColor(new java.awt.Color(153, 0, 0));
        Tables1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Tables1.setSelectionForeground(new java.awt.Color(255, 153, 204));
        PTable1.setViewportView(Tables1);

        javax.swing.GroupLayout TablePanel1Layout = new javax.swing.GroupLayout(TablePanel1);
        TablePanel1.setLayout(TablePanel1Layout);
        TablePanel1Layout.setHorizontalGroup(
            TablePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        TablePanel1Layout.setVerticalGroup(
            TablePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout ViewInv1Layout = new javax.swing.GroupLayout(ViewInv1);
        ViewInv1.setLayout(ViewInv1Layout);
        ViewInv1Layout.setHorizontalGroup(
            ViewInv1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeadingPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TablePanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ViewInv1Layout.setVerticalGroup(
            ViewInv1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewInv1Layout.createSequentialGroup()
                .addComponent(HeadingPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TablePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        OrderPanel.add(ViewInv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 407, 1130, 300));

        jLayeredPane1.add(OrderPanel, "card3");

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1130, 710));

        setSize(new java.awt.Dimension(1385, 751));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void DashBoardBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashBoardBtnMouseClicked
        switchPanel(DashBoardPanel);
    }//GEN-LAST:event_DashBoardBtnMouseClicked

    private void DashBoardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DashBoardBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DashBoardBtnActionPerformed

    private void MyProfileBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyProfileBtnMouseClicked
        switchPanel(MyProfilePanel);
    }//GEN-LAST:event_MyProfileBtnMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        switchPanel(MyProfilePanel);
    }//GEN-LAST:event_jButton3MouseClicked

    private void DEOsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEOsBtnMouseClicked
        switchPanel(DEOPanel);
    }//GEN-LAST:event_DEOsBtnMouseClicked

    private void DEOsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEOsBtnActionPerformed
        switchPanel(DEOPanel);
    }//GEN-LAST:event_DEOsBtnActionPerformed

    private void ManageShipmentsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageShipmentsBtnMouseClicked
        switchPanel(ManageShipmentsPanel);
    }//GEN-LAST:event_ManageShipmentsBtnMouseClicked

    private void ManageShipmentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageShipmentsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageShipmentsBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void MyProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyProfileBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MyProfileBtnActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseClicked

    private void rSPasswordTextPlaceHolder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSPasswordTextPlaceHolder1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSPasswordTextPlaceHolder1ActionPerformed

    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonRectangle1ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void rSPasswordTextPlaceHolder2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSPasswordTextPlaceHolder2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSPasswordTextPlaceHolder2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void rSPasswordTextPlaceHolder3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSPasswordTextPlaceHolder3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSPasswordTextPlaceHolder3ActionPerformed

    private void rSMaterialButtonRectangle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonRectangle3ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void InventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventoryActionPerformed
        switchPanel(InventoryPanel);
        // TODO add your handling code here:
    }//GEN-LAST:event_InventoryActionPerformed

    private void OrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdersActionPerformed
        switchPanel(OrderPanel);
        // TODO add your handling code here:
    }//GEN-LAST:event_OrdersActionPerformed

    private void MailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MailsActionPerformed
        switchPanel(MailPanel);
        // TODO add your handling code here:
    }//GEN-LAST:event_MailsActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void EditOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditOrderActionPerformed

    private void DeleteOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteOrderActionPerformed

    private void PrintOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintOrderActionPerformed
        
        String input = "";
        input = JOptionPane.showInputDialog(null, "Enter File Name for the pdf:");
        if(input.length() == 0)
            input = "myPdf";
        System.out.println(input);
        
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int  x =j.showSaveDialog(this);
        if(x == JFileChooser.APPROVE_OPTION)
            path = j.getSelectedFile().getPath();
        
        Document doc  = new Document();
        try 
        {
            //System.out.println(path + "\'mydocomg.docx"); 
            PdfWriter.getInstance(doc, new FileOutputStream(path + "\\" + input + ".pdf"));
            doc.open();
            int n = Tables1.getColumnCount();
            int m = 2;//Tables1. getRowCount();
            System.out.println("No of cokumsn: " + n);
            System.out.println("No of rows: " + m);
            System.out.println("No of rows: " + Tables1. getRowCount());
            
            PdfPTable tb = new PdfPTable(n);
            for(int i = 0; i < n;i++)
                tb.addCell(Tables1.getColumnName(i));
            
            String value = "";
            for(int y = 0; y < m ; y++ )
            {
                for(int  z = 0; z < n; z++)
                {
                    
                    value = Tables1.getValueAt(y,z).toString(); 
                    System.out.println("Value " + value);
                    tb.addCell(value);
                }
            }
            doc.add(tb);
            JOptionPane.showMessageDialog(null,"Pdf gnerated");
            
            
        } 
        catch (FileNotFoundException | DocumentException ex) 
        {
            JOptionPane.showMessageDialog(null,"there is some issue");
            
        }
        doc.close();
    }//GEN-LAST:event_PrintOrderActionPerformed

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
            java.util.logging.Logger.getLogger(APage.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APage.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APage.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APage.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APage().setVisible(true);
            }
        });
    }
        
    public void switchPanel(JPanel panel)
    {
        jLayeredPane1.removeAll();
        jLayeredPane1.add(panel);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddOrder;
    private javax.swing.JPanel ButtonsInv;
    private javax.swing.JPanel ButtonsInv1;
    private javax.swing.JPanel ButtonsInv2;
    private javax.swing.JPanel ButtonsInv3;
    private javax.swing.JLabel CNIC;
    private javax.swing.JPanel CalenderPanel;
    private javax.swing.JLabel Category;
    private javax.swing.JLabel Category1;
    private javax.swing.JButton ClearOrder;
    private javax.swing.JPanel DEOPanel;
    private javax.swing.JButton DEOsBtn;
    private javax.swing.JButton DashBoardBtn;
    private javax.swing.JPanel DashBoardPanel;
    private javax.swing.JButton DeleteOrder;
    private javax.swing.JButton EditOrder;
    private javax.swing.JPanel Formpanel1;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel Heading1;
    private javax.swing.JLabel Heading2;
    private javax.swing.JLabel Heading3;
    private javax.swing.JPanel HeadingPanel;
    private javax.swing.JPanel HeadingPanel1;
    private javax.swing.JPanel InvHeadingP;
    private javax.swing.JPanel InvHeadingP1;
    private javax.swing.JLabel InvType;
    private javax.swing.JLabel InvType1;
    private javax.swing.JButton Inventory;
    private javax.swing.JPanel InventoryPanel;
    private javax.swing.JPanel MButtonsP;
    private javax.swing.JPanel MButtonsP1;
    private javax.swing.JPanel MButtonsP2;
    private javax.swing.JPanel MButtonsP3;
    private javax.swing.JPanel MailPanel;
    private javax.swing.JButton Mails;
    private javax.swing.JPanel Manage;
    private javax.swing.JPanel Manage1;
    private javax.swing.JPanel ManageInv;
    private javax.swing.JPanel ManageInv1;
    private javax.swing.JButton ManageShipmentsBtn;
    private javax.swing.JPanel ManageShipmentsPanel;
    private javax.swing.JButton MyProfileBtn;
    private javax.swing.JPanel MyProfilePanel;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel OrderDate;
    private javax.swing.JPanel OrderPanel;
    private javax.swing.JButton Orders;
    private javax.swing.JScrollPane PTable;
    private javax.swing.JScrollPane PTable1;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel Price1;
    private javax.swing.JButton PrintOrder;
    private javax.swing.JLabel Quantity;
    private javax.swing.JLabel Quantity1;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JPanel TablePanel1;
    private javax.swing.JTable Tables;
    private javax.swing.JTable Tables1;
    private javax.swing.JPanel ViewInv;
    private javax.swing.JPanel ViewInv1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel panelBarChart1;
    private javax.swing.JPanel panelBarChart3;
    // End of variables declaration//GEN-END:variables

}
/*
    public void showPieChart(){
        
        //create dataset
      DefaultPieDataset barDataset = new DefaultPieDataset( );
      barDataset.setValue( "IPhone 5s" , new Double( 20 ) );  
      barDataset.setValue( "SamSung Grand" , new Double( 20 ) );   
      barDataset.setValue( "MotoG" , new Double( 40 ) );    
      barDataset.setValue( "Nokia Lumia" , new Double( 10 ) );  
      
      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("mobile sales",barDataset, false,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
      
       //changing pie chart blocks colors
        piePlot.setSectionPaint("IPhone 5s", new Color(255,255,102));
        piePlot.setSectionPaint("SamSung Grand", new Color(102,255,102));
        piePlot.setSectionPaint("MotoG", new Color(255,102,153));
        piePlot.setSectionPaint("Nokia Lumia", new Color(0,204,204));
      
       
        piePlot.setBackgroundPaint(Color.white);
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelBarChart.removeAll();
        panelBarChart.add(barChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();
    }
*/
    /*========================================================================================
    
    public void showHistogram(){
        
         double[] values = { 95, 49, 14, 59, 50, 66, 47, 40, 1, 67,
                            12, 58, 28, 63, 14, 9, 31, 17, 94, 71,
                            49, 64, 73, 97, 15, 63, 10, 12, 31, 62,
                            93, 49, 74, 90, 59, 14, 15, 88, 26, 57,
                            77, 44, 58, 91, 10, 67, 57, 19, 88, 84                                
                          };
 
 
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("key", values, 20);
        
         JFreeChart chart = ChartFactory.createHistogram("JFreeChart Histogram","Data", "Frequency", dataset,PlotOrientation.VERTICAL, false,true,false);
            XYPlot plot= chart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);

        
        
        ChartPanel barpChartPanel2 = new ChartPanel(chart);
        panelBarChart2.removeAll();
        panelBarChart2.add(barpChartPanel2, BorderLayout.CENTER);
        panelBarChart2.validate();
    }

    ========================================================================================*/
