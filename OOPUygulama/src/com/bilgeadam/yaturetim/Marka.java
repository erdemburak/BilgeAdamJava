package com.bilgeadam.yaturetim;

public enum Marka {
    HANSE(1), DEHLER(2);
    private int ID;

    private Marka(int iD){
        ID =iD;
    }
    public int getID(){
        return ID;
    }
}
