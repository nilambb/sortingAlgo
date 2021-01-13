package sort;

import java.util.Arrays;

public class QuickSortDescNilam {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 9, 8, 10, 6, 2, 4, 5, 3, 7 };
		System.out.println("Before sorting ---------------------");
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length -1);
		System.out.println("After sorting ----------------------");
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr, int lower, int high) {
		if(high <= lower) {
			return;
		}
		int partIndex = partition(arr, lower, high);
		quickSort(arr, lower, partIndex - 1);
		quickSort(arr, partIndex + 1, high);
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int partition(int[] arr, int lower, int high) {
		int pivot = high;
		int counter = lower;
		for(int i = lower; i < high; i++) {
			if(arr[i] > arr[pivot]) {
				if(i != counter) {
					swap(arr, i, counter);
				}
				counter++;
			}
		}
		if(pivot != counter) {
			swap(arr,pivot, counter);
		}
		return counter;
	}
}
