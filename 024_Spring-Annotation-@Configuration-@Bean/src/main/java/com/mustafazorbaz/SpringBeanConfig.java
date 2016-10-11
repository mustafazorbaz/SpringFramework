package com.mustafazorbaz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {

	@Bean
	public Telefon telefon()
	{
		Telefon telefon=new Telefon();
		telefon.setMarka("General Mobile");
		telefon.setModel("Discovery 2");
		telefon.setBatarya(batarya());
		return telefon;
	}
	
	@Bean
	public Batarya batarya()
	{
		Batarya batarya=new  Batarya();
		batarya.setVolt("2.3");
		batarya.setWh("1.9");
		return batarya;
	}
	
	/*<bean id="beanTelefon" class="com.mustafazorbaz.Telefon">
		<property name="marka" value="Iphone"></property>
		<property name="model" value="7S"></property>
	</bean>
	*/
	/*<bean id="beanBatarya1" class="com.mustafazorbaz.Batarya">
	<property name="volt" value="5.2"/>
	<property name="wh" value="3.4"/>
	</bean>
	*/
}
