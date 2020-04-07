package com.bbs.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach theCoach2 = context.getBean("tennisCoach", Coach.class);
		
		boolean result = theCoach == theCoach2;

		System.out.println("the same object = "+ result);
		
		Coach theCoachProto = context.getBean("basketballCoach", Coach.class);
		Coach theCoachProto2 = context.getBean("basketballCoach", Coach.class);
		
		boolean resultProto = theCoachProto == theCoachProto2;

		System.out.println("the same object = "+ resultProto);
		
		Coach theCoachLifecycle = context.getBean("baseballCoach", Coach.class);
		Coach theCoachLifecycle2 = context.getBean("baseballCoach", Coach.class);
		
		System.out.println(theCoachLifecycle.getDailyWorkout());
		
		context.close();
	}

}
