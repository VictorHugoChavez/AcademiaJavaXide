package com.luv2code.springdemoV3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
// @ComponentScan("com.luv2code.springdemoV3")
@PropertySource("classpath:sport.properties") // se define el archivo donde se va inyectar 
public class SportConfig {
	//define le bean del fortuneservice
	@Bean
	public climaMexico getFortuneService() {
		return new climaBueno();
	}
//define otro bean donde inyecta las dependenciaas	
	@Bean
	public octoGato getSwimCoach() {
		natacionOctogato mySwimCoach = new natacionOctogato(getFortuneService());
		return mySwimCoach;
	}
	
}








