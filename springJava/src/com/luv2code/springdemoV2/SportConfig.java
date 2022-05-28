package com.luv2code.springdemoV2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan("com.luv2code.springdemoV2")
public class SportConfig {
	
	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new HappyFortuneService();
	}
	
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
		return mySwimCoach;
	}
	
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach entrenadorFutBall() {
		FutBallCoach futBall = new FutBallCoach(new RandomFortuneService());
		return futBall;
	}
	
}








