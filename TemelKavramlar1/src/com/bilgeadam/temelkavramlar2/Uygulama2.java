package com.bilgeadam.temelkavramlar2;


/**
 * Alternatif class ismi Uygulama1_Basliyor
 */
public class Uygulama2 {
    private String degiskenlerKucukHarfleBaslar;

    /**
     * Yazımdaki karmaşıklığa örnektir.
     */
    private String degiskenlerkucukharflebaslar;

    /**
     * Sabitlenmiş field
     */
    private final double PI = 3.1415;

    private static String islemBilgisiBulunur;

    public static void main(String[] args) {
        islemBilgisiBulunur = "";

        Uygulama2 nesne1 = new Uygulama2();
        Uygulama2 nesne2 = new Uygulama2();
        Uygulama2 nesne3 = new Uygulama2();

        System.out.println("Pi Sayısı : " + nesne1.PI);
        System.out.println("Pi Sayısı : " + nesne2.PI);
        System.out.println("Pi Sayısı : " + nesne3.PI);

    }

}
