package search;

import java.util.Arrays;

public class BinarySearch {
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = high;
		int counter = low;
		for (int i = low; i < high; i++) {
			if (arr[i] < arr[pivot]) {
				if (i != counter) {
					swap(arr, counter, i);
				}
				counter++;
			}
		}
		if (counter != pivot) {
			swap(arr, pivot, counter);
		}
		return counter;
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (high <= low) {
			return;
		}
		int part = partition(arr, low, high);
		quickSort(arr, low, part - 1);
		quickSort(arr, part + 1, high);
	}

	public static void search(int[] arr, int num) {
		int found = binarySearch(arr, num);
		if (found >= 0) {
			System.out.println("The number " + num + " is present at index : " + found);
		} else {
			System.out.println("The number " + num + " is not present in the array..........");
		}
	}

	public static int binarySearch(int arr[], int num) {
		quickSort(arr, 0, arr.length - 1);
		System.out.println("Array after sorting - " + Arrays.toString(arr));
		int low = 0;
		int high = arr.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == num) {
				return mid;
			} else if (arr[mid] < num) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 7, 8, 4, 5, 1, 9, 6, 3, 2 };
		System.out.println("The array provided - " + Arrays.toString(arr));
		search(arr, 5);
		arr = new int[] { 7, 8, 4, 5, 1, 9, 6, 3, 2 };
		System.out.println("The array provided - " + Arrays.toString(arr));
		search(arr, 7);
		arr = new int[] { 7, 8, 4, 5, 1, 9, 6, 3, 2 };
		System.out.println("The array provided - " + Arrays.toString(arr));
		search(arr, 2);
		arr = new int[] { 7, 8, 4, 5, 1, 9, 6, 3, 2 };
		System.out.println("The array provided - " + Arrays.toString(arr));
		search(arr, 99);
		
		System.out.println("===================================================================");
		
		arr = new int[] { 7, 8, 4, 5, 1, 9, 6, 3, 2 };
		System.out.println("The array provided - " + Arrays.toString(arr));
		search(arr, 5);
		arr = new int[] { 7, 4, 5, 1, 9, 6, 3, 2 };
		System.out.println("The array provided - " + Arrays.toString(arr));
		search(arr, 7);
		arr = new int[] { 7, 4, 5, 1, 9, 6, 3, 2 };
		System.out.println("The array provided - " + Arrays.toString(arr));
		search(arr, 2);
		arr = new int[] { 7, 4, 5, 1, 9, 6, 3, 2 };
		System.out.println("The array provided - " + Arrays.toString(arr));
		search(arr, 99);
	}
}
