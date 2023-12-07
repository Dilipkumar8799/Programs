package com.java;

import java.util.Scanner;

public class Revision {
	public static void main(String[] args) {
	
		System.out.println("enter");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//outer loop
		for(int i =1; i<=num; i++) {
			//for space
			for(int j = num; j>i; j--) {
				System.out.print(" ");
			}
				//for star
				for(int k = 1; k <=(i*2)-1; k++) 
				{
					System.out.print("*");
				}
				System.out.println();
			}
		
	}

}
