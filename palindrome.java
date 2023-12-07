package com.java;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:-");
		int num = sc.nextInt();
		int temp = num;
		int rem, sum = 0;
		
		while(num!=0)
		{
			rem = num%10;
			sum = sum*10+rem;
			num = num/10;
			 
		}
		if(temp==sum)
		{
			System.out.println("pallandrome " + temp);
		}
		else
		{
			System.out.println("Not pallandrome" + temp);
		}
		

	}

}
