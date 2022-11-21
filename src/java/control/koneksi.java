package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class koneksi {
    Connection conn = null;
    public Statement stmt = null;
    ResultSet rs;

    public static void ambilkoneksi() {
        try {
            String db = "jdbc:mysql://localhost:3306/kas_masuk_sekolah";
            String user = "root";
            String pass = "";
            Class.forName ("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(db, user, pass);
        } catch (Exception x) {
            System.out.println("Terjadi kesalahan ambil koneksi : "+x);
        }
    }
    
    public koneksi() throws ClassNotFoundException {
        
            String dbName = "kas_masuk_sekolah";
            String uName = "root";
            String pass = "";
            String URL = "jdbc:mysql://localhost/" + dbName;
            Class.forName ("com.mysql.jdbc.Driver");
            
        try {    
            conn = DriverManager.getConnection(URL, uName, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public koneksi(String dbName, String uName, String pass) throws ClassNotFoundException {
        String URL = "jdbc:mysql://localhost/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        try{
            conn=DriverManager.getConnection(URL, uName,pass);
            stmt=conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bukakoneksi() {
        try {
            String db="jdbc:mysql://localhost:3306/kas_masuk_sekolah";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(db,user,pass);
            stmt=conn.createStatement();
        } catch (Exception x) {
            System.out.println("Terjadi Kesalahan Koneksi : " + x);
        }
    }
    
    public void diskonek(ResultSet rs) {
        try {
            if (rs!=null) {
                rs.close();
            }
            stmt.close();
            conn.close();
        } catch (Exception x) {
            System.out.println("Terjadi Kesalahan Diskoneksi : " + x);
        }
    }
    
    public ResultSet ambilData(String sql) {
        ResultSet rs=null;
        try{
            bukakoneksi();
            rs=stmt.executeQuery(sql);
        } catch (Exception x) {
            System.out.println("Terjadi Kesalahan Ambil Data : " + x);
        }
        return rs;
    }
    
    public void close() throws SQLException {
        conn.close();
        stmt.close();
    }
}

