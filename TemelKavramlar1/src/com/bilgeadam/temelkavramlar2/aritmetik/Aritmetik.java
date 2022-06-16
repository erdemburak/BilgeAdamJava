package com.bilgeadam.temelkavramlar2.aritmetik;

public class Aritmetik {
    public static void main(String[] args) {
        int sayi1 = 161;
        int sayi2 = 4;
        int carpim = sayi1 * sayi2;
        int toplam = sayi1 + sayi2;
        int cikartma = sayi1 - sayi2;
        int bolme = sayi1 / sayi2;
        double bolme2 = (double) (sayi1/sayi2);
        double bolme3 = ((double) sayi1) / ((double) sayi2);

        System.out.println("Çarpım sonucu : " + carpim);
        System.out.println("Toplam sonucu : " + toplam);
        System.out.println("Çıkartma sonucu : " + cikartma);
        System.out.println("Bölme sonucu : " + bolme);
        System.out.println("Bölme2 sonucu : " + bolme2);
        System.out.println("Bölme3 sonucu : " + bolme3);

        int mod = sayi1 % sayi2; // Sayi1'in sayi2'ye bölümünden kalan.
        System.out.println("Mod : " + mod);

        //Sayı arttırma
        int sayi3 = 0;
        sayi3 = sayi3 + 1; //Sayıyı bir arttırmak için kullanmaktayız.
        sayi3++; //Sayıyı bir arttırmak için kullanmaktayız.
        sayi3--; //Sayıyı bir azaltmak için kullanmaktayız.

        System.out.println("Arttırma : " + sayi3);

        System.out.println("String işlemler ile matematik işlemlerinin kullanımı : " + 1 + 1);
        System.out.println("String işlemler ile matematik işlemlerinin kullanımı : " + (1 + 1));
        System.out.println("String işlemler ile matematik işlemlerinin kullanımı:" + 2 * 4);
        System.out.println("String işlemler ile matematik işlemlerinin kullanımı:" + 2 * 4 + 1);
        System.out.println("String işlemler ile matematik işlemlerinin kullanımı:" + (2 * 4 + 1));

        int x = 1;

        System.out.println("Operant 1:"+ (x++));// 1
        System.out.println("Operant 2:"+ (++x));// 2
    }
}