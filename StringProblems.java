package com.java;

public class StringProblems {

	public static void main(String[] args) {
		//1                  String reverse
//		String str = "Dilipkumar";
//		StringBuilder br = new StringBuilder();
//		br.append(str);
//		
//		br.reverse();
//		
//		System.out.println(br);
//		
		
		
		
		//2       Check String pallandrome
//		String str = "abcdcba";
//		System.out.println(isPallandrome(str));
//	}
//		static boolean isPallandrome(String str)
//		{
//			for(int i = 0; i<str.length()/2; i++) {
//			int start = str.charAt(i);
//			int end = str.charAt(str.length()-1-i);
//			if(start!=end)
//			{
//				return false;
//			}
//		}
//		return true;
//	}
		
		//second approach to find String pallandrome
//		
//		//1                  String reverse
//		String str = "abcdcba";
//		StringBuilder br = new StringBuilder();
//		br.append(str);
//		
//		br.reverse();
//		
//		System.out.println(br);
//		
//		if(str.equals(br)) {
//			System.out.println("pallandrome " + str);
//		}
//		else
//		{
//			System.out.println("Not Pallandrome " + str);
//		}
//		
//	}
		
		
		//occurence of 2 digit in the paragraph
		
		String str = "my name is dilip kumar";
		int count = 0;
		for(String s : str.split(str)) 
		{
			if(str.length()%2==0)
				System.out.println(count++);
		}
	}
}
