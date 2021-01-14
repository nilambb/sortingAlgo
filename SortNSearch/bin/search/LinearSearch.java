package search;

import java.util.Arrays;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = new int[] { 7, 8, 4, 5, 1, 9, 6, 3, 2 };
		System.out.println("The array provided - " + Arrays.toString(arr));
		search(arr, 5);
		search(arr, 7);
		search(arr, 2);
		search(arr, 99);
		
		System.out.println("========================================================");
		arr = new int[] { 7, 8, 4, 5, 1, 9, 6, 3, 2 };
		System.out.println("The array provided - " + Arrays.toString(arr));
		search(arr, 5);
		search(arr, 7);
		search(arr, 2);
		search(arr, 99);
	}

	public static void search(int[] arr, int num) {
		int found = linearSearch(arr, num);
		if (found >= 0) {
			System.out.println("The number " + num + " present at index : " + found);
		} else {
			System.out.println("Number " + num + " doesn't present in the provided array.....");
		}
	}

	public static int linearSearch(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;

			}

		}
		return -1;
	}
}
