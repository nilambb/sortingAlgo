package sort;

import java.util.Arrays;

public class QuickSortAscAnotherNilam {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 9, 8, 10, 6, 2, 4, 5, 3, 7 };
		System.out.println("Before sorting ---------------------");
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length -1);
		System.out.println("After sorting ----------------------");
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int partiotion(int[] arr, int low, int high) {
		int pivot = low;
		int counter = high;
		for(int i= high; i > low; i--) {
			if(arr[i] > arr[pivot]) {
				if(counter != i) {
					swap(arr, counter, i);
				}
				counter--;
			}
		}
		if(counter != pivot) {
			swap(arr, counter, pivot);
		}
		return counter;
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if(high <= low) {
			return;
		}
		int partIndex = partiotion(arr, low, high);
		quickSort(arr, low, partIndex - 1);
		quickSort(arr, partIndex + 1, high);
		
	}
}
