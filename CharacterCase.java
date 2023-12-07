package com.java;

import java.util.Scanner;

public class CharacterCase {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		String  ch = sc.next();
		
		if(ch.charAt(0)>=65 && ch.charAt(0)<=90)
		{
			System.out.println("1");
		}
		else if(ch.charAt(0)>=97 && ch.charAt(0)<=122)
		{
			System.out.println("0");
		}
		else
		{
			System.out.println("-1");
		}
	}

}
