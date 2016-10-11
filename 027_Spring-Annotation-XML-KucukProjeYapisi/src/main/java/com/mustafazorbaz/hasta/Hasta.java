package com.mustafazorbaz.hasta;

public class Hasta {
	private String adi;
	private String soyadi;
	private Adres adres;
	
	public Hasta() {
		System.out.println("Hasta sınıfıdır.");
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	@Override
	public String toString() {
		return "Hasta [adi=" + adi + ", soyadi=" + soyadi + ", adres=" + adres + "]";
	}
	
}
