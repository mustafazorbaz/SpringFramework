package com.mustafazorbaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean-configuration.xml");

		Muhendis muhendis=(Muhendis) context.getBean("beanMuhendis");
		System.out.println("Adý    ="+muhendis.getAdi());
		System.out.println("Soyadý ="+muhendis.getSoyadi());
		System.out.println("Alan   ="+muhendis.getAlan());
		System.out.println("Tercübe="+muhendis.getTecrube());
		System.out.println("Isyeri Adý  :"     +muhendis.getIsyeri().getAdiIsyeri());
		System.out.println("Isyeri Soyadký  :"+muhendis.getIsyeri().getAdresIsyeri());
		
		

	}

}
