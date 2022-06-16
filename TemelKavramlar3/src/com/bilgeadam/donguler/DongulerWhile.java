package com.bilgeadam.donguler;

public class DongulerWhile {
    public static void main(String[] args) throws InterruptedException {
        int sayac = 0;
        int disSayac = 0;
        boolean kontrol = true;

        /**
         * While başındaki isim: Kırılması gereken döngünün adı, kod akış takibini kolay sağlamamız için koyuyoruz.
         */
        anaDongu: while(true){// Bu en dış döngü. İç döngünün devamlılığını sağlıyor.
            System.out.println("Ana döngü başladı !");
            sayac = 0;
            // Sonsuza kadar çalışma potansiyeli bulunur.
            dongu: while (true){
                Thread.sleep(1000); // Bu satır ile döngünün bu adımını 1sn bekletiyoruz.
                sayac++;

                if(sayac>3 && sayac<7)
                    continue;

                System.out.println("Döngü çalışıyor !" + sayac);

                if(sayac == 10){
                    System.out.println("Döngüden çıkıyor !");
                    break dongu;
                }
            }//iç while döngüsü bitişi
            Thread.sleep(1000);

            System.out.println("Dış döngü çalışma sayısı : " + disSayac);
            if(disSayac ==3)
                break anaDongu;

            disSayac++;
        }//Dış while döngüsü bitişi
        System.out.println("AnaDöngüden çıktı. Döngüler sonlandı!");

    }



}
