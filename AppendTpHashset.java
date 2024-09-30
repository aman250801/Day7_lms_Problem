package com.lmsDay7;

import java.util.HashSet;

public class AppendTpHashset {
	public static void main(String[]args) {
	
	  // create hashset
	  HashSet<String> hs = new HashSet<>();
	
	  hs.add("Element1");
	  hs.add("Element2");
	  hs.add("Element3");
	  System.out.println("HashSet elements:-"+hs);
	  
	  //Add a specified element to the HashSet
      String newElement = "Element4";
       hs.add(newElement);
       
    // Display the HashSet after adding the new element
       System.out.println("HashSet after adding new element:- " + hs);
   

}
}