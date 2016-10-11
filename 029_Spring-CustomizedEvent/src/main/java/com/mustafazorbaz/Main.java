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
		
		CustomEventEmittir customEventEmittir =appCtx.getBean("customEventEmitter",CustomEventEmittir.class);
		customEventEmittir.kontrolYap(233);
		
		appCtx.stop();
		appCtx.close();
	}

}
