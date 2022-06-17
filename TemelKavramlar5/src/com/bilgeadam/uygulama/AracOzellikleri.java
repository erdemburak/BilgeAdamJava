package com.bilgeadam.uygulama;
import java.util.Date;
public abstract class AracOzellikleri {

    //Non-functional nitelikler
    // Markalar ENUM olarak tanımlandı. Default marka BMW belirlendi.
    private Markalar markaAdi = Markalar.BMW;
    private Renk aracRengi = Renk.BEYAZ;
    private String jantBoyutu = JantBoyutu.ONYEDIINC;
    private Date uretimTarihi;
    private int agirlik;
    private int guc;
    private int motorHacmi;

    //functional nitelikler
    public final void arabayiCalistir(){
        System.out.printf("%s çalıştırıldı!", this.markaAdi);
    }
    public final void camlariAc() {
        System.out.printf("%s camları açıldı!",this.markaAdi);
    }

    //BMW ve MERCEDES te iki farklı tip cam temizleme yöntemi var
    public abstract void onCamiTemizle();
    public abstract void koltuklariIsit();

    public Markalar getMarkaAdi() {
        return markaAdi;
    }
    public void setMarkaAdi(Markalar markaAdi) {
        this.markaAdi = markaAdi;
    }
    public Renk getAracRengi() {
        return aracRengi;
    }
    public void setAracRengi(Renk aracRengi) {
        this.aracRengi = aracRengi;
    }
    public String getJantBoyutu() {
        return jantBoyutu;
    }
    public void setJantBoyutu(String jantBoyutu) {
        this.jantBoyutu = jantBoyutu;
    }
    public Date getUretimTarihi() {
        return uretimTarihi;
    }
    public void setUretimTarihi(Date uretimTarihi) {
        this.uretimTarihi = uretimTarihi;
    }
    public int getAgirlik() {
        return agirlik;
    }
    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }
    public int getGuc() {
        return guc;
    }
    public void setGuc(int guc) {
        this.guc = guc;
    }
    public int getMotorHacmi() {
        return motorHacmi;
    }
    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }
}
