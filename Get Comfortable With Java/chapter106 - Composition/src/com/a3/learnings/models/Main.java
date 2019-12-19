package com.a3.learnings.models;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player = new Player();
		player.name = "tim";
		player.health = 20;
		player.weapon = "sword";
		
		int damage = 10;
		player.loseHealth(damage);
		
		System.out.println(" Remaining health = "+player.health);
		
		//Control of the values of the instance is not the object itself.
		player.health = 200;
		player.loseHealth(10);
		
		
		System.out.println(" Remaing health --"+player.health);

	}

}
