package com.bilgeadam.soyut;

public class Ucgen extends SoyutKavramlar {
    @Override
    public int alanBul() {
        return 1;
    }
    @Override
    public double alanBul(double yukseklik, double taban) {
        double alan = ((taban * yukseklik) / 2);
        return alan;
    }
}
