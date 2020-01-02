package com.a3.learnings.models;

public class Monitor {
	
	private String model;
	private String manufacturer;
	private int size;
	
	//Composition: Resolution is a component of a monitor
	private Resolution nativeResolution;
	
	
	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixelAt( int x, int y, String color) {
		
		System.out.println(" Drawing pixel at x as " +x+" and Y as  "+y+ " using the color "+color);
		
	}

}
