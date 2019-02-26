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
public class Ilan {
    
    String sektor, meslek, tecrube, pozisyonTipi, iletisimNo;
    
//    static ArrayList<Ilan> bilisimIlanlari = new ArrayList<>();
//    static ArrayList<Ilan> eTicaretIlanlari = new ArrayList<>();
//    static ArrayList<Ilan> gidaIlanlari = new ArrayList<>();
//    static ArrayList<Ilan> insaatIlanlari = new ArrayList<>();
//    static ArrayList<Ilan> tekstilIlanlari = new ArrayList<>();

    Ilan(String sektor, String meslek, String tecrube, String pozisyonTipi, String iletisimNo){
        
        try {
            Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            PreparedStatement ps = c.prepareStatement("INSERT INTO IS_ILANLARI(SEKTOR,MESLEK,ILETISIM,TECRUBE,POZISYON_TIPI) VALUES(?,?,?,?,?)");
            ps.setString(1, sektor);
            ps.setString(2, meslek);
            ps.setString(3, iletisimNo);
            ps.setString(4, tecrube);
            ps.setString(5, pozisyonTipi);
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Ilan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
