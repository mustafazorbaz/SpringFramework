package com.mustafazorbaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		 
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean-configuration.xml");

         Boss  boss=context.getBean("boss",Boss.class);
         boss.setName("Mustafa");
         boss.setSurname("Zorbaz");
         System.out.println(boss);
         
         Boss  boss2=context.getBean("boss",Boss.class);
         System.out.println(boss2);
         //Burada Boss nesnesi �retti�imizde de�ereleri settedikten sonra farkl� bir nesne �retirsek ve hi� de�er atas� yapmassak ismi 
         //ilk at�lan de�erleri al�r.A�a��ya ise bir de�er atamas� yapaca��m ve ilk de�erleri yok ederek yeni de�er alacak.
         
         Boss  boss3=context.getBean("boss",Boss.class);
         boss3.setName("Taner");
         boss3.setSurname("Tanyeli");
         System.out.println(boss3); 
         //G�r��d��� gibi Mustafa Zorbaz de�erini yok sayd�
	}

}
