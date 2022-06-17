package com.bilgeadam.uygulama;

public class BesYirmi extends Bmw implements SunRoofOzelligi {
    public BesYirmi() {
        super();
        setModel(BmwModel.BESYIRMI);
    }
    @Override
    public void sunRoofAc() {
        System.out.println("Beş yirmi sunroof açıldı.");
    }
    @Override
    public void sunRoofKapat() {
        System.out.println("Beş yirmi sun roof kapatıldı.");
    }
}