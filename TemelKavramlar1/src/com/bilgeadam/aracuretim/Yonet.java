package com.bilgeadam.aracuretim;

import com.bilgeadam.aracuretim.nesneler.Araba;

public class Yonet {
    public static void main(String[] args) {

        Araba[] arabalar = new Araba[3];

        Araba bmw = new Araba();
        bmw.setAgirlik(2000.0f);
        bmw.setHp(200);
        bmw.setKasaTipi("Sedan");
        bmw.setMarka("BMW");
        bmw.setModel("3.20d");
        bmw.setMotorHacmi(2);
        bmw.setRenk("Parlement Mavi");
        bmw.setTork(320);
        bmw.setYakitTuru("Dizel");

        Araba audi = new Araba();
        audi.setAgirlik(2000.0f);
        audi.setHp(200);
        audi.setKasaTipi("Sedan");
        audi.setMarka("audi");
        audi.setModel("3.20d");
        audi.setMotorHacmi(2);
        audi.setRenk("Parlement Mavi");
        audi.setTork(320);
        audi.setYakitTuru("Dizel");

        Araba mercedes = new Araba();
        mercedes.setAgirlik(2000.0f);
        mercedes.setHp(200);
        mercedes.setKasaTipi("Sedan");
        mercedes.setMarka("Mercedes");
        mercedes.setModel("3.20d");
        mercedes.setMotorHacmi(2);
        mercedes.setRenk("Parlement Mavi");
        mercedes.setTork(320);
        mercedes.setYakitTuru("Dizel");
        arabalar[0] = bmw;
        arabalar[1] = audi;
        arabalar[2] = mercedes;

        new Yonet().araclariYazdir(arabalar);
    }

    private void araclariYazdir(Araba[]  arabalar) {

        Araba arac = arabalar[0];
        System.out.println("BMW Aracı:"+ arac.getMarka() + " -- "  + arac.getRenk());

        arac = arabalar[1];
        System.out.println("Audi Aracı:"+ arac.getMarka() + " -- "  + arac.getRenk());

        arac = arabalar[2];
        System.out.println("Mercedes Aracı:"+ arac.getMarka() + " -- "  + arac.getRenk());


		/*
		for(int i=0; i<3; i++) {
			arabalar[i];
		}
		*/
    }
}