package com.spring.core.assignments_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		applicationContext = new ClassPathXmlApplicationContext("applicationContext-assignment-1.xml");
		
		
		System.out.println(applicationContext.getBean(Customer.class));
	
	}

}
