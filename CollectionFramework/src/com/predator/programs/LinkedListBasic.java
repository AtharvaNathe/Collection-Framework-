//Better for data manipulation
//Asynchronous

package com.predator.programs;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasic {
	public static void main(String[] args) {
		LinkedList<String> cars=new LinkedList<String>();
		cars.add("Koenigsegg");
		cars.add("Bugatti");
		cars.add("McLaren");
		cars.add("Porsche");
		cars.add("Pagani");
		cars.add("Bentley");
		cars.add("Hennessey");
		cars.add("Jaguar");
		cars.add("Koenigsegg");   //Duplicate Entry
		cars.add(null);           //Null Entry
		
		
		System.out.println(cars);
		System.out.println(cars.size());
		System.out.println(cars.remove(8));
		System.out.println(cars);
		cars.add(6,"Lotus");
		System.out.println(cars);

		
		for(int i=0;i<cars.size();i++)
			System.out.println(cars.get(i));
		
		
		Iterator<String> iterator=cars.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());








	}

}
