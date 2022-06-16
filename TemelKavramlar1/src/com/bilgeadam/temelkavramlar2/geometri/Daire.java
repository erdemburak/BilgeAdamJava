package com.bilgeadam.temelkavramlar2.geometri;


public class Daire {
    private final double PI = 3.14;
    private int yariCap;
    private double daireninAlani;

    public Daire(){
        System.out.println("Daire sınıfı oluşturuldu.");
    }

    public Daire(int yariCap){
        this.yariCap = yariCap;
        System.out.println("Parametrik kurucu method çalıştı.");

        //Dairenin alanı hesaplandı.
        setDaireninAlani(PI * yariCap * yariCap);
    }

    public int getYariCap() {
        return yariCap;
    }

    public void setYariCap(int yariCap) {
        this.yariCap = yariCap;
    }

    public double getDaireninAlani() {
        return daireninAlani;
    }

    public void setDaireninAlani(double daireninAlani) {
        this.daireninAlani = daireninAlani;
    }

    public double getPI() {
        return PI;
    }

}

