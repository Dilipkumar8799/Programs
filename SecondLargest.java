package com.java;

public class SecondLargest {

	public static void main(String[] args) 
	{
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
		System.out.println("second largest" + arr[size-2]);
	}

}
