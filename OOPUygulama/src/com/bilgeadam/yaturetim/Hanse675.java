package com.bilgeadam.yaturetim;

public class Hanse675 extends Hanse{

    public Hanse675() {
        super(HanseModeller.HANSE675);
    }
    @Override
    public void guneslenmeHoluAc() {
        System.out.println("Hol açılıyor!");
    }
    @Override
    public void guneslenmeHoluKapat() {
        System.out.println("Hol kapanıyor!");
    }
}
