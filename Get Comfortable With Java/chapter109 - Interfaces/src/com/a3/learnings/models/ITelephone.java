/**
 * 
 */
package com.a3.learnings.models;

/**
 * @author asinha
 *
 *This is an interface which defines the blueprint of any telephone.
 */
public interface ITelephone {
	
	public void powerOn();
	public void dial(int phoneNumber);
	public void answer();
	public boolean callPhone(int phoneNumber);
	public boolean isRinging();

}
