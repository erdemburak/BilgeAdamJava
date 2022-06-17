package com.bilgeadam.uygulama;

public class Bmw extends AracOzellikleri {
    private BmwModel model = BmwModel.UCYIRMI;
    public Bmw() {
        setMarkaAdi(Markalar.BMW);
    }
    @Override
    public void onCamiTemizle() {
        System.out.println("Cam suyunu ön kaputtan ön cama fışkırt!");
        System.out.println("Camları silecekler ile silmeye başla ve 5 kere sil");
    }
    @Override
    public void koltuklariIsit() {
        System.out.println("Koltuk ısıtma için akü kontrol ediliyor!");
        System.out.println("Akü uygun olduğu için koltuk ısıtılıyor !");
    }
    public BmwModel getModel() {
        return model;
    }
    public void setModel(BmwModel model) {
        this.model = model;
    }
}
