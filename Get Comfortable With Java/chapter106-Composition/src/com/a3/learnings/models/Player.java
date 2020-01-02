package com.a3.learnings.models;

public class Player {
	
	//Object that dosent use encapsulation
	public String name;
	public int health;
	public String weapon;
	
	
	public void loseHealth(int damage) {
		 this.health = this.health - damage;
		 if (this.health<=0) {
			 System.out.println(" Played knocked out...");
		 }
		 
		
	}
	
	public int healthRemaining() {
		
		return this.health;
	}

}
