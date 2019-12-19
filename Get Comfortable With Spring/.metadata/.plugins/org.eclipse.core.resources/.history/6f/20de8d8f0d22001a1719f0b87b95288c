/**
 * 
 */
package com.a3.learnings.chapter101.models;

/**
 * @author asinha
 *
 */
public class Account {
	
	private String number;
	private double balance;
	private String customerName;
	private String emailAddress;
	private String phoneNumber;
	
	
	public Account() {
		
		this("0000", 0.0, "CustomerName", "email@email.com", "12233878789");
		System.out.println(" Empty constructor called...");
	}
	
	//overloading the constructor
	
	public Account(String number, double balance, String customerName, String emailAddress, String phoneNumber) {
		
		System.out.println(" Initialized the account constructor with prameters : ");
		
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.emailAddress = emailAddress;
		this.phoneNumber  = phoneNumber;
		
		
		
	}
	
	
	public void deposit(double depositAmount) {
		
		this.balance +=depositAmount;
		System.out.println("deposit of amount -"+depositAmount+"  made the new balance --"+this.balance);
		
	}
	
	public void withdrawl(double withdrawlAmount) {
		
		if(this.balance - withdrawlAmount <0) {
			System.out.println("Only "+ this.balance + "  available. Withdrawl was not processed");
		}
		else {
			this.balance -=withdrawlAmount;
			System.out.println("Withdrawl of "+ withdrawlAmount +" processed . Remaining balance "+ this.balance);
		}
	}
	
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
