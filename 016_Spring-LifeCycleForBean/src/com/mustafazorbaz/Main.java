package com.mustafazorbaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		 
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean-configuration.xml");

         Boss  boss=context.getBean("boss",Boss.class);
         boss.setName("Mustafa");
         boss.setSurname("Zorbaz");
         System.out.println(boss);
         
         Boss  boss2=context.getBean("boss",Boss.class);
         System.out.println(boss2);
         
         Boss  boss3=context.getBean("boss",Boss.class);
         boss3.setName("Taner");
         boss3.setSurname("Tanyeli");
         System.out.println(boss3); 
         
         ((AbstractApplicationContext) context).close();
         
         
	}

}
