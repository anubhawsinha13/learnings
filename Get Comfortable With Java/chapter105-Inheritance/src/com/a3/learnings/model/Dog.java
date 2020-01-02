/**
 * 
 */
package com.a3.learnings.model;

/**
 * @author asinha
 *
 */
public class Dog extends Animal {

	// Propertied inherited from Animal class
	/**
	 * @param name
	 * @param brain
	 * @param body
	 * @param size
	 * @param weight
	 */

	// Specific properties of dog class
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth,
			String coat) {

		// super in the class where this class extends from the base class.
		// super(name, brain, body, size, weight);
		super(name, 1, 1, size, weight);

		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;

		// initialize the dog parameters

	}

	private void chew() {

		System.out.println(" Dog chew called");
	}

	// Override the methods from the super class
	@Override
	public void eat() {
		System.out.println("Dog eat called");
		chew();
		super.eat();
	}

	public void walk() {

		System.out.println(" Dog walk class called");
		// Move is inherited from Animal without using super
		move(5);

	}

	public void run() {
		System.out.println(" Dog run class called");
		// Go directy to super class and dont call the overriden move
		super.move(10);

	}

	public void moveLegs() {
		System.out.println(" Dog movelegs called");
	}

	@Override
	public void move(int speed) {

		System.out.println(" DOg.move called ");
		moveLegs();
		super.move(speed);

	}

}
