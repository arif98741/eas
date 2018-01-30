package eas;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Show_Table_Data extends javax.swing.JFrame {
    
    public void printWork(){
     PrinterJob pj = PrinterJob.getPrinterJob();
     pj.setJobName(" Opt De Solver Printing ");
     pj.setPrintable(new Printable(){

         public int print(Graphics pg, PageFormat pf, int pageNum)
         {
             if(pageNum > 0)
            return Printable.NO_SUCH_PAGE;
            Graphics2D g2 = (Graphics2D)pg;
             g2.translate(pf.getImageableX(), pf.getImageableY());
             //print jtable
             jtable.print(g2);
             return Printable.PAGE_EXISTS;
         }
     });
     if(pj.printDialog() == false)
         return;
     try
     {
         pj.print();
     }
     catch(PrinterException xcp)
     {
         xcp.printStackTrace(System.err);
     }
 } 

    private String stdString;

    public Show_Table_Data(String std) {
        initComponents();
        this.stdString = std;
        findUsers();

    }

    public Show_Table_Data() {
        initComponents();
        findUsers();
    }

    public String getUserId(String stdid) {
        this.stdString = stdid;
        return stdString;
    }

    public ArrayList<User> ListUsers(String ValToSearch) {
        ArrayList<User> usersList = new ArrayList<User>();
        Connection con = MySqlConnect.ConnectDB();
        PreparedStatement ps;
        ResultSet rs;

        try {
            String sql = "SELECT * FROM std_attend WHERE std_attend.std_id='" + stdString + "'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            User user;
            while (rs.next()) {
                user = new User(
                        rs.getString("std_id"),
                        rs.getString("date"),
                        rs.getString("month"),
                        rs.getString("year"),
                        rs.getString("time"),
                        rs.getString("status")
                );

                usersList.add(user);
            }

        } catch (SQLException e) {
        }
        return usersList;
    }

    public void findUsers() {
        ArrayList<User> users = ListUsers(btnSearch.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID", "Date", "Month", "Year", "Time", "Status"});
        Object[] row = new Object[6];
        for (int i = 0; i < users.size(); i++) {
            row[0] = users.get(i).getStd_id();
            row[1] = users.get(i).getDate();
            row[2] = users.get(i).getMonth();
            row[3] = users.get(i).getYear();
            row[4] = users.get(i).getTime();
            row[5] = users.get(i).getStatus();
            model.addRow(row);
        }
        jtable.setModel(model);

    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        btnSeach1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JTextField();
        btnSeach = new javax.swing.JButton();
        minimize = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtable.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(jtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 1070, 430));

        btnSeach1.setText("Back");
        btnSeach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeach1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeach1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 630, 120, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Show Attendance History");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 270, 90));

        btnSearch.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 110, 170, -1));

        btnSeach.setText("Seach");
        btnSeach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeachActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeach, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, -1, -1));

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, 40, 30));

        jButton1.setText("print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 110, -1, -1));

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 40, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eas/background_UI/project ui bg.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeach1ActionPerformed
        Students_Dashboard sd = new Students_Dashboard();
        Student_Profile sp = new Student_Profile(stdString);
        sd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSeach1ActionPerformed

    private void btnSeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeachActionPerformed
        findUsers();
    }//GEN-LAST:event_btnSeachActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(MainMenu_JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.printWork();
        //MessagePane ms = new MessagePane();
       // ms.displayPane("Print Detail");
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Show_Table_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show_Table_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show_Table_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show_Table_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show_Table_Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeach;
    private javax.swing.JButton btnSeach1;
    private javax.swing.JTextField btnSearch;
    private javax.swing.JLabel close;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
