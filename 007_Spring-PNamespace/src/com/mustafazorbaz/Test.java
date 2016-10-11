package com.mustafazorbaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean-configuration.xml");

		Muhendis muhendis=(Muhendis) context.getBean("beanMuhendis");
		System.out.println("Ad�    ="+muhendis.getAdi());
		System.out.println("Soyad� ="+muhendis.getSoyadi());
		System.out.println("Alan   ="+muhendis.getAlan());
		System.out.println("Terc�be="+muhendis.getTecrube());
		System.out.println("Isyeri Ad�  :"     +muhendis.getIsyeri().getAdiIsyeri());
		System.out.println("Isyeri Soyadk�  :"+muhendis.getIsyeri().getAdresIsyeri());
		
		

	}

}
