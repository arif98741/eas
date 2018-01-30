package eas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class LoginPanel extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String u, p; // here int c for checking user to the dialog box specificly
    public int check, ch; // this is for checking login user such as admin ,teacher and student
    errorDialouge edialog = new errorDialouge(); // edialog is an object of errorDialogue.java that is used for showing message(error,wrong,confirm,etc)

    public LoginPanel() {
        initComponents();
        showDate();
        showTime();
    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        dateTF.setText(s.format(d));
    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                timeTF.setText(s.format(d));
            }
        }).start();
    }

    public int check_logUser(int check) {
        this.check = check;

        return check;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        usernameTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        passwordTF = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        timeTF = new javax.swing.JLabel();
        dateTF = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Copyright All Right Reserved By Team Alligators-2017");

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 120, 40));

        usernameTF.setFont(new java.awt.Font("Xanadau", 0, 14)); // NOI18N
        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });
        jPanel2.add(usernameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 160, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 80, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 170, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 120, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Login Panel");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 190, 60));

        passwordTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTFActionPerformed(evt);
            }
        });
        jPanel2.add(passwordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 160, 30));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Copyright all right reserved by team Alligators 2017");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(564, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(549, 549, 549))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 696, -1, 40));

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 40, 30));

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, 40, 30));

        timeTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timeTF.setForeground(new java.awt.Color(255, 255, 255));
        timeTF.setText("Time: ");
        jPanel2.add(timeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 160, -1, -1));

        dateTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateTF.setForeground(new java.awt.Color(255, 255, 255));
        dateTF.setText("Date: 4-4-2017");
        jPanel2.add(dateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 120, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eas/background_UI/login menu bg.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 560, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainMenu_JFrame mm = new MainMenu_JFrame();
        mm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection conn = MySqlConnect.ConnectDB();
        int select = check;

        if (select == 1) {
            u = usernameTF.getText();
            p = passwordTF.getText();
            String sql = "select * from admin where username='" + u + "' and password='" + p + "'";
            try {

                if (u.equals("") || p.equals("")) {
                    edialog.showDialog("Enter Username and Password");
                    edialog.setVisible(true);
                } else {

                    pst = (PreparedStatement) (PreparedStatement) conn.prepareStatement(sql);
                    rs = pst.executeQuery();
                    if (rs.next()) {
                        //JOptionPane.showConfirmDialog(null, "You Have Sucessfully Loggeg In");
                        edialog.showDialog("You Have Sucessfully Logged in");
                        edialog.setVisible(true);
                        edialog.checkUser(1);
                        this.setVisible(false);
                        //here we are sending check=1 as for checking in dialog box to show and sending user to admin panel

                    } else {
                        edialog = new errorDialouge();
                        edialog.showDialog("Invalid Username or Password");
                        edialog.setVisible(true);
                    }
                }

            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null, e);

            }
        }
        if (select == 2) {

            try {
                u = usernameTF.getText();
                p = passwordTF.getText();
                String sql = "select * from tea_register where tea_id='" + u + "' and password='" + p + "'";

                if (u.equals("") || p.equals("")) {
                    edialog.showDialog("Enter Username and Password");
                    edialog.setVisible(true);
                } else {
                    pst = (PreparedStatement) (PreparedStatement) conn.prepareStatement(sql);
                    rs = pst.executeQuery();
                    if (rs.next()) {

                        edialog.showDialog("You Have Sucessfully Logged in");
                        Teachers_Dashboard t = new Teachers_Dashboard();
                        t.setVisible(true);
                        this.setVisible(false);
                        //here we are sending check=1 as for checking in dialog box to show and sending user to admin panel

                    } else {
                        edialog = new errorDialouge();
                        edialog.showDialog("Invalid Username or Password");
                        edialog.setVisible(true);

                    }
                }

            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null, e);

            }
        }
        if (select == 3) {

            try {

                u = usernameTF.getText();
                p = passwordTF.getText();
                String sql = "select * from std_register where std_id='" + u + "' and password='" + p + "'";
                if (u.equals("") || p.equals("")) {
                    edialog.showDialog("Enter Username and Password");
                    edialog.setVisible(true);
                } else {

                    pst = (PreparedStatement) (PreparedStatement) conn.prepareStatement(sql);
                    rs = pst.executeQuery();
                    if (rs.next()) {
                        edialog.showDialog("You Have Sucessfully Logged in");
                        //shadhin changed start                        
                        //setting student id
                        Students_Dashboard sd = new Students_Dashboard(u);
                        //shadhin changed start
                        sd.setVisible(true);
                        this.setVisible(false);
                        //this is for chekcing user and send to uniquely in student profile page
                        //here we are sending check=1 as for checking in dialog box to show and sending user to admin panel
                    } else {
                        edialog = new errorDialouge();
                        edialog.showDialog("Invalid Username or Password");
                        edialog.setVisible(true);

                    }

                }

            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null, e);

            }
        } else {

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(MainMenu_JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void passwordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTFActionPerformed

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTFActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel dateTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JLabel timeTF;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables

}
