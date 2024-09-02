/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import com.mysql.jdbc.Driver;
import java.util.List;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class conek {
   
    private static Connection koneksi;
    
    public static Connection GetConnection()throws SQLException{
        String db = "jdbc:mysql://localhost:3306/siresta";
        String user = "root";
        String pass = "";
        if (koneksi==null){
            koneksi=DriverManager.getConnection(db, user, pass);
        }
        return koneksi;
    }
    // Metode untuk mendapatkan admin dari database
    public static List<String> getAdmins() throws SQLException {
        List<String> admins = new ArrayList<>();
        Connection conn = GetConnection(); // Memanggil metode koneksi database
        String query = "SELECT nama, email FROM admin"; // Ganti 'admin' dengan nama tabel yang sesuai
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                // Menggabungkan nama dan nomor telepon dengan format "nama | nomor_telepon"
                String admin = rs.getString("nama") + " | " + rs.getString("email");
                admins.add(admin);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Menangani eksepsi
            throw ex; // Melemparkan eksepsi agar dapat ditangani di tempat lain jika perlu
        } finally {
            if (conn != null) {
                conn.close(); // Menutup koneksi database
            }
        }
        return admins;
    }
}