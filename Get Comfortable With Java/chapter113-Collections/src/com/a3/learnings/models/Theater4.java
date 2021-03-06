package com.a3.learnings.models;


/*
 * Theater2 object with collection as the interface and LinkedHashSet as the implementation
 * where the order is maintained
 */


import java.util.*;

public class Theater4 {
	
	private final String theaterName;
	/*
	 * Collection in the HashSet is not ordered
	 */
	private List<Seat> seats = new ArrayList<>();
	
	
	public String getTheaterName() {
		return theaterName;
	}


	public Theater4(String theaterName, int numRows, int seatsPerRow) {
		this.theaterName = theaterName;
		
		int lastRow = 'A'+(numRows-1);
		for(char row = 'A'; row <=lastRow; row++) {
			
			for(int seatNum =1; seatNum<=seatsPerRow;seatNum++) {
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seat);
			}
		}
	}
	
	public boolean reserveSeat(String seatNumber) {
		
		
		
		//Create the object against which the object from the list is supposed to be compared to
		Seat requestedSeat = new Seat(seatNumber);
		int foundSeat  = Collections.binarySearch(seats, requestedSeat, null);
		
		if(foundSeat >=0) {
			
			return seats.get(foundSeat).reserve();
		}
		
		else {
			
			System.out.println(" There is no seat with seat numbre");
			return false;
		}
		
	}
	
	public void getSeats() {
		
		for(Seat seat: seats) {
			System.out.println(seat.getSeatNumber());
		}
	}
	
	
	//Inner class for seat
	private class Seat implements Comparable<Seat>{
		
		private final String seatNumber;
		private boolean reserved = false;
		
		public Seat(String seatNumber) {
			this.seatNumber = seatNumber;
		}
		
		
		public boolean reserve() {
			if(!this.reserved) {
				 this.reserved = true;
				 System.out.println(" Seat "+ seatNumber + " reserved");
				 return true;
			}
			else {
				return false;
			}
		}
		
		public boolean cancel() {
			
			if(this.reserved) {
				this.reserved = false;
				System.out.println(" Seat numbet "+seatNumber + "  has been cancelled");
				return true;
			} else {
				return false;
			}
		}
		
		public String getSeatNumber() {
			return seatNumber;
		}


		@Override
		public int compareTo(Seat seat) {
			return this.seatNumber.compareToIgnoreCase(seat.seatNumber);
		}
		
		
	}

}
