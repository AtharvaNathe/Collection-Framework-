//Better for data retrieval
//Asynchronous   
package com.predator.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListBasic {  
	public static void main(String[] args) {
		ArrayList<String> lst=new ArrayList<String>();
		lst.add("Audi");
		lst.add("Bmw");
		lst.add("Ferrari");
		lst.add("Lamborghini");
		lst.add("Mahendra");
		lst.add("Maserati");
		lst.add("Mercedes");
		lst.add("Dodge");
		lst.add("Audi");   //Duplicate entry
		lst.add(null);     //Null entry
		
		System.out.println(lst);
		System.out.println(lst.size());
		System.out.println(lst.remove(8));
		System.out.println(lst);
		lst.add(6,"Aston Martin");
		System.out.println(lst);

		
		for(int i=0;i<lst.size();i++)
			System.out.println(lst.get(i));
		
		
		System.out.println("____________");

		
		Iterator<String> iterator=lst.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());

		
		
		



		
	}

}



