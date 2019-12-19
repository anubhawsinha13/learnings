package com.a3.learnings.models;

public class Main {

	public static void main(String[] args) {
		
		Theater1 theater = new Theater1("Olympian", 200 ,200);
		//theater.getSeats();
		long startTime = System.nanoTime();
		if(theater.reserveSeat("H11")) {
			System.out.println("Please pay for the seat");
			
		}
		else {
			System.out.println(" Sorry seat is already taken");
		}	
		
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Total time of binary search-->"+totalTime);
		
		
		Theater3 theater3 = new Theater3("Olympian", 8 ,12);
		//theater.getSeats();
		long startTime2 = System.nanoTime();
		if(theater3.reserveSeat("H11")) {
			System.out.println("Please pay for the seat");
			
		}
		else {
			System.out.println(" Sorry seat is already taken");
		}	
		
		long endTime2 = System.nanoTime();
		long totalTime2 = endTime2 - startTime2;
		System.out.println(" Total time of brute force search-->"+totalTime2);

	}

}
