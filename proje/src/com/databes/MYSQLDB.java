package com.databes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MYSQLDB implements DATABASEDAO {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DOMAIN_NAME = "localhost";
    static final String DB_NAME = "hastane_db"; //veritabanı ismi
    static final String DB_URL = "jdbc:mysql://" + DOMAIN_NAME + "/" + DB_NAME;
    static final String USER = "root";//veritabanı kullanıcı ad
    static final String PASS = "";//şifresi
    
    static Connection conn; //connection nesnemiz
    static  Statement sta; //statement nesnemiz
    static ResultSet myRs;
    @Override
    public void connectionOpen() {//veritabanına bağlantı oluşturuldu
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {//jdbc driver sürücüsünde hata
            Logger.getLogger(MYSQLDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void add(String tablo,String sql_sorgusu,String degerler) {
        try {//ekle
        sta = (Statement) conn.createStatement();
        sta.executeUpdate("INSERT INTO "+tablo+"("+sql_sorgusu+") "+degerler);
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLDB.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }

    @Override
    public void delete(String sql_sorgusu) {//sil
        try {
        sta = (Statement) conn.createStatement();
        sta.executeUpdate("DELETE FROM "+sql_sorgusu);
        } 
        catch (SQLException ex) {//hata
             Logger.getLogger(MYSQLDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(String tablo,String sql_sorgusu) {//güncelle
        try {
        sta = (Statement) conn.createStatement();
        sta.executeUpdate("UPDATE "+tablo+" SET "+sql_sorgusu);
        } 
        catch (SQLException ex) {//hata
             Logger.getLogger(MYSQLDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    @Override
    public  ResultSet veriGetir(String tablo) { //veri getir   
       myRs=null;
        try {
        sta = (Statement) conn.createStatement();
        myRs = sta.executeQuery("SELECT * FROM "+tablo);
        return myRs;
        } 
        catch (SQLException ex) {//hata
             Logger.getLogger(MYSQLDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return myRs;
        }
        
    }
    
    
    @Override
    public void connectionClose() {
        try {//bağlantı kapa        
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
