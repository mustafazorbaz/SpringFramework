package com.mustafazorbaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean-configuration.xml");

		 Calisan calisan=context.getBean("BeanCalisan",Calisan.class);
		 System.out.println(calisan);
		
		  Adres adres=context.getBean("BeanAdres",Adres.class);
		  System.out.println(adres);
		  
		  Ogrenci degerler=(Ogrenci) context.getBean("ogrenci");
		  System.out.println(degerler);

	}

}
