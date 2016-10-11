package com.mustafazorbaz;

public class Muhendis {
private String adi;
private String soyadi;
private String alan;
private int tecrube;
private Isyeri isyeri;



public Muhendis(String adi, String soyadi, String alan, int tecrube, Isyeri isyeri) {
	super();
	this.adi = adi;
	this.soyadi = soyadi;
	this.alan = alan;
	this.tecrube = tecrube;
	this.isyeri = isyeri;
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
public String getAlan() {
	return alan;
}
public void setAlan(String alan) {
	this.alan = alan;
}
public int getTecrube() {
	return tecrube;
}
public void setTecrube(int tecrube) {
	this.tecrube = tecrube;
}
public Isyeri getIsyeri() {
	return isyeri;
}
public void setIsyeri(Isyeri isyeri) {
	this.isyeri = isyeri;
}
public void uygula()
{
	System.out.println("Uygulama Tamam Muhendis"+getAdi()+"Sektördeki tecrübesi "+getTecrube());
}

}
