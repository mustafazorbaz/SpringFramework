package com.mustafazorbaz;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitBoss  implements BeanPostProcessor{

	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String arg1) throws BeansException {
		System.out.println( bean+"  Bean'i ba�latmadan �ncesi");
		return null;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String arg1) throws BeansException {
		System.out.println( bean+"  Bean'i ba�latmadan sonras�");
		return null;
	}

	

}

