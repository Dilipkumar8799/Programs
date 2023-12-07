package com.java;

import java.util.Scanner;

public class largest {
	
//	static int arr[] = {45,586,5,16,38};
//	
//	static int largest()
//	{
//		int max = arr[0];
//		for(int i = 1; i<arr.length; i++)
//			if(arr[i]>max)
//				max=arr[i];
//			return max;
//	}
//
	public static void main(String[] args) 
{
//		System.out.println("largest number"  + largest());
		
		//second approach
		
		int temp, size;
		int arr[] = {14,23,25,12,10};
		size = arr.length;
		
		for(int i = 0; i<size; i++)
		{
			for(int j = i+1; j<size; j++ )
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("second largest" + arr[size-1]);

	}

}
