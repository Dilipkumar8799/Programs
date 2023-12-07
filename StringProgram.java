package com.java;

public class StringProgram {

	public static void main(String[] args) 
	{
		String str = "Dilip";
		char ch = 's';
		String str1 = "kumar";
		String s = str.concat(str1);
		System.out.println(s);

		//Adding a character at end
		
		String ans = str + ch;
		System.out.println(ans);
		
		//Adding a character at begining
		String ans1 = ch + str;
		System.out.println(ans1);
		
	}

}
