package com.programming.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	public static void main(String[] args) {
		
		// Load Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from Spring Container
		Coach obj = context.getBean("myCoach", Coach.class);
		
		// Call methods on the bean
		System.out.println(obj.getDailyWorkout());
		
		// calling the new method to get fortunes.
		System.out.println(obj.getDailyFortunes());
		
		// Close the application context
		context.close();
	}
}
