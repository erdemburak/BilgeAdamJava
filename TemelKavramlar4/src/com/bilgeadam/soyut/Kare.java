package com.bilgeadam.soyut;

public class Kare extends SoyutKavramlar{
    @Override
    public int alanBul() {
        return 2;
    }

    @Override
    public double alanBul(double yukseklik, double taban) {
        double alan = taban * yukseklik;
        return alan;
    }
}
