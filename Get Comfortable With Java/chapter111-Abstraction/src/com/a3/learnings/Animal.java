package com.a3.learnings;

public abstract class Animal {
	
	private String name;
	
	//An interface cannot have constructor as there is no need of creating an instance of interface

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}



	//method should be defined abstract if no body is defined.
	public abstract void eat();
	public abstract void breathe();
	
	

}
