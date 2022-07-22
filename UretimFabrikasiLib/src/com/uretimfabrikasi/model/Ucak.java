package com.uretimfabrikasi.model;

import com.uretimfabrikasi.Arac;

public abstract class Ucak extends Arac {

    public Ucak() {

    }

    public abstract void acilTahliyeMekanizmasiCalistir();

    public abstract void acilTahliyeMekanizmasiKapat();

    public abstract void otomatikPlotuDevreyeAl();

    public abstract void otomatikPlotuDevredenCikar();


}
