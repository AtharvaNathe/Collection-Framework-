//Synchronous
package com.predator.programs;

import java.util.Iterator;
import java.util.Vector;

public class VectorBasic {
	public static void main(String[] args) {
		Vector<String> companies=new Vector<String>();
		companies.add("Apple");
		companies.add("Microsoft");
		companies.add("Dell");
		companies.add("Lenovo");
		companies.add("Asus");
		companies.add("Hp");
		companies.add("Apple");   //Duplicate value
		companies.add(null);      //Null value
		
		System.out.println(companies);
		companies.addElement("Vivo");
		companies.add(6,"Moto");
		companies.insertElementAt("Xiaomi", 7);
		System.out.println(companies.elementAt(7));
		System.out.println(companies);
		
		
		Iterator<String> iterator=companies.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		








		
	}

}

