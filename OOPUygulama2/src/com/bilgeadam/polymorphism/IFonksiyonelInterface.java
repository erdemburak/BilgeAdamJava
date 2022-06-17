package com.bilgeadam.polymorphism;

/**
 * Functional Interface
 */
public interface IFonksiyonelInterface {
    public void mesajVer();
    public default void islemYap() {
        System.out.println("Merhaba işlem tamamlandı !");
    }
}
