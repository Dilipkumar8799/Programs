package com.java;

import java.util.Scanner;

public class HollowInverted {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();

		for(int i = rows; i>=1; i--)
		{
			//printing space
			for(int j=rows; j>i;j--) 
			{
				System.out.print(" ");
			}
			//printing star
			for(int k = 1; k<=(i*2)-1; k++)
			{
				if(k==1 || k==(i*2)-1 ||i ==rows)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	

}
