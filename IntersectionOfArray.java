package com.java;

public class IntersectionOfArray {

	public static void main(String[] args)
	{
		int[] a = {1,2,4,-5,0};
		int[] b = {3,4,-5,0};
		
		for(int i = 0; i<a.length;i++)
		{
			for(int j = 0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					System.out.println("Intersection is " + a[i]);
				}
				
			}
		}

	}

}
