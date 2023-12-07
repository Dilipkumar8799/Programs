package com.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) 
	{
		List<Integer> list = List.of(2,4,5,25,12,36);
		
		//finding the even number in the list
		//normal traversing method
		ArrayList<Integer> listEven = new ArrayList<>();
		
		for(Integer i : list)
		{
			if(i%2==0)
			{
				listEven.add(i);
			}
		}
		System.out.println(list);
		System.out.println(listEven);
		System.out.println("__________________________");
		
		
		//with streamapi
		
		Stream<Integer> stream = list.stream();
		List<Integer> newlist = stream.filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(newlist);
		
						//Or
		
		List<Integer> newlist1 = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(newlist1);
	}

}
