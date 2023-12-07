package com.java;

import java.util.Scanner;

public class AverageFunction {
	
	public static void threeAve(int n1, int n2, int n3)
	{
		int avg = (n1+n2+n3)/3;
		System.out.println(avg);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		AverageFunction obj = new AverageFunction();
		obj.threeAve(n1, n2, n3);
	}

}
