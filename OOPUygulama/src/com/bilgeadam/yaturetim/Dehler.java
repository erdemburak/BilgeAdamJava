package com.bilgeadam.yaturetim;

public abstract class Dehler extends YelkenliOrtakOzellikler {
    private DehlerModeller model;

    public Dehler(){
        super(Marka.DEHLER);
    }
    public Dehler(DehlerModeller model){
        super(Marka.DEHLER);
        this.model = model;
    }

    public void yanOturmaBarlariAc() {
        System.out.println("Yan oturma barları açılıyor !");
    }

    public void yanOturmaBarlariKapat() {
        System.out.println("Yan oturma barları kapatılıyor !");
    }

    public abstract void sualtiAydinlatmaAc();
    public abstract void sualtiAydinlatmaKapat();

    public DehlerModeller getModel() {
        return model;
    }
    private void setModel(DehlerModeller model) {
        this.model = model;
    }
}
