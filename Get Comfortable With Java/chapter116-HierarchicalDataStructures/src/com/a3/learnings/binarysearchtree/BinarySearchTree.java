package com.a3.learnings.binarysearchtree;

public class BinarySearchTree {
	
		TreeNode root;
	
	
	private TreeNode addRecursive(TreeNode current, int value) {
		
		if(current ==null) {
			return new TreeNode(value);
		}
		
		if(value < current.value) {
			current.left = addRecursive(current.left, value);
		}
		else if(value >current.value){
			current.right = addRecursive(current.right, value);			
		}else {
			return current;
		}
		return current;
	}
	
	//Add method to add the recursion from the root.
	
	public void add(int value) {
		root = addRecursive(root, value);
	}
	
	public static void main(String args[]) {
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.add(6);
		tree.add(4);
		tree.add(8);
		printLeafNode(tree.root);
		
	}
	
	public static void printLeafNode(TreeNode node) {
		if(node==null) {
			return;
		}
		
		if(node.left==null && node.right==null) {
			System.out.println(" Value of the node "+node.value);
		}
		
		printLeafNode(node.left);
		printLeafNode(node.right);
	}
	

}
