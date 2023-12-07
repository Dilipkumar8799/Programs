package com.java;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ksmallest {

	public static void main(String[] args) 
{
//		int[] arr = {7,10,4,3,20,15};
//		int k = 3;
//		
//		System.out.println("Kth smallest element " + smallest(arr, k));
//	}
//	
//	static int smallest(int[] arr , int k)
//	{
//		//first sort the arr
//		Arrays.sort(arr);
//		
//		//return kth element in the sorted array
//		return arr[k-1];
	
	
		
		//using another approach using treeset
		
		int[] arr = {7,10,4,3,20,15};
		int n = arr.length;
		int k = 3;
		
		//since counting start from 0 so the kth element would be reduce by 1
		
		k--;
		
		//for sorting elements in sorted form we will use treeset
		
		Set<Integer> s = new TreeSet<Integer>();
		
		//Adding elements to set
		
		for(int i = 0; i<n; i++)
			s.add(arr[i]);
		
		
		//Use Iterrator to iterate elements
		
		Iterator<Integer> itr = s.iterator();
		while(k>0)
		{
			itr.next();
			k--;
		}
		System.out.println(itr.next());
		
}

}
