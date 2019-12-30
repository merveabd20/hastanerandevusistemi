package com.classes;

public class VATANDAS {
    private String tc;
    private String ad;
    private String soyad;
    private String cinsiyet;
    private String dogumTarihi;
    private String telefonNum;
    private String mail;
    
    public void setTc(String TC){
        tc = TC;
    }
    
    public void setAd(String ad1){
        ad=ad1;
    }
    public void setSoyad(String soyad1){
        soyad=soyad1;
    }
    public void setCinsiyet(String cin){
        cinsiyet=cin;
    }
    public void setDogumTarihi(String date){
        dogumTarihi = date;
    }
    public void setTelefonNum(String num){
        telefonNum = num;
    }
    public void setMaii(String maill){
        mail = maill;
    }    
    
    public String getTc(){
        return tc;
    }
    
    public String getAd(){
        return ad;
    }
    public String getSoyad(){
        return soyad;
    }
    public String getCinsiyet(){
        return cinsiyet;
    }
    public String getDogumTarihi(){
        return dogumTarihi;
    }
    public String getTelefonNum(){
        return telefonNum;
    }
    public String getMaii(){
        return mail;
    }  
}
