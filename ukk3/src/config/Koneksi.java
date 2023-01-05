/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SMKN 1 SELONG
 */
public class Koneksi {
    public static Connection con;
    public static Connection koneksiDB()
    {
        if(con == null) {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/ukk3", "root", null);
                //JOptionPane.showMessageDialog(null, "Tersambung ke database");
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        
        return con;
    }
    
    public static void main(String[]args)
    {
        Koneksi db = new Koneksi();
        db.koneksiDB();
    }
}
