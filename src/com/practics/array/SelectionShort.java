package com.practics.array;

public class SelectionShort {

	public static void main(String[] args) {
		int[] arr = { 6, 5, 4, 3, 2, 1 };
		selectionShort(arr);
		print(arr);

	}

	private static void print(int[] arr) {
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}

	private static void selectionShort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
                    min=arr[j];
                    minIndex=j;
				}
			}
			if(minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}
		}

	}

}
