package com.luv2code.springdemov4;

public class CricketCoach implements Coach {

	private FortuneService fortuneServicesx;	
	
	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: Paso por constructor defecto");
	}
	
	// our setter method
	public void setFortuneservicesx(FortuneService fortuneService) {
		System.out.println("CricketCoach: Pasa por el setter - setFortuneService");
		this.fortuneServicesx = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneServicesx.getFortune();
	}

}
