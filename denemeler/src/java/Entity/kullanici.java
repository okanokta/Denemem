package Entity;

import java.sql.Timestamp;

/**
 *
 * @author oktao
 */
public class kullanici {

    private int kullaniciid;
    private String kuladi;
    private String sifre;
    private String adi;
    private String soyadi;
    private String mail;
    private Timestamp tarih;

    public kullanici() {
    }

    public kullanici(int kullaniciid, String kuladi, String sifre, String adi, String soyadi, String mail, Timestamp tarih) {
        this.kullaniciid = kullaniciid;
        this.kuladi = kuladi;
        this.sifre = sifre;
        this.adi = adi;
        this.soyadi = soyadi;
        this.mail = mail;
        this.tarih = tarih;
    }

    public kullanici(String kuladi, String sifre, String adi, String soyadi, String mail) {
        this.kuladi = kuladi;
        this.sifre = sifre;
        this.adi = adi;
        this.soyadi = soyadi;
        this.mail = mail;
    }

    public int getKullaniciid() {
        return kullaniciid;
    }

    public void setKullaniciid(int kullaniciid) {
        this.kullaniciid = kullaniciid;
    }

    public String getKuladi() {
        return kuladi;
    }

    public void setKuladi(String kuladi) {
        this.kuladi = kuladi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Timestamp getTarih() {
        return tarih;
    }

    public void setTarih(Timestamp tarih) {
        this.tarih = tarih;
    }

}
