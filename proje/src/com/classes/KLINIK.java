package com.classes;

public class KLINIK {
    private int klinik_id;
    private String klinik_ad;
    
    public void setID(int id){
        klinik_id = id;
    }
    
    public void setAd(String ad){
        klinik_ad=ad;
    }
    public int getID(){
       return klinik_id;
    }
    
    public String getAd(){
        return klinik_ad;
    }    
    
}
