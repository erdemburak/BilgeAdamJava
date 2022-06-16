package com.bilgeadam.soyut;

public class Yonet {

    public static void main(String[] args) {

        Ucgen ucg = new Ucgen();
        Kare kr = new Kare();

        System.out.println("Üçgen : " + ucg.alanBul());
        System.out.println("Kare : " + kr.alanBul());

        System.out.println("Üçgen alanı : " + ucg.alanBul(10,5));
        System.out.println("Kare alanı : " + kr.alanBul(10,10));

        SoyutKavramlar sk = new SoyutKavramlar() {
            @Override
            public int alanBul() {
                return 200;
            }
            @Override
            public double alanBul(double yukseklik, double taban) {
                return 100d;
            }
        };
        System.out.println("Sk bilgi : " + sk.alanBul());
        System.out.println("Sk bilgi : " + sk.alanBul(0,0));
    }
}
