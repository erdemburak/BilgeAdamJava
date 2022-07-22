package com.uretimfabrikasi.model;

import java.util.Objects;

import com.uretimfabrikasi.Arac;

public class Araba extends Arac {

    public ARABA_KASA_TIPI kasaTipi;
    public ARABA_MARKA arabaMarka;

    public Araba() {

    }

    public Araba(ARABA_KASA_TIPI kasaTipi) {
        this.kasaTipi = kasaTipi;
    }

    public ARABA_MARKA getArabaMarka() {
        return arabaMarka;
    }



    @Override
    public int hashCode() {
        return Objects.hash(arabaMarka);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        Araba other = (Araba) obj;

        Boolean birinciKosul = Objects.equals(getBeygirGucu(), other.getBeygirGucu());
        Boolean ikinciKosul = Objects.equals(getMotorHacmi(), other.getMotorHacmi());
        Boolean ucuncuKosul =  Objects.equals(getArabaMarka(), other.getArabaMarka());


        return  birinciKosul && ikinciKosul && ucuncuKosul;

    }

    public ARABA_KASA_TIPI getKasaTipi() {
        return kasaTipi;
    }




}
