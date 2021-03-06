package com.a3.learnings;

//Generic class which takes any type of objects
//<> is used to define the object types.
class Test<T>

{
	T obj;
	public Test(T obj) {
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
}
public class Main {
	
	public static void main (String args[]) {
		
		
		//Instance of integer type
		Test<Integer> 	iobj = new Test<Integer>(200);
		System.out.println("Printing the object---"+iobj.getObject());
		
		//Instance of test using string
		Test<String> sObj = new Test<String>("a3 private company");
		System.out.println("Printing the string object-->"+sObj.getObject());
	}
	
	

}
