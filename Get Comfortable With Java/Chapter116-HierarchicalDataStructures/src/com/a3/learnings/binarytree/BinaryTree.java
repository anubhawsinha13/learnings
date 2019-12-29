package com.a3.learnings.binarytree;

public class BinaryTree {
	
	
	Node root;
	
	private BinaryTree(int key) {
		
		root= new Node(key);
		
	}
	
	private BinaryTree() {
		root = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree = new BinaryTree(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		printLeafNode(tree.root);
		

	}
	
	//Operation to print binary tree
	
	public static void printLeafNode(Node node) {
		
		if(node ==null) {
			
			return;
		}
		
		if(node.left == null && node.right==null) {
			System.out.println(" Node value  "+node.key);
		}
		
		printLeafNode(node.left);
		printLeafNode(node.right);
		
	}

}
