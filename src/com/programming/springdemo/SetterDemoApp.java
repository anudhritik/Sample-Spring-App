package com.programming.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args) {
		
		// Load spring configuration file.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean from Spring Container.
		CricketCoach obj = context.getBean("myCricketCoach", CricketCoach.class);
		
		// Call methods on Spring bean.
		System.out.println(obj.getDailyFortunes());
		
		System.out.println(obj.getDailyWorkout());
		
		//Close the context.
		context.close();
	}
}
