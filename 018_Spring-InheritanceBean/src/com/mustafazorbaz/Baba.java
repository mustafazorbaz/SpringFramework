package com.mustafazorbaz;

public class Baba {
	
	private String adi;
	private String soyadi;
	private String boy;
	private String  gozrengi;
	
	public String getAdi() {
		return adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getBoy() {
		return boy;
	}
	public void setBoy(String boy) {
		this.boy = boy;
	}
	public String getGozrengi() {
		return gozrengi;
	}
	public void setGozrengi(String gozrengi) {
		this.gozrengi = gozrengi;
	}
	@Override
	public String toString() {
		return "Baba [adi=" + adi + ", soyadi=" + soyadi + ", boy=" + boy + ", gozrengi=" + gozrengi + "]";
	}
}
