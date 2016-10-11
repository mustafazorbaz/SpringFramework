package com.mustafazorbaz;

import org.springframework.beans.factory.annotation.Required;

public class Telefon {
	private String marka;
	private String model;
	public String getMarka() {
		return marka;
	}
	@Required //Marka içeriği boş geçilemiyeceğini belirttik.
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	@Required //Model değerinin içeriği boş geçilemeyeceğini belirttik.
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Telefon [marka=" + marka + ", model=" + model + "]";
	}
	
 

}
