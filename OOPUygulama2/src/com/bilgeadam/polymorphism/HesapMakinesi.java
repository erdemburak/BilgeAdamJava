package com.bilgeadam.polymorphism;

public class HesapMakinesi {

    private IslemSinifi islem;

    public HesapMakinesi(){
        islem = new IslemSinifi();
    }

    public void verilenSayilariTopla(int sayi1, int sayi2){
        System.out.println("Toplama sonucu : " + islem.topla(sayi1,sayi2));
    }

}
