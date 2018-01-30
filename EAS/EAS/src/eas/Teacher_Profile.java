package eas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Teacher_Profile extends javax.swing.JFrame {

    String id;

    public Teacher_Profile() { // this is the constructor for running this program first
        initComponents();
        //JOptionPane.showMessageDialog(null, id);
        showData();
    }

    public String check_logUser(String user) {
        this.id = user;
        return user;
    }

    public void showData() {
        String s = check_logUser(id);
        String sql = "select * from std_register where std_id ='"+s+"'";
        Connection con = MySqlConnect.ConnectDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                showname.setText(rs.getString("name"));
                showstd.setText(rs.getString("std_id"));
                showemail.setText(rs.getString("email"));
                showbirth.setText(rs.getString("date_of_birth"));
                showfaculty.setText(rs.getString("faculty"));
                showdepartment.setText(rs.getString("department"));
                showgender.setText(rs.getString("gender"));
                showcontact.setText(rs.getString("contact_no"));
                showaddress.setText(rs.getString("address"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Teacher_Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        showblood = new javax.swing.JLabel();
        showcontact = new javax.swing.JLabel();
        showemail = new javax.swing.JLabel();
        showgender = new javax.swing.JLabel();
        showfaculty = new javax.swing.JLabel();
        showdepartment = new javax.swing.JLabel();
        showaddress = new javax.swing.JLabel();
        showstd = new javax.swing.JLabel();
        showbirth = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel22 = new javax.swing.JLabel();
        showname = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, 40, 30));

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 40, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Blood Group:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Department:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Faculty:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gender:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date of Birth :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 100, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Student ID :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact Number :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Address:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        showblood.setBackground(new java.awt.Color(255, 255, 255));
        showblood.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showblood.setForeground(new java.awt.Color(255, 255, 255));
        showblood.setText("Shahriar Roudro");
        getContentPane().add(showblood, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 140, -1));

        showcontact.setBackground(new java.awt.Color(255, 255, 255));
        showcontact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showcontact.setForeground(new java.awt.Color(255, 255, 255));
        showcontact.setText("Shahriar Roudro");
        getContentPane().add(showcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 140, -1));

        showemail.setBackground(new java.awt.Color(255, 255, 255));
        showemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showemail.setForeground(new java.awt.Color(255, 255, 255));
        showemail.setText("show");
        getContentPane().add(showemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 140, -1));

        showgender.setBackground(new java.awt.Color(255, 255, 255));
        showgender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showgender.setForeground(new java.awt.Color(255, 255, 255));
        showgender.setText("Shahriar Roudro");
        getContentPane().add(showgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 140, -1));

        showfaculty.setBackground(new java.awt.Color(255, 255, 255));
        showfaculty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showfaculty.setForeground(new java.awt.Color(255, 255, 255));
        showfaculty.setText("Shahriar Roudro");
        getContentPane().add(showfaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 140, -1));

        showdepartment.setBackground(new java.awt.Color(255, 255, 255));
        showdepartment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showdepartment.setForeground(new java.awt.Color(255, 255, 255));
        showdepartment.setText("Shahriar Roudro");
        getContentPane().add(showdepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 140, -1));

        showaddress.setBackground(new java.awt.Color(255, 255, 255));
        showaddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showaddress.setForeground(new java.awt.Color(255, 255, 255));
        showaddress.setText("Shahriar Roudro");
        getContentPane().add(showaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 140, -1));

        showstd.setBackground(new java.awt.Color(255, 255, 255));
        showstd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showstd.setForeground(new java.awt.Color(255, 255, 255));
        showstd.setText("Shahriar Roudro");
        getContentPane().add(showstd, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 140, -1));

        showbirth.setBackground(new java.awt.Color(255, 255, 255));
        showbirth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showbirth.setForeground(new java.awt.Color(255, 255, 255));
        showbirth.setText("Shahriar Roudro");
        getContentPane().add(showbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 140, -1));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 160, 170));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("  Name :");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        showname.setBackground(new java.awt.Color(255, 255, 255));
        showname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showname.setForeground(new java.awt.Color(255, 255, 255));
        showname.setText("Shahriar Roudro");
        getContentPane().add(showname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 140, -1));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Student");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 140, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Occupation:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jButton2.setText("Dashboard");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 110, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eas/background_UI/project ui bg.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(MainMenu_JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Teachers_Dashboard td = new Teachers_Dashboard();
        td.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Teacher_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel showaddress;
    private javax.swing.JLabel showbirth;
    private javax.swing.JLabel showblood;
    private javax.swing.JLabel showcontact;
    private javax.swing.JLabel showdepartment;
    private javax.swing.JLabel showemail;
    private javax.swing.JLabel showfaculty;
    private javax.swing.JLabel showgender;
    private javax.swing.JLabel showname;
    private javax.swing.JLabel showstd;
    // End of variables declaration//GEN-END:variables
}
