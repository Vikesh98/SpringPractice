package com.vikesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	

	public static void main(String[] args) 
	{
	ApplicationContext	context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		HelloWorld obj=(HelloWorld) context.getBean("helloworldbean");
		obj.get();
		
	}

}
