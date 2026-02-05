package Sortieralgorithmen;

public class BubbleSort {
	
	public static int[] bubble_sort(int[] zahlenArray) {
		for(int i = 0; i < zahlenArray.length -1; i++) {
			for(int j = 0; j < zahlenArray.length -1 -i; j++) {
				if(zahlenArray[j] > zahlenArray[j + 1]) {
					//Größere Zahlen wandern ganz nach rechts
					int temp = zahlenArray[j];
					zahlenArray[j] = zahlenArray[j+1];
					zahlenArray[j + 1] = temp;
				}
			}
		}
		return zahlenArray;
	}
}
