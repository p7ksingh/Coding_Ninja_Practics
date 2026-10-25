package com.practics.Day3;

public class IsSortedArr {
	public static boolean isSorted(int[] arr) {

		if (arr.length <= 1) {
			return true;
		}
		int[] smallArr = new int[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			smallArr[i - 1] = arr[i];
		}
		boolean smallAnd = isSorted(smallArr);

		if (!smallAnd) {
			return false;
		}
		if (arr[0] < arr[1]) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 5 };
		System.out.print(isSorted(arr));

	}

}
