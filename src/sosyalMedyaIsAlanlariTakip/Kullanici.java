/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosyalMedyaIsAlanlariTakip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ömer Faruk KAAN
 */
public class Kullanici {

    Connection c;
    PreparedStatement s;
    String ePosta, ad, soyad, meslek, iletisimNo, sektor;
    private String sifre;

    
//    ArrayList<Kullanici> arkadaslar;

    public Kullanici(String ad, String soyad, String ePosta, String sifre, String sektor, String meslek, String iletisimNo) {
        
        try {
            c = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            s = c.prepareStatement("INSERT INTO KULLANICI(EPOSTA,AD,SOYAD,MESLEK,TELEFON,SEKTOR,SIFRE) VALUES(?,?,?,?,?,?,?)");
            s.setString(1, ePosta);
            s.setString(2, ad);
            s.setString(3, soyad);
            s.setString(4, meslek);
            s.setInt(5, Integer.parseInt(iletisimNo));
            s.setString(6, sektor);
            s.setString(7, sifre);
            s.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Kullanici.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    String getSifre(Kullanici kullanici) {
        return kullanici.sifre;
    }

    void setSifre(Kullanici kullanici, String yeniSifre) {
        kullanici.sifre = yeniSifre;
    }
}
