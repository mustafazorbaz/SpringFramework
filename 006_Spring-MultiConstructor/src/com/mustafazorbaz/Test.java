package com.mustafazorbaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean-configuration.xml");
		Muhendis muh=(Muhendis) context.getBean("muhendis");
		muh.uygula();
		

	}

}
