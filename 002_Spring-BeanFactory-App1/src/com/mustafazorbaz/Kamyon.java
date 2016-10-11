package com.mustafazorbaz;

public class Kamyon {
	private Yakit yakit;

	
	public Kamyon(Yakit yakit) {
		this.yakit = yakit;
	}
		
	public void hareketeGec() {
		yakit.depo();
		System.out.println("Kamyon harekete gecti.");
	}
	
}
