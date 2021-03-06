package com.a3.learnings.models;

public class MobilePhone implements ITelephone {
	
	
	private int myNumber;
	private boolean isRinging;
	private boolean isOn = false;
	
	

	public MobilePhone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
System.out.println("Mobile phone is powered on ");
	}

	@Override
	public void dial(int phoneNumber) {
		// TODO Auto-generated method stub
		
		System.out.println(" Now ringing the + "+ phoneNumber +" on the mobile Phone");

	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		
		if(isRinging) {
			System.out.println(" Answering the mobile phone");
			isRinging = false;
		}

	}

	@Override
	public boolean callPhone(int phoneNumber) {
		// TODO Auto-generated method stub
		
		if(phoneNumber == myNumber) {
			isRinging = true;
			System.out.println(" Melody ring");
			
		}
		else {
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	}

}
