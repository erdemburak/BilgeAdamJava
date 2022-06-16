package com.bilgeadam.akislar;

public class AkislarSwitchCase {

    public static void main(String[] args) {

        int sayi = 1;

        switch (sayi) {
            case 0:
                System.out.println("Lütfen 0 tuşuna basınız !");
                break;
            case 1:
                System.out.println("Lütfen 1 tuşuna basınız !");
                break;
            default:
                System.out.println("Default mesaj");
        }

        switch (sayiDon()) {
            case 0:
                System.out.println("Lütfen 0 tuşuna basınız !");
                break;
            case 1:
                System.out.println("Lütfen 1 tuşuna basınız !");
                break;
            case 10:
                System.out.println("Lütfen 10 tuşuna basınız !");
                break;
            default:
                System.out.println("Default mesaj");
        }

        int sayi2 = 2;
        final Integer karesiSonuc = 4;

        switch (sayi2) {
            case 4:
                // Case önündeki sayı bir methoddan gelemez
                //final bir değişken ile temsil edilemez
                break;
            default:
                break;
        }
    }

    static Integer sayiDon() {
        return 10;
    }

    final static Integer karesi(Integer sayi) {
        return sayi*sayi;
    }

}
