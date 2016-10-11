package com.mustafazorbaz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mustafazorbaz.Kopek;

@Configuration
public class KopekConfig {
	@Bean(name="beanKopek")
	public Kopek kopek()
	{
		return new Kopek();
	}

}
