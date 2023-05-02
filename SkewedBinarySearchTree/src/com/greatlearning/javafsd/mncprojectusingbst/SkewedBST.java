package com.greatlearning.javafsd.mncprojectusingbst;

public class SkewedBST {

	Node root;
	Node prev;

	public void convertToSkewed(Node root) {
		if (root == null) {
			return;
		}

		convertToSkewed(root.left);

		if (prev == null) {
			this.root = root;

		} else {
			prev.right = root;

		}
		Node right = root.right;
		root.left = null;
		prev = root;
		convertToSkewed(right);

	}

	public void inOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		//inOrderTraversal(root.left);
		System.out.print(root.value + " ");
		inOrderTraversal(root.right);
	}

}
