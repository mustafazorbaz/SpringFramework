package com.mustafazorbaz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext();
	    appCtx.register(SpringBeanConfing.class);
	    
	    appCtx.refresh();
	    
	  Kopek kopek =  appCtx.getBean("beanKopek",Kopek.class);
	  System.out.println(kopek.yaz());
	  
	  Kedi kedi =  appCtx.getBean("beanKedi",Kedi.class);
	  System.out.println( kedi.yaz()); 

	}

}
