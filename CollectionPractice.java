package com.java;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CollectionPractice {

	public static void main(String[] args)
	{
			ArrayList<Integer> list = new ArrayList<>();
			list.add(5);
			list.add(9);
			list.add(12);
			list.add(25);
			
			//Travesing the element of arraylist
			
			//1. By foreach
			
//			for(Integer i : list)
//			{
//				System.out.println("Element after travesing " + i);
//				System.out.println(i.getClass());
//			}
//			
			
			//2.....By iterator(only in forward direction)
//			
//			Iterator<Integer> itr = list.iterator();
//			while(itr.hasNext())
//			{
//				Integer next = 	itr.next();
//				System.out.println(next);
//			}
			
			//3....listiterator(only for list in backward direction traversing)
//			
//			ListIterator<Integer> itr = list.listIterator(list.size());
//			while(itr.hasPrevious())
//			{
//				Integer next = itr.previous();
//				System.out.println(next);
//			}
			
			//4..foreach() method or lambda experssion
			
//			list.forEach(e->{
//				System.out.println(e);
//			});
			
//			
//			
//			Vector<Integer> v = new Vector<>();
//			v.add(5);
//			v.add(45);
//			v.add(12);
//			v.add(32);
//			
//			//Travesing by enumartion
//			
//			Enumeration<Integer> e = v.elements();
//			if(e.hasMoreElements())
//			{
//				Integer it = e.nextElement();
//				System.out.println(it);
//			}
			
			
		
	}

}
