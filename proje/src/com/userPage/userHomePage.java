package com.userPage;

import com.classes.DOKTOR;
import com.classes.HASTA;
import com.classes.KLINIK;
import com.classes.RANDEVU;
import com.databes.MYSQLDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.commons.lang.StringUtils;


public class userHomePage extends javax.swing.JFrame {
    public static  String deger;//diğer pageden gelen tc kimlik bilgisi
    HASTA hasta = new HASTA();
    RANDEVU randevu = new RANDEVU();
    String klinik_degeri="";
    String doktor_adı="";
    public userHomePage(String gelen) {
        deger = gelen;
        this.setLocationRelativeTo(null);//ekranda tam ortada olması sağlandı
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        baslık = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tarihText = new javax.swing.JLabel();
        saatText = new javax.swing.JLabel();
        saatField = new javax.swing.JTextField();
        tarihField = new javax.swing.JTextField();
        randevuAlButon = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        klinikList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        dokList = new javax.swing.JList<>();
        klinikSecButon = new javax.swing.JButton();
        doklisteButon = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        TCLabel = new javax.swing.JLabel();
        adLabel = new javax.swing.JLabel();
        soyadLabel = new javax.swing.JLabel();
        cinsiyetLabel = new javax.swing.JLabel();
        dogumYeriLabel = new javax.swing.JLabel();
        dogumTarihiLabel = new javax.swing.JLabel();
        anaAdıLabel = new javax.swing.JLabel();
        babaAdıLabel = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        telNumLabel = new javax.swing.JLabel();
        sifreLabel = new javax.swing.JLabel();
        tcField = new javax.swing.JTextField();
        adField = new javax.swing.JTextField();
        soyadField = new javax.swing.JTextField();
        cinsiyetCombobox = new javax.swing.JComboBox<>();
        dYerField = new javax.swing.JTextField();
        dTarihField = new javax.swing.JTextField();
        anaAdıField = new javax.swing.JTextField();
        babaAdıField = new javax.swing.JTextField();
        mailField = new javax.swing.JTextField();
        telNumField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        guncelleButon = new javax.swing.JButton();
        bilGetirButon = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        ranListeleButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(129, 207, 224));

