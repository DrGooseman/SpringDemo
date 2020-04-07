package com.bbs.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BasketballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	public BasketballCoach() {
	}
	
	
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Dunk a lot.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + " And dribble.";
	}

}
