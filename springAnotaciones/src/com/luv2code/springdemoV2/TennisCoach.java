package com.luv2code.springdemoV2;

import org.springframework.stereotype.Component;

@Component("thatSillyCoaches") ///se implemento por nivel de clase 
public class TennisCoach implements Coach {

	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
