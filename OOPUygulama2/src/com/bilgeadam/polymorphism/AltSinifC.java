package com.bilgeadam.polymorphism;

public class AltSinifC extends UstSinif implements IFonksiyonelInterface{

    public AltSinifC(){
    }
    @Override
    public void merhaba(){
        System.out.println("Merhaba - Altsınıf C");
    }
    @Override
    public void mesajVer() {
        merhaba();
    }
    @Override
    public void soyutMethod() {
        System.out.println("Soyut method çalıştı Altsınıf C");
    }
}
