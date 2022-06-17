package com.bilgeadam.yaturetim;

public class Dehler42 extends Dehler{

    public Dehler42() {
        super(DehlerModeller.DEHLER42);
    }
    @Override
    public void sualtiAydinlatmaAc() {
        System.out.println("Sualtı lazer ışıklarını aç !");
    }
    @Override
    public void sualtiAydinlatmaKapat() {
        System.out.println("Sualtı lazer ışıklarını kapat !");
    }
}
