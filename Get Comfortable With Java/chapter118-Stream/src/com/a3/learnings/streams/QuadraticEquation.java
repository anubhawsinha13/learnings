/**
 * Implement the function findRoots to find the roots of the quadratic equation: ax2 + bx + c = 0.

The roots of the quadratic equation can be found with the following formula: 

A quadratic equation.

For example, the roots of the equation 2x2 + 10x + 8 = 0 are -1 and -4.
 */
package com.a3.learnings.streams;

/**
 * @author asinha (https://github.com/anubhawsinha13)
 *
 */
public class QuadraticEquation {
    public static Roots findRoots(double a, double b, double c) {

    	
    	double root1 = 0, root2 = 0;
    	double determinant = b*b - 4*a*c;
    	Roots root = null;
    	//condition for real and different roots
    	if( determinant>0) {
    		root1= (-b + Math.sqrt(determinant))/(2*a);
    		root2= (-b - Math.sqrt(determinant))/(2*a);
    		//System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
    		
    	}
    	//for real and equal roots
    	else if(determinant==0) {
    		
    		root1 = root2 = -b/(2*a);
    	}
    	
    	 root = new Roots(root1,root2);
    	return root;
    }
    
    public static void main(String[] args) {
        Roots roots = QuadraticEquation.findRoots(2, 10, 8);
        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
    }
}

class Roots {
    public final double x1, x2;

    public Roots(double x1, double x2) {         
        this.x1 = x1;
        this.x2 = x2;
    }
}
