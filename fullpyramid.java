package com.java;

import java.util.Scanner;

public class fullpyramid {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		for(int i = 0; i<row; i++) {
			//print space
			for(int j = row-i; j>1; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				//print stars
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
