package com.uretimfabrikasi.model;

public class X5 extends BmwAraba implements IHizSabitleme, IKorNoktaUyariSistemi, IKoltukIsitma {

    public X5() {
        super(ARABA_KASA_TIPI.SUV);
    }

    @Override
    public void korNoktadaAracVarmi() {
        // TODO Auto-generated method stub

    }

    @Override
    public void hizSabitlemeyiAc() {
        // TODO Auto-generated method stub

    }

    @Override
    public void hizSabitlemeyiKapat() {
        // TODO Auto-generated method stub

    }

    @Override
    public void koltukIsitmayiAc() {

        System.out.println("Bmw da koltuk ısıtma açıldı !");

    }

    @Override
    public void koltukIsitmayiKapat() throws Exception {
        System.out.println("Bmw da koltuk ısıtma kapatıldı !");

    }

}
