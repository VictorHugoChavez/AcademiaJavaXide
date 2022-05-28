package com.luv2code.springdemoV2;

public class FutBallCoach implements Coach {
	private FortuneService fortuneService;

	public FutBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Hacer 100 lagartijas";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
