package com.java;

import java.util.Scanner;

public class Quadrant {
	
	static void cordinate( int x , int y)
	{
		//find true if first quadrant
		if(x>0 && y>0)
		{
			System.out.println("1st Quadrant");
		}
		//find second quadrant
		else if(x<0 && y>0)
		{
			System.out.println("2nd Quadrant");
		}
		//find third quadrant
		else if(x<0 && y<0)
		{
			System.out.println("3rd Quadrant");
		}
		//find fourth quadrant
		else if(x>0 && y<0)
		{
			System.out.println("4th Quadrant");
		}
		//to find that does not lie on the origin
		else if(x==0 && y==0)
		{
			System.out.println("Origin");
		}
		//on x-axis
		else if(y==0 && x!=0)
		{
			System.out.println("x axis");
		}
		//on y-axis
		else if(x==0 && y!=0)
		{
			System.out.println("y axis");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cordinate");
		int x = sc.nextInt();
		int y = sc.nextInt();
		cordinate(x, y);

	}

}
