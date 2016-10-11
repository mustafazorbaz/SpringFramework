package com.mustafazorbaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		 
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean-configuration.xml");

		Baba baba=context.getBean("baba",Baba.class);
		
		Cocuk cocuk=context.getBean("cocuk",Cocuk.class);
		System.out.println(cocuk);
    
	}

}
