package Sortieralgorithmen;

public class InsertionSort {
	public static void insertionSort(int[] arr) {
		int sorted, unsorted, temp;
		
		//Laufe durch das Array und nehme eines nach dem anderen aus unsorted
		for(sorted = 0; sorted < arr.length - 1; sorted++) {
			unsorted = sorted +1;
			temp = arr[unsorted];
			
			// Solange temp kleiner ist, schiebe die größeren Elemente nach rechts
			while(unsorted > 0 && temp < arr[unsorted-1]) {
				arr[unsorted] = arr[unsorted -1];
				unsorted--;
			}
			
			// Setze temp an die richtige Position (Die Stelle unsorted)
			arr[unsorted] = temp;
		}
	}
}