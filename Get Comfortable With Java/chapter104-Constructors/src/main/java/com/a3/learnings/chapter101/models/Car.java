package com.a3.learnings.chapter101.models;


/*
 * Sample object that represents a car
 */
public class Car {
	
	//State of the car, which can also be called as the attributes of a car.
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	

	
	public void setModel( String model) {
		
		//this.model always refers to the attribute of the class and the left side attribute is 
		//the attribute that is passed in the method.
		this.model = model;
	}
	
	
	//This is the behavior of the object with which it return the model to the caller when asked for. 
	public String getModel() {
		
		return this.model;
	}
}
