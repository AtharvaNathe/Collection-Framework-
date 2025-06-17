//Asynchronous
package com.predator.programs;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapBasic {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		hm.put(7,"Atharva");
		hm.put(3,"John");
		hm.put(9,"Alex");
		hm.put(45,"Rohit");
		hm.put(10,"Messi");
		hm.put(18,"Virat");
		hm.put(7,"Dhoni");              //Duplicate key overwrites value
		hm.put(11,"Dhoni");             //Duplicate value is stored
		hm.putIfAbsent(7, "Atharva");
		hm.put(null,"Tom");             //Null value allowed
		
		
		
		
		System.out.println(hm);
		
		System.out.println(hm.getOrDefault("Robert", "Not Found"));
		
		
		Iterator<Integer> iterator=hm.keySet().iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		
		
		
		
		
	}

}
