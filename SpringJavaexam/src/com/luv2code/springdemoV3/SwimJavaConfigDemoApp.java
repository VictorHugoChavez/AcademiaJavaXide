package com.luv2code.springdemoV3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// lee las configuraciones de spring 
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		octoGato theCoach = context.getBean("getSwimCoach", natacionOctogato.class);
		
		System.out.println(theCoach.informacionCompetencia());//llama al metodo que cobtiene el bean
				
		System.out.println(theCoach.getStatus());//llama al metodo getStatus
			
		System.out.println("email: " + ((natacionOctogato) theCoach).getEmail());// llama las variables que se encuentran en mi sportProperties, y las inyecta
		System.out.println("team: " + ((natacionOctogato) theCoach).getTeam());
		
		// close the context
		context.close();
		
	}

}


