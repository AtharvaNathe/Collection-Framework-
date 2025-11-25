//Asynchronous
//Binary Tree min-max heap
package com.predator.programs;

import java.util.PriorityQueue;

public class PriorityQueueBasic {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> num=new PriorityQueue<Integer>();
		num.add(12);
		num.add(45);
		num.add(67);
		num.add(23);
		num.add(99);
		num.add(34);
		num.add(67);     //Duplicate value
		                 //Null value not allowed
		 
		
		System.out.println(num);
		
	}
	

}

