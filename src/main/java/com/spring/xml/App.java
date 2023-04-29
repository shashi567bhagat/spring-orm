package com.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

public class App {
	public static void main(String[] args) {

		System.out.println("**************************************");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/xml/config.xml");
		
		System.out.println("------------------------------");
		HibernateTemplate ht = context.getBean("template", HibernateTemplate.class);
		System.out.println(ht);
		
		
		
		
		
		

	}
}
