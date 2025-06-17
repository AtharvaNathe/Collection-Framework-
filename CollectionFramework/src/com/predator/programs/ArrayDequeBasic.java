package com.predator.programs;

import java.util.ArrayDeque;

public class ArrayDequeBasic {
	public static void main(String[] args) {
		
		ArrayDeque<String> q=new ArrayDeque<String>();
		q.add("Samsung");
		q.add("Apple");
		q.add("Vivo");
		q.add("Moto");
		q.add("Nothing");
		q.add("Samsung");             //Duplicate value
		q.addFirst("Xiaomi");         //Null not allowed
		q.addLast("Oneplus");
		
		System.out.println(q);
		System.out.println(q.peekFirst());    //retrieve
		System.out.println(q.peekLast());
		System.out.println(q.pollFirst());    //retrieve and remove
		System.out.println(q);
		
		
		
		
	}
	

}
