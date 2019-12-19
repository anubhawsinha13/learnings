package com.a3.learnings;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.a3.learnings.autowiring.models.Coach;

public class AnnotationsExample {

	public static void main(String[] args) {
		

		//load the spring configuration file
		//retrieve the bean from the container
		//call the methods
		//close the context
		
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("annotationsApplicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(theCoach.getDailyFortune());

	}

}
