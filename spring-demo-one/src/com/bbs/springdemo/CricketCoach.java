package com.bbs.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	
	public CricketCoach() {}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Hit the ball a few times";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + ", and then play some cricket";
	}

}
