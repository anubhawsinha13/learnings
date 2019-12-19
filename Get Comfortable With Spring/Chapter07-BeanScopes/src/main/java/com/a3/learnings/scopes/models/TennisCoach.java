package com.a3.learnings.scopes.models;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	//define my init method
	
	@PostConstruct
	public void doMyStartupStuff() {
		
		System.out.println(">> Tennis coach inside do my startup stuff");
	}
	
	//define my destroy method
	
	@PreDestroy
	public void doMyDestroystuff() {
		System.out.println(">>>> Tennis coach do my destory stuff");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Return to the tennis coach for practice";
	}
	
	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
		
	}

	}
