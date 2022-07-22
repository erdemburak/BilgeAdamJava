package com.uretimfabrikasi;

import java.util.Date;
import java.util.Objects;

public class Arac {

    private Date aracUretimTarihi;
    private RENK renk;
    private YAKIT_TURU yakitTuru;
    private Integer beygirGucu;

    private Integer motorHacmi;

    public Arac() {
        this.aracUretimTarihi = new Date();
        this.renk = RENK.BEYAZ;
        this.yakitTuru = YAKIT_TURU.BENZIN;
    }

    public Date getAracUretimTarihi() {
        return aracUretimTarihi;
    }

    public RENK getRenk() {
        return renk;
    }

    public void setRenk(RENK renk) {
        this.renk = renk;
    }

    public YAKIT_TURU getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(YAKIT_TURU yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public Integer getBeygirGucu() {
        return beygirGucu;
    }

    public void setBeygirGucu(Integer beygirGucu) {
        this.beygirGucu = beygirGucu;
    }

    public Integer getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(Integer motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    @Override
    public int hashCode() {
        return Objects.hash(beygirGucu, motorHacmi);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Arac other = (Arac) obj;
        return Objects.equals(beygirGucu, other.beygirGucu) && Objects.equals(motorHacmi, other.motorHacmi);
    }
}
