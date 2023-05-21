package com.mycompany.scdproject;

import javax.swing.JOptionPane;

public class LOGIN extends javax.swing.JFrame 
{
    public LOGIN()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        LOGOH = new javax.swing.JPanel();
        Footer = new javax.swing.JLabel();
        LOGINHead = new javax.swing.JPanel();
        LoginH = new javax.swing.JLabel();
        Form = new javax.swing.JPanel();
        Role = new javax.swing.JLabel();
        UserType = new javax.swing.JComboBox<>();
        UserId = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        UPassword = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        Buttons = new javax.swing.JPanel();
        LOGINB = new javax.swing.JButton();
        CancelB = new javax.swing.JButton();
        HelpPanel = new javax.swing.JPanel();
        DeskH = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        Icons1 = new javax.swing.JPanel();
        Climber = new javax.swing.JButton();
        Creepers = new javax.swing.JButton();
        FTrees = new javax.swing.JButton();
        Trees = new javax.swing.JButton();
        Shrubs = new javax.swing.JButton();
        Herbs = new javax.swing.JButton();
        Icons = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setBackground(new java.awt.Color(153, 0, 0));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        LoginPanel.setBackground(new java.awt.Color(255, 255, 255));
        LoginPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        LoginPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LoginPanel.setName(""); // NOI18N
        LoginPanel.setPreferredSize(new java.awt.Dimension(1024, 768));

        LOGOH.setBackground(new java.awt.Color(255, 255, 255));

        Footer.setBackground(new java.awt.Color(204, 255, 204));
        Footer.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valeena Afzal\\Documents\\NetBeansProjects\\SCDProject\\src\\main\\java\\com\\mycompany\\Images\\BudB.png")); // NOI18N
        Footer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LOGOH.add(Footer);

        LOGINHead.setBackground(new java.awt.Color(255, 255, 255));

        LoginH.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        LoginH.setForeground(new java.awt.Color(153, 0, 0));
        LoginH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginH.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valeena Afzal\\Documents\\NetBeansProjects\\SCDProject\\src\\main\\java\\com\\mycompany\\Images\\icons8-login-30.png")); // NOI18N
        LoginH.setText("LOGIN");
        LoginH.setIconTextGap(30);
        LOGINHead.add(LoginH);

        Form.setBackground(new java.awt.Color(255, 255, 255));
        Form.setAlignmentX(5.0F);
        Form.setAlignmentY(5.0F);
        Form.setLayout(new java.awt.GridLayout(3, 2, 0, 25));

        Role.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Role.setForeground(new java.awt.Color(153, 0, 0));
        Role.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Role.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valeena Afzal\\Documents\\NetBeansProjects\\SCDProject\\src\\main\\java\\com\\mycompany\\Images\\icons8-name-tag-30.png")); // NOI18N
        Role.setText("Select Role");
        Role.setIconTextGap(16);
        Form.add(Role);

