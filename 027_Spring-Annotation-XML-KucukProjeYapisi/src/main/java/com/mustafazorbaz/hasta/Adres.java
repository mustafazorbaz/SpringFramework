package com.mustafazorbaz.hasta;

public class Adres {

	private String sokak;
	private String mahalle;
	private int no;
	
	public Adres() {
		System.out.println("Hasta adresi ile ilgili sınıftır.");
	}

	public String getSokak() {
		return sokak;
	}

	public void setSokak(String sokak) {
		this.sokak = sokak;
	}

	public String getMahalle() {
		return mahalle;
	}

	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Adres [sokak=" + sokak + ", mahalle=" + mahalle + ", no=" + no + "]";
	}
	
}
