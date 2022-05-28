package com.luv2code.springdemov5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextV5.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("pato", CricketCoach.class);
		
		// call methods on the bean
		// ... let's come back to this ...
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// call our new methods to get the literal values 
		System.out.println(((CricketCoach) theCoach).getEmailAddress());
		
		System.out.println(((CricketCoach) theCoach).getTeam());
				
		// close the context
		context.close();
	}

}






