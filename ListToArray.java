package com.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) 
	{
		List<Integer> list = List.of(15,23,14,17);
		list.toArray();
		
		//array to list
		String[] name = {"Dilip","Deepak"};
		
		ArrayList<String> ls = new ArrayList<>(Arrays.asList(name));
		
		for(String s : ls)
		{
			System.out.println(ls);
		}
		
		
//		ArrayList<String> ls = new ArrayList<>();
//		
//		Collections.addAll(ls, name);
//		
//		for(String s : ls)
//		{
//			System.out.println(ls);
//		}
		
	
		
		
//		//containing the value or not
//		if(list.contains(20))
//		{
//			System.out.println("yes");
//		}
//		else
//		{
//			System.out.println("no");
//		}
		

	}

}
