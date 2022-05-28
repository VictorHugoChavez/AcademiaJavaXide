package com.luv2code.springdemoV4;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Fortune REST";
	}

}
