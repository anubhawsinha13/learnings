/**
 * 
 */
package com.a3.learnings;

import com.a3.learnings.model.Animal;
import com.a3.learnings.model.Dog;

/**
 * @author asinha
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal= new Animal("Animal", 1,1,5,5);
		Dog dog = new Dog("Paul", 8, 20, 2, 4, 1, 20, 24, 12, "long silky");
		
		//Eat method id defined in animal class being inherited for the dog class
		dog.eat();
		dog.walk();
		dog.run();

	}

}
