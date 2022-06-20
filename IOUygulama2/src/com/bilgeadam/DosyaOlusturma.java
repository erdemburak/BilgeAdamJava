package com.bilgeadam;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DosyaOlusturma {
    private static String dosyaAdi;
    private static String konum;
    private static String icerik;

    private static void menuGoster() throws Exception {
        System.out.println("*****************************");
        System.out.println("* 1- Dosyaya veri girin");
        System.out.println("* 2- Programdan çıkın");
        System.out.println("*****************************");
        System.out.print("* Seçiniz:");
        menudenSecim();
    }

    private static void dosyayaYaz() throws Exception {

        Path yol = Paths.get(konum+"/"+dosyaAdi);
        Files.write(yol, icerik.getBytes(StandardCharsets.UTF_8));
        System.out.println("Dosya Kaydedildi !");
    }

    private static void dosyayaVeriGirisMenu() throws Exception {

        System.out.print("* Dosya Konumu:");
        Scanner giris = new Scanner(System.in);
        konum = giris.next();

        System.out.println("***************************");
        System.out.print("* Dosya Adı:"+konum+"/");
        giris = new Scanner(System.in);
        dosyaAdi = giris.next();

        System.out.print("* ["+konum+"/"+dosyaAdi+"]  Dosya İçeriği:");
        giris = new Scanner(System.in);
        icerik = giris.nextLine();

        dosyayaYaz();
        Thread.sleep(2000);
        menuGoster();
    }
    private static void menudenSecim() throws Exception {

        Scanner giris = new Scanner(System.in);
        int secim = giris.nextInt();

        if(secim !=1 && secim !=2) {
            System.out.println("Lütfen menüden seçiniz!");
            menuGoster();
        }else if(secim==1) {
            dosyayaVeriGirisMenu();
        }else if(secim==2) {
            System.out.println("Program kapatılmıştır !");
            giris.close();
            System.exit(0);
        }


    }
    public static void main(String[] args) throws Exception {
        menuGoster();
    }


}
