//Synchronous
package com.predator.programs;

import java.util.Stack;

public class StackBasic {
	public static void main(String[] args) {
		Stack<String> state=new Stack<String>();
		state.push("Maharashtra");
		state.push("Goa");
		state.push("Rajasthan");
		state.push("Tamil Nadu");
		state.push("Gujrat");
		state.push("Punjab");
		state.push("Goa");      //Duplicate value
		state.push(null);       //Null value
		
		System.out.println(state);
		System.out.println(state.pop());  //Last in first out
		System.out.println(state);
		
		
		
		
	}

}
