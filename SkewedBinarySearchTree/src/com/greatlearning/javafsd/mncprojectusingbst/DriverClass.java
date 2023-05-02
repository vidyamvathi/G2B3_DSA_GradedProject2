package com.greatlearning.javafsd.mncprojectusingbst;

public class DriverClass {

	Node root;

	public static void main(String[] args) {

		DriverClass tree = new DriverClass();

		tree.root = new Node(50);
		tree.root.left = new Node(30);
		tree.root.right = new Node(60);
		tree.root.left.left = new Node(10);
		tree.root.right.left = new Node(55);

		// Converted to Skewed Tree

		SkewedBST skewed = new SkewedBST();

		skewed.root = tree.root;
		skewed.prev = null;
		skewed.convertToSkewed(tree.root);

		// Display the node values in ascending order

		System.out.print("Node values present in ascending order:\n");
		skewed.inOrderTraversal(skewed.root);
	}

}
