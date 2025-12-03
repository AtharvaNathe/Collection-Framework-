//Store data in sorted order
package com.predator.programs;

import java.util.TreeSet;

public class TreeSetBasic {
	public static void main(String[] args) {
		TreeSet<String> n=new TreeSet<String>();
		n.add("Moto");
		n.add("Samsung");
		n.add("Apple");
		n.add("Vivo");
		n.add("Asus");
		n.add("Panasonic");
		n.add("Honor");
		n.add("Moto");      //Do not maintain duplicate value
		                    //Null value is not allowed
		
		
		
		System.out.println(n);
		
			
	}

}
