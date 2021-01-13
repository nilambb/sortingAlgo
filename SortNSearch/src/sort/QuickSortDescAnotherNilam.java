package sort;

import java.util.Arrays;

public class QuickSortDescAnotherNilam {
	public static void main(String[] args) {
		int[] a = new int[] {11,8,2,7,3,15,6,20,99,174};
		System.out.println("Before Sorting ");
		System.out.println(Arrays.toString(a));
		quickSort(a, 0, a.length -1 );
		System.out.println("==============================================");
		System.out.println("After Sorting ");
		System.out.println(Arrays.toString(a));
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int partition(int arr[], int low, int high) {
		int pivot = low;
		int counter = high;
		for(int i = high; i > low; i--) {
			if(arr[i] < arr[pivot]) {
				if(i != counter) {
					swap(arr, i, counter);
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
		int part = partition(arr, low, high);
		quickSort(arr, low, part - 1);
		quickSort(arr, part + 1, high);
	}
}
