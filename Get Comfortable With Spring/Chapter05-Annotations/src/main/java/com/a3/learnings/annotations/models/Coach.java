package com.a3.learnings.annotations.models;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class Coach {
		
	public String getDailyWorkout() {
		
		return "Coach says load the beans from the annotations configurations";
	}

}
