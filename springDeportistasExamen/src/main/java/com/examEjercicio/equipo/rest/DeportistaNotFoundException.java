package com.examEjercicio.equipo.rest;

public class DeportistaNotFoundException extends RuntimeException {
//en este caso nuestra clase extiende de RuntimeException, esto es del tema de las excepciones donde runtimeexcepciones
//es la unica que no requiere darse tratamaiento, tambien esta sobrecraga de constructores
	
	public DeportistaNotFoundException() {
	}

	public DeportistaNotFoundException(String mensage) {
		super(mensage);
	}

	public DeportistaNotFoundException(Throwable causa) {
		super(causa);
	}

	public DeportistaNotFoundException(String mensage, Throwable causa) {
		super(mensage, causa);
	}

	public DeportistaNotFoundException(String mensage, Throwable causa, boolean enableSuppression,
			boolean writableStackTrace) {
		super(mensage, causa, enableSuppression, writableStackTrace);
	}

}
