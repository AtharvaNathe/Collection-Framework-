//Maintain insertion sequence
package com.predator.programs;

import java.util.LinkedHashSet;

public class LinkedHashSetBasic {
	public static void main(String[] args) {
		
		LinkedHashSet<String> n=new LinkedHashSet<String>();
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
