package Sortieralgorithmen;

import java.util.Arrays;

public class SortingAlgorithmMain {

	public static void main(String[] args) {
		int[] zahlenArray = {1, 3, 5, 3, 65, 2, 4, 122};
		int[] NewArray = BubbleSort.bubble_sort(zahlenArray);
		
		System.out.println(Arrays.toString(NewArray));
	}

}
