package com.classes;

import com.databes.MYSQLDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RANDEVU extends AbsIslem{
    private int randevu_id;
    private int doktor_id;
    private int hasta_id;
    private int klinik_id;
    private String randevu_tarihi;
    private String randevu_saati;
    
    public void setKlinikID(int id){
      klinik_id=id;  
    }
    public void setRandevuID(int id){
      randevu_id=id;  
    }
    public void setDoktorID(int id){
        doktor_id=id;
    }
    public void setHastaID(int id){
        hasta_id=id;
    }
    public void setRandevuTarihi(String tarih){
        randevu_tarihi=tarih;
    }
    public void setRandevuSaati(String saat){
        randevu_saati=saat;
    }
    
    public int getRandevuID(){
        return randevu_id;
    }
    public int getDoktorID(){
        return doktor_id;
    }
    public int getKlinikID(){
        return klinik_id;
    }    
    public int getHastaID(){
        return hasta_id;
    }
    public String getRandevuTarihi(){
        return randevu_tarihi;
    }
    public String getRandevuSaati(){
        return randevu_saati;
    } 
    
    @Override
    public ArrayList <String> getir() {
        KLINIK klinik = new KLINIK();
        MYSQLDB mysql = new MYSQLDB();
        ArrayList <String> liste = new ArrayList <String>();
        mysql.connectionOpen();//bağlantı aç
        ResultSet myRs;
        myRs = mysql.veriGetir("klinik");
        try { 
            while(myRs.next()){
                klinik.setAd(myRs.getString("klinik_ad"));
                klinik.setID(myRs.getInt("klinik_id"));
                liste.add(String.valueOf(klinik.getID()));
                liste.add(klinik.getAd());
            }
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLDB.class.getName()).log(Level.SEVERE, null, ex);
        }
         mysql.connectionClose();//bağlantı kapatıldı
        return liste;
    }
    
    @Override
    public ArrayList <String> getir(int id) {
        DOKTOR doktor = new DOKTOR();
        MYSQLDB mysql = new MYSQLDB();
        ArrayList <String> liste = new ArrayList <String>();
        mysql.connectionOpen();//bağlantı aç
        ResultSet myRs;
        myRs = mysql.veriGetir("doktor WHERE brans_id="+id);
        try { 
            while(myRs.next()){
                doktor.setAd(myRs.getString("ad"));
                doktor.setSoyad(myRs.getString("soyad"));
                String birlestir = doktor.getAd()+" "+doktor.getSoyad();
                liste.add(birlestir);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        mysql.connectionClose();//bağlantı kapatıldı
        return liste;
    }

}
