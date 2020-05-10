/**
 * 
 */
package com.code.java8.forEach.listMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author dineshveer
 *
 */
public class ClassicListMap {
	
	public static void main(String[] args) {
		List<String> list =new ArrayList<>();
		list.add("Dinesh");
		list.add("John");
		list.add("Sample");
		list.add("Test");
		
		for(String string: list)
			System.out.println(string);
		
		//Method 1
	    float f1 = 0.0f;
	    for (int i = 1; i <= 11; i++) {
	        f1 += .1;
	    }
	 
	    //Method 2
	    float f2 = .1f * 11;
	 
	    System.out.println("f1 = " + f1);
	    System.out.println("f2 = " + f2);

	    
	    HashMap<String, Integer> hashmap =new HashMap<>();
	    hashmap.put(null, 11);
	    hashmap.put("Test", 22);
		
	}

}
