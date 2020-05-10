package com.code.java8.forEach.listMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

class parent{
	int id=10;
	public void method() {
		System.out.println("IN parent");
	}
}

class child extends parent{ 
	int id=100;
	public void method() {
		System.out.println("IN child");
	}
}

public class Inheritance {
	
	
	public static void main(String[] args) {
		child c= new child();
		System.out.println(c.id);
		c.method();
		
		parent p= new child();
		System.out.println(p.id);
		p.method();
		
		ArrayList<String> arr= new ArrayList<>();
		System.out.println(null instanceof List);
		
		HashSet  treeSet =new HashSet();
		treeSet.add(null);
		
		System.out.println(treeSet);
		int i = 010;
        int j = 07;
        System.out.println(i);
        System.out.println(j);
		
	}
	

}
