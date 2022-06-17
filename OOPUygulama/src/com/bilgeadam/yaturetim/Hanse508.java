package com.bilgeadam.yaturetim;

public class Hanse508 extends Hanse{

    public Hanse508() {
        super(HanseModeller.HANSE508);
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
