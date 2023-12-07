package com.java;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		//Hollow rectangle
//		for(int i =1; i<=size;i++) {
//			for(int j = 1; j<=size;j++) {
//				//printing space
//				if(i==1 || i==size || j==1 || j==size)
//				System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
			
		//pyramid
		
		for(int i = 0; i<size;i++)
		{
			//printing space
			for(int sp = 0; sp<size-i; sp++)
				System.out.print(" ");
		}
		//printing star
		for(int st = 0; st<=size;st++)
			System.out.print("*");
		//printing star
		for(int st = 1; st<=size; st++ )
			System.out.print("*");
		System.out.println();
	}
	
}
