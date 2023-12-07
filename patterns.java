package com.java;

import java.util.Scanner;

public class patterns {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int n = sc.nextInt();

		//right triangle
		
//		for(int i = 1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//pyarmid
		
//		for(int i = 1; i<=n; i++) {
//			//for space
//			for(int j = n; j>i; j--) {
//				System.out.print(" ");
//			}
//			//stars
//			for(int k = 1; k<=(i*2)-1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//Inverted pyarmaid
		
		for(int i =n; i>=1;i--) {
			//space
			for(int j = 1; j<=n; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=(i*2)-1; k++) {
				System.out.print("*");
			}
			//space
//			for(int j = 1; j<=n; j++) {
//				System.out.print(" ");
//			}
			System.out.println();
		}
		
	}

}
