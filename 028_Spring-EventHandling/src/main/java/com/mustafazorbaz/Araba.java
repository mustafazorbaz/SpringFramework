package com.mustafazorbaz;

public class Araba {
	private String marka;
	private int model;
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Araba [marka=" + marka + ", model=" + model + "]";
	}
	
}
