package com.bilgeadam.yaturetim;

public class Dehler46SQ extends Dehler {

    public Dehler46SQ(){
        super(DehlerModeller.DEHLER46SQ);
    }

    @Override
    public void sualtiAydinlatmaAc() {
        System.out.println("Su altı lazer ışıklandırma açılıyor!");
    }
    @Override
    public void sualtiAydinlatmaKapat() {
        System.out.println("Su altı lazer ışıklandırma kapatılıyor!");
    }
}
