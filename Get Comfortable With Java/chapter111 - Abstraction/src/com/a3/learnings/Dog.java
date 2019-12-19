package com.a3.learnings;

public class Dog extends Animal{
	
	

	public Dog(String name) {
		super(name);
	}

	@Override
	public void eat() {
		
		//Since the getName getter was defined in the abstract class it is available in subclass
		System.out.println(getName() + " is eating ");
		
	}

	@Override
	public void breathe() {
		
		System.out.println(" Breathe in breathe out and repeat");
		
	}

}
