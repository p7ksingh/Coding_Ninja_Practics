package com.practics.Day3;

public class Print1ToN {

	public static void main(String[] args) {
		int n=10;
		print(n);
		

	}

	private static void print(int n) {
		System.out.print(n+" ");
		if(n==1) {
			
			 return;
		}
		print(n-1);
	
		
		
	}

}
