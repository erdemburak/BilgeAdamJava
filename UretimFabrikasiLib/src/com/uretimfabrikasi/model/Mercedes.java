package com.uretimfabrikasi.model;

public abstract class Mercedes extends Araba implements IKoltukSogutma {

    private Boolean direksiyonIsitma;
    private Boolean powerShiftSanzimanVar;

    public Mercedes() {
        super.arabaMarka = ARABA_MARKA.MERCEDES;
        System.out.println(this.getClass().getName() + "  nesnesi yaratıldı.");

        this.direksiyonIsitma = true;
        this.powerShiftSanzimanVar = true;

    }

    public Mercedes(ARABA_KASA_TIPI kasaTipi) {
        super(kasaTipi);
        super.arabaMarka = ARABA_MARKA.MERCEDES;
        System.out.println(this.getClass().getName() + "  nesnesi yaratıldı.");

        this.direksiyonIsitma = true;
        this.powerShiftSanzimanVar = true;

    }

    public void direksiyonIsitmaAc() {

        if (direksiyonIsitma) {

        }

    };

    public void direksiyonIsitmaKapat() {

        if (direksiyonIsitma) {

        }

    }

    public Boolean getDireksiyonIsitma() {
        return direksiyonIsitma;
    }

    public Boolean getPowerShiftSanzimanVar() {
        return powerShiftSanzimanVar;
    };

}
