package guimahasiswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    public Connection getConnection(){
        Connection con = null;
        try{
            // PENTING: Ganti "pbo" dengan nama database yang kamu buat di XAMPP/phpMyAdmin
            con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", ""); 
            return con;
        } catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}