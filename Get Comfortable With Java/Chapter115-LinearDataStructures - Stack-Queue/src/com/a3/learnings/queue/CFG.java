package com.a3.learnings.queue;

import java.util.Stack;

public class CFG {
	
	static class Queue{
		static Stack<Integer> s1 = new Stack<Integer>();
		static Stack<Integer> s2 = new Stack<Integer>();
		
		static void enque(int x) {
			
			//move all elements from s1 to s2
			while(!s1.isEmpty()) {
				
				s2.push(s1.pop());
				
			}
			
			//push the new item to s1
			s1.push(x);
			
			//push everything back to s1
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
			
		}
		
		static int dequeue() {
			
			//if the first stack is empty return error
			if(s1.isEmpty()) {
			System.out.println("Queue is empty");
			System.exit(0);
			}
			
			int x= s1.pop();
			return x;
		
		}
		
		public static void main(String args[]) {
			Queue q = new Queue();
			q.enque(10);
			q.enque(20);
			q.enque(30);
			
			System.out.println(q.dequeue());
			System.out.println(q.dequeue());
			System.out.println(q.dequeue());
			
		}
	}

}
