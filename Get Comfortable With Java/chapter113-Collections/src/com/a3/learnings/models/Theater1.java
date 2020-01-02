package com.a3.learnings.models;


/*
 * Theater object with List as the collection of objects(Seats)
 */
import java.util.ArrayList;
import java.util.List;

public class Theater1 {
	
	private final String theaterName;
	public List<Seat> seats = new ArrayList<>();
	
	
	public String getTheaterName() {
		return theaterName;
	}


	public Theater1(String theaterName, int numRows, int seatsPerRow) {
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
		
		Seat requestedSeat = null;
		for(Seat seat : seats) {
			
			if(seat.getSeatNumber().equals(seatNumber)) {
				requestedSeat = seat;
				break;
			}
		}
		
		if(requestedSeat == null) {
			System.out.println(" There is no seat with number -"+seatNumber);
			
			return false;
		}
		
		return requestedSeat.reserve();
	}
	
	public void getSeats() {
		
		for(Seat seat: seats) {
			System.out.println(seat.getSeatNumber());
		}
	}
	
	
	//Inner class for seat
	public class Seat{
		
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
		
		
	}

}