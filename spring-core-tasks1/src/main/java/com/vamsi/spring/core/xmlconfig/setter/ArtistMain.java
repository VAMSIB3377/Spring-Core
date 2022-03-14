package com.vamsi.spring.core.xmlconfig.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ArtistMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-setter.xml");
		
		
		System.out.println(applicationContext.getBean(Artist.class));
	

	}

}
