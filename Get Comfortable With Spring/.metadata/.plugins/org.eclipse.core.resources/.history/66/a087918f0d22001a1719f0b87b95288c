/**
 * 
 */
package com.a3.learnings.chapter101;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.a3.learnings.chapter101.models.Coach;

/**
 * @author asinha
 *
 */
public class SpringLearningApp {
	
	public static void main(String args[]) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from the spring container ( Coach.class is the interface)
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//retrieve the trackCoach from the container
		
		Coach trackCoach  = context.getBean("myCoach", Coach.class);
		
		//call method from the bean 
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println("Track coach-->"+ trackCoach.getDailyWorkout());
		
		System.out.println("Daily fortune--->"+ trackCoach.getDailyFortune());
		
		//close the context
		
		context.close();
	}

}
