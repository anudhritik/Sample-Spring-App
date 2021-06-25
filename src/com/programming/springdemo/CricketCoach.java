package com.programming.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach(){
		System.out.println("Cricket Coach: Inside no arg constructor.");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: Inside the setter method.");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes.";
	}

	@Override
	public String getDailyFortunes() {
		return fortuneService.getFortune();
	}

}
