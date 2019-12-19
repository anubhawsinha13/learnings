package com.a3.learnings;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.a3.learnings.Configuration.Config.AppConfig;
import com.a3.learnings.Configuration.models.Coach;
import com.a3.learnings.Configuration.models.TennisCoach;

public class ConfigurationApp {

	public static void main(String[] args) {
		
		//Load the spring java configuration file
		//load the bean from the factory
		//call the methods
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		TennisCoach aCoach  = context.getBean("tennisCoach", TennisCoach.class);
		
		//Check to see if both the bean are pointing to the same object.
		boolean result = (theCoach == alphaCoach);
		System.out.println("Pointing to the same object:" +result);
		System.out.println("Memory location of the object theCoach  "+theCoach);
		System.out.println("Memory location of the object alpha  "+alphaCoach);
		System.out.println("Email of the coach--"+aCoach.getEmail());
		context.close();
	}

}
