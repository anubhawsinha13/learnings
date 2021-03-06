package com.a3.learnings;

import java.util.Scanner;

public class AddNumbers {
	
	/*
	 * system.in allows you to type input in the console, 
	 * just like system.out which lets you print out on console.
	 */
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] myIntegers = getIntegers(5);
		printArray(myIntegers);
		getAverage(myIntegers);
		

	}
	
	public static int[] getIntegers(int number) {
		
		System.out.println("Enter "+ number + " integer values: \r");
		int[] values = new int[number];
		
		for(int i =0; i<values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}
	
	public static void printArray(int[] array){
		
		for(int i=0; i<array.length;i++) {
			System.out.println("Element " +i+ "  value is  "+array[i]);
		}
		
	}
	
	
	/*
	 * Get average of the sum of elements in the array
	 * 
	 * Average = sum of terms/number of terms
	 * 
	 */
	
	public static double getAverage(int[] array) {
		
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum +=array[i];
		}
		
		double average = sum/array.length;
		System.out.println("Average of the integers = "+average);
		return average;
		
	}

}
