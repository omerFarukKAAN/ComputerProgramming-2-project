/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosyalMedyaIsAlanlariTakip;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ömer Faruk KAAN
 */
@Entity
@Table(name = "KULLANICI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kullanici_1.findAll", query = "SELECT k FROM Kullanici_1 k"),
    @NamedQuery(name = "Kullanici_1.findByEposta", query = "SELECT k FROM Kullanici_1 k WHERE k.eposta = :eposta"),
    @NamedQuery(name = "Kullanici_1.findByAd", query = "SELECT k FROM Kullanici_1 k WHERE k.ad = :ad"),
    @NamedQuery(name = "Kullanici_1.findBySoyad", query = "SELECT k FROM Kullanici_1 k WHERE k.soyad = :soyad"),
    @NamedQuery(name = "Kullanici_1.findByMeslek", query = "SELECT k FROM Kullanici_1 k WHERE k.meslek = :meslek"),
    @NamedQuery(name = "Kullanici_1.findByTelefon", query = "SELECT k FROM Kullanici_1 k WHERE k.telefon = :telefon"),
    @NamedQuery(name = "Kullanici_1.findBySektor", query = "SELECT k FROM Kullanici_1 k WHERE k.sektor = :sektor"),
    @NamedQuery(name = "Kullanici_1.findBySifre", query = "SELECT k FROM Kullanici_1 k WHERE k.sifre = :sifre")})
public class Kullanici_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EPOSTA")
    private String eposta;
    @Column(name = "AD")
    private String ad;
    @Column(name = "SOYAD")
    private String soyad;
    @Column(name = "MESLEK")
    private String meslek;
    @Column(name = "TELEFON")
    private Integer telefon;
    @Column(name = "SEKTOR")
    private String sektor;
    @Column(name = "SIFRE")
    private String sifre;

    public Kullanici_1() {
    }

    public Kullanici_1(String eposta) {
        this.eposta = eposta;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }

    public String getSektor() {
        return sektor;
    }

    public void setSektor(String sektor) {
        this.sektor = sektor;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eposta != null ? eposta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kullanici_1)) {
            return false;
        }
        Kullanici_1 other = (Kullanici_1) object;
        if ((this.eposta == null && other.eposta != null) || (this.eposta != null && !this.eposta.equals(other.eposta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sosyalMedyaIsAlanlariTakip.Kullanici_1[ eposta=" + eposta + " ]";
    }
    
}
