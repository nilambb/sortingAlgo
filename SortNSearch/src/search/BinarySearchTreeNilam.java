package search;

import java.util.Arrays;

public class BinarySearchTreeNilam {
	class Node {
		int data;
		Node right, left;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	public Node insertRec(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		} else if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else {
			root.right = insertRec(root.right, data);
		}
		return root;
	}

	public void travelsal(Node root) {
		if (root != null) {
			travelsal(root.left);
			System.out.print(root.data + ", ");
			travelsal(root.right);
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
		int arr[] = new int[] { 9, 8, 7, 4, 5, 6, 3, 2, 1 };
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(arr));
		Node root = null;
		BinarySearchTreeNilam tree = new BinarySearchTreeNilam();
		for (int i : arr) {
			root = tree.insertRec(root, i);
		}
		System.out.println("===========================================");
		System.out.println("After sorting - ");
		System.out.print("[");
		tree.travelsal(root);
		System.out.print("]");
		System.out.println();
		int searchArr[] = new int[] { 4, 1, 8, 5, 9, 10, 0, 4785 };
		for (int i : searchArr) {
			if(tree.search(root, i)) {
				System.out.println("Number - " + i + " is present in tree");
			} else {
				System.out.println("Number - " + i + " noooooooooooooooot present");
			}
		}
	}
}
