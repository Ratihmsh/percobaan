package suratmasuk;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author WIN 10
 */
public class conn {
    Connection conn;
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/siresta","root","");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "koneksi Database Gagal !"+e);
        }
    }
    Connection GetConnection(){
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
           conn = DriverManager.getConnection("jdbc:mysql://localhost/siresta","root","");
        } catch (Exception e){
        }
        return conn;
    }
}
