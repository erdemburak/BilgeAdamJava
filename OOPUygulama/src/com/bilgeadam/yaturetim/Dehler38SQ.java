package com.bilgeadam.yaturetim;

public class Dehler38SQ extends Dehler implements OtoLimanYanasma {

    public Dehler38SQ(){
        super(DehlerModeller.DEHLER38SQ);
    }

    @Override
    public void sualtiAydinlatmaAc() {
        System.out.println("Su altı lazer ışıklandırma açılıyor!");
    }
    @Override
    public void sualtiAydinlatmaKapat() {
        System.out.println("Su altı lazer ışıklandırma kapatılıyor!");
    }
    @Override
    public void otomatikOlarakLimanaYanas() {
        System.out.println("Torniston motorları ile yan yanaş");
    }
}
