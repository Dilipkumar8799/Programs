package com.java;

public class number7 {

	public static void main(String[] args) {
		//1
		//23
		//456
		//78910
		//1112131415
		
		int no = 5;
		int count = 1;
		 
		for(int i = 1; i<=no; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}

	}

}
