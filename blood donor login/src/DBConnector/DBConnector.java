/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnector;

/**
 *
 * @author User
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnector {
    Connection conn = null;
    
    public static Connection ConnectDb(){
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/donor_db","root","0523");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        } 
    }
    
}
