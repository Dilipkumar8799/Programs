package com.java;

public class number8 {

	public static void main(String[] args) 
	{
		//1
		//121
		//12321
		//1234321
		//123454321
		
		int no = 5;
		for(int i = 1; i<=no; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			for(int k = i-1; k>=1; k--)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

}
