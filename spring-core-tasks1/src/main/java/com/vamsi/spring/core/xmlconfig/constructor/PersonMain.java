package com.vamsi.spring.core.xmlconfig.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-constructor.xml");
		
		
		System.out.println(applicationContext.getBean(Person.class));
	
	}

}
