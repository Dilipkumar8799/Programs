package com.java;

public class PeakElement {

	public static void main(String[] args) 
	{
		int[] arr = {5,10,20,15,25,13};
		int size = arr.length;
		System.out.println(findPeak(arr, size));
	}
	
//	static int findPeak(int[] arr , int size)
//	{
//		
//		//if length of array will 1 then first element would be the peak element
//		if(size==1)
//		{
//			return 0;
//		}
//		//if it is in decreasing order then first would be peak element
//		if(arr[0]>=arr[1])
//		{
//			return 0 ;
//		}
//		//if ascending then last would be peak element
//		if(arr[size-1]>=arr[size-2])
//		{
//			return size-1;
//		}
//		
//		//check if the neighbours are small
//		
//		for(int i = 0; i<=size-1; i++)
//		{
//			if(arr[i]>arr[i-1] && arr[i]<arr[i+1]) 
//			{
//				return i;
//			}
//		}
//		return 0;
//	}
	
	
	//using binary search to find the peak element
	
	static int findPeak(int[] arr , int size)
	{
		int start = 0; 
		int end = size-1;
		
		while(start<end)
		{
			int mid = start + (end-start) / 2;
			
			if(arr[mid] > arr[mid+1])
			{
				end = mid;
			}
			else
			{
				start = mid+1;
			}
		}
		return start;
	}

}
