package com.examEjercicio.equipo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DeportistaRestExceptionHandler {

	// Agrega una exception de DeportistaNotFoundException
	@ExceptionHandler
	public ResponseEntity<DeportistaErrorRespuesta> handleException(DeportistaNotFoundException exc) {
		
		// se crea un variable de refrencia donde apunta al objeto DeportistaErrorRespuesta, defineod como parametros sobre el protocoHttp, el mensage y el tiempo
		DeportistaErrorRespuesta error = new DeportistaErrorRespuesta(
											HttpStatus.NOT_FOUND.value(),
											exc.getMessage(),
											System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);  //regresa un objeto cde responseEntity  con el error que tuvo
	}
	
	@ExceptionHandler
	public ResponseEntity<DeportistaErrorRespuesta> handleException(Exception exc) {
		
		DeportistaErrorRespuesta error = new DeportistaErrorRespuesta(
											HttpStatus.BAD_REQUEST.value(),
											exc.getMessage(),
											System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
}





