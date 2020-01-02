package com.a3.learnings.models;


//Inherits from the super class vehicle
public class Car extends Vehicle {
	
	
	private int doors;
	private int engineCapacity;

	public Car(String name, int doors, int engineCapacity) {
		super(name);
		this.doors = doors;
		this.engineCapacity = engineCapacity;
		
	}

}
