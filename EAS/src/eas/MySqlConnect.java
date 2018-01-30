package eas;

import java.sql.*;
import javax.swing.*;

public class MySqlConnect {

    Connection conn = null;

    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/eas", "root", "");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://mysql3.neuprime.com:3306/n1_eas", "n1_eas", "ca4d6e8e23");
            
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
}
