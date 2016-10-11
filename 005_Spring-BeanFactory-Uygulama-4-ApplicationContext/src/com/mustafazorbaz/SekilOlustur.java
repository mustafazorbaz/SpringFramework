package com.mustafazorbaz;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SekilOlustur {

	public static void main(String[] args) {
	
		//Birden fazla xml kullanýlýyorsa   ApplicationContext context = new ClassPathXmlApplicationContext( new String [] { "spring.xml","spring2.xml"});
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean-configuration.xml");
		BeanFactory beanFactory = context;

		Dikdortgen dikdortgen=(Dikdortgen) beanFactory.getBean("dikdortgen");
		dikdortgen.olustur();
	}

}
