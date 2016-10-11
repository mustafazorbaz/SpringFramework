package com.mustafazorbaz;

import java.util.Set;

public class Ogrenci {
	  private Set<?>  settekiler;

	public Set<?> getSettekiler() {
		return settekiler;
	}

	public void setSettekiler(Set<?> settekiler) {
		this.settekiler = settekiler;
	}

	@Override
	public String toString() {
		return "Ogrenci [settekiler=" + settekiler + "]";
	}

}
