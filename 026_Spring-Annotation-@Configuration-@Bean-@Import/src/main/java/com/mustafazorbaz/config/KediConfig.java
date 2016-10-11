package com.mustafazorbaz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mustafazorbaz.Kedi;

@Configuration
public class KediConfig {

	@Bean(name="beanKedi")
	public Kedi kedi()
	{
		return new Kedi();
	}
}
