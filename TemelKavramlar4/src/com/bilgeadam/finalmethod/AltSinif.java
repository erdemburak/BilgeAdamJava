package com.bilgeadam.finalmethod;

public class AltSinif extends FinalMethod {
    /* mottoYaz methodu üst sınıfta final tanımlandığı için bu method yazılamaz.
    public void mottoYaz(){
        System.out.println("Motto!!!");
    }
    */

    @SuppressWarnings("static-access")
    public static void main(String[] args){
        MirasAlinamayanSinif.selamVer();

        MirasAlinamayanSinif mas = new MirasAlinamayanSinif();
        mas.selamVer();

    }

}
