/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import config.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SMKN 1 SELONG
 */
public class PenggunaModel {
    public void simpan(String namaLengkap, String namaPengguna, String email, String alamat, String password)
    {
        try {
            String query = "INSERT INTO pengguna VALUES (null, '"+namaLengkap+"', '"+namaPengguna+"', '"+email+"', '"+alamat+"', '"+password+"')";
            Connection con = Koneksi.koneksiDB();
            Statement stmt = con.createStatement();
            stmt.execute(query);
            JOptionPane.showMessageDialog(null, "Register berhasil dilakukan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public String namaPengguna()
    {
        try {
            String query = "SELECT * FROM pengguna LIMIT 1";
            Connection con = Koneksi.koneksiDB();
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            
            String namaPengguna = "";
            while(result.next()) {
                namaPengguna = result.getString("nama_pengguna");
            }
            
            return namaPengguna;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return "";
        }
    }
    
    public String[] pengguna()
    {
        try {
            String query = "SELECT * FROM pengguna LIMIT 1";
            Connection con = Koneksi.koneksiDB();
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            
            String[] pengguna;
            
            int i = 1;
            while(result.next()) {
                pengguna = result.getString(i);
            
            i++}
            
            return result;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return result;
        }
    }
}
