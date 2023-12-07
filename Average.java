package com.java;

public class Average {

	public static void main(String[] args) 
	{
		int[] num= {10,15,16,12,14,10,13,5};
		int sum = 0;
		
		for(int no : num) {
			sum = sum+no;
		}
		int average =sum/num.length;
		System.out.println(average);
	}

}
