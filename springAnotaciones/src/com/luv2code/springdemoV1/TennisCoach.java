package com.luv2code.springdemoV1;

import org.springframework.stereotype.Component;

@Component // agui es donde vamos inyectar las variablescon ayuda del component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
