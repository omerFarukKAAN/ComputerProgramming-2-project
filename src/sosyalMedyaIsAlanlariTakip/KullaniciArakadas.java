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
@Table(name = "KULLANICI_ARAKADAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KullaniciArakadas.findAll", query = "SELECT k FROM KullaniciArakadas k"),
    @NamedQuery(name = "KullaniciArakadas.findByEpostaEkleyen", query = "SELECT k FROM KullaniciArakadas k WHERE k.epostaEkleyen = :epostaEkleyen"),
    @NamedQuery(name = "KullaniciArakadas.findByEposta", query = "SELECT k FROM KullaniciArakadas k WHERE k.eposta = :eposta"),
    @NamedQuery(name = "KullaniciArakadas.findByAd", query = "SELECT k FROM KullaniciArakadas k WHERE k.ad = :ad"),
    @NamedQuery(name = "KullaniciArakadas.findBySoyad", query = "SELECT k FROM KullaniciArakadas k WHERE k.soyad = :soyad"),
    @NamedQuery(name = "KullaniciArakadas.findBySektor", query = "SELECT k FROM KullaniciArakadas k WHERE k.sektor = :sektor"),
    @NamedQuery(name = "KullaniciArakadas.findByMeslek", query = "SELECT k FROM KullaniciArakadas k WHERE k.meslek = :meslek"),
    @NamedQuery(name = "KullaniciArakadas.findByTelefon", query = "SELECT k FROM KullaniciArakadas k WHERE k.telefon = :telefon")})
public class KullaniciArakadas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "EPOSTA_EKLEYEN")
    private String epostaEkleyen;
    @Id
    @Basic(optional = false)
    @Column(name = "EPOSTA")
    private String eposta;
    @Column(name = "AD")
    private String ad;
    @Column(name = "SOYAD")
    private String soyad;
    @Column(name = "SEKTOR")
    private String sektor;
    @Column(name = "MESLEK")
    private String meslek;
    @Column(name = "TELEFON")
    private Integer telefon;

    public KullaniciArakadas() {
    }

    public KullaniciArakadas(String eposta) {
        this.eposta = eposta;
    }

    public String getEpostaEkleyen() {
        return epostaEkleyen;
    }

    public void setEpostaEkleyen(String epostaEkleyen) {
        this.epostaEkleyen = epostaEkleyen;
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

    public String getSektor() {
        return sektor;
    }

    public void setSektor(String sektor) {
        this.sektor = sektor;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eposta != null ? eposta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KullaniciArakadas)) {
            return false;
        }
        KullaniciArakadas other = (KullaniciArakadas) object;
        if ((this.eposta == null && other.eposta != null) || (this.eposta != null && !this.eposta.equals(other.eposta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sosyalMedyaIsAlanlariTakip.KullaniciArakadas[ eposta=" + eposta + " ]";
    }
    
}
