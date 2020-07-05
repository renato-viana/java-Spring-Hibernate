package com.renatoviana.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = 
				context.getBean("myCoach", Coach.class);
		Coach basketballCoach = 
				context.getBean("myBasketballCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(basketballCoach.getDailyWorkout());
		
		context.close();
	}

}
