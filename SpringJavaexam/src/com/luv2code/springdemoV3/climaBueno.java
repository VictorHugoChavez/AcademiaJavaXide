package com.luv2code.springdemoV3;

import org.springframework.stereotype.Component;

@Component
public class climaBueno implements climaMexico {

	@Override
	public String getFortune() {//este metodo es se implemento de la interfaz de climaMexico
		return "Es un dia hermoso para practicar natacion en un lago";
	}

}
