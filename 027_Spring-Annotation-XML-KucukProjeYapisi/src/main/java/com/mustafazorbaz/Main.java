package com.mustafazorbaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mustafazorbaz.hasta.Hasta;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("spring-bean-configuration.xml");
		 
		Hasta musteri = appCtx.getBean("BeanHasta", Hasta.class);
		System.out.println(musteri);

	}

}
