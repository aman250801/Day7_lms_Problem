package com.lmsDay7;

import java.util.Stack;

public class StackEx {
	
	public static void main(String[] args) {
		// Create stack
		Stack<Integer> st = new Stack<>();
		//Strore 10 element
		for(int i=1; i<=10; i++) {
			st.push(i);
			
		}
		// display
		System.out.println("stack elemts pushing:-"+st);
        
	  // Remove 4 elemets
	  for(int i=1; i<=4; i++) {
		  st.pop();
	  }
	  // display after 4 elemts
	  System.out.println("Stack after 4 elements remove:-"+st);

}
}
