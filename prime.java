package com.java;

import java.util.Scanner;

public class prime {
	
	static boolean checkPrime(int n, int i) {
		//0 1 and negative number are not prime
		if(n <2)
			return false;
	
		//if this satisfies the thing as we complete the recursion
		
		if(i==n) {
			return true;
		}
		
		//Base case
		if(n%i==0) 
			return false;
		i++;
		return checkPrime(n, i);
	}
	public static void main(String[] args) 
	{
		
		int i = 2;
		boolean isPrime = true;
		
		int n = 37;
		isPrime = checkPrime(n,i);
		
		String result = isPrime ? "prime": "not prime";
		System.out.println(n + "is" +result);
	}
}
