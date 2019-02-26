/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosyalMedyaIsAlanlariTakip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ömer Faruk KAAN
 */
public class arkadaslar extends javax.swing.JFrame {

    /**
     * Creates new form arkadaslar
     */
    String aktifKullanici;
    Connection c;
    Statement s;
    ResultSet rs;

    DefaultTableModel arkadaslar = new DefaultTableModel();
    String[] baslik = {"İsim", "Soyisim", "İletişim", "E-Posta", "Meslek"};

    public arkadaslar(String k) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        button_arkadasliktanCikar.setEnabled(false);

        aktifKullanici = k;

        table_arkadaslar.setModel(arkadaslar);
        arkadaslar.setColumnIdentifiers(baslik);

        try {
            c = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            s = c.createStatement();
            rs = s.executeQuery("SELECT * FROM KULLANICI_ARAKADAS WHERE EPOSTA_EKLEYEN= '"+aktifKullanici+"'");
            while (rs.next()) {
                
                    Vector v = new Vector();
                    v.add(rs.getString("AD"));
                    v.add(rs.getString("SOYAD"));
                    v.add(rs.getString("TELEFON"));
                    v.add(rs.getString("EPOSTA"));
                    v.add(rs.getString("MESLEK"));
                    arkadaslar.addRow(v);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(arkadaslar.class.getName()).log(Level.SEVERE, null, ex);
        }

//        for (Kullanici kullanici : aktifKullanici.arkadaslar) {
//            Vector v = new Vector();
//            v.add(kullanici.ad);
//            v.add(kullanici.soyad);
//            v.add(kullanici.iletisimNo);
//            v.add(kullanici.ePosta);
//            v.add(kullanici.meslek);
//            arkadaslar.addRow(v);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_arkadaslar = new javax.swing.JTable();
        button_arkadasliktanCikar = new javax.swing.JButton();
        lbl_sosyalMeslek = new javax.swing.JLabel();
        lbl_isAra = new javax.swing.JLabel();
        button_anaSayfa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_arkadaslar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_arkadaslar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_arkadaslarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_arkadaslar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 540, 275));

        button_arkadasliktanCikar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        button_arkadasliktanCikar.setText("Arkadaşlıktan Çıkar");
        button_arkadasliktanCikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_arkadasliktanCikarActionPerformed(evt);
            }
        });
        getContentPane().add(button_arkadasliktanCikar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 210, 70));

        lbl_sosyalMeslek.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_sosyalMeslek.setText("SOSYAL M.İ.A.T.");
        getContentPane().add(lbl_sosyalMeslek, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lbl_isAra.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lbl_isAra.setText("İş Arkadaşları");
        getContentPane().add(lbl_isAra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        button_anaSayfa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        button_anaSayfa.setText("< Ana Sayfa >");
        button_anaSayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_anaSayfaActionPerformed(evt);
            }
        });
        getContentPane().add(button_anaSayfa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 210, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_arkadasliktanCikarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_arkadasliktanCikarActionPerformed
        // TODO add your handling code here:
//        for (Kullanici kullanici : aktifKullanici.arkadaslar) {
//            if (kullanici.ePosta.equals(arkadaslar.getValueAt(table_arkadaslar.getSelectedRow(), 3))) {
//                aktifKullanici.arkadaslar.remove(kullanici);
//                arkadaslar.removeRow(table_arkadaslar.getSelectedRow());
//                break;
//            }
//        }
    }//GEN-LAST:event_button_arkadasliktanCikarActionPerformed

    private void button_anaSayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_anaSayfaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_button_anaSayfaActionPerformed

    private void table_arkadaslarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_arkadaslarMouseClicked
        // TODO add your handling code here:
        button_arkadasliktanCikar.setEnabled(true);
    }//GEN-LAST:event_table_arkadaslarMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(arkadaslar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(arkadaslar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(arkadaslar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(arkadaslar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new arkadaslar(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_anaSayfa;
    private javax.swing.JButton button_arkadasliktanCikar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_isAra;
    private javax.swing.JLabel lbl_sosyalMeslek;
    private javax.swing.JTable table_arkadaslar;
    // End of variables declaration//GEN-END:variables
}