/**
 * 
 */
package com.a3.learnings.autowiring.models;

/**
 * @author asinha
 *
 */
public class BaseballCoach implements Coach {
	
	
	//define the private field for dependency injection
	
	private FortuneService fortuneService;
	
	//define the constructor for dependency injection 
	
	public BaseballCoach(FortuneService theFortuneService) {

		fortuneService = theFortuneService;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 30 minutes daily on batting practice";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
