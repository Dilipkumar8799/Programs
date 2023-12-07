package com.java;

import java.util.Scanner;

public class R4Triangle {

	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		
		for(int i = rows; i >=1; i--) {
			//printing space
			for(int j=1; j>rows;j--) {
				System.out.print(" ");
			}
			System.out.println();
			//printing star
			for(int k = 1; k<=i; k++)
			{
				System.out.print("*");
			}
		}
		

	}

}
