package com.mustafazorbaz;

import java.text.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
			 
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean-configuration.xml");	
		
		Batarya batarya=context.getBean("bataryaBeanComponent",Batarya.class);
		batarya.setVolt("3.5");
		batarya.setWh("4.5");
		Telefon telefon=context.getBean("telefonBeanComponent",Telefon.class);
		telefon.setMarka("Vestel");
		telefon.setModel("Venus");
		telefon.setBatarya(batarya);
		
		System.out.println(telefon);
		
		((AbstractApplicationContext) context).close();

	}

}
