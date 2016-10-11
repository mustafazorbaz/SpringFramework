package com.mustafazorbaz;

public class Telefon {
	private String marka;
	private Batarya batarya;
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public Batarya getBatarya() {
		return batarya;
	}
	public void setBatarya(Batarya batarya) {
		this.batarya = batarya;
	}
	@Override
	public String toString() {
		return "Telefon [marka=" + marka + ", batarya=" + batarya + "]";
	}
	

}
