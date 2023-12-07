package com.java;

import java.util.Scanner;

public class AllSubString {
	
	static void allSubString(String str)
	{
		//finding length of string
		int n = str.length();
		
		//this loop is for selection of starting point 
		for(int i =0 ; i<n; i++)
		{
			//this loop is for selection of ending point
			for(int j = i; j<n;j++)
			{
				//printing form starting to ending point
				for(int k = i; k<=j;k++)
				{
					System.out.print(str.charAt(k));
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		String str = sc.nextLine();
		allSubString(str);

	}

}
