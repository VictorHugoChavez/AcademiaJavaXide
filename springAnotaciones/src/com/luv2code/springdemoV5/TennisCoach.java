package com.luv2code.springdemoV5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // es para cambiar 
public class TennisCoach implements Coach {

	@Autowired  //inyectando por atributo
	@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	// define a setter method
	
//	@Autowired
//	@Qualifier("restFortuneService") ///inyectando por setter
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println(">> TennisCoach: inside setFortuneService() method");
//		this.fortuneService = theFortuneService;
//	}
	
	//@Autowired //inyectamos por constructor
	//public TennisCoach(@Qualifier("happyFortuneService") 
	//						FortuneService theFortuneService) {
	//	System.out.println("Constructor param FortuneService");
	//	fortuneService = theFortuneService;
	//}
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
