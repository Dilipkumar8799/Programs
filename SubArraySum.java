package com.java;

public class SubArraySum {
	
	static void ArraySum(int[] arr, int n , int sum)
	{
		//Traversing from begning
		for(int i = 0; i<n; i++)
		{
		int result = arr[i];
		if(result==sum)
		{
			System.out.println("sum at index " + i);
			return;
		}
		
		//Travesing between subarray
		else
		for(int j  = i+1; j<n; j++)
		{
			result += arr[j];
			if(result==sum)
			{
				System.out.println("sum is between index " + i + "and " + j);
				return;
			}
		}
		}
		System.out.println("No index found! ");
		return;
	}

	public static void main(String[] args)
	{
		int[] arr = {15,2,4,8,9,5,10};
		int sum = 23;
		int n = arr.length;
		ArraySum(arr, n, sum);

	}

}
