package com.mustafazorbaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans-configuration.xml");
			
			
			Telefon telefon1=context.getBean("BeanTelefon",Telefon.class);
			System.out.println(telefon1);
	}

}
