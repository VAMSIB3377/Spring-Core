package com.vamsi.spring.core.bean.collaboration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PersonMain {
	
	public static void main(String[] args)
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-beancol1.xml");
		
		
		System.out.println(applicationContext.getBean(Person.class));
	
	}
}
