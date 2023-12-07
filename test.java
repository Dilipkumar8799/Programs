package com.java;

public class test {

	public static void main(String[] args) {
		int n = 12;
		int n1 =15;
		int gcd = 1;
		
		for(int i = 1; i<=n && i<=n1; i++) 
		{
			if(n%i == 0 && n1%i==0)
			{
				gcd = i;
			}
		}
		int lcm = (n*n1)/gcd;
		System.out.println(lcm);
	}

}
