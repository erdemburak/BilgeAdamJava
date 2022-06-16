package com.bilgeadam.aracuretim.nesneler;


/**
 * Araç üretimi için gerekli temel template.
 */
public class Araba {
    private String renk;
    private Float agirlik;
    private Integer hp;
    private Integer motorHacmi;
    private Integer tork;
    private String yakitTuru;
    private String marka;
    private String model;
    private String kasaTipi;

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
    public Float getAgirlik() {
        return agirlik;
    }
    public void setAgirlik(Float agirlik) {
        this.agirlik = agirlik;
    }
    public Integer getHp() {
        return hp;
    }
    public void setHp(Integer hp) {
        this.hp = hp;
    }
    public Integer getMotorHacmi() {
        return motorHacmi;
    }
    public void setMotorHacmi(Integer motorHacmi) {
        this.motorHacmi = motorHacmi;
    }
    public Integer getTork() {
        return tork;
    }
    public void setTork(Integer tork) {
        this.tork = tork;
    }
    public String getYakitTuru() {
        return yakitTuru;
    }
    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getKasaTipi() {
        return kasaTipi;
    }
    public void setKasaTipi(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }
}

