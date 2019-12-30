package com.userPage;

import com.classes.HASTA;
import javax.swing.JFrame;
import com.databes.MYSQLDB;
import java.sql.Date;
import static java.sql.JDBCType.DATE;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
//import java.util.Date;
public class registerForm extends javax.swing.JFrame {

    public registerForm() {
        initComponents();
        this.setLocationRelativeTo(null);//ekranda tam ortada olması sağlandı
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        baslık = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TCLabel = new javax.swing.JLabel();
        soyadLabel = new javax.swing.JLabel();
        babaAdıLabel = new javax.swing.JLabel();
        dogumTarihiLabel = new javax.swing.JLabel();
        dogumYeriLabel = new javax.swing.JLabel();
        cinsiyetLabel = new javax.swing.JLabel();
        adLabel = new javax.swing.JLabel();
        sifreLabel = new javax.swing.JLabel();
        anaAdıLabel = new javax.swing.JLabel();
        telNumLabel = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        sifreTekrarLabel = new javax.swing.JLabel();
        tcField = new javax.swing.JTextField();
        adField = new javax.swing.JTextField();
        soyadField = new javax.swing.JTextField();
        cinsiyetCombobox = new javax.swing.JComboBox<>();
        dYerField = new javax.swing.JTextField();
        anaAdıField = new javax.swing.JTextField();
        babaAdıField = new javax.swing.JTextField();
        mailField = new javax.swing.JTextField();
        telNumField = new javax.swing.JTextField();
        kayıtOlButon = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        passwordField2 = new javax.swing.JPasswordField();
        dTarihField = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(129, 207, 224));

        baslık.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        baslık.setForeground(new java.awt.Color(46, 49, 49));
        baslık.setText("Merisa Hastanesi");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(46, 49, 49));
        jLabel1.setText("Hasta Yeni Kayıt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(baslık, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(123, 123, 123))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(baslık)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(243, 241, 239));

        TCLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TCLabel.setForeground(new java.awt.Color(46, 49, 49));
        TCLabel.setText("T.C. Kimlik Numarası");

        soyadLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        soyadLabel.setForeground(new java.awt.Color(46, 49, 49));
        soyadLabel.setText("Soyad");

        babaAdıLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        babaAdıLabel.setForeground(new java.awt.Color(46, 49, 49));
        babaAdıLabel.setText("Baba Adı");

        dogumTarihiLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        dogumTarihiLabel.setForeground(new java.awt.Color(46, 49, 49));
        dogumTarihiLabel.setText("Doğum Tarihi");

        dogumYeriLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        dogumYeriLabel.setForeground(new java.awt.Color(46, 49, 49));
        dogumYeriLabel.setText("Doğum Yeri");

        cinsiyetLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cinsiyetLabel.setForeground(new java.awt.Color(46, 49, 49));
        cinsiyetLabel.setText("Cinsiyet");

        adLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        adLabel.setForeground(new java.awt.Color(46, 49, 49));
        adLabel.setText("Ad");

        sifreLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        sifreLabel.setForeground(new java.awt.Color(46, 49, 49));
        sifreLabel.setText("Şifre");

        anaAdıLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        anaAdıLabel.setForeground(new java.awt.Color(46, 49, 49));
        anaAdıLabel.setText("Ana Adı");

        telNumLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        telNumLabel.setForeground(new java.awt.Color(46, 49, 49));
        telNumLabel.setText("Telefon Numarası");

        mailLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        mailLabel.setForeground(new java.awt.Color(46, 49, 49));
        mailLabel.setText("E-posta Adresi");

        sifreTekrarLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        sifreTekrarLabel.setForeground(new java.awt.Color(46, 49, 49));
        sifreTekrarLabel.setText("Şifre Tekrar");

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

        kayıtOlButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        kayıtOlButon.setForeground(new java.awt.Color(46, 49, 49));
        kayıtOlButon.setText("Kayıt Ol");
        kayıtOlButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayıtOlButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
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
                    .addComponent(telNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreTekrarLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kayıtOlButon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcField)
                    .addComponent(adField)
                    .addComponent(soyadField)
                    .addComponent(cinsiyetCombobox, 0, 198, Short.MAX_VALUE)
                    .addComponent(dYerField)
                    .addComponent(anaAdıField)
                    .addComponent(babaAdıField)
                    .addComponent(mailField)
                    .addComponent(telNumField)
                    .addComponent(passwordField)
                    .addComponent(passwordField2)
                    .addComponent(dTarihField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TCLabel)
                    .addComponent(tcField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adLabel)
                    .addComponent(adField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soyadLabel)
                    .addComponent(soyadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cinsiyetLabel)
                    .addComponent(cinsiyetCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dogumYeriLabel)
                    .addComponent(dYerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dogumTarihiLabel)
                    .addComponent(dTarihField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anaAdıLabel)
                    .addComponent(anaAdıField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(babaAdıLabel)
                    .addComponent(babaAdıField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telNumLabel)
                    .addComponent(telNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifreLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifreTekrarLabel)
                    .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(kayıtOlButon)
                .addGap(0, 48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kayıtOlButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayıtOlButonActionPerformed
        //kayıt ol butonuna tıklandığında
        MYSQLDB mysql = new MYSQLDB();//sınıfımızdan nesne oluşturduk
        mysql.connectionOpen();//bağlantıyı açtık
        HASTA hasta = new HASTA();//hasta sınıfından nesne ürettik
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
        String sql_sorgusu="tc_numarası,ad,soyad,cinsiyet, dogum_yeri,dogum_tarihi,baba_adı,ana_adı,telefon,mail,sifre";
        String degerler=" VALUES ("+hasta.getTc()+",'"+hasta.getAd()+"','"+hasta.getSoyad()+"','"+hasta.getCinsiyet()+"','"+hasta.getDogumYeri()+"','"+hasta.getDogumTarihi()+"','"+hasta.getBabaAdı()+"','"+hasta.getAnaAdı()+"','"+hasta.getTelefonNum()+"','"+hasta.getMaii()+"','"+hasta.getSifre()+"')";
        mysql.add("hasta",sql_sorgusu,degerler);//veri ekledik
        JOptionPane.showMessageDialog(jPanel2,"Kaydınız başarı ile oluşturuldu.");
        mysql.connectionClose();//bağlantıyı kapattık
    }//GEN-LAST:event_kayıtOlButonActionPerformed

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
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerForm().setVisible(true);
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
    private javax.swing.JComboBox<String> cinsiyetCombobox;
    private javax.swing.JLabel cinsiyetLabel;
    private javax.swing.JTextField dTarihField;
    private javax.swing.JTextField dYerField;
    private javax.swing.JLabel dogumTarihiLabel;
    private javax.swing.JLabel dogumYeriLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton kayıtOlButon;
    private javax.swing.JTextField mailField;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JLabel sifreLabel;
    private javax.swing.JLabel sifreTekrarLabel;
    private javax.swing.JTextField soyadField;
    private javax.swing.JLabel soyadLabel;
    private javax.swing.JTextField tcField;
    private javax.swing.JTextField telNumField;
    private javax.swing.JLabel telNumLabel;
    // End of variables declaration//GEN-END:variables
}
