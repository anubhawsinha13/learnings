package com.a3.learnings.Configuration.models;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		//load the spring configuration file
		//load the bean
		//call the method
		//close the context
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationsApplicationContext.xml");
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());;
		context.close();

	}

}
