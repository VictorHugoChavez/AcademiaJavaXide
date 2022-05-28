package com.luv2code.springdemov4;

public class BaseballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneServicesx;
	
	

	// create a no-arg constructor
	public BaseballCoach() {
		System.out.println("BaseballCoach: Paso por constructor defecto");
	}
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneServicesx) {
		fortuneServicesx = theFortuneServicesx;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {		
		// use my fortuneService to get a fortune		
		return fortuneServicesx.getFortune();
	}
	
	public void setFortuneServicesx(FortuneService fortuneServicesx) {
		System.out.println("pASA POR EL PATO");
		this.fortuneServicesx = fortuneServicesx;
	}
}








