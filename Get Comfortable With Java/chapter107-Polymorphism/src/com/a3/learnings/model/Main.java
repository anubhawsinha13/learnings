package com.a3.learnings.model;



//Base class that defines the movie Object
class Movie{
	
	private String name;
	
	public Movie(String name) {
		
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}



	public String Plot() {
		
		return "no plot here";
	}
}

//Child class that extends the movie object and inherits the properties of movie object.
class Jaws extends Movie{
		
	public Jaws() {
		
		super("Jaws");
	}
	
	@Override
	public String Plot() {
		
		return "A shark eats lots of people";
	}
	
}


public class Main {

	public static void main(String[] args) {
		
		
for(int i=0; i<9; i++) {

	Movie movie = RandomMovie();
	System.out.println("Random movie name --> "+movie.getName());
	System.out.println(" Plot of the movie -->"+ movie.Plot());
	
}

	}
	
	public static Movie RandomMovie() {
		
		int randomNumber = (int)(Math.random() *5)+1;
		
		System.out.println(" Random number generated in # "+randomNumber);
		
		switch(randomNumber) {
		
		case 1: 
			return new Jaws();
		}
		return null;
	}

}
