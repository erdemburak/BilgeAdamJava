package com.uretimfabrikasi.model;

public class BmwMotorsiklet extends Motorsiklet implements IElektronikGeriItki {

    public BmwMotorsiklet() {
        System.out.println(this.getClass().getName() + "  nesnesi yaratıldı.");
    }

    @Override
    public void elektronikGeriItkiyiAc() {
        // TODO Auto-generated method stub

    }

    @Override
    public void elektronikGeriItkiyiKapat() {
        // TODO Auto-generated method stub

    }



}
