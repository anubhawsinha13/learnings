/**
 * 
 */
package com.a3.learnings.chapter101.models;

/**
 * @author asinha
 *
 */
public class SimpleCalculator {
	
	private double firstNumber;
	private double secondNumber;
	/**
	 * @return the firstNumber
	 */
	public double getFirstNumber() {
		return firstNumber;
	}
	/**
	 * @param firstNumber the firstNumber to set
	 */
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	/**
	 * @return the secondNumber
	 */
	public double getSecondNumber() {
		return secondNumber;
	}
	/**
	 * @param secondNumber the secondNumber to set
	 */
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public double getAdditionResult() {
		
		return( this.firstNumber + this.secondNumber);
	}
	
	public double getSubstractionResult() {
		
		return (this.firstNumber - this.secondNumber);
	}

}
