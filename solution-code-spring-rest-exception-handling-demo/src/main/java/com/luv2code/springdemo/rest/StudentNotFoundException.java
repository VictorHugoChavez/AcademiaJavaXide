package com.luv2code.springdemo.rest;

public class StudentNotFoundException extends RuntimeException {

//	public StudentNotFoundException(String message, Throwable cause) {
//		super(message, cause);
//	}

	//Constructor utilizado
	public StudentNotFoundException(String message) {
		super(message);
	}

//	public StudentNotFoundException(Throwable cause) {
//		super(cause);
//	}
	
}
