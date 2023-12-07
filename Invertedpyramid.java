package com.java;

import java.util.Scanner;

public class Invertedpyramid {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		
		for(int i = rows; i>=1; i--)
		{
			//printing star
			for(int j = 1; j<=(i*2)-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			//printing space
			for(int k =rows; k>=1;k--)
			{
				System.out.print(" ");
			}

		}

	}

}
