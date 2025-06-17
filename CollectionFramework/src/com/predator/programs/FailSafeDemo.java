package com.predator.programs;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> lst=new CopyOnWriteArrayList<String>();
		lst.add("Audi");
		lst.add("Bmw");
		lst.add("Ferrari");
		lst.add("Lamborghini");
		lst.add("Mahendra");
		lst.add("Maserati");
		
		
		
		
		
		Iterator<String> iterator=lst.iterator();
		while(iterator.hasNext()) 
		{
			System.out.println(iterator.next());       
			if(!lst.contains("Toyota"))
			{
				lst.add("Toyota");
			}
			
				
		}
		System.out.println(lst);
		
		
		
	}

}

