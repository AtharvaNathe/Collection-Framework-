//Synchronous
//Do not maintain insertion sequence
//Key-Value format
//Hash code and bucket
package com.predator.programs;

import java.util.Hashtable;
import java.util.Iterator;

public class HashtableBasic {
	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht=new Hashtable<Integer, String>();
		ht.put(7,"Atharva");
		ht.put(3,"John");
		ht.put(9,"Alex");
		ht.put(45,"Rohit");
		ht.put(10,"Messi");
		ht.put(18,"Virat");
		ht.put(7,"Dhoni");              //Duplicate key overwrites value
		ht.put(11,"Dhoni");             //Duplicate value is stored
		ht.putIfAbsent(7, "Atharva");
		
		
		
		System.out.println(ht);
		
		System.out.println(ht.keys());   //Gives output in obj
		
		Iterator<Integer> itrk=ht.keys().asIterator();
		while(itrk.hasNext())
			System.out.println(itrk.next());
		
		Iterator<String> itrv=ht.values().iterator();
		while(itrv.hasNext())
			System.out.println(itrv.next());
		
		
		System.out.println(ht.get(45));
		System.out.println(ht.containsValue("Alex"));
		
		
		
		
	}

}
