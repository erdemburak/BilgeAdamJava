package com.bilgeadam.hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    private static int islem;
    private static int sayi1;
    private static int sayi2;

    private static int topla(){
        return sayi1+sayi2;
    }
    private static int cikar(){
        return sayi1-sayi2;
    }
    private static int carp(){
        return sayi1*sayi2;
    }
    private static double bol(){
        return (double) sayi1/sayi2;
    }

    private static void sayilariAl(){
        System.out.println("***********************");
        System.out.print("* Sayı 1 : ");
        Scanner input = new Scanner(System.in);

        if(input.hasNext()){
            int giris = input.nextInt();
            sayi1 = giris;
        }
        System.out.print("* Sayi 2 : ");
        if (input.hasNext()){
            int giris = input.nextInt();
            sayi2 = giris;
        }

        switch (islem) {
            case 1://Toplama
                System.out.println("***********************");
                System.out.println("Sonuc : " + topla());
                break;
            case 2://Çıkarma
                System.out.println("***********************");
                System.out.println("Sonuc : " + cikar());
                break;
            case 3://Çarpma
                System.out.println("***********************");
                System.out.println("Sonuc : " + carp());
                break;
            case 4://Bölme
                System.out.println("***********************");
                System.out.println("Sonuc : " + bol());
                break;

        }
    }


    private static void anaMenu(){
        System.out.println("***********************");
        System.out.println("* Hesap Makinesi ******");
        System.out.println("* 1- Topla");
        System.out.println("* 2- Çıkar");
        System.out.println("* 3- Çarp");
        System.out.println("* 4- Böl");
        System.out.println("* 5- Çıkış Yap");
        System.out.println("***********************");
        System.out.print("* Seçiminiz : ");
        girisAl();
    }

    private static void girisAl(){
        int giris = 0;
        Scanner input = new Scanner(System.in);

        while (input.hasNext()){
            giris = input.nextInt();

            switch (giris){
                case 1://Toplama
                    break;
                case 2://Çıkarma
                    break;
                case 3://Çarpma
                    break;
                case 4://Bölme
                    break;
                case 5://Çıkış Yap
                    break;
                default:
                    System.out.println("Lütfen listedekilerden birini seçiniz !");
                    System.out.println("***************************************");
                    System.out.print("* İşlem no : ");
                    girisAl();
                    break;
            }
            islem = giris;
            if(giris == 5){
                System.out.println("Çıkış yapıldı ! ");
                break;
            }
            sayilariAl();
            break;
        }
        if(giris!=5){
            anaMenu();
        }
    }

    public static void main(String[] args) {
        anaMenu();
    }


}
