package com.bilgeadam.yaturetim;

public abstract class Hanse extends YelkenliOrtakOzellikler {
    private HanseModeller model;

    public Hanse(){
        super(Marka.HANSE);
        // getMarka().getID(); Eğer buradan ID alırda bakarsak karşımıza 1 değeri gelir.
    }

    public Hanse(HanseModeller model){
        super(Marka.HANSE);
        this.model = model;
    }

    public abstract void guneslenmeHoluAc();
    public abstract void guneslenmeHoluKapat();

    public void yemekAlaniAc(){
        System.out.println("Yemek alanı açılıyor!");
    }
    public void yemekAlaniKapat(){
        System.out.println("Yemek alanı kapatılıyor!");
    }
}
