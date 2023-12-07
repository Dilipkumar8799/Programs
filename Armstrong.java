package com.java;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int rem, sum=0;
		
		while(num!=0)
		{
			rem = num%10;
			sum = sum+(rem*rem*rem);
			num = num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Armstrong number " + sum);
		}
		else
			System.out.println("Not Armstrong number " + sum);
		

	}

}
