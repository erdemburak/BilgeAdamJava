package com.bilgeadam;

public class HataKontrolu {
    private static void bolme(){
        try{ // İçindeki kodu dene, bir arıza çıkarsa yakala !

            int sayi1 = 5;
            int sayi2 = 0;

            int sonuc = sayi1 / sayi2;
        } catch (ArithmeticException e){
            System.out.println("Aritmetik hata oluştu ! Ayrıntısı : " + e.getMessage());
            throw e;
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Hata oluştu ! Devam Et");
        }
    }

    private static void araciMethod(){
        try{
            bolme();
        }catch (Exception e){
            System.out.println("bolme methodunda hata oluştu !");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            araciMethod();
            System.out.println("Bölme işlemi yapıldı");
        }catch (Exception e){
            System.out.println("İşlemde hata oluştu");
        }
    }
}
