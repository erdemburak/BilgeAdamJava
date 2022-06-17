package com.bilgeadam.yaturetim;

public class Hanse460 extends Hanse implements IOtoLimanYanasma {

    public Hanse460() {
        super(HanseModeller.HANSE460);
    }
    @Override
    public void guneslenmeHoluAc() {
        System.out.println("Hol açılıyor!");
    }

    @Override
    public void guneslenmeHoluKapat() {
        System.out.println("Hol kapanıyor!");
    }

    @Override
    public void otomatikOlarakLimanaYanas() {
        System.out.println("Pruva motorları ile yan yanaş !");
    }
}
