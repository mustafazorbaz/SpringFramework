package com.mustafazorbaz;

public class Cocuk {
	
	private String adi;
	private String soyadi;
	private String boy;
	private String  gozrengi;
    private String yasi;
	
  
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
  	public String getYasi() {
  		return yasi;
  	}
  	public void setYasi(String yasi) {
  		this.yasi = yasi;
  	}
  	 
  	@Override
  	public String toString() {
  		return "Cocuk [adi=" + adi + ", soyadi=" + soyadi + ", boy=" + boy + ", gozrengi=" + gozrengi + ", yasi=" + yasi
  				+ "]";
  	}
    
}
