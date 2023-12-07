package com.java;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int rem, sum = 0;
		
		int square = num*num;
		
		while(square!=0)
		{
			rem = square%10;
			sum = sum+ rem;
//			square = square/10;
		}
		if(sum==square)
		{
			System.out.println("Neon number" + sum);
		}
		else
		{
			System.out.println("Not neon"+ sum);
		}

	}

}
