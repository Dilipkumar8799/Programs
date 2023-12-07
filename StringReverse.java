package com.java;

public class StringReverse {
	
	public static String isReverse(String str)
	{
		String str1 = " ";
		for(int i = str.length()-1; i>=0; i--)
		{
			str1 =  str1 +str.charAt(i);
		}
		return str1;
	}

	public static void main(String[] args) {
		String str = "Dilip";
		System.out.println(isReverse(str));
		
		String num1 = "123";
		String num2 = "11";
		
		int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		System.out.println(sum);
	}
	
}
