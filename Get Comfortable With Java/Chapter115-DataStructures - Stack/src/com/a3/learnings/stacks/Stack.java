package com.a3.learnings.stacks;

public class Stack {
	
	// define the top of the stack.
	int top;
	
	//define the max size for the array
	private static final int MAX= 1000;
	//define the array which will represent stack with max size 
	int a[] = new int[MAX];
	
	//Step 1: check if the stack is full
	boolean isEmpty() {
		return (top<0);
	}
	
	//constructor to initialize the top of the stack.
	Stack(){
		top = -1;
	}
	
	boolean push (int x) {
	
		if(top>=(MAX-1)) {
			System.out.println(" Stack overflow");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println(x +" pushed into the stack ");
			 return true;
		}
	}
		
	int pop() {
		
		if(top<0) {
			System.out.println(" Stack Underflow");
			return 0;
			
		}
		else {
			int x = a[top--];
			System.out.println(x +" Popped out oft he stack");
			return x;
		}
	}
	
}

//Driver class 
class Main{
	public static void main(String args[]) {
		
		Stack s = new Stack();
		s.push(10);
		s.pop();
	}
}
