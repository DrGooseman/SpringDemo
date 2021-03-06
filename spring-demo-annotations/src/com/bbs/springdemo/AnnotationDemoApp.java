package com.bbs.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println();

		Coach theCoach2 = context.getBean("basketballCoach", Coach.class);

		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(theCoach2.getDailyFortune());
		System.out.println();
		
		Coach theCoach3 = context.getBean("baseballCoach", Coach.class);

		System.out.println(theCoach3.getDailyWorkout());
		System.out.println(theCoach3.getDailyFortune());
		System.out.println();
		
		context.close();

	}

}
