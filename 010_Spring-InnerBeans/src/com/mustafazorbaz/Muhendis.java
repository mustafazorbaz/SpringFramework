package com.mustafazorbaz;

public class Muhendis {

	private Isyeri isyeri;

	public Isyeri getIsyeri() {
		return isyeri;
	}

	public void setIsyeri(Isyeri isyeri) {
		this.isyeri = isyeri;
	}

    public void bilgiler()
    {
    	System.out.println("Muhendisin iþyeri bilgileri");
    	isyeri.isyeriBilgileri();
     }

}
