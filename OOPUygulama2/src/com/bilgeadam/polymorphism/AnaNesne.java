package com.bilgeadam.polymorphism;

public class AnaNesne {

    private String kullaniciAdi;
    private String sifre;
    private String tcNo;
    private float malVarligiToplami;
    private String email;
    private String departman;
    private String adres;

    public AnaNesne() {
        // TODO Auto-generated constructor stub
    }

    public KisitlandirilmisNesneDto kisitliNesneVer() {

        KisitlandirilmisNesneDto kn = new KisitlandirilmisNesneDto();
        kn.setAdres(this.adres);
        kn.setDepartman(this.departman);
        kn.setEmail(this.email);
        return kn;
    }

    public static void main(String[] args) {
        AnaNesne an = new AnaNesne();
        an.setAdres("Adres bilgisi");
        an.setDepartman("Mühendislik");
        an.setEmail("uzunsoy@yandex.com");
        an.setKullaniciAdi("uzunsoy");
        an.setMalVarligiToplami(90000000);
        an.setSifre("fsdgstjyurtyr");
        an.setTcNo("23454576477");

        an.bilgileriEmailYolla(an.kisitliNesneVer());
    }

    public void bilgileriEmailYolla(KisitlandirilmisNesneDto veri) {
        System.out.println("Bilgiler yollanıyor:"+ veri.getEmail());
        System.out.println("Tüm nesnedeki veriler "+ veri);
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }
    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
    public String getSifre() {
        return sifre;
    }
    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    public String getTcNo() {
        return tcNo;
    }
    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }
    public float getMalVarligiToplami() {
        return malVarligiToplami;
    }
    public void setMalVarligiToplami(float malVarligiToplami) {
        this.malVarligiToplami = malVarligiToplami;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDepartman() {
        return departman;
    }
    public void setDepartman(String departman) {
        this.departman = departman;
    }
    public String getAdres() {
        return adres;
    }
    public void setAdres(String adres) {
        this.adres = adres;
    }
}
