//Asynchronous
//Do not maintain insertion order
package com.predator.programs;

import java.util.HashSet;

public class HashSetBasic {
	public static void main(String[] args) {
		
		HashSet<String> n=new HashSet<String>();
		n.add("Moto");
		n.add("Samsung");
		n.add("Apple");
		n.add("Vivo");
		n.add("Asus");
		n.add("Panasonic");
		n.add("Honor");
		n.add("Moto");      //Do not maintain duplicate value
		n.add(null);        //Null value allowed
		
		
		
		System.out.println(n);
		
	}

}
