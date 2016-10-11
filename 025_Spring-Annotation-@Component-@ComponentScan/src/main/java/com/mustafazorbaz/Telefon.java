package com.mustafazorbaz;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component("telefonBeanComponent")
public class Telefon {
	private String marka;
	private String model;
	
	 
	private Batarya batarya;
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Batarya getBatarya() {
		return batarya;
	}
	public void setBatarya(Batarya batarya) {
		this.batarya = batarya;
	}
	
	@Override
	public String toString() {
		return "Telefon [marka=" + marka + ", model=" + model + ", batarya=" + batarya + "]";
	}
	
	
	
 

}
