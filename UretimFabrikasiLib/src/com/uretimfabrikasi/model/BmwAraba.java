package com.uretimfabrikasi.model;

public class BmwAraba extends Araba implements IKoltukSogutma {

    private Boolean elektroHidrolikDireksiyonVar;


    public BmwAraba() {
        super.arabaMarka = ARABA_MARKA.BMW;
        System.out.println(this.getClass().getName() + "  nesnesi yaratıldı.");
        this.elektroHidrolikDireksiyonVar=true;

    }

    public BmwAraba(ARABA_KASA_TIPI kasaTipi) {
        super(kasaTipi);
        super.arabaMarka = ARABA_MARKA.BMW;
        System.out.println(this.getClass().getName() + "  nesnesi yaratıldı.");
        this.elektroHidrolikDireksiyonVar=true;

    }

    @Override
    public void koltukSogutmaAc() {
        // TODO Auto-generated method stub

    }

    @Override
    public void koltukSogutmaKapat() {
        // TODO Auto-generated method stub

    }

    public Boolean getElektroHidrolikDireksiyonVar() {
        return elektroHidrolikDireksiyonVar;
    }






}
