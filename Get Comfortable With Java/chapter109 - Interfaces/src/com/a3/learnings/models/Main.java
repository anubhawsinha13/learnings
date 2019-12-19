package com.a3.learnings.models;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ITelephone timsPhone;
		timsPhone = new DeskPhone(123456);
		timsPhone.powerOn();
		timsPhone.callPhone(123456);
		timsPhone.answer();
		
		timsPhone = new MobilePhone(24545);
		timsPhone.callPhone(24545);
		timsPhone.answer();

	}

}
