package com.mustafazorbaz;

public class Engineer {
	private String name;
	private String surname;
	private Experience experience;
	private Adress adress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Engineer [name=" + name + ", surname=" + surname + ", experience=" + experience + ", adress= sokak" + adress.getNeighborhood()
				+ "]";
	}

}
