package com.uretimfabrikasi.model;

public class A180 extends Mercedes implements IOtomatikGeriGorusKamerasi {

    public A180() {
        super(ARABA_KASA_TIPI.HBACK);
    }

    @Override
    public void koltukSogutmaAc() {
        System.out.println("Koltuk soğutma açıldı!");

    }

    @Override
    public void koltukSogutmaKapat() {

        System.out.println("Koltuk soğutma kapat");

    }

    @Override
    public void kamerayiAc() {

        System.out.println("Kamera AÇıldı !");

    }

    @Override
    public void aydinlikOraninaGoreGoruntuyuDuzenle() {

        System.out.println("Işık oranına göre düzenlendi !");

    }

    @Override
    public void kamerayiKapat() {
        System.out.println("Kamera Kapatıldı !");
    }





}
