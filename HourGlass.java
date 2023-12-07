package com.java;

import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows  = sc.nextInt();
		
		//Inverted pyramid
		for(int i = rows;i>=2;i--)
		{
			//printing space
			for(int j = rows; j>=i; j--)
			{
				System.out.print(" ");
			}
			//printing star
			for(int k = 1; k<=(i*2)-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//printing pyramid
		for(int i = 1; i<=rows; i++)
		{
			//printing space
			for(int j = rows+1; j>i; j--)
			{
				System.out.print(" ");
			}
			//printing star
			for(int k = 1; k<=(i*2)-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
