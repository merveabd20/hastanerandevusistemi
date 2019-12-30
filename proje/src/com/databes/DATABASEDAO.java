package com.databes;

import java.sql.ResultSet;

public interface DATABASEDAO {
        /* Interface şeklinde bir Database üretilmesinin amacı burada her veritabanı için ortak olacak
metotların gövdelerini oluşturmak ve daha sonra oluşabilecek/oluşturulabilecek
veritabanları için işlemleri daha kolay yapmaktır.
ekle,sil,güncelle,veri getir,bağlantı aç,bağlantı kapa
* */

    void connectionOpen();//bağlantı oluştur
    void add(String s,String sql_sorgu1,String degerler);//ekle
    void delete(String sql_sorgusu);//sil
    void update(String tablo,String sql_sorgusu);//güncelle
    void connectionClose();//bağlantıyı sonlandır
    ResultSet veriGetir(String tablo);
}