        baslık.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        baslık.setForeground(new java.awt.Color(46, 49, 49));
        baslık.setText("Merisa Hastanesi");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(46, 49, 49));
        jLabel1.setText("Kullanıcı Arayüz");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(baslık, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(376, 376, 376))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(430, 430, 430))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(baslık)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 240));
        jPanel3.setForeground(new java.awt.Color(255, 255, 204));

        tarihText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tarihText.setForeground(new java.awt.Color(49, 49, 49));
        tarihText.setText("Randevu Tarihi");

        saatText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        saatText.setForeground(new java.awt.Color(49, 49, 49));
        saatText.setText("Randevu Saati");

        randevuAlButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        randevuAlButon.setForeground(new java.awt.Color(49, 49, 49));
        randevuAlButon.setText("Randevu Al");
        randevuAlButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randevuAlButonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(49, 49, 49));
        jLabel3.setText("Randevu Al");

        klinikList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Klinik Seçin" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        klinikList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                klinikListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(klinikList);

        dokList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Doktor Seçin" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        dokList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                dokListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(dokList);

        klinikSecButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        klinikSecButon.setForeground(new java.awt.Color(49, 49, 49));
        klinikSecButon.setText("Klinik Listele");
        klinikSecButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klinikSecButonActionPerformed(evt);
            }
        });

        doklisteButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        doklisteButon.setForeground(new java.awt.Color(49, 49, 49));
        doklisteButon.setText("Doktor Listele");
        doklisteButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doklisteButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(klinikSecButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(doklisteButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saatText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tarihText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(randevuAlButon, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(saatField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                            .addComponent(tarihField))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(doklisteButon)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tarihField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tarihText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(saatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(saatText))
                                .addGap(18, 18, 18)
                                .addComponent(randevuAlButon)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(klinikSecButon)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(255, 250, 250));

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

        dogumYeriLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        dogumYeriLabel.setForeground(new java.awt.Color(46, 49, 49));
        dogumYeriLabel.setText("Doğum Yeri");

        dogumTarihiLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        dogumTarihiLabel.setForeground(new java.awt.Color(46, 49, 49));
        dogumTarihiLabel.setText("Doğum Tarihi");

        anaAdıLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        anaAdıLabel.setForeground(new java.awt.Color(46, 49, 49));
        anaAdıLabel.setText("Ana Adı");

        babaAdıLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        babaAdıLabel.setForeground(new java.awt.Color(46, 49, 49));
        babaAdıLabel.setText("Baba Adı");

        mailLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        mailLabel.setForeground(new java.awt.Color(46, 49, 49));
        mailLabel.setText("E-posta Adresi");

        telNumLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        telNumLabel.setForeground(new java.awt.Color(46, 49, 49));
        telNumLabel.setText("Telefon Numarası");

        sifreLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        sifreLabel.setForeground(new java.awt.Color(46, 49, 49));
        sifreLabel.setText("Şifre");

        tcField.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        tcField.setForeground(new java.awt.Color(46, 49, 49));

        adField.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        adField.setForeground(new java.awt.Color(46, 49, 49));

        soyadField.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        soyadField.setForeground(new java.awt.Color(46, 49, 49));

        cinsiyetCombobox.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        cinsiyetCombobox.setForeground(new java.awt.Color(46, 49, 49));
        cinsiyetCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kadın", "Erkek" }));

        dYerField.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        dYerField.setForeground(new java.awt.Color(46, 49, 49));

        anaAdıField.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        anaAdıField.setForeground(new java.awt.Color(46, 49, 49));

        babaAdıField.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        babaAdıField.setForeground(new java.awt.Color(46, 49, 49));

        mailField.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        mailField.setForeground(new java.awt.Color(46, 49, 49));

        telNumField.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        telNumField.setForeground(new java.awt.Color(46, 49, 49));

        guncelleButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        guncelleButon.setForeground(new java.awt.Color(46, 49, 49));
        guncelleButon.setText("Hesap Bilgilerini Güncelle");
        guncelleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleButonActionPerformed(evt);
            }
        });

        bilGetirButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        bilGetirButon.setForeground(new java.awt.Color(46, 46, 46));
        bilGetirButon.setText("Bilgilerimi Getir");
        bilGetirButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilGetirButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TCLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinsiyetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogumYeriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anaAdıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(babaAdıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogumTarihiLabel)
                    .addComponent(mailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(guncelleButon, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(tcField)
                    .addComponent(adField)
                    .addComponent(soyadField)
                    .addComponent(cinsiyetCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dYerField)
                    .addComponent(anaAdıField)
                    .addComponent(babaAdıField)
                    .addComponent(mailField)
                    .addComponent(telNumField)
                    .addComponent(passwordField)
                    .addComponent(dTarihField)
                    .addComponent(bilGetirButon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adLabel))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soyadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soyadLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cinsiyetCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinsiyetLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dYerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogumYeriLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dTarihField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogumTarihiLabel))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anaAdıField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anaAdıLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(babaAdıField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(babaAdıLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mailLabel)
                    .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telNumLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreLabel))
                .addGap(18, 18, 18)
                .addComponent(bilGetirButon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guncelleButon)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(49, 49, 49));
        jLabel2.setText("Randevularım");

        jScrollPane1.setViewportView(jList);

        ranListeleButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ranListeleButon.setForeground(new java.awt.Color(49, 49, 49));
        ranListeleButon.setText("Randevu Listele");
        ranListeleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ranListeleButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ranListeleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addComponent(ranListeleButon)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guncelleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButonActionPerformed
        // güncelle butonuna tıklandığında
        MYSQLDB mysql = new MYSQLDB();
        mysql.connectionOpen();//bağlantı aç
        ResultSet myRs;
        String gecici = tcField.getText();
        if(!StringUtils.isBlank(gecici)){
        hasta.setTc(tcField.getText());
        hasta.setAd(adField.getText());
        hasta.setSoyad(soyadField.getText());
        hasta.setCinsiyet((String)cinsiyetCombobox.getSelectedItem());
        hasta.setDogumYeri(dYerField.getText());
        hasta.setDogumTarihi(dTarihField.getText());
        hasta.setAnaAdı(anaAdıField.getText());
        hasta.setBabaAdı(babaAdıField.getText());
        hasta.setTelefonNum(telNumField.getText());
        hasta.setMaii(mailField.getText());
        hasta.setSifre(String.valueOf(passwordField.getPassword()));
        myRs= mysql.veriGetir("hasta WHERE tc_numarası='"+hasta.getTc()+"'");
        try {
            if(myRs.next()){//girilen id veritabanında varsa girilen verileri güncelle
             //   mysql.update("hasta","tc_numarası,ad,soyad,cinsiyet, dogum_yeri,dogum_tarihi,baba_adı,ana_adı,telefon,mail,sifre");
                mysql.update("hasta"," tc_numarası='"+hasta.getTc()+"',ad='"+hasta.getAd() + "', soyad='"+hasta.getSoyad()+"', cinsiyet='"+hasta.getCinsiyet()+"',dogum_yeri='"+hasta.getDogumYeri()+"',dogum_tarihi='"+hasta.getDogumTarihi()+"',baba_adı='"+hasta.getBabaAdı()+"',ana_adı='"+hasta.getAnaAdı()+"',telefon='"+hasta.getTelefonNum()+"', mail='"+hasta.getMaii()+"', sifre='"+hasta.getSifre()+"' WHERE tc_numarası='"+hasta.getTc()+"'");
                //ekran temizlendi
                tcField.setText("");
                adField.setText("");
                soyadField.setText("");
                cinsiyetCombobox.setSelectedItem("");
                dYerField.setText("");
                dTarihField.setText("");
                anaAdıField.setText("");
                babaAdıField.setText("");
                telNumField.setText("");
                mailField.setText("");
                passwordField.setText("");  
                JOptionPane.showMessageDialog(jPanel3,"Bilgileriniz Başarı İle Güncellendi.");
                
            }else{
                JOptionPane.showMessageDialog(jPanel2,"Girilen T.C. kimlik numarası bulunamadı.","Veri Bulunamadı",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(jPanel2,"Veritabınında br hata ile karşılaşıldı.","Bilinmeyen Hata",JOptionPane.ERROR_MESSAGE);
        }
        }else{
            JOptionPane.showMessageDialog(jPanel3,"Klinik Id Boş Geçilemez.","Veri Hatası",JOptionPane.ERROR_MESSAGE);
        }
        mysql.connectionClose();//bağlantı kapandı        
    }//GEN-LAST:event_guncelleButonActionPerformed

    private void bilGetirButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilGetirButonActionPerformed
        // bilgilerimi getir butonuna basıldığında
        MYSQLDB mysql = new MYSQLDB();
        mysql.connectionOpen();//bağlantı aç
        ResultSet myRs;
        myRs = mysql.veriGetir("hasta"+" WHERE tc_numarası='"+deger+"'");
        try {
            while(myRs.next()){//veritabanından bilgileri aldık ve hasta sınıfından ürettilen nesneye atandı
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
                hasta.setSifre(myRs.getString("sifre"));  
            }
            //hasta nesnesinin değişkenleri ekrana yazdırıldı
            tcField.setText(hasta.getTc());
            adField.setText(hasta.getAd());
            soyadField.setText(hasta.getSoyad());
            cinsiyetCombobox.setSelectedItem(hasta.getCinsiyet());
            dYerField.setText(hasta.getDogumYeri());
            dTarihField.setText(hasta.getDogumTarihi());
            anaAdıField.setText(hasta.getAnaAdı());
            babaAdıField.setText(hasta.getBabaAdı());
            telNumField.setText(hasta.getTelefonNum());
            mailField.setText(hasta.getMaii());
            passwordField.setText(hasta.getSifre());  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jPanel2,"Veritabınında br hata ile karşılaşıldı.","Bilinmeyen Hata",JOptionPane.ERROR_MESSAGE);
        }
        mysql.connectionClose();//bağlantıyı kapattık
    }//GEN-LAST:event_bilGetirButonActionPerformed

    private void ranListeleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ranListeleButonActionPerformed
        // randevu listele butonuna basıldığında
        RANDEVU ran=new RANDEVU(); 
        HASTA has = new HASTA(); //has.setTc(deger);
        KLINIK klink = new KLINIK();
        DOKTOR dr = new DOKTOR();
        
        MYSQLDB mysql = new MYSQLDB();
        mysql.connectionOpen();//bağlantı açıldı
        ResultSet myRs;
        int id; String birlestir = "";
        DefaultListModel  model = new DefaultListModel ();
        myRs= mysql.veriGetir("hasta"+" WHERE tc_numarası='"+deger+"'");
        try {
            
            while(myRs.next()){
               System.out.println(deger);
                id=myRs.getInt("hasta_id");
                ResultSet myRs2;
                myRs2=mysql.veriGetir("randevu"+" WHERE hasta_id="+id);
                while(myRs2.next()){
                   
                    ran.setRandevuID(myRs2.getInt("randevu_id"));
                    ran.setDoktorID(myRs2.getInt("doktor_id"));
                    ran.setHastaID(myRs2.getInt("hasta_id"));
                    ran.setKlinikID(myRs2.getInt("klinik_id"));
                    ran.setRandevuTarihi(myRs2.getString("randevu_tarihi"));
                    ran.setRandevuSaati(myRs2.getString("randevu_saati"));
                    ResultSet myRs3;
                    myRs3=mysql.veriGetir("doktor WHERE brans_id="+ran.getKlinikID()); 
                    while(myRs3.next()){
                        dr.setAd(myRs3.getString("ad"));
                        dr.setSoyad(myRs3.getString("soyad"));
                        birlestir=dr.getAd()+" "+dr.getSoyad();
                        ResultSet myRs4;
                        myRs4=mysql.veriGetir("klinik WHERE klinik_id="+ran.getKlinikID());
                        while(myRs4.next()){
                            klink.setAd(myRs4.getString("klinik_ad"));
                            
                        }
                    }
                                                        
                    model.addElement("Doktor Adı");
                    model.addElement(birlestir);
                    model.addElement("Klinik");
                    model.addElement(klink.getAd());
                    model.addElement("Randevu Tarihi");
                    model.addElement(ran.getRandevuTarihi());
                    model.addElement("Randevu Saati");
                    model.addElement(ran.getRandevuSaati());
                    model.addElement("-------------------------------");
                    jList.setModel(model);
                }
            }
            mysql.connectionClose();//bağlantı kapatıldı
        } catch (SQLException ex) {
            Logger.getLogger(userHomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ranListeleButonActionPerformed

    private void randevuAlButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randevuAlButonActionPerformed
        // randevu al butonu
        int hasta_id =0; int doktor_id=0; int klinik_id =0; String[] ayır = doktor_adı.split(" ");
        if(!StringUtils.isBlank(klinik_degeri) && !StringUtils.isBlank(doktor_adı) && !StringUtils.isBlank(tarihField.getText()) && !StringUtils.isBlank(saatField.getText()) ){
            MYSQLDB mysql = new MYSQLDB();
            mysql.connectionOpen();
            ResultSet myRs = mysql.veriGetir("hasta WHERE tc_numarası='"+deger+"'");
            System.out.println(ayır[0]+ayır[1]);
            ResultSet myRs2 = mysql.veriGetir("doktor WHERE ad='"+ayır[0]+"' && soyad='"+ayır[1]+"'");
            //ResultSet myRs3 = mysql.veriGetir("klinik WHERE klinik_ad='"+klinik_degeri+"'");
            try {
                while(myRs.next()){
                    hasta_id=myRs.getInt("hasta_id");
                }
                while(myRs2.next()){
                    doktor_id = myRs2.getInt("doktor_id");
                    klinik_id =myRs2.getInt("brans_id");
                }
            mysql.add("randevu","doktor_id, hasta_id,klinik_id,randevu_tarihi,randevu_saati"," VALUES("+doktor_id+","+hasta_id+","+klinik_id+",'"+tarihField.getText()+"','"+ saatField.getText() + "')");
           // klinikList.setSelectedIn
            JOptionPane.showMessageDialog(jPanel3,"Randevu Oluşturuldu");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(jPanel3,"Veritabınında br hata ile karşılaşıldı.","Bilinmeyen Hata",JOptionPane.ERROR_MESSAGE);
            }
            mysql.connectionClose();
        }
        else{
           JOptionPane.showMessageDialog(jPanel3,"Verileri Eksiksiz Giriniz!","Bilinmeyen Hata",JOptionPane.ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_randevuAlButonActionPerformed

    private void klinikListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_klinikListValueChanged
        klinik_degeri=klinikList.getSelectedValue();
    }//GEN-LAST:event_klinikListValueChanged

    private void klinikSecButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klinikSecButonActionPerformed
        // klinik listele
        DefaultListModel  model = new DefaultListModel ();
        ArrayList<String> karsıla = new ArrayList<String>();
        karsıla=randevu.getir();
        for(int i =1; i<karsıla.size(); i+=2){
            model.addElement(karsıla.get(i));
        }
        klinikList.setModel(model);
    }//GEN-LAST:event_klinikSecButonActionPerformed

    private void doklisteButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doklisteButonActionPerformed
        // doktor listele
        if(!StringUtils.isBlank(klinik_degeri)){
        MYSQLDB mysql = new MYSQLDB();
        mysql.connectionOpen();
        int klinik_id=0;
        ResultSet myRs = mysql.veriGetir("klinik"+" WHERE klinik_ad='"+klinik_degeri+"'");
        try {
            while(myRs.next()){
                klinik_id=myRs.getInt("klinik_id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(userHomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultListModel  model = new DefaultListModel ();
        ArrayList<String> karsıla = new ArrayList<String>();
        karsıla=randevu.getir(klinik_id);
        for(int i =0; i<karsıla.size(); i++){
            model.addElement(karsıla.get(i));
        }
        dokList.setModel(model);
        mysql.connectionClose();//bağlantı kapatıldı
        }else{
            JOptionPane.showMessageDialog(jPanel3,"Öncelikle Kliniği Seçiniz!");
        }
    }//GEN-LAST:event_doklisteButonActionPerformed

    private void dokListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_dokListValueChanged
        doktor_adı=dokList.getSelectedValue();
    }//GEN-LAST:event_dokListValueChanged

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
            java.util.logging.Logger.getLogger(userHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userHomePage(deger).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TCLabel;
    private javax.swing.JTextField adField;
    private javax.swing.JLabel adLabel;
    private javax.swing.JTextField anaAdıField;
    private javax.swing.JLabel anaAdıLabel;
    private javax.swing.JTextField babaAdıField;
    private javax.swing.JLabel babaAdıLabel;
    private javax.swing.JLabel baslık;
    private javax.swing.JButton bilGetirButon;
    private javax.swing.JComboBox<String> cinsiyetCombobox;
    private javax.swing.JLabel cinsiyetLabel;
    private javax.swing.JTextField dTarihField;
    private javax.swing.JTextField dYerField;
    private javax.swing.JLabel dogumTarihiLabel;
    private javax.swing.JLabel dogumYeriLabel;
    private javax.swing.JList<String> dokList;
    private javax.swing.JButton doklisteButon;
    private javax.swing.JButton guncelleButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> klinikList;
    private javax.swing.JButton klinikSecButon;
    private javax.swing.JTextField mailField;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton ranListeleButon;
    private javax.swing.JButton randevuAlButon;
    private javax.swing.JTextField saatField;
    private javax.swing.JLabel saatText;
    private javax.swing.JLabel sifreLabel;
    private javax.swing.JTextField soyadField;
    private javax.swing.JLabel soyadLabel;
    private javax.swing.JTextField tarihField;
    private javax.swing.JLabel tarihText;
    private javax.swing.JTextField tcField;
    private javax.swing.JTextField telNumField;
    private javax.swing.JLabel telNumLabel;
    // End of variables declaration//GEN-END:variables

}
