package sort;

import java.util.Arrays;

public class QuickSortAnotherDummy {
	static int partition(int[] array, int begin, int end) {
	    int pivot = end;
	    int temp;
	    int counter = begin;
	    for (int i = begin; i < end; i++) {
	        if (array[i] < array[pivot]) {
	        	if(i != counter) {
	        		temp = array[counter];
		            array[counter] = array[i];
		            array[i] = temp;

	        	}
	        	counter++;
	        }
	    }
	    if(pivot != counter) {
	    	temp = array[pivot];
		    array[pivot] = array[counter];
		    array[counter] = temp;
	    }
	    return counter;
	}

	public static void quickSort(int[] array, int begin, int end) {
	    if (end <= begin) return;
	    int pivot = partition(array, begin, end);
	    quickSort(array, begin, pivot-1);
	    quickSort(array, pivot+1, end);
	}
	
	public static void main(String[] args) 
    {
        // This is unsorted array
        int[] array = new int[] { 12, 130, 24, 90, 3, 6, 10, 70 };
 
        // Let's sort using quick sort
        quickSort( array, 0, array.length - 1);
 
        // Verify sorted array
        System.out.println(Arrays.toString(array));
    }

}
