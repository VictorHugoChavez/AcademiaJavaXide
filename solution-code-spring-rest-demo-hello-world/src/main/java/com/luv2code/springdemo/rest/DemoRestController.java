package com.luv2code.springdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")  // es la direccion de las peticiones
public class DemoRestController {

	// add code for the "/hello" endpoint
	
	@GetMapping("/hello") // puede haber varios getmapping
	public String sayHello() {
		return "Hello World Academy Xideral!";
	}
	@GetMapping("/hola") // puede haber varios getmapping
	public int sayHola() {
		return 10+16;
	}
	
	
}
