package com.mustafazorbaz;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring-bean-configuration.xml"); //En iyi performasn bundan elde edilir.
		
		
		appCtx.start(); // Ayağa kaldırılıyor.
		
		Araba bmwAraba = appCtx.getBean("arabaBean", Araba.class);
		System.out.println(bmwAraba);
		
		appCtx.refresh();
		
		
		appCtx.stop();
		appCtx.close();
	}

}
