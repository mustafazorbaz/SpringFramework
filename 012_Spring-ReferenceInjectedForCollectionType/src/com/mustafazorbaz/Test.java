package com.mustafazorbaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean-configuration.xml");

		Collection kolleksiyon=context.getBean("BeanCollection",Collection.class);
		System.out.println(kolleksiyon);

	}

}
