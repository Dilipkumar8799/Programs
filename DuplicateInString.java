package com.java;

import java.util.Iterator;

public class DuplicateInString {
	public static void main(String[] args)
	{
		String str = "aba";
		char nstr = ' ';
		String str1 = str;
		for(int i = str.length()-1; i>0; i--)
		{
			nstr = str.charAt(i);
		}
		
		if(str1.equals(nstr))
		{
			System.out.println("pallandrome String " + nstr);
		}
		else
		{
			System.out.println("Not Pallandrome String " + nstr);
		}
		
	}

}
