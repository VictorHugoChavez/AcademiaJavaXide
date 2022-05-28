package com.luv2code.springdemov3;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Hoy es 10 de Mayo y ando en curso, mala suerte!";
	}

}
