package com.vamsi.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Instantiate the Spring IOC Container
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		//2. Get the Bean Information from Spring IOC
		
		Product product1 = (Product) applicationContext.getBean("Product1",Product.class);
		Product product2 = (Product) applicationContext.getBean("Product2",Product.class);
		
		//3. Use the Bean
		System.out.println(product1);
		System.out.println(product2);		

	}

}
