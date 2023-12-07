package com.java;

public class binaryToDecimal {

	public static void main(String args[]) {
		String binary = "01011011";
		
		int decimal = Integer.parseInt(binary,2);
		System.out.println(decimal);
	}
}
