package com.a3.learnings.models;

import java.util.*;

public class CopyList {

	public static void main(String[] args) {
		// How to copy a collection in another list
		
		Theater1  theater = new Theater1("Olympian", 8,12);
		List<Theater1.Seat> seatCopy = new ArrayList<>(theater.seats);
		printList(seatCopy);
		
		seatCopy.get(1).reserve();
		if(theater.reserveSeat("A02")) {
			System.out.println("Please pay for A02");
		}
		else {
			System.out.println("Seat is already reserved ....");
		}
		
		Collections.reverse(seatCopy);
		System.out.println(" =======Printing seatCopy=====");
		printList(seatCopy);
		
		//Theater1.Seat minSeat = Collections.min(seatCopy);
		

	}
	public static void printList(List<Theater1.Seat> list) {
		for(Theater1.Seat seat: list) {
			System.out.println("   "+seat.getSeatNumber());
		}
		System.out.println("========================");
		
	}
	
	

}
