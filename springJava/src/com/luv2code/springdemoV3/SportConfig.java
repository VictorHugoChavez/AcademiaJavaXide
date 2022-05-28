package com.luv2code.springdemoV3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
// @ComponentScan("com.luv2code.springdemoV3")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// add support to resolve ${...} properties
	//
	// NOTE: THIS IS ONLY REQUIRED FOR OLD VERSIONS OF SPRING: v4.2 and lower
	//
	// This is NOT required if using Spring v4.3+
	//
	
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer
//					propertySourcesPlaceHolderConfigurer() {
//		
//		return new PropertySourcesPlaceholderConfigurer();
//	}
	
	// define bean for our sad fortune service
	@Bean
	public FortuneService getFortuneService() {
		return new HappyFortuneService();
	}
	
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach getSwimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(getFortuneService());
		
		return mySwimCoach;
	}
	
}








