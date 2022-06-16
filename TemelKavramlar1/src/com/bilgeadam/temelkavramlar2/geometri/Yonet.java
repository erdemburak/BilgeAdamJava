package com.bilgeadam.temelkavramlar2.geometri;

public class Yonet {
    public static void main(String[] args) {
        float deger = 1.123456789f;
        double deger2 = 1.123456789123456789;

        System.out.println("Bilgi : " + deger);
        System.out.println("Bilgi : " + deger2);

        System.out.println("BigInteger Max : " + Long.MAX_VALUE);
        System.out.println("BigInteger Min : " + Long.MIN_VALUE);

        Daire nesne1 = new Daire();

        nesne1.setYariCap(2);
        double daireninAlani = nesne1.getPI() * nesne1.getYariCap() * nesne1.getYariCap();
        nesne1.setDaireninAlani(daireninAlani);

        System.out.println("Nesne1 dairesinin alanı : " + nesne1.getDaireninAlani());

        Daire nesne2 = new Daire();

        nesne2.setYariCap(4);
        double daireninAlani2 = nesne1.getPI() * nesne1.getYariCap() * nesne1.getYariCap();
        nesne1.setDaireninAlani(daireninAlani2);

        System.out.println("Nesne2 dairesinin alanı : " + nesne1.getDaireninAlani());

        Daire nesne3 = new Daire(10);

        System.out.println("Dairenin alanı :" + nesne3.getDaireninAlani());

    }

    //byte, short, int, long, float, double   soyut olarak Number sınıfından üretiliştir.
    // Byte, Short, Integer, Long, Float, Double,  = Wrapping

    //byte sayi1 = (byte) 255; //1 byte
    //short sayi2 = 32767;//2 byte
    //int   sayi3 = 2147483647; //4
    //long  sayi4 = 999999999999999999L;
    //float sayi5 = 1.123456789f;
    //double sayi6 = 1.123456789123456789d;
    //BigInteger sayi7;
    //BigDecimal sayi8;


}

