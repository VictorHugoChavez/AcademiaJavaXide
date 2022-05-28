package com.luv2code.springdemoV3;

import org.springframework.beans.factory.annotation.Value;

public class natacionOctogato implements octoGato {

	private climaMexico fortuneService;

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public natacionOctogato(climaMexico theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String informacionCompetencia() {
		return "Nadando durante 2 hrs diarias para el concurso de natacion 100 mtss";
	}

	@Override
	public String getStatus() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}	

}




