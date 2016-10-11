package com.mustafazorbaz;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import com.mustafazorbaz.config.KediConfig;
import com.mustafazorbaz.config.KopekConfig;

@Configuration
@ComponentScan("com.mustafa.*")
@Import( {KediConfig.class , KopekConfig.class})
public class SpringBeanConfing {

}
