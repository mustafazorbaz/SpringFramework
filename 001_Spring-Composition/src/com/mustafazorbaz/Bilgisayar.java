package com.mustafazorbaz;

public class Bilgisayar {
	private Islemci  islemci;

	public Bilgisayar() {
		super();
		this.islemci = new Islemci();
	}
	
	public void calis() {
		islemci.power();
		System.err.println("Bilgisayar Çalýþtý...");
	}
}
