package com.spring.crud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/crud/configAC.xml");
		
		StudentDao stdao=context.getBean("dao",StudentDao.class);
		
		System.out.println(stdao);
		
		System.out.println("hiii****************");
		Student st1=new Student();
		st1.setId(1);
		st1.setName("shahsikant");
		st1.setAddress("delhi");
		st1.setCollege("CCET");
		
		
		stdao.deleteStudent(1);
		System.out.println("data update successfully");
		
	
		
		
	}
	
	
}
