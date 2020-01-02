package com.a3.learnings.binarytree;

public class Node {
	
	//define the root of the node
	int key;
	//define the left and the right child
	Node left, right;
	
	public Node(int item) {
		this.key = item;
		left = right = null;
	}

}
