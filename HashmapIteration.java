package com.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapIteration {

	public static void main(String[] args) 
	{
		HashMap<Integer , String> hs = new HashMap<>();
		hs.put(1, "Dilip");
		hs.put(2,"Deepak");
		hs.put(3, "mintu");
		
		//for each loop
		
		for(Integer key : hs.keySet())
		{
			System.out.println("key: " + key + "value: " + hs.get(key));
		}
		
		
		//iteration using keyset
		
		Set<Integer> keyset = hs.keySet();
		Iterator<Integer> keySetIterator = keyset.iterator();
		
		while(keySetIterator.hasNext())
		{
			Integer key = keySetIterator.next();
			System.out.println(key + hs.get(key));
		}
		
		
		//iteration using entry set
		
		Set<Map.Entry<Integer, String>> entrySet = hs.entrySet();
		for(Map.Entry entry : entrySet)
		{
			System.out.println("key"+ entry.getKey() + " values" + entry.getValue());
		}
		
		
		
		
		

	}

}
