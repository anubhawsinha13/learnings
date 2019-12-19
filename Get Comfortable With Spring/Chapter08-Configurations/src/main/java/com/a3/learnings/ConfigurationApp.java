package com.a3.learnings;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.a3.learnings.scopes.models.Coach;

public class AnnotationBeanScope {

	public static void main(String[] args) {
		
		//Load the spring configuration file
		//load the bean from the factory
		//call the methods
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationsApplicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//Check to see if both the bean are pointing to the same object.
		boolean result = (theCoach == alphaCoach);
		System.out.println("Pointing to the same object:" +result);
		System.out.println("Memory location of the object theCoach  "+theCoach);
		System.out.println("Memory location of the object alpha  "+alphaCoach);
		context.close();
	}

}
