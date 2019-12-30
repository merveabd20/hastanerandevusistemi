package com.userPage;

import com.classes.*;
import com.databes.MYSQLDB;
import com.userPage.islemForm;
import java.awt.Color;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
        
        
public class adminForm extends javax.swing.JFrame {

    public adminForm() {
        initComponents();
        this.setLocationRelativeTo(null);//ekranda tam ortada olması sağlandı
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        baslık = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        hListeleButon = new javax.swing.JButton();
        dListeleButon = new javax.swing.JButton();
        klinikListeleButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        islemButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(129, 207, 224));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(46, 49, 49));
        jLabel1.setText("Admin Ekranı");

        baslık.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        baslık.setForeground(new java.awt.Color(46, 49, 49));
        baslık.setText("Merisa Hastanesi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(baslık, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(baslık)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(243, 241, 239));

        hListeleButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        hListeleButon.setForeground(new java.awt.Color(46, 49, 49));
        hListeleButon.setText("Hastaları Listele");
        hListeleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hListeleButonActionPerformed(evt);
            }
        });

        dListeleButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        dListeleButon.setForeground(new java.awt.Color(46, 49, 49));
        dListeleButon.setText("Doktorları Listele");
        dListeleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dListeleButonActionPerformed(evt);
            }
        });

        klinikListeleButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        klinikListeleButton.setForeground(new java.awt.Color(46, 49, 49));
        klinikListeleButton.setText("Klinikleri Listele");
        klinikListeleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klinikListeleButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList);

        islemButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        islemButon.setForeground(new java.awt.Color(46, 49, 49));
        islemButon.setText("İşlem Ekranına Geç");
        islemButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                islemButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hListeleButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dListeleButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(klinikListeleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(islemButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(hListeleButon)
                        .addGap(14, 14, 14)
                        .addComponent(klinikListeleButton)
                        .addGap(18, 18, 18)
                        .addComponent(dListeleButon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(islemButon)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hListeleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hListeleButonActionPerformed
        //hasta
        MYSQLDB mysql = new MYSQLDB();
        mysql.connectionOpen();//bağlantı aç
        ResultSet myRs= mysql.veriGetir("hasta");
        DefaultListModel  model = new DefaultListModel ();
        try {
            while(myRs.next()){
                HASTA hasta = new HASTA();//sınıfımızdan nesne ürettik
                hasta.setTc(myRs.getString("tc_numarası"));            
                hasta.setAd(myRs.getString("ad"));
                hasta.setSoyad(myRs.getString("soyad"));
                hasta.setCinsiyet(myRs.getString("cinsiyet"));
                hasta.setDogumYeri(myRs.getString("dogum_yeri"));
                hasta.setDogumTarihi(myRs.getString("dogum_tarihi"));
                hasta.setBabaAdı(myRs.getString("baba_adı"));
                hasta.setAnaAdı(myRs.getString("ana_adı"));
                hasta.setTelefonNum(myRs.getString("telefon"));
                hasta.setMaii(myRs.getString("mail"));
                model.addElement("Hasta T.C. Kimlik Numarası");
                model.addElement(hasta.getTc());
                model.addElement("Hasta Ad");
                model.addElement(hasta.getAd());
                model.addElement("Hasta Soyad");
                model.addElement(hasta.getSoyad());
                model.addElement("Cinsiyet");
                model.addElement(hasta.getCinsiyet());
                model.addElement("Hasta Doğum Yeri");
                model.addElement(hasta.getDogumYeri());
                model.addElement("Hasta Doğum Tarihi");
                model.addElement(hasta.getDogumTarihi());
                model.addElement("Hasta Baba Adı");
                model.addElement(hasta.getBabaAdı());
                model.addElement("Hasta Ana Adı");
                model.addElement(hasta.getAnaAdı());
                model.addElement("Hasta Telefon Numarası");
                model.addElement(hasta.getTelefonNum());
                model.addElement("Hasta E-posta Adresi");
                model.addElement(hasta.getMaii());
                model.addElement("********************************************************");
               jList.setModel(model);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jPanel2,"Veritabanında bir hata ile karşılaşıldı.","Bağlantı Hatası",JOptionPane.ERROR_MESSAGE);
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(jPanel2,"Bilinmeyen bir hata ile karşılaşıldı.","Bilinmeyen Hata",JOptionPane.ERROR_MESSAGE);
        }
        mysql.connectionClose();//bağlantı kapatıldı
    }//GEN-LAST:event_hListeleButonActionPerformed

    private void klinikListeleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klinikListeleButtonActionPerformed
       //klinik
        MYSQLDB mysql = new MYSQLDB();
        mysql.connectionOpen();//bağlantı aç
        ResultSet myRs= mysql.veriGetir("klinik");
        DefaultListModel model = new DefaultListModel();
        try {
            while(myRs.next()){
                KLINIK klinik = new KLINIK();//sınıfımızdan nesne ürettik
              //  klinik.setID(myRs.getInt("klinik_id"));//id bilgisi alındı
                klinik.setAd(myRs.getString("klinik_ad"));//klinik ad bilgisi alındı
              //  model.addElement(klinik.getID());
                model.addElement(klinik.getAd());
                jList.setModel(model);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jPanel2,"Veritabanında bir hata ile karşılaşıldı.","Bağlantı Hatası",JOptionPane.ERROR_MESSAGE);
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(jPanel2,"Bilinmeyen bir hata ile karşılaşıldı.","Bilinmeyen Hata",JOptionPane.ERROR_MESSAGE);
        }
        mysql.connectionClose();//bağlantı kapatıldı
    }//GEN-LAST:event_klinikListeleButtonActionPerformed

    private void dListeleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dListeleButonActionPerformed
       //doktor
        MYSQLDB mysql = new MYSQLDB();
        mysql.connectionOpen();//bağlantı aç
        ResultSet myRs= mysql.veriGetir("doktor");
        DefaultListModel  model = new DefaultListModel ();
        try {
            while(myRs.next()){
                DOKTOR doktor = new DOKTOR();//sınıfımızdan nesne ürettik
                doktor.setTc(myRs.getString("tc_numarası"));            
                doktor.setAd(myRs.getString("ad"));
                doktor.setSoyad(myRs.getString("soyad"));
                doktor.setCinsiyet(myRs.getString("cinsiyet"));            
                doktor.setDogumTarihi(myRs.getString("dogum_tarihi"));
                doktor.setTelefonNum(myRs.getString("telefon"));
                doktor.setMaii(myRs.getString("mail"));
                doktor.setBransID(myRs.getInt("brans_id"));
                model.addElement("Doktor T.C. Kimlik Numarası");
                model.addElement(doktor.getTc());
                model.addElement("Doktor Ad");
                model.addElement(doktor.getAd());
                model.addElement("Doktor Soyad");
                model.addElement(doktor.getSoyad());
                model.addElement("Cinsiyet");
                model.addElement(doktor.getCinsiyet());
                model.addElement("Doktor Doğum Tarihi");
                model.addElement(doktor.getDogumTarihi());
                model.addElement("Doktor Telefon Numarası");
                model.addElement(doktor.getTelefonNum());
                model.addElement("Doktor E-posta Adresi");
                model.addElement(doktor.getMaii());
                ResultSet myRs2= mysql.veriGetir(" klinik WHERE "+doktor.getBransID()+"=klinik_id");//bu kısa kod parçacığında
                //ilişkili olan tablolarımız yardımıyla kliniğin adına ulaştık
                while(myRs2.next()){
                   doktor.setBransAd(myRs2.getString("klinik_ad"));
                }
                model.addElement("Doktor Branş");
                model.addElement(doktor.getBransAd());
                model.addElement("********************************************");
               jList.setModel(model);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jPanel2,"Veritabanında bir hata ile karşılaşıldı.","Bağlantı Hatası",JOptionPane.ERROR_MESSAGE);
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(jPanel2,"Bilinmeyen bir hata ile karşılaşıldı.","Bilinmeyen Hata",JOptionPane.ERROR_MESSAGE);
        }
        mysql.connectionClose();//bağlantı kapatıldı
    }//GEN-LAST:event_dListeleButonActionPerformed

    private void islemButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_islemButonActionPerformed
        //işlem ekranına geç butonuna basıldığında
        islemForm islem = new islemForm();
        islem.setVisible(true);
    }//GEN-LAST:event_islemButonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baslık;
    private javax.swing.JButton dListeleButon;
    private javax.swing.JButton hListeleButon;
    private javax.swing.JButton islemButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton klinikListeleButton;
    // End of variables declaration//GEN-END:variables
}
