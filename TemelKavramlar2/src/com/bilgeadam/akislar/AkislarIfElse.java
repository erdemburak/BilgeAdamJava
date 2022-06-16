package com.bilgeadam.akislar;

import javafx.beans.binding.IntegerExpression;
import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

public class AkislarIfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1 ;
        int sayi2 ;

        System.out.println("Sayi1'i giriniz : ");
        sayi1 = input.nextInt();
        System.out.println("Sayi2'yi giriniz : ");
        sayi2 = input.nextInt();


        System.out.println("Koşula girmek üzere !");

        if (sayi1 > sayi2) {
            System.out.println("Sayi1 sayi2'den büyüktür !");
        } else if (sayi1 == sayi2) {
            System.out.println("Sayılar eşittir!");
        }else if(sayi1 < sayi2) {
            System.out.println("Sayi1 sayi2'den küçüktür.");
        } else {    // Oluşan tüm koşullar else öncesi ele alındığı için kör scope alanı oluşabilir.
            System.out.println("Koşul yanlıştır!");
        }

        System.out.println("Koşuldan çıktı !");

        System.out.println("<--------------------------------->");

        if (sayi1 > sayi2) {
            System.out.println("Sayi1 sayi2'den büyüktür !");
        }
        if (sayi1 == sayi2) {
            System.out.println("Sayılar eşittir!");
        }
        if(sayi1 < sayi2) {
            System.out.println("Sayi1 sayi2'den küçüktür.");
        }

        System.out.println("Ayrı koşul durumlarından çıktı !");

        if(kontrolMethod(sayi1, sayi2)) {
            System.out.println("Kontrol method ile aldığım yanıt TRUE !");
        }else {
            System.out.println("Kontrol method ile aldığım yanıt FALSE !");
        }

        if(kontrolMethodShortIf(sayi1, sayi2)) {
            System.out.println("Kontrol method ile aldığım yanıt TRUE !");
        }else {
            System.out.println("Kontrol method ile aldığım yanıt FALSE !");
        }

        boolean sonuc = sayi1>sayi2 ? true:false;
        boolean sonuc2 = sayi1>sayi2;


        String  mesaj = sayi1>sayi2 ? "Bu durumda Sayı1 Sayı2'den büyüktür!":"Bu durumda Sayı1 Sayı2'den küçüktür!";

        System.out.println("Bilgi:"+mesaj);


        if (sayi1 > sayi2) {
            System.out.println("Bu durumda sayi1 sayi2'den büyüktür.");
        }else {
            System.out.println("Bu durumda sayi1 sayi2'den küçüktür");
        }

        if(true)
            System.out.println("Sayı1 büyüktür sayı2'den *");
        else
            System.out.println("Sayı1 küçüktür sayı2'den *");
        System.out.println("Çalışma satırı");
    }

    static boolean kontrolMethod(Integer sayi1, Integer sayi2) {
        //Eğer sayi1 sayi2'den geriye true döner.
        if(sayi1 > sayi2) {
            return true;
        }
        //Aksi durumda default olarak false döner.
        return false;
    }

    static boolean kontrolMethodShortIf(Integer sayi1, Integer sayi2) {

        //short if durumu !
        //Burada iki sayı operant ile kıyaslanır ve sonuç otomatik olarak yaratılır.
        return sayi1>sayi2;
    }


}
