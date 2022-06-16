package com.bilgeadam.donguler;

import java.util.Formatter;

public class DongulerForDoWhile {
    public static void main(String[] args) throws InterruptedException {
        atla:{
            if(true) break atla;

            boolean durum = false;

            while (durum){
                System.out.println("While döngüsü içerisinde!");
                Thread.sleep(1000);
            }

            do{
                System.out.println("DoWhile döngüsü içerisinde!");
                Thread.sleep(1000);
            }while (durum);

            System.out.println("Döngüden çıktı");

            for(int i = 0; i<10; i++){
                System.out.println("Döngü " + i);
            }

            //Sonsuz Döngü
            for(;;){
                break ; //Sonsuz döngüyü kırar.
            }
            //Sonsuza kadar giden 5 er 5 er artan indexle döngü
            for(int i=0; true; i+=5){
                System.out.println("İndex : " + i);
                Thread.sleep(1000);
                break ;  // Sonsuz döngüyü kırar
            }

            //Koşulun sonucunu tersine çeviren ünlem(!) kullanımı
            for(int i = 0; kosulKontrolUnlem(i); i++){
                System.out.println("Ünlem ile kontrol methodlu for döngüsü " + i);
            }
            for(int i = 0; kosulKontrol(i); i++){
                 System.out.println("Kontrol methodlu for döngüsü " + i);
            }

            String[] yazilar = new String[2];
            yazilar[0] = "Merhaba";
            yazilar[1] = "Dünya";

            for(int i = 0; i<yazilar.length; i++){
                System.out.print(yazilar[i]);
            }
        }

        System.out.println("<------------------------------------->");
        System.out.format("Merhaba %s, Nasılsın?", "Burak");

        String[] isimler = {"Burak","Armağan","Erdem","Akyol"};

        for (String isim : isimler){
            System.out.println("");
            System.out.format("Merhaba %s, Nasılsın?!",isim);
        }

        System.out.println("<------------------------------------->");
        System.out.format("Değer : %f", 1267.6);

        double x = 47.8;

        System.out.printf("%1$5f", x);

        StringBuffer buffer = new StringBuffer();
        Formatter formatter = new Formatter(buffer);

        double sayi = 27.51234567;
        formatter.format("Sayi = %3.7g", sayi);

        System.out.println(buffer);
        System.out.println("Aşağı yuvarlama : " + Math.nextDown(sayi));
        System.out.printf("Çıktı örneği : %3.7g", 1452.456333d);

    }

    private static boolean kosulKontrol(int i) {
        if (i > 10)
            return false;
        return true;
    }

    private static boolean kosulKontrolUnlem(int i) {
        if (i < 10)
            return false;
        return true;
    }
}
