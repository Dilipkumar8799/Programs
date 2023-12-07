package com.java;

public class OccurenceInArray {

	public static void main(String[] args) 
	{
		int[] arr = {1,5,5,5,6,4};
		int target = 5;
		int count = 0;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == target)
			 count++;
		}
		System.out.println("occurence " + count);
		 
		
	}

}
