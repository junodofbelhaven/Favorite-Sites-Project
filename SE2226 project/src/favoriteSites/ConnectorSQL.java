/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package favoriteSites;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author anil
 */
public class ConnectorSQL {
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sitesdatabase", "root", "asdbnm1122"); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database connection failed: " + ex.getMessage());
        }
        return con;
    }
}
