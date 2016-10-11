package com.mustafazorbaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {

		ApplicationContext appCtx = new ClassPathXmlApplicationContext("spring-bean-configuration.xml");
			
		Memur memur = (Memur) appCtx.getBean("memurBean");
		memur.calis();
		
	}

}
