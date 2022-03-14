package com.vamsi.b.spring.core;


import org.springframework.context.ApplicationContext;

public class ProductMain {
	public static void main(String[] args)
	{
		//1.Instantiate the Spring Container
		
		ApplicationContext applicationContext = new ClassPatheXmlApplicationContext("applicationContext.xml");
		
		//2.Get the bean information from Spring IOC
		
		
		//3.Use the Bean
	}
}
