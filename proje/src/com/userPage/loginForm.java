package com.userPage;

import javax.swing.JFrame;
import com.databes.MYSQLDB;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class loginForm extends javax.swing.JFrame {

    public static  String deger;//tc kimlik numarasını diğer pagemize taşıyacak değişken oluşturuldu
    public loginForm() {
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
        tcField = new javax.swing.JTextField();
        sifreField = new javax.swing.JPasswordField();
        sifreBaslık = new javax.swing.JLabel();
        hGirisButon = new javax.swing.JButton();
        hKayıtButon = new javax.swing.JButton();
        aGirisButon = new javax.swing.JButton();
        tcBaslık = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(243, 241, 239));

        jPanel1.setBackground(new java.awt.Color(129, 207, 224));

        baslık.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        baslık.setForeground(new java.awt.Color(46, 49, 49));
        baslık.setText("Merisa Hastanesi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(353, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(baslık)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(baslık, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(243, 241, 239));

        sifreBaslık.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        sifreBaslık.setForeground(new java.awt.Color(46, 49, 49));
        sifreBaslık.setText("Şifre");

        hGirisButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        hGirisButon.setForeground(new java.awt.Color(46, 49, 49));
        hGirisButon.setText("Hasta Giriş");
        hGirisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hGirisButonActionPerformed(evt);
            }
        });

        hKayıtButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        hKayıtButon.setForeground(new java.awt.Color(46, 49, 49));
        hKayıtButon.setText("Hasta Kayıt Ol");
        hKayıtButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hKayıtButonActionPerformed(evt);
            }
        });

        aGirisButon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        aGirisButon.setForeground(new java.awt.Color(46, 49, 49));
        aGirisButon.setText("Admin Girişi");
        aGirisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aGirisButonActionPerformed(evt);
            }
        });

        tcBaslık.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tcBaslık.setForeground(new java.awt.Color(46, 49, 49));
        tcBaslık.setText("T.C. Kimlik Numarası");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tcBaslık)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tcField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(sifreBaslık)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sifreField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aGirisButon, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hGirisButon, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hKayıtButon, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcBaslık))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreBaslık))
                .addGap(26, 26, 26)
                .addComponent(hGirisButon)
                .addGap(18, 18, 18)
                .addComponent(hKayıtButon)
                .addGap(18, 18, 18)
                .addComponent(aGirisButon)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void hKayıtButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hKayıtButonActionPerformed
        //hasta kayıt ola tıkladığında
        registerForm reg = new registerForm();
        reg.setVisible(true);
    }//GEN-LAST:event_hKayıtButonActionPerformed

    private void aGirisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aGirisButonActionPerformed
        //admin giriş tuşuna basıldığında
        String tc =tcField.getText();
        String sifre = String.valueOf(sifreField.getPassword());
        MYSQLDB mysql = new MYSQLDB();
        mysql.connectionOpen();//bağlantı açıldı
        ResultSet myRs= mysql.veriGetir(" yönetici WHERE admin_TC='"+tc+"' AND admin_sifre='"+sifre+"'");
        try {
            if(myRs.next()){
                adminForm adForm = new adminForm();
                adForm.setVisible(true);
                //adForm.
            }else{
                JOptionPane.showMessageDialog(jPanel2,"T.C. Kimlik Numarası Veya Şifre Hatalı.","Hatalı Giriş",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(jPanel2,"Veritabınında bir hata ile karşılaşıldı.","Bilinmeyen Hata",JOptionPane.ERROR_MESSAGE);
        }
        mysql.connectionClose();//bağlantı kapandı
        
    }//GEN-LAST:event_aGirisButonActionPerformed

    private void hGirisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hGirisButonActionPerformed
        //hasta giriş butonuna tıklandığında
        String tc =tcField.getText();
        String sifre = String.valueOf(sifreField.getPassword());
        MYSQLDB mysql = new MYSQLDB();
        mysql.connectionOpen();//bağlantı açıldı
        ResultSet myRs= mysql.veriGetir(" hasta WHERE tc_numarası='"+tc+"' AND sifre='"+sifre+"'");
        try {
            if(myRs.next()){
                userHomePage user = new userHomePage(tc);
                user.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(jPanel2,"T.C. Kimlik Numarası Veya Şifre Hatalı.","Hatalı Giriş",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(jPanel2,"Bilinmeyen bir hata ile karşılaşıldı.","Bilinmeyen Hata",JOptionPane.ERROR_MESSAGE);
        }
        mysql.connectionClose();//bağlantı kapandı
    }//GEN-LAST:event_hGirisButonActionPerformed

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aGirisButon;
    private javax.swing.JLabel baslık;
    private javax.swing.JButton hGirisButon;
    private javax.swing.JButton hKayıtButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel sifreBaslık;
    private javax.swing.JPasswordField sifreField;
    private javax.swing.JLabel tcBaslık;
    private javax.swing.JTextField tcField;
    // End of variables declaration//GEN-END:variables
}
