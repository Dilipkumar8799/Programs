package com.java;

public class factRecursion {
	
	static int fact(int n) {
		//Base case
		if(n==1 || n==0) {
			return 1;
		}
		//inner function calling n-1 
		int mn1 = fact(n-1);
		int fn = n  * mn1;
		return fn;
		
	}

	public static void main(String[] args) {
		int n = 5;
		int ans = fact(n);
		System.out.println(ans);

	}

}