        UserType.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        UserType.setForeground(new java.awt.Color(153, 0, 0));
        UserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Entry Operator" }));
        UserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTypeActionPerformed(evt);
            }
        });
        Form.add(UserType);

        UserId.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        UserId.setForeground(new java.awt.Color(153, 0, 0));
        UserId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UserId.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valeena Afzal\\Documents\\NetBeansProjects\\SCDProject\\src\\main\\java\\com\\mycompany\\Images\\icons8-user-tag-32.png")); // NOI18N
        UserId.setText("ID");
        UserId.setIconTextGap(16);
        Form.add(UserId);

        ID.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ID.setForeground(new java.awt.Color(153, 0, 0));
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        Form.add(ID);

        UPassword.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        UPassword.setForeground(new java.awt.Color(153, 0, 0));
        UPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UPassword.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valeena Afzal\\Documents\\NetBeansProjects\\SCDProject\\src\\main\\java\\com\\mycompany\\Images\\icons8-user-secured-32.png")); // NOI18N
        UPassword.setText("Password");
        UPassword.setIconTextGap(16);
        Form.add(UPassword);

        Password.setText("jPasswordField1");
        Form.add(Password);

        Buttons.setBackground(new java.awt.Color(255, 255, 255));
        Buttons.setLayout(new java.awt.GridLayout(1, 0));

        LOGINB.setBackground(new java.awt.Color(153, 0, 0));
        LOGINB.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        LOGINB.setForeground(new java.awt.Color(255, 255, 255));
        LOGINB.setText("LogIN");
        LOGINB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LOGINB.setMaximumSize(new java.awt.Dimension(200, 70));
        LOGINB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINBActionPerformed(evt);
            }
        });
        Buttons.add(LOGINB);

        CancelB.setBackground(new java.awt.Color(153, 0, 0));
        CancelB.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        CancelB.setForeground(new java.awt.Color(255, 255, 255));
        CancelB.setText("Cancel");
        CancelB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBActionPerformed(evt);
            }
        });
        Buttons.add(CancelB);

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LOGOH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LOGINHead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Form, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
            .addComponent(Buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addComponent(LOGOH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LOGINHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Form, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(Buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        getContentPane().add(LoginPanel);

        HelpPanel.setBackground(new java.awt.Color(153, 0, 0));
        HelpPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        DeskH.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        DeskH.setForeground(new java.awt.Color(255, 255, 255));
        DeskH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeskH.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valeena Afzal\\Documents\\NetBeansProjects\\SCDProject\\src\\main\\java\\com\\mycompany\\Images\\icons8-desk-30.png")); // NOI18N
        DeskH.setText("Information Desk");
        DeskH.setIconTextGap(30);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        Menu.setBackground(new java.awt.Color(255, 255, 255));

        Icons1.setBackground(new java.awt.Color(255, 255, 255));
        Icons1.setPreferredSize(new java.awt.Dimension(181, 50));

        javax.swing.GroupLayout Icons1Layout = new javax.swing.GroupLayout(Icons1);
        Icons1.setLayout(Icons1Layout);
        Icons1Layout.setHorizontalGroup(
            Icons1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );
        Icons1Layout.setVerticalGroup(
            Icons1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Menu.add(Icons1);

        Climber.setBackground(new java.awt.Color(153, 0, 0));
        Climber.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Climber.setForeground(new java.awt.Color(255, 255, 255));
        Climber.setText("Climbers");
        Climber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Climber.setPreferredSize(new java.awt.Dimension(210, 50));
        Climber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClimberActionPerformed(evt);
            }
        });
        Menu.add(Climber);

        Creepers.setBackground(new java.awt.Color(153, 0, 0));
        Creepers.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Creepers.setForeground(new java.awt.Color(255, 255, 255));
        Creepers.setText("Creepers");
        Creepers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Creepers.setPreferredSize(new java.awt.Dimension(210, 50));
        Creepers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreepersActionPerformed(evt);
            }
        });
        Menu.add(Creepers);

        FTrees.setBackground(new java.awt.Color(153, 0, 0));
        FTrees.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        FTrees.setForeground(new java.awt.Color(255, 255, 255));
        FTrees.setText("Fruit Trees");
        FTrees.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FTrees.setPreferredSize(new java.awt.Dimension(210, 50));
        FTrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTreesActionPerformed(evt);
            }
        });
        Menu.add(FTrees);

        Trees.setBackground(new java.awt.Color(153, 0, 0));
        Trees.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Trees.setForeground(new java.awt.Color(255, 255, 255));
        Trees.setText("Trees");
        Trees.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Trees.setPreferredSize(new java.awt.Dimension(210, 50));
        Trees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TreesActionPerformed(evt);
            }
        });
        Menu.add(Trees);

        Shrubs.setBackground(new java.awt.Color(153, 0, 0));
        Shrubs.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Shrubs.setForeground(new java.awt.Color(255, 255, 255));
        Shrubs.setText("Shrubs");
        Shrubs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Shrubs.setPreferredSize(new java.awt.Dimension(210, 50));
        Shrubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShrubsActionPerformed(evt);
            }
        });
        Menu.add(Shrubs);

        Herbs.setBackground(new java.awt.Color(153, 0, 0));
        Herbs.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Herbs.setForeground(new java.awt.Color(255, 255, 255));
        Herbs.setText("Herbs");
        Herbs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Herbs.setPreferredSize(new java.awt.Dimension(210, 50));
        Herbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HerbsActionPerformed(evt);
            }
        });
        Menu.add(Herbs);

        Icons.setBackground(new java.awt.Color(255, 255, 255));

        icon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valeena Afzal\\Documents\\NetBeansProjects\\SCDProject\\src\\main\\java\\com\\mycompany\\Images\\icons8-tulip-30.png")); // NOI18N

        icon2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valeena Afzal\\Documents\\NetBeansProjects\\SCDProject\\src\\main\\java\\com\\mycompany\\Images\\icons8-palm-tree-30.png")); // NOI18N

        icon3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valeena Afzal\\Documents\\NetBeansProjects\\SCDProject\\src\\main\\java\\com\\mycompany\\Images\\icons8-seed-packet-30.png")); // NOI18N

        javax.swing.GroupLayout IconsLayout = new javax.swing.GroupLayout(Icons);
        Icons.setLayout(IconsLayout);
        IconsLayout.setHorizontalGroup(
            IconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IconsLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(icon1)
                .addGap(18, 18, 18)
                .addComponent(icon3)
                .addGap(19, 19, 19))
            .addGroup(IconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(IconsLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(icon2)
                    .addContainerGap(135, Short.MAX_VALUE)))
        );
        IconsLayout.setVerticalGroup(
            IconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IconsLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(IconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
            .addGroup(IconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IconsLayout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );

        Menu.add(Icons);

        jPanel2.add(Menu);

        jLabel1.setBackground(new java.awt.Color(153, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valeena Afzal\\Documents\\NetBeansProjects\\SCDProject\\src\\main\\java\\com\\mycompany\\Images\\icons8-sprout-100.png")); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setIconTextGap(0);
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2);

        javax.swing.GroupLayout HelpPanelLayout = new javax.swing.GroupLayout(HelpPanel);
        HelpPanel.setLayout(HelpPanelLayout);
        HelpPanelLayout.setHorizontalGroup(
            HelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(HelpPanelLayout.createSequentialGroup()
                        .addComponent(DeskH, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        HelpPanelLayout.setVerticalGroup(
            HelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(DeskH, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        getContentPane().add(HelpPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void LOGINBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LOGINBActionPerformed

    private void CancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelBActionPerformed

    private void UserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserTypeActionPerformed

    private void ClimberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClimberActionPerformed
        
        try
        {
            String Url="https://www.rhs.org.uk/advice/how-to-plant-climber";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(Url));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_ClimberActionPerformed

    private void FTreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTreesActionPerformed
     try
        {
            String Url="https://www.youtube.com/watch?v=7EbJP9R7WKg&ab_channel=GrowVeg";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(Url));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }         // TODO add your handling code here:
    }//GEN-LAST:event_FTreesActionPerformed

    private void TreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TreesActionPerformed
     try
        {
            String Url="https://www.growingagreenerworld.com/how-to-plant-a-tree/";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(Url));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }         // TODO add your handling code here:
    }//GEN-LAST:event_TreesActionPerformed

    private void ShrubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShrubsActionPerformed
     try
        {
            String Url="https://www.youtube.com/watch?v=P54qredYIws&ab_channel=osmocotegarden";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(Url));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ShrubsActionPerformed

    private void HerbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HerbsActionPerformed
        try
        {
            String Url="https://www.gardenersworld.com/how-to/grow-plants/how-to-grow-herbs/";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(Url));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_HerbsActionPerformed

    private void CreepersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreepersActionPerformed
       try
        {
            String Url="https://www.ugaoo.com/blogs/ornamental-gardening/how-to-grow-climbers-and-creepers#:~:text=Lots%20and%20lots%20of%20water,affects%20the%20growth%20of%20plants.";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(Url));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_CreepersActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Buttons;
    private javax.swing.JButton CancelB;
    private javax.swing.JButton Climber;
    private javax.swing.JButton Creepers;
    private javax.swing.JLabel DeskH;
    private javax.swing.JButton FTrees;
    private javax.swing.JLabel Footer;
    private javax.swing.JPanel Form;
    private javax.swing.JPanel HelpPanel;
    private javax.swing.JButton Herbs;
    private javax.swing.JTextField ID;
    private javax.swing.JPanel Icons;
    private javax.swing.JPanel Icons1;
    private javax.swing.JButton LOGINB;
    private javax.swing.JPanel LOGINHead;
    private javax.swing.JPanel LOGOH;
    private javax.swing.JLabel LoginH;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel Menu;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel Role;
    private javax.swing.JButton Shrubs;
    private javax.swing.JButton Trees;
    private javax.swing.JLabel UPassword;
    private javax.swing.JLabel UserId;
    private javax.swing.JComboBox<String> UserType;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
