package com.userPage;

import com.databes.MYSQLDB;
import com.classes.DOKTOR;
import com.classes.KLINIK;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.commons.lang.StringUtils;

public class islemForm extends javax.swing.JFrame {

    public islemForm() {
        
        initComponents();
        this.setLocationRelativeTo(null);//ekranda tam ortada olması sağlandı
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        baslık = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TCLabel = new javax.swing.JLabel();
        adLabel = new javax.swing.JLabel();
        soyadLabel = new javax.swing.JLabel();
        cinsiyetLabel = new javax.swing.JLabel();
        dogumTarihiLabel = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        telNumLabel = new javax.swing.JLabel();
        sifreLabel = new javax.swing.JLabel();
        sifreTekrarLabel = new javax.swing.JLabel();
        bransTextLabel = new javax.swing.JLabel();
        tcField = new javax.swing.JTextField();
        adField = new javax.swing.JTextField();
        soyadField = new javax.swing.JTextField();
        mailField = new javax.swing.JTextField();
        telNumField = new javax.swing.JTextField();
        cinCombo = new javax.swing.JComboBox<>();
        sifrePass2 = new javax.swing.JPasswordField();
        sifrePass = new javax.swing.JPasswordField();
        dokEkleButon = new javax.swing.JButton();
        dokGuncelleButon = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tcAra = new javax.swing.JTextField();
        dokAraButon = new javax.swing.JButton();
        dogTarihField = new javax.swing.JTextField();
        dokSilButon = new javax.swing.JButton();
        klinikCom = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        TCLabel1 = new javax.swing.JLabel();
        kAdAraField = new javax.swing.JTextField();
        klinikGuncelleButon = new javax.swing.JButton();
        klinikEkleButon = new javax.swing.JButton();
        klnkIDTEXT = new javax.swing.JLabel();
        klnkAdField = new javax.swing.JTextField();
        klnkSilButon = new javax.swing.JButton();
        klnkAraButon = new javax.swing.JButton();
        klinikAdLabel = new javax.swing.JLabel();
        knkIDField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(129, 207, 224));

