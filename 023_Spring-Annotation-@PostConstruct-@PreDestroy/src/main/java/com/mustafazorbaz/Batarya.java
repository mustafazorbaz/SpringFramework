package com.mustafazorbaz;

public class Batarya {
	private String volt;
	private String Wh;

	public String getVolt() {
		return volt;
	}

	public void setVolt(String volt) {
		this.volt = volt;
	}

	public String getWh() {
		return Wh;
	}

	public void setWh(String wh) {
		Wh = wh;
	}

	@Override
	public String toString() {
		return "Batarya [volt=" + volt + ", Wh=" + Wh + "]";
	}

}
