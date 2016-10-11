package com.mustafazorbaz;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class SekilOlustur {

	public static void main(String[] args) {


		Resource resource=new FileSystemResource("spring-bean-configuration.xml");
		XmlBeanFactory xmlBeanFactory=new XmlBeanFactory(resource);
 
		Dikdortgen dikdortgen=(Dikdortgen) xmlBeanFactory.getBean("dikdortgen");
		dikdortgen.olustur();
		
	}

}
