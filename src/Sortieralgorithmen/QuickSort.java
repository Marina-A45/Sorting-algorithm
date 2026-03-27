package Sortieralgorithmen;

public class QuickSort {
	
	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	private static void quickSort(int[] arr, int left, int right) {
		if (left < right) {
			int pivotIndex = partition(arr, left, right);
			
			quickSort(arr, left, pivotIndex -1);
			quickSort(arr, pivotIndex +1, right);
		}
	}
	
	private static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int j = left -1;
		
		for(int i = left; i < right; i++) {
			if(arr[i] <= pivot) {
				j++;
				swap(arr, i, j);
			}
		}
		
		swap(arr, j +1, right);
		return j + 1;
	}
	
	private static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
