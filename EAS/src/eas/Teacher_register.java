package eas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Teacher_register extends javax.swing.JFrame {

    //this is public variable and it will be used in program
    //here variable of preparedstatemt,connection,errorDialouge,,resultSet etc
    PreparedStatement pst = null;
    Connection con = MySqlConnect.ConnectDB();
    errorDialouge edialog = new errorDialouge();
    ResultSet rs = null;
    String sql = null;

    //this is function for clear data field.
    private void clear() {
        nameTF.setText("");
        emailTF.setText("");
        studentidTF.setText("");
        studentidTF.setText("");
        departmentTF.setText("");
        dateofbirthTF.setDate(null);
        addressTF.setText("");
        contactnoTF.setText("");
        passwordTF.setText("");
        genderTF.setSelectedIndex(0);
        bloodTF.setSelectedIndex(0);
        designationTF.setSelectedIndex(0);
        bloodTF.setSelectedIndex(0);
        facultyTF1.setSelectedIndex(0);

        //lbl_img.setIcon(null);
    }

    public Teacher_register() {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        studentidTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        contactnoTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bloodTF = new javax.swing.JComboBox<>();
        genderTF = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        departmentTF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel17 = new javax.swing.JLabel();
        designationTF = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        passwordTF = new javax.swing.JPasswordField();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        dateTF = new javax.swing.JLabel();
        timeTF = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        facultyTF1 = new javax.swing.JComboBox<>();
        dateofbirthTF = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Log out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(670, 600, 140, 40);
        jPanel1.add(studentidTF);
        studentidTF.setBounds(250, 320, 240, 30);

        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });
        jPanel1.add(nameTF);
        nameTF.setBounds(750, 420, 240, 30);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Name :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 210, 70, 40);

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date of Birth :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 370, 110, 40);

        jLabel11.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Faculty:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(170, 470, 70, 40);
        jPanel1.add(contactnoTF);
        contactnoTF.setBounds(750, 470, 240, 30);

        emailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTFActionPerformed(evt);
            }
        });
        jPanel1.add(emailTF);
        emailTF.setBounds(250, 270, 240, 30);

        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact Number :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(590, 470, 140, 30);

        jLabel8.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Student ID :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(140, 320, 100, 40);

        jLabel9.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(180, 270, 130, 40);

        bloodTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A-", "AB+", "AB-", "O+", "O-", "B+", "B-" }));
        jPanel1.add(bloodTF);
        bloodTF.setBounds(250, 520, 240, 30);

        genderTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Male", "Female" }));
        genderTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderTFActionPerformed(evt);
            }
        });
        jPanel1.add(genderTF);
        genderTF.setBounds(250, 420, 240, 30);

        jLabel12.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gender:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(170, 420, 70, 40);

        jLabel13.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Department:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(630, 360, 93, 50);
        jPanel1.add(departmentTF);
        departmentTF.setBounds(750, 370, 240, 30);

        jLabel14.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Blood Group:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(130, 520, 140, 30);
        jPanel1.add(addressTF);
        addressTF.setBounds(250, 220, 240, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teacher Registration Portal");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(430, 110, 470, 70);

        jLabel15.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Address:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(660, 420, 70, 30);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(750, 210, 240, 140);

        jLabel17.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Password:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(650, 520, 80, 40);

        designationTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Dean", "Associate Head", "Professor", "Assistant Professor", "Lecturer" }));
        designationTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationTFActionPerformed(evt);
            }
        });
        jPanel1.add(designationTF);
        designationTF.setBounds(250, 570, 240, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Save Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1020, 520, 130, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1020, 475, 130, 30);
        jPanel1.add(passwordTF);
        passwordTF.setBounds(750, 520, 240, 30);

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize);
        minimize.setBounds(1260, 10, 40, 30);

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close);
        close.setBounds(1310, 10, 40, 30);

        dateTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateTF.setForeground(new java.awt.Color(255, 255, 255));
        dateTF.setText("Date: 4-4-2017");
        jPanel1.add(dateTF);
        dateTF.setBounds(1160, 80, 140, 40);

        timeTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timeTF.setForeground(new java.awt.Color(255, 255, 255));
        timeTF.setText("Time:10:53 pm");
        jPanel1.add(timeTF);
        timeTF.setBounds(1160, 110, 140, 40);

        jLabel10.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Designation");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(140, 570, 100, 40);

        facultyTF1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "FSIT", "FE", "BUSINESS", "Natural Science", "Literature" }));
        jPanel1.add(facultyTF1);
        facultyTF1.setBounds(250, 470, 240, 30);
        jPanel1.add(dateofbirthTF);
        dateofbirthTF.setBounds(260, 360, 230, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eas/background_UI/project ui bg.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1360, 760);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1359, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MainMenu_JFrame mm = new MainMenu_JFrame();
        mm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void emailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTFActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clear();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (nameTF.getText().equals("") || emailTF.getText().equals("") || studentidTF.getText().equals("") || studentidTF.getText().equals("") || departmentTF.getText().equals("") || addressTF.getText().equals("") || contactnoTF.getText().equals("") || passwordTF.getText().equals("")) {
            edialog.showDialog("Please Insert all Data Correctly");
            edialog.setVisible(true);
        } else {
            try {
                sql = "select * from std_register where std_id='" + studentidTF.getText() + "' or email='" + emailTF.getText() + "'";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                if (rs.next()) {
                    edialog.showDialog("Data Already Inserted");
                    edialog.setVisible(true);
                } else {
                    String gender, faculty, blood,designation;
                    gender = (String) genderTF.getSelectedItem();
                    faculty = (String) bloodTF.getSelectedItem();
                    blood = (String) bloodTF.getSelectedItem();
                    designation = (String) designationTF.getSelectedItem();
                    

                    Connection conn = MySqlConnect.ConnectDB();
                    sql = "INSERT INTO `tea_register` (`tea_id`, `name`, `email`, `password`, `date_of_birth`,`department`, `contact`, `address`,`gender`,`faculty`,`blood_group`,designation) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement pst = conn.prepareStatement(sql);

                    pst.setString(1, studentidTF.getText());
                    pst.setString(2, nameTF.getText());
                    pst.setString(3, emailTF.getText());
                    pst.setString(4, passwordTF.getText());
                    SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
                    String birthday = d.format(dateofbirthTF.getDate());
                    pst.setString(5, birthday);
                    pst.setString(6, departmentTF.getText());
                    pst.setString(7, contactnoTF.getText());
                    pst.setString(8, addressTF.getText());
                    pst.setString(9, gender);
                    pst.setString(10, faculty);
                    pst.setString(11, blood);
                    pst.setString(12, designation);
                    pst.execute();
                    edialog.showDialog("Data Inserted Sucessfully");
                    edialog.setVisible(true);
                    Admin_Dashboard ad = new Admin_Dashboard();
                    ad.setVisible(true);
                    this.setVisible(false);

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
//                edialog.showDialog("Connection Error");
//                edialog.setVisible(true);

            }

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(MainMenu_JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void genderTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderTFActionPerformed

    private void designationTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designationTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_designationTFActionPerformed

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
            java.util.logging.Logger.getLogger(Teacher_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTF;
    private javax.swing.JComboBox<String> bloodTF;
    private javax.swing.JLabel close;
    private javax.swing.JTextField contactnoTF;
    private javax.swing.JLabel dateTF;
    private com.toedter.calendar.JDateChooser dateofbirthTF;
    private javax.swing.JTextField departmentTF;
    private javax.swing.JComboBox<String> designationTF;
    private javax.swing.JTextField emailTF;
    private javax.swing.JComboBox<String> facultyTF1;
    private javax.swing.JComboBox<String> genderTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField nameTF;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JTextField studentidTF;
    private javax.swing.JLabel timeTF;
    // End of variables declaration//GEN-END:variables
}
