package com.java;

import java.util.Scanner;

public class MedianOfSortedArray {

	public static void main(String[] args) 
	{
		int[] num1 = {1,2};
		int[] num2 = {3,4};
		
		int a = num1.length;
		int b = num2.length;
		int c = a+b;
		
		//creating a new array
		int[] c1 = new int[c];
		
		//loop to store the elements in the resultant array
		for(int i =0; i<a; i++)
		{
			c1[i] = num1[i];
		}
		
		for(int i = 0; i<b; i++)
		{
			c1[a + i] = num2[i];
		}
		
		//after merging
		for(int i = 0; i<c; i++)
		{
			System.out.println(c1[i]);
		}
		
		//finding the median of sorted array
		
		for(int i = 0; i<c1.length; i++)
		{
			int start = 0; 
			int end = c1.length-1;
			int result = (start+ end)/2;
			
			System.out.println(result);
		}
	}
	

}
