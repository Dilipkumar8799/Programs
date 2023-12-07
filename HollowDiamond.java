package com.java;

import java.util.Scanner;

public class HollowDiamond {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		
		for(int i = 1; i<=rows; i++)
		{
			//printing space
			for(int j= rows; j>i; j--)
			{
				System.out.print(" ");
			}
			//printing star
			for(int k = 1; k<=(i*2)-1; k++)
			{
				if(k==1 ||k==(i*2)-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int i = rows-1; i>=1; i--)
		{
			//printing space
			for(int j=rows; j>i;j--) 
			{
				System.out.print(" ");
			}
			//printing star
			for(int k = 1; k<=(i*2)-1; k++)
			{
				if(k==1 || k==(i*2)-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
