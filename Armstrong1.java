package com.java;

import java.util.Scanner;

public class Armstrong1 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 =sc.nextInt();
		
		for(int i = num1; i<=num2;i++)
		{
			int temp,rem,sum=0;
			temp=i;
			while(temp!=0)
			{
				rem = temp%10;
				sum = sum+(rem*rem*rem);
				temp = temp/10;
			}
			if(sum==i)
			{
				System.out.println(i + "is an Armstrong number");
			}
		}
		
				
			

	}

}
