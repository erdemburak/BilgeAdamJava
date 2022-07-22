package com.uretimfabrikasi.model;

public class XC90 extends Volvo implements IKoltukIsitma, IOtomatikKapiKapatma {

    public XC90() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void koltukIsitmayiAc() {

        System.out.println("Koltuk Isıtma Çalışıyor !");

    }

    @Override
    public void koltukIsitmayiKapat() throws Exception {
        System.out.println("Koltuk Isıtma Kapandı !");
        //throw new Exception("Koltuk ısıtma kapanırken hata oluştu !");

    }

    @Override
    public void kapiyiAc() {
        // TODO Auto-generated method stub

    }

    @Override
    public void kapiyiKapat() {
        // TODO Auto-generated method stub

    }

}
