package com.java;

public class UniqueElement {
	public static void main(String[] args) {
		int[] arr  = {1,2,2,1,3,3,7};
//		System.out.print(Unique(arr));
		System.out.println(arr.toString());
	}

//	static int Unique(int[] arr)
//	{
//		int ans = 0;
//		for(int i = 0; i<arr.length; i++)
//		{
//			arr[i] = arr[0]^arr[i];
//			ans = arr[i];
//		}
//		return ans;
//	}
	
	static void Unique(int[] arr)
	{
		int count = 0;
		for(int i =0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count--;
				}
				else
				{
					count++;
				}
				
				if(count==1)
				{
					System.out.println(i);
				}
			}
		}
		
	}
}
