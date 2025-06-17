//Same as Fail Safe but for Map interface
package com.predator.programs;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer,String> hm=new ConcurrentHashMap<Integer, String>();
		hm.put(7,"Atharva");
		hm.put(3,"John");
		hm.put(9,"Alex");
		hm.put(45,"Rohit");
		hm.put(10,"Messi");
		hm.put(18,"Virat");
		
		
		
		Iterator<Integer> iterator=hm.keySet().iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		
		System.out.println(hm);
		
		
		
		
		
		
		
	}

}
