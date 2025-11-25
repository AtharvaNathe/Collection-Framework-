//Maintain insertion sequence
package com.predator.programs;

import java.util.LinkedHashMap;

public class LinkedHashMapBasic {
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer, String>();
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
		
		
		
		
		
		
		
	}

}

