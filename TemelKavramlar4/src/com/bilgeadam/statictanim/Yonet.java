package com.bilgeadam.statictanim;

public class Yonet {
    public static void main(String[] args) {

        DegerTutucu.sayac=0;//Static method ve sınıfa nesne adını doğrudan kullanrak erişebilirsiniz !

        DegerTutucu.sayacArt();//Method da kullanım örneği

        DegerTutucu  dt1 = new DegerTutucu();
        dt1.veri=0;
        dt1.sayac=1;

        System.out.println("Bilgi:"+DegerTutucu.sayac);

        DegerTutucu  dt2 = new DegerTutucu();
        dt2.veri=1;
        dt2.sayac=8;

        DegerTutucu.sayacArt();

        System.out.println("Bilgi:"+DegerTutucu.sayac);

        System.out.println("Sayac Değeri ="+ DegerTutucu.sayac);
        System.out.println("Veri bilgisi="+dt1.veri +"---"+ dt2.veri);

    }
}
