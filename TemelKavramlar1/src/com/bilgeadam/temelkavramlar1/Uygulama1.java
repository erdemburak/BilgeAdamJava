package com.bilgeadam.temelkavramlar1;

/**
 * BilgeAdam ile Java temel kavramlara başlıyoruz.
 */
public class Uygulama1 {

    /**
     * Değişmeyen sabitlerin tanımı UPPERCASE'dir.
     */
    private final float PI_SAYISI = 3.14f;

    //Class member
    private static String staticTextVeri = "Merhaba Dünya - Static veriden okundu!";

    /**
     * Static olmayan bir değişken oluşturulan her nesnede farklı tanımlanabilir.
     */
    private String textVeri = "Merhaba Dünya - Non-Static veriden okundu!";

    /**
     * Static bir değişken yaratılan tüm nesneler için aynı stack adresini kullanır.
     * Bu sayede bir referans tipinde değişen static bir alanın verisi, tüm referanslar için değişir.
     */
    private static int temelCarpanDegeri = 1;

    public static void main(String[] args) {

        Uygulama1 app1 = new Uygulama1();
        app1.textVeri = "Mesaj 1";
        app1.staticTextVeri = "Static Mesaj 1"; //Static Değişken
        System.out.println("Sonuc : " + (app1.temelCarpanDegeri * 5)); // Değişken static tanımlandığı için aynı class içinde direkt erişilebilir.

        app1.temelCarpanDegeri = 2; //Static Değişken

        Uygulama1 app2 = new Uygulama1();
        app2.textVeri = "Mesaj 2";
        app2.staticTextVeri = "Static Mesaj 2";//Static Değişken
        System.out.println("Sonuc : " + (app2.temelCarpanDegeri * 5));//Static Değişken

        Uygulama1 app3 = new Uygulama1();
        app3.merhabaMesaji();

        new Uygulama1().merhabaMesaji();
        String donenDeger = new Uygulama1().merhabaMesaji("Hoş Geldiniz!");
        System.out.println("Mesaj : " + donenDeger);

    }

    void merhabaMesaji(){
        System.out.println("Karşılama Mesajı");
    }

    String merhabaMesaji(String mesaj){
        return "Karşılama Mesajı : "+ mesaj;
    }
}
