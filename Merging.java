package com.java;

import java.util.Arrays;

public class Merging {
	
	static void merging(int[] arr1 , int[] arr2 , int n, int m, int[] arr3)
	{
		int i = 0; 
		int j = 0;
		int k = 0;
		
		//traverse the arr1 and put the value in arr3
		
		while(i<n) {
			arr3[k++] = arr1[i++];
		}
		
		//Now traverse the arr2 and put the value in arr3
		
		while(j<m)
		{
			arr3[k++] = arr2[j++];
		}
		
		//sort the whole array
		Arrays.sort(arr3);
	}
	

	public static void main(String[] args) {
		
		int[] arr1 = {1,3,5,7};
		int n = arr1.length;
		int[] arr2= {2,4,6,8};
		int m = arr2.length;
		
		int[] arr3 = new int[n + m];
		
		merging(arr1, arr2, n, m, arr3);
		
		System.out.println("Sorted array after merging");
		for(int i = 0; i <n+m;i++)
		{
			System.out.println(arr3[i] + " ");
		}

	}

}
