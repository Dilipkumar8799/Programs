package com.java;

public class CharString {

	public static void main(String[] args) {
		String str = "Dilip";
		char ch = 'p';
		
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i)==ch) {
				System.out.println(i);
			}
		}
		
		//replace character
		System.out.println(str.replace("i", "o"));

	}

}
