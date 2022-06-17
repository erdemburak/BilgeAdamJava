package com.bilgeadam.uygulama;

public class YediKirk extends Bmw implements SunRoofOzelligi {

    public YediKirk() {
        super();
        setModel(BmwModel.YEDIKIRK);
    }
    @Override
    public void sunRoofAc() {
        System.out.println("Yedi kırk SunRoof Açıldı !");
    }
    @Override
    public void sunRoofKapat() {
        System.out.println("Yedi kırk SunRoof Kapatıldı");
    }
    public void tipGuvenligiOrnegi(Bmw ozellik) {
        System.out.println("Bilgi Ver:");
        ozellik.arabayiCalistir();
        ozellik.camlariAc();
    }

	/*
	public void tipGuvenligiOrnegi(YediKirk ozellik) {
		System.out.println("Bilgi Ver:");
		ozellik.sunRoofAc();
		ozellik.sunRoofKapat();
	}

	public void tipGuvenligiOrnegi(BesYirmi ozellik) {
		System.out.println("Bilgi Ver:");
		ozellik.sunRoofAc();
		ozellik.sunRoofKapat();
	}*/

}
