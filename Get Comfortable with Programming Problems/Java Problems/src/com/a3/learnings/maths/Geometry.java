/**
 * 
 */
package com.a3.learnings.maths;

import java.util.Scanner;

/**
 * @author asinha (https://github.com/anubhawsinha13)
 *
 */
public class Geometry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		int r = in.nextInt();
		double area = Math.PI * r *r;
		System.out.println("Aread  = "+area);

	}

}
