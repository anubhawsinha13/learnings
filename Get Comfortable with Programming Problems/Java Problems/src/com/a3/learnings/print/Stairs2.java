/**
 * 
 */
package com.a3.learnings.print;

import java.util.Scanner;

/**
 * @author asinha (https://github.com/anubhawsinha13)
 *
 */
public class Stairs2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    String str="#";
	    for (int i=0;i<n;i++)
	        { 
	        System.out.printf("%"+n+"s%n",str);
	        str=str+"#";
	    }
	}

}
