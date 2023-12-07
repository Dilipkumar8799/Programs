package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Listpractice {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(36);
		list.add(12);
		list.add(17);
		list.add(69);
		
		//In arraylist elements are stored in order manner so if we want to insert the element 
		//on the first position so the we can the element first in the list
		
//		System.out.println(list.indexOf(25));
//		System.out.println(list.remove(0));
//		System.out.println(list.add(20));
//		System.out.println(list);
		
//		list.add(0, 10);
//		System.out.println(list);
//		
//		System.out.println(list.get(1));
//		
//		System.out.println(list.remove(3));
	
//		Collections.sort(list);
//		System.out.println(list);
//		
//		//reverse the arraylist
//		
//		ListIterator<Integer> ls = list.listIterator(list.size());
//		while(ls.hasPrevious())
//		{
//			Integer it = ls.previous();
//			System.out.println(it);
//		}
		
		//join two  arraylist
		
//		ArrayList<Integer> list1 = new ArrayList<>();
//		list1.add(36);
//		list1.add(25);
//		
//		ArrayList<Integer> list2 = new ArrayList<>();
//		list2.addAll(list);
//		list2.addAll(list1);
//		System.out.println(list2);
		
		
		
		//Traversing the Hashset
		//order is not preserved
		HashSet<Integer> hs = new HashSet<>();
		hs.add(25);
		hs.add(36);
		hs.add(23);
		hs.add(78);
		
		System.out.println(hs);
		//traversing the hashset
		
		for(Integer i : hs)
		{
			System.out.println(i);
		}
		System.out.println("______________");
		//second approach
		
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext())
		{
			Integer i = it.next();
			System.out.println(i);
		}
		
	}

}
