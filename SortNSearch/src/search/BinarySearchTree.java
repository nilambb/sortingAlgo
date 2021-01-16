package search;

import java.util.Arrays;

public class BinarySearchTree {
	class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	Node root;

	public BinarySearchTree() {
		root = null;
	}

	public Node insertNode(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		if (data < root.data) {
			root.left = insertNode(root.left, data);
		} else if (data > root.data) {
			root.right = insertNode(root.right, data);
		}
		return root;
	}

	public void traversal(Node node) {
		if (node != null) {
			traversal(node.left);
			System.out.print(node.data + ", ");
			traversal(node.right);
		}
	}

	public boolean search(Node root, int key) {
		if (root == null) {
			return false;
		}
		if (root.data == key) {
			return true;
		} else if (key < root.data) {
			return search(root.left, key);
		} else {
			return search(root.right, key);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 4, 7, 8, 5, 2, 3, 6, 9 };
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(arr));
		System.out.println("==================================================");
		System.out.println("Array after sorting");
		BinarySearchTree tree = new BinarySearchTree();
		for (int i : arr) {
			tree.root = tree.insertNode(tree.root, i);
		}
		System.out.println();
		System.out.print("[");
		tree.traversal(tree.root);
		System.out.print("]");
		System.out.println();
		int[] searchArr = new int[] {7, 5, 1, 10,1111};
		for (int i : searchArr) {
			boolean isPresent = tree.search(tree.root, i);
			if(isPresent) {
				System.out.println("The number " + i + " is present in binary tree" );
			} else {
				System.out.println("not present -------------" + i + " in tree");
			}
		}
	
	}
}
