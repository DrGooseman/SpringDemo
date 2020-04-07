package com.bbs.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// xml constructor injection
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println();
		
		// xml setter ref injection
		
		Coach theCoach2 = context.getBean("myCoach2", Coach.class);
		
		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(theCoach2.getDailyFortune());
		System.out.println();
		
		// xml setter literal value injection
		
		BaseballCoach theCoach3 = context.getBean("myCoach3", BaseballCoach.class);
			
			System.out.println(theCoach3.getDailyWorkout());
			System.out.println(theCoach3.getDailyFortune());
			System.out.println("team: " + theCoach3.getTeam());
			System.out.println("email: " + theCoach3.getEmailAddress());
			System.out.println();
			
			// xml setter properties file injection
			
	BaseballCoach theCoach4 = context.getBean("myCoach4", BaseballCoach.class);
			
			System.out.println(theCoach4.getDailyWorkout());
			System.out.println(theCoach4.getDailyFortune());
			System.out.println("team: " + theCoach4.getTeam());
			System.out.println("email: " + theCoach4.getEmailAddress());
			System.out.println();
		
		context.close();
		
	}
}
