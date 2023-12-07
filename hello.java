package com.java;

public class hello {

	public static void main(String[] args) {
		int num = 130994;
		int temp=0;
		int rem;
		
		while(num!=0) {
			rem = num%10;
			temp = temp*10+rem;
			num = num/10;
			
		}
			System.out.println(temp);
	}

}
