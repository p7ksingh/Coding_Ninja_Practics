package com.practics.Day3;

public class Power {

	public static void main(String[] args) {
		int x = 3;
		int n = 4;
		int rel = power(x, n);
		System.out.print(rel);

	}

	private static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int smallAns = power(x, n - 1);
		return x * smallAns;

	}

}
