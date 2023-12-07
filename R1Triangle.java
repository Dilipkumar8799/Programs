package com.java;

import java.util.Scanner;

public class R1Triangle {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		
		for(int i = 1; i<=rows; i++)
		{
			//printing space
			for(int j = rows; j>i;j--)
			{
				System.out.print(" ");
			}
			//printing star
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
