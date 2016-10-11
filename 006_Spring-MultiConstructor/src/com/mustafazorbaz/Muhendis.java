package com.mustafazorbaz;

public class Muhendis {
private String adi;
private String soyadi;
private String alan;
private int tecrube;

public Muhendis(String adi, String soyadi, String alan, int tecrube) {
	super();
	this.adi = adi;
	this.soyadi = soyadi;
	this.alan = alan;
	this.tecrube = tecrube;
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
public void uygula()
{
	System.out.println("Uygulama Tamam Muhendis"+getAdi()+"Sektördeki tecrübesi "+getTecrube());
}

}
