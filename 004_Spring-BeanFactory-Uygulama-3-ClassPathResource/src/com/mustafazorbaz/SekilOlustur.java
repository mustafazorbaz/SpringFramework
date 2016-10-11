package com.mustafazorbaz;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class SekilOlustur {

	public static void main(String[] args) {
	
		ClassPathResource classPathResource=new ClassPathResource("spring-bean-configuration.xml");
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
		

		Dikdortgen dikdortgen=(Dikdortgen) beanFactory.getBean("dikdortgen");
		dikdortgen.olustur();
	}

}
