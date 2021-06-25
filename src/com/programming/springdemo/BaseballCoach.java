package com.programming.springdemo;

public class BaseballCoach implements Coach {

	// define a private field for dependency

	private FortuneService fortuneService;

	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on practice.";
	}

	@Override
	public String getDailyFortunes() {
		// use my fortuneService to get fortune.
		return fortuneService.getFortune();
	}
}
