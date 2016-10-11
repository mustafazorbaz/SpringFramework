package com.mustafazorbaz;

import java.text.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
			 
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(SpringBeanConfig.class);
		context.refresh(); //context yenilenir.
		Telefon telefon= context.getBean("telefon",Telefon.class);
		System.out.println(telefon);

	}

}
