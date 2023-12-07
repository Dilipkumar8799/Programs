package com.java;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		
		//first print pyramid
		for(int i = 1; i<=rows;i++)
		{
			//printing space
			for(int j = rows; j>i; j--)
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
		//now print inverted pyramid
		for(int i = rows-1; i>=1; i--)
		{
			//printing space
			for(int k = rows-1; k>=i;k--)
			{
				System.out.print(" ");
			}
			//printing star
			for(int j = 1; j<=(i*2)-1;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}
}

