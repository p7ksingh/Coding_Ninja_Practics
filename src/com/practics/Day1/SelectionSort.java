package com.practics.Day1;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 8, 7, 6, 5, 4, 3, 2, 1 };
		// O/P:1 2 3 4 5 6 7 8  
		selectionSort(arr);
		printArr(arr);

	}

	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			int minValue = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < minValue) {
					minValue = arr[j];
					minIndex = j;
				}

			}
			if (minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = minValue;
			}
		}

	}

}
