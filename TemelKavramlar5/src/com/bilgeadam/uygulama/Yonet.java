package com.bilgeadam.uygulama;

import java.util.Date;

public final class Yonet {
    static UcYirmi[] ucYirmiDizisi = new UcYirmi[20];
    static BesYirmi[] besYirmiDizisi = new BesYirmi[20];

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            //Araç üretimi yapalım
            UcYirmi bmw = new UcYirmi();
            bmw.setAgirlik(2000);
            bmw.setAracRengi(i%2==0 ? Renk.BEYAZ:Renk.KIRMIZI);
            bmw.setGuc(300);
            bmw.setJantBoyutu(JantBoyutu.ONSEKIZINC);
            bmw.setMotorHacmi(2000);
            bmw.setUretimTarihi(new Date(2022, 3, 10));

            ucYirmiDizisi[i]= bmw;
        }

        for (UcYirmi arac : ucYirmiDizisi) {
            System.out.println("Araç Bilgileri:"+ arac.getAracRengi() + "--" +  arac.getMarkaAdi());
        }

        //Araç üretimi yapalım
        UcYirmi bmw = new UcYirmi();
        bmw.setAgirlik(2000);
        bmw.setAracRengi(Renk.KIRMIZI);
        bmw.setGuc(300);
        bmw.setJantBoyutu(JantBoyutu.ONSEKIZINC);
        bmw.setMotorHacmi(2000);
        bmw.setUretimTarihi(new Date(2022, 3, 10));

        System
                .out.
                printf("Aracın Markası: %s, modeli: %s",
                        bmw.getMarkaAdi(), bmw.getModel());

        for (int i = 0; i < 20; i++) {
            BesYirmi bmw1 = new BesYirmi();
            bmw1.setAgirlik(2000);
            bmw1.setAracRengi(Renk.BEYAZ);
            bmw1.setGuc(300);
            bmw1.setJantBoyutu(JantBoyutu.ONYEDIINC);
            bmw1.setMotorHacmi(2000);
            bmw1.setUretimTarihi(new Date(2022, 3, 11));

            besYirmiDizisi[i]=bmw1;
        }

        BesYirmi bmw1 = new BesYirmi();
        bmw1.setAgirlik(2000);
        bmw1.setAracRengi(Renk.BEYAZ);
        bmw1.setGuc(300);
        bmw1.setJantBoyutu(JantBoyutu.ONYEDIINC);
        bmw1.setMotorHacmi(2000);
        bmw1.setUretimTarihi(new Date(2022, 3, 11));

        System
                .out.
                printf("Aracın Markası: %s, modeli: %s",
                        bmw1.getMarkaAdi(), bmw1.getModel());

        YediKirk bmw2 = new YediKirk();
        bmw2.setAgirlik(2200);
        bmw2.setAracRengi(Renk.SIYAH);
        bmw2.setGuc(250);
        bmw2.setJantBoyutu(JantBoyutu.ONDOKUZINC);
        bmw2.setMotorHacmi(2000);
        bmw2.setUretimTarihi(new Date(2022, 3, 12));

        System
                .out.
                printf("Aracın Markası: %s, modeli: %s",
                        bmw2.getMarkaAdi(), bmw2.getModel());

        //Bu kullanım örneği typeSafety özellik sağlar
        //Loose Coupling niteliği taşımaktadır.
        bmw2.tipGuvenligiOrnegi(bmw2);
        bmw2.tipGuvenligiOrnegi(new BesYirmi());
    }
}
