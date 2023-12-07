package com.java;

public class sortArray {
	static void printArr(int[] arr, int n)
	{
		for(int i = 0; i<n; i++)
		System.out.println(arr[i] + " ");
	}
	
	//function to sort the array
	
	static void sortArr(int[] arr , int n)
	{
		int cnt0 = 0 , cnt1 = 0 , cnt2 = 0;
		
		for(int i = 0; i<n; i++)
		{
			switch (arr[i])
			{
			case 0 :
				cnt0++;
				break;
			case 1:
				cnt1++;
				break;
			case 2:
			cnt2++;
			break;
		}
	}
	
		//update thr array
		int i = 0;
		
		//store all the 0 in the begging
		while(cnt0 > 0)
		{
			arr[i++] = 0;
			cnt0--;
		}
		
		//Then all the 1
		while(cnt1 > 0)
		{
			arr[i++] = 1; 
			cnt1--;
		}
		
		//Then all the 2
		
		while(cnt2 > 0)
		{
			arr[i++] = 2; 
			cnt2--;
		}
		
		//print the sorted array
        printArr(arr, n);
	}

    	public static void main(String[] args) 
    	{
    		int[] arr = {0,1,1,0,2,0,1,2,1,0,2};
    		int n = arr.length;
    		sortArr(arr,n);
    	}
}
