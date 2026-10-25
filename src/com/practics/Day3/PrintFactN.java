package com.practics.Day3;

public class PrintFactN {

	public static void main(String[] args) {
		int n = 3;
		int rel = fact(n);
		System.out.print(rel);
	}

	private static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		int smallAns = fact(n - 1);
		return n * smallAns;

	}

}
