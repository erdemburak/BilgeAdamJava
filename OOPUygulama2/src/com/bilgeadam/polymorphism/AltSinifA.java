package com.bilgeadam.polymorphism;

public class AltSinifA extends UstSinif implements IFonksiyonelInterface{

    public AltSinifA(){
    }
    @Override
    public void merhaba(){
        System.out.println("Merhaba - Altsınıf A");
    }
    @Override
    public void mesajVer() {
        merhaba();
    }
    @Override
    public void soyutMethod() {
        System.out.println("Soyut method çalıştı Altsınıf A");
    }
}
