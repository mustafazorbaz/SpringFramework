package com.mustafazorbaz;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Telefon {
	private String marka;
	private String model;
	
	@Autowired //farklı bir bean'i referans alıp kullanmak için belirttiğimiz bir annotation.
	@Qualifier("beanBatarya2") //Hangi bean'i seçeceğimizi belirtiyoruz.
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
	@PostConstruct
	public void init() {
		System.out.println("Bean başlatılıyor...");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Bean sonlandırılıyor...");
	}
	@Override
	public String toString() {
		return "Telefon [marka=" + marka + ", model=" + model + ", batarya=" + batarya + "]";
	}
	
	
	
 

}
