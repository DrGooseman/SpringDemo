package com.bbs.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + ", and run 10 laps";
	}
	
	public void doMyStartupStuff() {
		System.out.println("Track Coach startup");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("Track Coach destroy");
	}
}
