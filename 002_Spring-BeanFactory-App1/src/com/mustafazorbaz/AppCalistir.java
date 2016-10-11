package com.mustafazorbaz;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class AppCalistir {

	public static void main(String[] args) {
		
		
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring-bean-configuration.xml"));
		
		Araba araba = (Araba) beanFactory.getBean("araba");
		araba.hareketeGec();
		
		Kamyon kamyon = (Kamyon) beanFactory.getBean("kamyon");
		kamyon.hareketeGec();

	}

}
