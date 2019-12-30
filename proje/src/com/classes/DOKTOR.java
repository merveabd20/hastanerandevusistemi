package com.classes;


public class DOKTOR extends VATANDAS {
    private int brans_id;
    private String brans_ad;
    private String sifre;
    
    public void setBransID(int id){
        brans_id = id;
    }
    public void setSifre(String pass){
        sifre = pass;
    }
    public int getBransID(){
        return brans_id;
    }
    public String getSifre(){
        return sifre;
    }
    public void setBransAd(String ad){
        brans_ad = ad;
    }
    public String getBransAd(){
        return brans_ad;
    }
 }
