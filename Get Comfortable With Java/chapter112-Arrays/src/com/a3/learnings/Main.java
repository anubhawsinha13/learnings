package com.a3.learnings;

public class Main {

	public static void main(String[] args) {
		
			//Ways of assigning data in the array.//
//		int[] myVariable;
//		myVariable = new int[10];
//		myVariable[5] = 50;
		int[] myVariable = {1,2,3,4,5,6,7,8,9,0,11};
		
		for(int i=0; i<10;i++) {
			myVariable[i] = i*10;
		}
		
//		for(int a:myVariable) {
//			System.out.println(" Value at position"+ a);
//		}
		
		printArray(myVariable);

	}
	
	public static void printArray(int[] myArray) {
		
		for(int i=0; i<myArray.length;i++) {
			System.out.println("Element " +i+ "  value is  "+myArray[i]);
		}
		
	}

}
