/**
 * 
 */
package com.a3.learnings.maths;

import java.util.Scanner;

/**
 * @author asinha (https://github.com/anubhawsinha13)
 *
 */
public class Average {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the numbers of digits to find the average:");
		
		int n = in.nextInt();
		double average = 0;
		int a[] = new int[n];	
		System.out.println("Enter the numbers :");
		for(int i=0; i<=n-1;i++) {
			a[i] = in.nextInt();
			average += a[i];
			
		}
		System.out.println("Average :"+average/n);
		
		

	}

}
