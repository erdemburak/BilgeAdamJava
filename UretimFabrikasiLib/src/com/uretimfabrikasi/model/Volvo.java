package com.uretimfabrikasi.model;

public class Volvo extends Araba implements IKoltukSogutma{

    private Boolean direksiyonIsitma;

    public Volvo() {
        // TODO Auto-generated constructor stub
        System.out.println(this.getClass().getName() + "  nesnesi yaratıldı.");
        this.direksiyonIsitma=true;
    }

    @Override
    public void koltukSogutmaAc() {
        // TODO Auto-generated method stub

    }

    @Override
    public void koltukSogutmaKapat() {
        // TODO Auto-generated method stub

    }

}
