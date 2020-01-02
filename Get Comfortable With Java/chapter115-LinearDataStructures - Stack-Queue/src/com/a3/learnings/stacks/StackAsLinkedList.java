package com.a3.learnings.stacks;

public class StackAsLinkedList {
	
	//Define the linkedList  node
	StackNode root;
	
	static class StackNode{
		//define the data in the node
		int data;
		//Define the next node of the linked list
		StackNode next;
		StackNode(int data){
			this.data = data;
		}
	}
	
	public void push(int data) {
		
		StackNode newNode = new StackNode(data);
		
		if(root ==null) {
			root = newNode;
		}else
		{
			StackNode temp = root;
			root = newNode;
			newNode.next = temp;
			
		}
		
		System.out.println(data +" Pushed on to the stack");
	}
	
	public int pop() {
		int popped = Integer.MIN_VALUE;	
		if(root == null) {
			System.out.println(" Stack is Empty");
			return Integer.MIN_VALUE;
		}
		
		else {
			System.out.println("Popped Data "+root.data);
			popped = root.data;
			root = root.next;
			
		}
		return popped;
		
	}
	
	
	public static void main(String args[]) {
		
		StackAsLinkedList newStack = new StackAsLinkedList();	
		newStack.push(10);
		newStack.push(20);
		newStack.push(30);
		System.out.println("=====POP======");
		newStack.pop();
		newStack.pop();
		newStack.pop();
		
	}

}
