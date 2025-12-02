package com.predator.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastDemo {
	public static void main(String[] args) {
		
		ArrayList<String> lst=new ArrayList<String>();
		lst.add("Audi");
		lst.add("Bmw");
		lst.add("Ferrari");
		lst.add("Lamborghini");
		lst.add("Mahendra");
		lst.add("Maserati");
		
		
		
		

		
		Iterator<String> iterator=lst.iterator();
		while(iterator.hasNext()) 
		{
			System.out.println(iterator.next());       //Adding value by running iterator gives error
			lst.add("Toyota");                         //Concurrent Modification Exception
		}
		
	}

}

