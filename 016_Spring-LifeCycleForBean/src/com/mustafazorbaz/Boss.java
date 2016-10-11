package com.mustafazorbaz;

public class Boss {
	private String name;
	private String surname;
 

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
	public void init()
	{
		System.out.println("Bean baþlatýlýyor...");
	}
	public void destory()
	{
		System.out.println("Bean sonandýrýlýyor...");
	}
	@Override
	public String toString() {
		return "Boss [name=" + name + ", surname=" + surname + "]";
	}

	
}
