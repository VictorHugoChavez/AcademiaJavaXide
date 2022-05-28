 package com.luv2code.springdemov3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context =  //variable de refrencia
				new ClassPathXmlApplicationContext("applicationContextV3.xml");// que apunta a spring ClassPath
				//le inyecto un archivo aplicationContextV3.xml puede cambiar el nombre
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());//imprime el valor de theCoach 
		
		// let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}







