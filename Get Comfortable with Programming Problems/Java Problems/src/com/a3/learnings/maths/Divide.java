package com.a3.learnings.maths;

import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the number that needs to be added:\n");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println("Remainder:" + x % y);

	}

}
