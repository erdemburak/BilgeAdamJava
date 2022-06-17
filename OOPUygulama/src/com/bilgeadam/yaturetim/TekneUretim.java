package com.bilgeadam.yaturetim;

public class TekneUretim {
    public TekneUretim(){

    }

    public static void main(String[] args) {
        Dehler46SQ dehler1 = new Dehler46SQ();
        //dehler1.setMarka(Marka.DEHLER);
        //dehler1.setModel(DehlerModeller.DEHLER42);

        System.out.println("Marka:"+ dehler1.getMarka());
        System.out.println("Model:"+ dehler1.getModel());
    }

}
