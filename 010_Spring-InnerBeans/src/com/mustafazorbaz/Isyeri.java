package com.mustafazorbaz;

public class Isyeri {
	private String adiIsyeri;
	private String adresIsyeri;
	
	public String getAdiIsyeri() {
		return adiIsyeri;
	}
	public void setAdiIsyeri(String adiIsyeri) {
		this.adiIsyeri = adiIsyeri;
	}
	public String getAdresIsyeri() {
		return adresIsyeri;
	}
	public void setAdresIsyeri(String adresIsyeri) {
		this.adresIsyeri = adresIsyeri;
	}
	public void isyeriBilgileri()
	{
		System.out.println(" ��yeri ad�"+getAdiIsyeri()+""+"\n ��yeri adresi"+getAdresIsyeri());
	}
	

}
