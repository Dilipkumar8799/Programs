package com.java;

public class number3 {

	public static void main(String[] args) 
	{
		//1
		//12
		//123
		//1234
		//12345
		//1234
		//123
		//12
		//1
		
		int no = 5;
		for(int i = 1; i<=no; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i = no-1; i>=1; i--)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
