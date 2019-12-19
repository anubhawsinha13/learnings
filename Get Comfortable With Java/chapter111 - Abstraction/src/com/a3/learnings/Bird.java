package com.a3.learnings;

public class Bird extends Animal implements CanFly{

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println( getName() +" is pecking");
		
	}

	@Override
	public void breathe() {
		System.out.println(" Breathe in, breathe out, repeat");
		
	}

	@Override
	public void fly() {
		System.out.println(" Flip flop - I am flying");
	}
	
	// all the above methods have implementation, but one method in the class requires the class to be defined 
	// as abstract
	
//	public abstract void fly();
	
	
	
	

}
