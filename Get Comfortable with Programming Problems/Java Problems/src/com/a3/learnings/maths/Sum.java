package com.a3.learnings.maths;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the number that needs to be added:\n");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int sum = Math.addExact(x, y);
		
		System.out.println("Total:"+sum);
		System.out.println("Remainder:" + x % y);
		

	}

}
