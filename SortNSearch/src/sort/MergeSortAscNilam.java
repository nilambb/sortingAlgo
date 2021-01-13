package sort;

import java.util.Arrays;

public class MergeSortAscNilam {
	public static void mergeSort(int[] a) {
		int n = a.length;
		if (n == 1) {
			return;
		}
		int mid = n / 2;
		int[] left = new int[mid];
		int[] right = new int[n - mid];
		int count = 0;
		int i;
		for (i = 0; i < left.length; i++) {
			left[i] = a[count];
			count++;
		}
		for (i = 0; i < right.length; i++) {
			right[i] = a[count];
			count++;
		}
		mergeSort(left);
		mergeSort(right);
		merge(a, left, right);

	}

	public static void merge(int[] arr, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}

		if (i == left.length) {
			while (j < right.length) {
				arr[k++] = right[j++];
			}
		} else {
			while (i < left.length) {
				arr[k++] = left[i++];
			}
		}
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 9, 8, 7, 6, 5, 4 };
		// new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		// new int[] { 3, 2, 1, 6, 5, 4, 9, 8, 7 };
		// new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		// new int[] { 1, 8, 4, 6, 5, 3, 9, 2, 7 };
		System.out.println("Before sorting ");
		System.out.println(Arrays.toString(a));
		mergeSort(a);
		System.out.println("======================================");
		System.out.println("After sorting");
		System.out.println(Arrays.toString(a));
	}
}
