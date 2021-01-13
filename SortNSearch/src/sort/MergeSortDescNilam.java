package sort;

import java.util.Arrays;

public class MergeSortDescNilam {
	public static void mergeSort(int[] arr) {
		int len = arr.length;
		if (len < 2) {
			return;
		}
		int mid = len / 2;
		int[] left = new int[mid];
		int[] right = new int[len - mid];
		int count = 0;
		int i;
		for (i = 0; i < left.length; i++) {
			left[i] = arr[count++];
		}
		for (i = 0; i < right.length; i++) {
			right[i] = arr[count++];
		}
		mergeSort(left);
		mergeSort(right);
		merge(arr, left, right);
	}

	public static void merge(int[] arr, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] > right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}

		if (i < left.length) {
			while (i < left.length) {
				arr[k++] = left[i++];
			}
		}

		if (j < right.length) {
			while (j < right.length) {
				arr[k++] = right[j++];
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {7,4,1,8,9,6,5,2,3};
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(arr));
		mergeSort(arr);
		System.out.println("========================================");
		System.out.println("After sorting");
		System.out.println(Arrays.toString(arr));
	}
}
