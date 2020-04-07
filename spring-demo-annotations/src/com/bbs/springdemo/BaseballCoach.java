package com.bbs.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
	
	@Autowired
	@Qualifier("badFortuneService")
	private FortuneService fortuneService;
	
	
	public BaseballCoach() {
	}
	

	@Override
	public String getDailyWorkout() {
		return "Batting practice.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + " And hit a homer.";
	}
	
	@PostConstruct 
	public void startUp() {
		System.out.println("coach initialized" + this.getClass());
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("coach destroyed");
	}
}
