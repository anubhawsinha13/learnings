/**
 * 
 */
package com.a3.learnings.chapter101;

import com.a3.learnings.chapter101.models.Account;

/**
 * @author asinha
 *
 */
public class BankApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 
		
		//Use the constructor to initialize the object	
	
		
		//Account bobsAccount = new Account( "12345", 0.0, "Bob", "myemail.email.com", "8002074078");
		Account bobsAccount = new Account();
		
		System.out.println(" Account Owner : "+bobsAccount.getCustomerName());
		bobsAccount.withdrawl(100.0);
		
		bobsAccount.deposit(50.0);
		bobsAccount.withdrawl(100.0);
		
		bobsAccount.deposit(51.0);
		bobsAccount.withdrawl(100.0);
		
		
		

	}

}
