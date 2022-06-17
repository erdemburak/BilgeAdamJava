package com.bilgeadam.polymorphism;

/**
 * Kısıtlandırılmış nesneye DTO denir.
 * (Data Transfer Object)
 */
public class KisitlandirilmisNesneDto {
    private String email;
    private String departman;
    private String adres;

    public KisitlandirilmisNesneDto() {

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

    @Override
    public String toString() {
        String veri = "Email:"+ email+" Departman:"+ departman+ "  Adres: "+ adres;
        return veri;
    }
}
