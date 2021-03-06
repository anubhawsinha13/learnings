package com.a3.learnings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingDescending {
	
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
		//get integers as input stream
		//
		int[] myIntegers = getIntegers(5);
		
		//read the array and sort the array in descending order
		
		int[] sortedArray = sortArray(myIntegers);
		
		System.out.println(Arrays.toString(sortedArray));
		
		
	}
	
	public static int[] getIntegers(int capacity)
	
	{
		int[] array = new int[capacity];
		System.out.println("Enter "+ capacity +" numbers to be sorted:\r");
		
		for(int i=0; i<capacity;i++) {
			
			array[i] = scanner.nextInt();
		}
		
		return array;
		
	}
	
	
	public static int[] sortArray(int[] array) {
		
//		 Arrays.sort(array);
//		System.out.println(" Sorted array-->"+Arrays.toString(array));
		
		//Assign the array to a new array to be returned
		int[] sortedArray = new int[array.length];
		for(int i=0;i<array.length;i++) {
			sortedArray[i] = array[i];
		}
		
		//sort the array
		//define a flag which breaks the loop when the array is sorted
		boolean flag = true;
		//define the temp variable which will hold the value of the element before assigning to the new array
		int temp;
		//exit the while loop only when the array is sorted
		while(flag) {
			
			//set the value of flag to false to assume that the array is sorted
			flag = false;
			//iterate the loop only length -1 times and the elements compared is 2 at a time.
			for(int i=0;i<sortedArray.length-1;i++) {
				
				if(sortedArray[i]<sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
			
		}
		
		
		return sortedArray;
		
	}
}
