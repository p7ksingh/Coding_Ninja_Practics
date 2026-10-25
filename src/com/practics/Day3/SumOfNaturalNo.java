package com.practics.Day3;

public class SumOfNaturalNo {

	public static int sum(int n) {
		if (n == 0) {
			return 0;
		}
		int sa = sum(n - 1);
		return n + sa;
	}

	public static void main(String[] args) {
		int n = 10;
		int rel = sum(n);
		System.out.println(rel);

	}

}
