package com.bilgeadam.yaturetim;

public class YelkenliOrtakOzellikler {
    // Sınıf üyeleri (Class members) en üstte yazılır ve private prefix'i ile sınırlandırılır.
    private Marka marka = Marka.DEHLER; // Bu alandaki atama sayesinde kurucu method bize ID değerine ilk veri olarak 2 atamasını sağlar.
    private int kamaraSayisi = 5;

    public YelkenliOrtakOzellikler(){
        System.out.println("Yelkenli oluşturuldu!");
    }

    public YelkenliOrtakOzellikler(Marka marka){
        this.marka = marka;
    }

    //Functional nitelikler her zaman kurucu methoddan sonra yazılır.

    /**
     * Tekne temizlenmektedir !
     */
    public void tekneyiTemizle(){
        System.out.println("Tekne temizleniyor!");
    }
    /**
     * Teknenin yelkenlerinin açılması sağlanacaktır.
     */
    public void yelkenleriAc(){
        System.out.println("Yelkenler açılıyor.");
    }
    /**
     * Teknenin yelkenlerinin kapanması sağlanacaktır.
     */
    public void yelkenleriKapat(){
        System.out.println("Yelkenler kapatılıyor.");
    }
    /**
     * Motorlar çalıştırılması için bir method
     */
    public void motorlariCalistir() {
        System.out.println("Motorlar çalışıtırılıyor !");
    }
    /**
     * Motorlar durdurulması için bir method
     */
    public void motorlariDurdur() {
        System.out.println("Motorlar durduruluyor !");
    }

    // GET ve SET proxy methodlar sınıfın en altında bulunur.


    public Marka getMarka() {
        return marka;
    }
    private void setMarka(Marka marka) {
        this.marka = marka;
    }
    public int getKamaraSayisi() {
        return kamaraSayisi;
    }
}
