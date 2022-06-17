package com.bilgeadam.polymorphism;

public class AltSinifB extends UstSinif implements IFonksiyonelInterface{
    public AltSinifB(){
    }
    @Override
    public void merhaba(){
        System.out.println("Merhaba - Altsınıf B");
    }
    @Override
    public void mesajVer() {
        merhaba();
    }
    @Override
    public void soyutMethod() {
        System.out.println("Soyut method çalıştı Altsınıf B");
    }
}
