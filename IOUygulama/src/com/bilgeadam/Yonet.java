package com.bilgeadam;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Yonet {

    private static void ornek1() throws Exception {
        InputStreamReader input = null;
        input = new InputStreamReader(System.in);

        System.out.println("q harfine basana kadar döngü devam eder !");
        char c;

        do {
            //1 sn bekle
            Thread.sleep(1000);
            System.out.println("Döngü devam ediyor!");
            c = (char) input.read();
        } while (c != 'q');
        input.close();
        System.out.println("Döngüden çıktı !");
    }

    private static void ornek2(){
        Scanner sc = new Scanner(System.in);
        double girilenVeri = sc.nextDouble();
        System.out.println("Girilen sayısal bilgi : " + girilenVeri);
    }

    private static void ornek3(){
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir metin giriniz : ");
        while (input.hasNext()){
            String str = input.next();
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        //ornek1();
        //ornek2();
        ornek3();
    }
}
