package com.code.java8.forEach.listMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;

class I{
	int p;
}

public class Test {
	int i;
	public static void main(String[] args) {
		final int i;
		i=20;
		System.out.println(i);
		long l;
		//double d=l;
		//System.out.println(d);
		//System.out.println(i.p);
		//System.out.println(fun());
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		list.add("B");
 
		for(int k=0;k<list.size();k++)
			list.remove(k);
//		Iterator<String> itr = list.iterator();
//		while (itr.hasNext()) {
//			String element = itr.next();
//			if(element.equals("A")){
//				list.add("AA");
//			}
//		}
		
		System.out.println(list);
		System.out.println(list instanceof RandomAccess);
		//Autoboxing and unboxing in java
		Boolean b1= new Boolean(true);
		Boolean b2= new Boolean(true);
		System.out.println("Boolean");
		System.out.println(b1==b2);
		
		//Hashmap in comparing value 
		HashMap<Integer,String> hashmap= new HashMap();
		hashmap.put(1, "Dinesh");
		hashmap.put(2, "Veer");
		if(!hashmap.containsValue("Dinesh"))
		hashmap.put(3, "Dinesh");
		
		Integer i1 = 260;
		Integer i2 = 260;

		if (i1 == i2) {
		    System.out.println("i1 and i2 is equal");
		} else {
		   System.out.println("i1 and i2 is not equal ");
		}
		//Integer caching for -127 to128
		i1=120;
		i2=120;
		
		if (i1 == i2) {
		    System.out.println("i1 and i2 is equal");
		} else {
		   System.out.println("i1 and i2 is not equal ");
		}
		
		System.out.println(hashmap);
		
		
		String name="Diensh";
		name.toUpperCase();
		System.out.println(name);
		
		List<String> listOfString = Arrays.asList("London", "Tokyo", "NewYork");
		listOfString.stream().sorted().forEach(System.out::println);
		Collections.sort(listOfString, Collections.reverseOrder()); 
		System.out.println(listOfString); //[Tokyo, NewYork, London]
		
		
		try {
			System.out.println(10/0);
		}finally {
			throw new ArrayIndexOutOfBoundsException();
		}
		
	}
	
	int fun() {
		return 20;
	}
}
