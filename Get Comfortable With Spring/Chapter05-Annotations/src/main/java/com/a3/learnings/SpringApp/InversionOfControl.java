package com.a3.learnings.SpringApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.a3.learnings.SpringApp.models.Coach;

public class InversionOfControl {
	
	
	/*
	 * 
	 * 1) Load the spring configuration file
		2) retrieve the bean from container
		3) Call methods on the bean 
		4) close the context 
	 */
	
	public static void main(String args[]) {
	
	ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
	Coach coach = context.getBean("myCoach",Coach.class);
	
	System.out.println(coach.dailyWorkout());
	context.close();
	
	}
}
