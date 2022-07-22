package com.uretimfabrikasi;

import com.uretimfabrikasi.model.Araba;

public class Fabrika {
    public Fabrika() {
        // TODO Auto-generated constructor stub
    }
/*
	public Araba arabaUret(ARABA_MARKA marka) throws Exception {

		if (marka.equals(ARABA_MARKA.BMW)) {

			return new BmwAraba();

		} else if (marka.equals(ARABA_MARKA.MERCEDES)) {

			return new Mercedes() {

				@Override
				public void koltukSogutmaKapat() {
					// TODO Auto-generated method stub

				}

				@Override
				public void koltukSogutmaAc() {
					// TODO Auto-generated method stub

				}
			};

		} else if (marka.equals(ARABA_MARKA.VOLVO)) {

			return new Volvo();

		}

		throw new Exception("Araç üretim için markayı seçin !");

	}
*/


    public Araba arabaUretFab(Class olusClass) throws Exception {

        return (Araba) olusClass.newInstance();

    }
}
