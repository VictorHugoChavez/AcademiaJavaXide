package com.ejercicio.rest;

public class EmpleadoNotFoundException extends RuntimeException {

	public EmpleadoNotFoundException() {
	}

	public EmpleadoNotFoundException(String mensage) {
		super(mensage);
	}

	public EmpleadoNotFoundException(Throwable causa) {
		super(causa);
	}

	public EmpleadoNotFoundException(String mensage, Throwable causa) {
		super(mensage, causa);
	}

	public EmpleadoNotFoundException(String mensage, Throwable causa, boolean enableSuppression,
			boolean writableStackTrace) {
		super(mensage, causa, enableSuppression, writableStackTrace);
	}

}
