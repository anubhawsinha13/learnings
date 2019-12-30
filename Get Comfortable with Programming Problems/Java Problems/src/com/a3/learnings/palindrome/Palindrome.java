package com.a3.learnings.palindrome;

public class Palindrome {

	public static void main(String[] args) {
		checkPalindrome("malayalam"); 
	    checkPalindrome("GeeksforGeeks"); 
	}
	
	public static void checkPalindrome(String s) {
		String reverse  = new StringBuffer(s).reverse().toString();
		
		if(s.equals(reverse)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
