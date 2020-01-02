package com.a3.learnings;

public class Outer {
	
	private int outerVaraible;
	
	static class NestedDemo{
		
		public void nestedMethod() {
			System.out.println(" This is a nested class");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NestedDemo innerStaticClass = new NestedDemo();
		innerStaticClass.nestedMethod();
		
		

	}

}
