package com.bilgeadam.polymorphism;

public class Yonet {
    public Yonet(){

    }

    public static void main(String[] args) {
        UstSinif nesne = new AltSinifA();
        //nesne.merhaba();
        selamVer(nesne);
        nesne = new AltSinifB();
        selamVer(nesne);
        nesne = new AltSinifC();
        selamVer(nesne);

        nesne = new UstSinif() {
            @Override
            public void soyutMethod() {
                System.out.println("Soyut Method çalıştı");
            }
        };
        selamVer(nesne);

        nesne = new EnAltSinifA();
        selamVer(nesne);

        /*Bu işlem hatalıdır.
        AltSinifA deneme = new UstSinif();*/

        AltSinifA altsinifA = new AltSinifA();
        mesajCalistir(altsinifA);

        IFonksiyonelInterface altSinifAInterfaceIle = new AltSinifA();
        mesajCalistir(altSinifAInterfaceIle);
    }

    //Loose Coupling Gevşek-Bağlı kullanım yöntemi
    //UstSınıfı miras alan her alt sınıf bu methodu kullanabilir.
    private static void selamVer(UstSinif nesne) {
        nesne.merhaba();
        nesne.soyutMethod();
    }

    private static void mesajCalistir(IFonksiyonelInterface nesne) {
        nesne.mesajVer();
        nesne.islemYap();
    }
}
