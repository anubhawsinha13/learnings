package com.a3.learnings.models;


import org.springframework.stereotype.Component;

@Component
public class Bird implements Animal {
	
	

	@Override
	public void eat() {
		System.out.println(" Birds eatingh chillis ....");

	}

	@Override
	public void breathe() {
		System.out.println(" Breathe in, breathe out ,  repeat");

	}

}
