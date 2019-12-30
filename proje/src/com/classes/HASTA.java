package com.classes;


public class HASTA extends VATANDAS {
    private String babaAd;
    private String anaAd;
    private String dogumYeri;
    private String sifre;
    
    public void setBabaAdı(String baba){
        babaAd = baba;
    }
    public void setAnaAdı(String ana){
        anaAd = ana;
    }
    public void setDogumYeri(String dogumYer){
        dogumYeri = dogumYer;
    }
    public void setSifre(String password){
        sifre = password;
    }
   
    public String getBabaAdı(){
        return babaAd;
    }
    public String getAnaAdı(){
        return anaAd;
    }
    public String getDogumYeri(){
        return dogumYeri;
    }
    public String getSifre(){
        return sifre;
    }
    
}