        baslık.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        baslık.setForeground(new java.awt.Color(46, 49, 49));
        baslık.setText("Merisa Hastanesi");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(46, 49, 49));
        jLabel1.setText("İşlem Ekranı");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(baslık, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(407, 407, 407))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(baslık)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(245, 255, 250));
        jPanel2.setForeground(new java.awt.Color(46, 49, 49));

        TCLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TCLabel.setForeground(new java.awt.Color(46, 49, 49));
        TCLabel.setText("T.C. Kimlik Numarası");

        adLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        adLabel.setForeground(new java.awt.Color(46, 49, 49));
        adLabel.setText("Ad");

        soyadLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        soyadLabel.setForeground(new java.awt.Color(46, 49, 49));
        soyadLabel.setText("Soyad");

        cinsiyetLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cinsiyetLabel.setForeground(new java.awt.Color(46, 49, 49));
        cinsiyetLabel.setText("Cinsiyet");

        dogumTarihiLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        dogumTarihiLabel.setForeground(new java.awt.Color(46, 49, 49));
        dogumTarihiLabel.setText("Doğum Tarihi");

        mailLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        mailLabel.setForeground(new java.awt.Color(46, 49, 49));
        mailLabel.setText("E-posta Adresi");

        telNumLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        telNumLabel.setForeground(new java.awt.Color(46, 49, 49));
        telNumLabel.setText("Telefon Numarası");

        sifreLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        sifreLabel.setForeground(new java.awt.Color(46, 49, 49));
        sifreLabel.setText("Şifre");

        sifreTekrarLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        sifreTekrarLabel.setForeground(new java.awt.Color(46, 49, 49));
        sifreTekrarLabel.setText("Şifre Tekrar");

        bransTextLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        bransTextLabel.setForeground(new java.awt.Color(46, 49, 49));
        bransTextLabel.setText("Branş");

        tcField.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        tcField.setForeground(new java.awt.Color(46, 49, 49));

        adField.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        adField.setForeground(new java.awt.Color(46, 49, 49));

        soyadField.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        soyadField.setForeground(new java.awt.Color(46, 49, 49));

        mailField.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        mailField.setForeground(new java.awt.Color(46, 49, 49));

        telNumField.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        telNumField.setForeground(new java.awt.Color(46, 49, 49));

        cinCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kadın", "Erkek" }));

        dokEkleButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        dokEkleButon.setForeground(new java.awt.Color(46, 49, 49));
        dokEkleButon.setText("Doktor Ekle");
        dokEkleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokEkleButonActionPerformed(evt);
            }
        });

        dokGuncelleButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        dokGuncelleButon.setForeground(new java.awt.Color(46, 49, 49));
        dokGuncelleButon.setText("Doktor Güncelle");
        dokGuncelleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokGuncelleButonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(46, 49, 49));
        jLabel2.setText("T.C. Kimlik Numarası Giriniz");

        dokAraButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        dokAraButon.setForeground(new java.awt.Color(46, 49, 49));
        dokAraButon.setText("Doktor Ara");
        dokAraButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokAraButonActionPerformed(evt);
            }
        });

        dokSilButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        dokSilButon.setForeground(new java.awt.Color(46, 49, 49));
        dokSilButon.setText("Doktor Sil");
        dokSilButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokSilButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dokAraButon, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tcAra, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(mailLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cinsiyetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cinCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(soyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(soyadField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(adLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(dogumTarihiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(74, 74, 74)
                                .addComponent(dogTarihField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(telNumLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TCLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(sifreLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sifreTekrarLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tcField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telNumField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sifrePass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sifrePass2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(bransTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(148, 148, 148)
                                        .addComponent(klinikCom))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(dokEkleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dokGuncelleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dokSilButon, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dokAraButon)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adLabel)
                    .addComponent(adField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soyadLabel)
                    .addComponent(soyadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cinCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinsiyetLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(klinikCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bransTextLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dogTarihField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogumTarihiLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailLabel)
                    .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telNumLabel)
                    .addComponent(telNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sifreLabel)
                    .addComponent(sifrePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sifreTekrarLabel)
                    .addComponent(sifrePass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dokEkleButon)
                    .addComponent(dokGuncelleButon)
                    .addComponent(dokSilButon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 248, 220));

        TCLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TCLabel1.setForeground(new java.awt.Color(46, 49, 49));
        TCLabel1.setText("Klinik Adı Giriniz");

        klinikGuncelleButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        klinikGuncelleButon.setForeground(new java.awt.Color(46, 49, 49));
        klinikGuncelleButon.setText("Klinik Güncelle");
        klinikGuncelleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klinikGuncelleButonActionPerformed(evt);
            }
        });

        klinikEkleButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        klinikEkleButon.setForeground(new java.awt.Color(46, 49, 49));
        klinikEkleButon.setText("Klinik Ekle");
        klinikEkleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klinikEkleButonActionPerformed(evt);
            }
        });

        klnkIDTEXT.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        klnkIDTEXT.setForeground(new java.awt.Color(46, 49, 49));
        klnkIDTEXT.setText("Klinik ID");

        klnkSilButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        klnkSilButon.setForeground(new java.awt.Color(46, 49, 49));
        klnkSilButon.setText("Klinik Sil");
        klnkSilButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klnkSilButonActionPerformed(evt);
            }
        });

        klnkAraButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        klnkAraButon.setForeground(new java.awt.Color(46, 49, 49));
        klnkAraButon.setText("Klinik Ara");
        klnkAraButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klnkAraButonActionPerformed(evt);
            }
        });

        klinikAdLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        klinikAdLabel.setForeground(new java.awt.Color(46, 49, 49));
        klinikAdLabel.setText("Klinik Ad");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(TCLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(kAdAraField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(klnkAraButon, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(klnkSilButon, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(klinikGuncelleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(klinikEkleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(klinikAdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(klnkIDTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(klnkAdField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(knkIDField))))
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kAdAraField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCLabel1))
                .addGap(18, 18, 18)
                .addComponent(klnkAraButon)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(klnkIDTEXT)
                    .addComponent(knkIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(klinikAdLabel)
                    .addComponent(klnkAdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(klinikEkleButon)
                .addGap(18, 18, 18)
                .addComponent(klinikGuncelleButon)
                .addGap(18, 18, 18)
                .addComponent(klnkSilButon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DOKTOR doktor = new DOKTOR();
    KLINIK klinik = new KLINIK();
    private void dokAraButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokAraButonActionPerformed
        // doktor ara butonuna basıldığında
        MYSQLDB mysql = new MYSQLDB();
        mysql.connectionOpen();//bağlantı aç
        ResultSet myRs;
        String gecici = tcAra.getText();
        if(!StringUtils.isBlank(gecici)){//tc texti boş değilse kodu çalıştır
             doktor.setTc(tcAra.getText());
             System.out.println(doktor.getTc());
             myRs= mysql.veriGetir("doktor WHERE tc_numarası='"+doktor.getTc()+"'");
        try {
            if(myRs.next()){//girilen tc veritabanında varsa girilen veriyi getir
                myRs= mysql.veriGetir("doktor WHERE tc_numarası='"+doktor.getTc()+"'");
                   try {
                        if(myRs.next()){
                         doktor.setTc(myRs.getString("tc_numarası"));            
                         doktor.setAd(myRs.getString("ad"));
                         doktor.setSoyad(myRs.getString("soyad"));
                         doktor.setCinsiyet(myRs.getString("cinsiyet"));            
                         doktor.setDogumTarihi(myRs.getString("dogum_tarihi"));
                         doktor.setTelefonNum(myRs.getString("telefon"));
                         doktor.setMaii(myRs.getString("mail"));
                         doktor.setBransID(myRs.getInt("brans_id"));
                         doktor.setSifre(myRs.getString("sifre"));
                        
                         tcField.setText(doktor.getTc());
                         adField.setText(doktor.getAd());
                         soyadField.setText(doktor.getSoyad());
                         cinCombo.setSelectedItem(doktor.getCinsiyet());
                         ResultSet myRs2= mysql.veriGetir(" klinik WHERE "+doktor.getBransID()+"=klinik_id");//bu kısa kod parçacığında
                         //ilişkili olan tablolarımız yardımıyla kliniğin adına ulaştık
                          while(myRs2.next()){
                             doktor.setBransAd(myRs2.getString("klinik_ad"));
                          }
                         klinikCom.setText(doktor.getBransAd());
                         dogTarihField.setText(doktor.getDogumTarihi());
                         mailField.setText(doktor.getMaii());
                         telNumField.setText(doktor.getTelefonNum());
                         sifrePass.setText(doktor.getSifre());
                         sifrePass2.setText(doktor.getSifre());

                    }else{
                     JOptionPane.showMessageDialog(jPanel2,"Veri Bulunamadı.","Veri Bulunamadı",JOptionPane.ERROR_MESSAGE);
             }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(jPanel2,"Veritabınında bir hata ile karşılaşıldı.","Bilinmeyen Hata",JOptionPane.ERROR_MESSAGE);
        }
                
            }else{
                JOptionPane.showMessageDialog(jPanel2,"Girilen T.C. kimlik numarası bulunamadı.","Veri Bulunamadı",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(jPanel2,"Veritabınında bir hata ile karşılaşıldı.","Bilinmeyen Hata",JOptionPane.ERROR_MESSAGE);
        }
        }else{
            JOptionPane.showMessageDialog(jPanel2,"Doktor T.C. Kimlik Numarası Boş Geçilemez.","Veri Hatası",JOptionPane.ERROR_MESSAGE);
        }
        mysql.connectionClose();//bağlantı kapandı
    }//GEN-LAST:event_dokAraButonActionPerformed

    private void klnkAraButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klnkAraButonActionPerformed
        // klinik ara butonuna basıldığında
        MYSQLDB mysql = new MYSQLDB();
        mysql.connectionOpen();//bağlantı aç
        ResultSet myRs;
        String gecici = kAdAraField.getText();
        if(!StringUtils.isBlank(gecici)){
             klinik.setAd(kAdAraField.getText());
             myRs= mysql.veriGetir("klinik WHERE klinik_ad='"+klinik.getAd()+"'");
        try {
            if(myRs.next()){//girilen id veritabanında varsa girilen veriyi getir
               myRs= mysql.veriGetir(" klinik WHERE klinik_ad='"+klinik.getAd()+"'");
                     try {
                          if(myRs.next()){
                                 klinik.setID(myRs.getInt("klinik_id"));
                                 klinik.setAd(myRs.getString("klinik_ad"));
                                 knkIDField.setText(String.valueOf(klinik.getID()));
                                 klnkAdField.setText(klinik.getAd());
            }else{
                JOptionPane.showMessageDialog(jPanel3,"Veri Bulunamadı.","Veri Bulunamadı",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(jPanel3,"Veritabınında bir hata ile karşılaşıldı.","Bilinmeyen Hata",JOptionPane.ERROR_MESSAGE);
        }
                
            }else{
                JOptionPane.showMessageDialog(jPanel3,"Girilen ID bulunamadı.","Veri Bulunamadı",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(jPanel3,"Veritabınında bir hata ile karşılaşıldı.","Bilinmeyen Hata",JOptionPane.ERROR_MESSAGE);
        }
        }else{
            JOptionPane.showMessageDialog(jPanel3,"Klinik Id Boş Geçilemez.","Veri Hatası",JOptionPane.ERROR_MESSAGE);
        }
        mysql.connectionClose();//bağlantı kapandı
    }//GEN-LAST:event_klnkAraButonActionPerformed

    private void klnkSilButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klnkSilButonActionPerformed
        // sil butonuna basıldığında
        MYSQLDB mysql = new MYSQLDB();
        mysql.connectionOpen();//bağlantı aç
        ResultSet myRs;
        String gecici = knkIDField.getText();
        if(!StringUtils.isBlank(gecici)){
             klinik.setID(Integer.parseInt(knkIDField.getText()));
             myRs= mysql.veriGetir("klinik WHERE "+klinik.getID()+"=klinik_id");
        try {
            if(myRs.next()){//girilen id veritabanında varsa girilen verileri sil
            mysql.delete(" klinik WHERE klinik_id="+klinik.getID());
            klnkAdField.setText("");
            knkIDField.setText("");
            JOptionPane.showMessageDialog(jPanel3,"Veri başarı ile silindi.");
                
            }else{
                JOptionPane.showMessageDialog(jPanel3,"Girilen ID bulunamadı.","Veri Bulunamadı",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(jPanel3,"Veritabınında bir hata ile karşılaşıldı.","Bilinmeyen Hata",JOptionPane.ERROR_MESSAGE);
        }
        }else{
            JOptionPane.showMessageDialog(jPanel3,"Klinik Id Boş Geçilemez.","Veri Hatası",JOptionPane.ERROR_MESSAGE);
        }        
        mysql.connectionClose();//bağlantı kapandı
        
    }//GEN-LAST:event_klnkSilButonActionPerformed

    private void klinikGuncelleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klinikGuncelleButonActionPerformed
        // güncelle butonun basıldığında
        MYSQLDB mysql = new MYSQLDB();
        mysql.connectionOpen();//bağlantı aç
        ResultSet myRs;
        String gecici = knkIDField.getText();
        if(!StringUtils.isBlank(gecici)){
             klinik.setID(Integer.parseInt(knkIDField.getText()));
             klinik.setAd(klnkAdField.getText());
             myRs= mysql.veriGetir("klinik WHERE klinik_id ="+klinik.getID());
        try {
            if(myRs.next()){//girilen id veritabanında varsa girilen verileri güncelle
                mysql.update("klinik"," klinik_ad='"+klinik.getAd()+"' WHERE klinik_id="+klinik.getID());
                 knkIDField.setText("");
                 klnkAdField.setText("");
                JOptionPane.showMessageDialog(jPanel3,"Veri başarı ile güncellendi.");
                
            }else{
                JOptionPane.showMessageDialog(jPanel3,"Girilen ID bulunamadı.","Veri Bulunamadı",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(jPanel3,"Veritabınında bir hata ile karşılaşıldı.","Bilinmeyen Hata",JOptionPane.ERROR_MESSAGE);
        }
        }else{
            JOptionPane.showMessageDialog(jPanel3,"Klinik Id Boş Geçilemez.","Veri Hatası",JOptionPane.ERROR_MESSAGE);
        }
        mysql.connectionClose();//bağlantı kapandı
        
    }//GEN-LAST:event_klinikGuncelleButonActionPerformed

    private void klinikEkleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klinikEkleButonActionPerformed
        // klinik ekle butonuna basıldığında
        MYSQLDB mysql = new MYSQLDB();
        mysql.connectionOpen();//bağlantı aç
        String gecici = klnkAdField.getText();
        if(!StringUtils.isBlank(gecici)){
        klinik.setAd(klnkAdField.getText());
        mysql.add("klinik", " klinik_ad "," VALUES('"+ klinik.getAd()+"')");
        knkIDField.setText("");
        klnkAdField.setText("");
        JOptionPane.showMessageDialog(jPanel3,"Veri başarı ile eklendi.");
        }else{
            JOptionPane.showMessageDialog(jPanel3,"Eklenecek kısım boş geçilemez!","Veri Hatası",JOptionPane.ERROR_MESSAGE);
        }
        mysql.connectionClose();//bağlantı kapandı
    }//GEN-LAST:event_klinikEkleButonActionPerformed

    private void dokEkleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokEkleButonActionPerformed
        // doktor ekle butonuna tıklandığında        
        MYSQLDB mysql = new MYSQLDB();
        mysql.connectionOpen();//bağlantı aç
        String gecici = tcField.getText();
        if(!StringUtils.isBlank(gecici)){
            doktor.setTc(tcField.getText());            
            doktor.setAd(adField.getText());
            doktor.setSoyad(soyadField.getText());
            doktor.setCinsiyet(String.valueOf(cinCombo.getSelectedItem()));            
            doktor.setDogumTarihi(dogTarihField.getText());
            doktor.setTelefonNum(telNumField.getText());
            doktor.setMaii(mailField.getText());
            if(!StringUtils.isBlank(klinikCom.getText())){
                ResultSet myRs2= mysql.veriGetir("klinik WHERE klinik_ad='"+klinikCom.getText()+"'");//bu kısa kod parçacığında
             try {//ilişkili olan tablolarımız yardımıyla kliniğin idsine ulaştık
                while(myRs2.next()){
                    doktor.setBransID(myRs2.getInt("klinik_id"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(islemForm.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
            doktor.setSifre(String.valueOf(sifrePass.getPassword()));
            System.out.println("doktor" + " tc_numarası,ad,soyad,cinsiyet,dogum_tarihi,telefon,mail,sifre,brans_id"+ " VALUES ('"+doktor.getTc()+"','"+doktor.getAd()+"','"+doktor.getSoyad()+"','"+doktor.getCinsiyet()+"','"+doktor.getDogumTarihi()+"','"+doktor.getTelefonNum()+"','"+doktor.getMaii()+"','"+doktor.getSifre()+"',"+doktor.getBransID()+")");
            mysql.add("doktor", "tc_numarası,ad,soyad,cinsiyet,dogum_tarihi,telefon,mail,sifre,brans_id", " VALUES ('"+doktor.getTc()+"','"+doktor.getAd()+"','"+doktor.getSoyad()+"','"+doktor.getCinsiyet()+"','"+doktor.getDogumTarihi()+"','"+doktor.getTelefonNum()+"','"+doktor.getMaii()+"','"+doktor.getSifre()+"',"+doktor.getBransID()+")");
            tcField.setText("");
            adField.setText("");
            soyadField.setText("");
            cinCombo.setSelectedItem("");
            klinikCom.setText("");
            dogTarihField.setText("");
            mailField.setText("");
            telNumField.setText("");
            sifrePass.setText("");
            sifrePass2.setText("");
            JOptionPane.showMessageDialog(jPanel2,"Veri başarı ile eklendi."); 
            }else{
                JOptionPane.showMessageDialog(jPanel2,"T.C. Kimlik Numarası Boş Geçilemez.","Veri Hatası",JOptionPane.ERROR_MESSAGE);
            }       
        mysql.connectionClose();//bağlantı kapandı
    }//GEN-LAST:event_dokEkleButonActionPerformed

    private void dokSilButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokSilButonActionPerformed
        // doktor sil butotuna basıldığında
        MYSQLDB mysql = new MYSQLDB();
        mysql.connectionOpen();//bağlantı aç
        String gecici = tcField.getText();
        if(!StringUtils.isBlank(gecici)){
             doktor.setTc(tcField.getText());
         ResultSet myRs= mysql.veriGetir("doktor"+" WHERE tc_numarası='"+doktor.getTc()+"'");
        try {
            if(myRs.next()){//girilen tc veritabanında varsa girilen verileri sil
            mysql.delete("doktor WHERE tc_numarası='"+doktor.getTc()+"'");    
            tcField.setText("");
            adField.setText("");
            soyadField.setText("");
            cinCombo.setSelectedItem("");
            klinikCom.setText("");
            dogTarihField.setText("");
            mailField.setText("");
            telNumField.setText("");
            sifrePass.setText("");
            sifrePass2.setText("");
            JOptionPane.showMessageDialog(jPanel2,"Veri başarı ile silindi.");
                
            }else{
                JOptionPane.showMessageDialog(jPanel2,"Girilen T.C. kimlik nuamarası bulunamadı.","Veri Bulunamadı",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(jPanel2,"Veritabınında bir hata ile karşılaşıldı.","Bilinmeyen Hata",JOptionPane.ERROR_MESSAGE);
        }
        }else{
            JOptionPane.showMessageDialog(jPanel2,"T.C. Kimlik Numarası Boş Geçilemez.","Veri Hatası",JOptionPane.ERROR_MESSAGE);
        }        
        mysql.connectionClose();//bağlantı kapandı
    }//GEN-LAST:event_dokSilButonActionPerformed

    private void dokGuncelleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokGuncelleButonActionPerformed
        // doktor güncelle butonuna basıldığında
        MYSQLDB mysql = new MYSQLDB();
        mysql.connectionOpen();//bağlantı aç
        ResultSet myRs;
        String gecici = tcField.getText();
        if(!StringUtils.isBlank(gecici)){
             doktor.setTc(tcField.getText());    
             myRs= mysql.veriGetir(" doktor WHERE tc_numarası='"+doktor.getTc()+"'");
        try {
            if(myRs.next()){//girilen id veritabanında varsa girilen verileri güncelle         
            doktor.setAd(adField.getText());
            doktor.setSoyad(soyadField.getText());
            doktor.setCinsiyet(String.valueOf(cinCombo.getSelectedItem()));            
            doktor.setDogumTarihi(dogTarihField.getText());
            doktor.setTelefonNum(telNumField.getText());
            doktor.setMaii(mailField.getText());
            ResultSet myRs2= mysql.veriGetir("klinik WHERE klinik_ad='"+klinikCom.getText()+"'");//bu kısa kod parçacığında
            try {//ilişkili olan tablolarımız yardımıyla kliniğin idsine ulaştık
                while(myRs2.next()){
                    doktor.setBransID(myRs2.getInt("klinik_id"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(islemForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            doktor.setSifre(String.valueOf(sifrePass.getPassword()));
            mysql.update("doktor","tc_numarası='"+doktor.getTc()+"',ad='"+doktor.getAd() + "', soyad='"+doktor.getSoyad()+"', cinsiyet='"+doktor.getCinsiyet()+"',dogum_tarihi='"+doktor.getDogumTarihi()+"', telefon='"+doktor.getTelefonNum()+"', mail='"+doktor.getMaii()+"', sifre='"+doktor.getSifre()+"', brans_id="+doktor.getBransID()+" WHERE tc_numarası='"+doktor.getTc()+"'");
            tcField.setText("");
            adField.setText("");
            soyadField.setText("");
            cinCombo.setSelectedItem("");
            klinikCom.setText("");
            dogTarihField.setText("");
            mailField.setText("");
            telNumField.setText("");
            sifrePass.setText("");
            sifrePass2.setText("");
            JOptionPane.showMessageDialog(jPanel2,"Veri başarı ile güncellendi.");
                
            }else{
                JOptionPane.showMessageDialog(jPanel2,"Girilen T.C. kimlik numarası bulunamadı.","Veri Bulunamadı",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(jPanel2,"Veritabınında bir hata ile karşılaşıldı.","Bilinmeyen Hata",JOptionPane.ERROR_MESSAGE);
        }
        }else{
            JOptionPane.showMessageDialog(jPanel2,"T.C. Kimlik Numarası Boş Geçilemez.","Veri Hatası",JOptionPane.ERROR_MESSAGE);
        }
        mysql.connectionClose();//bağlantı kapandı 
    }//GEN-LAST:event_dokGuncelleButonActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(islemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(islemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(islemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(islemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new islemForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TCLabel;
    private javax.swing.JLabel TCLabel1;
    private javax.swing.JTextField adField;
    private javax.swing.JLabel adLabel;
    private javax.swing.JLabel baslık;
    private javax.swing.JLabel bransTextLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cinCombo;
    private javax.swing.JLabel cinsiyetLabel;
    private javax.swing.JTextField dogTarihField;
    private javax.swing.JLabel dogumTarihiLabel;
    private javax.swing.JButton dokAraButon;
    private javax.swing.JButton dokEkleButon;
    private javax.swing.JButton dokGuncelleButon;
    private javax.swing.JButton dokSilButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField kAdAraField;
    private javax.swing.JLabel klinikAdLabel;
    private javax.swing.JTextField klinikCom;
    private javax.swing.JButton klinikEkleButon;
    private javax.swing.JButton klinikGuncelleButon;
    private javax.swing.JTextField klnkAdField;
    private javax.swing.JButton klnkAraButon;
    private javax.swing.JLabel klnkIDTEXT;
    private javax.swing.JButton klnkSilButon;
    private javax.swing.JTextField knkIDField;
    private javax.swing.JTextField mailField;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JLabel sifreLabel;
    private javax.swing.JPasswordField sifrePass;
    private javax.swing.JPasswordField sifrePass2;
    private javax.swing.JLabel sifreTekrarLabel;
    private javax.swing.JTextField soyadField;
    private javax.swing.JLabel soyadLabel;
    private javax.swing.JTextField tcAra;
    private javax.swing.JTextField tcField;
    private javax.swing.JTextField telNumField;
    private javax.swing.JLabel telNumLabel;
    // End of variables declaration//GEN-END:variables
}
