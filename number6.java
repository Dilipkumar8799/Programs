package com.java;

public class number6 {

	public static void main(String[] args) {
		//12345
		//1234
		//123
		//12
		//1
		//12
		//123
		//1234
		//12345
		
		int no = 5;
		for(int i = no; i>=1; i--)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		for(int i = 2; i<=no; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}
