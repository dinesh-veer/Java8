/**
 * 
 */
package com.code.java8.comprator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author dineshveer
 *
 */
public class Java8Comprator {

	public static void main(String[] args) {

		List<Developer> listOfDevelopers =getData();
		
		System.out.println("Before Sorting...");
		for (Developer developer : listOfDevelopers) {
			System.out.println(developer);
		}
		//By name Ascending
		//Comparator<Developer> byName =(Developer d1,Developer d2)->d1.getName().compareTo(d2.getName());
		
		//By Dept Descending
		//Comparator<Developer> byDept =(Developer d1,Developer d2)-> -d1.getDepaartment().compareTo(d2.getDepaartment());
		
		//By Salary Descending
		//Comparator<Developer> bySalary =(Developer d1,Developer d2)->-(d1.getSalary()-d2.getSalary());
		
		
		listOfDevelopers.sort((dev1,dev2)->dev1.getSalary()-dev2.getSalary());
			
		//Collections.sort(listOfDevelopers,bySalary);
		
		System.out.println("After Sorting...");
		for (Developer developer : listOfDevelopers) {
			System.out.println(developer);
		}
//		
//		Integer[] arr=new Integer[]{1,2,3,4,3,2,4,2};
//		List<Integer> listWithDuplicates = Arrays.asList(arr);
//		List<Integer> listWithoutDups = listWithDuplicates.stream().distinct().collect(Collectors.toList());
//		listWithoutDups.forEach((i)->System.out.print(" "+i));
		
		Integer[] arr=new Integer[]{1,2,3,4,3,2,4,2};
		List<Integer> listWithDuplicates = Arrays.asList(arr);
		
		Set<Integer> setWithoutDups = listWithDuplicates.stream().collect(Collectors.toSet());
		setWithoutDups.forEach((i)->System.out.print(" "+i));
		System.out.println(setWithoutDups.getClass());
		
		
		Integer[] arr1=new Integer[]{100,24,13,44,114,200,40,112};
		List<Integer> list = Arrays.asList(arr1);
		Double average = list.stream()
				                 .mapToInt(n->n*n)
				                 .filter(n->n>10000)
				                 .average().getAsDouble();
		System.out.println(average);
		
		List<String> listA = Arrays.asList(new String[]{"A1","B1","C1","A1","B1","C1","D1"});
		listA.stream().distinct().forEach(System.out::print);
		
	}
	
	private static List<Developer> getData(){
		
		ArrayList<Developer> list= new ArrayList<>();
		
		list.add(new Developer("Dinesh","Comp",45000));
		list.add(new Developer("Sam","Ele",6000));
		list.add(new Developer("John","Chem",40000));
		list.add(new Developer("Ryan","Comp",39000));
		list.add(new Developer("Roth","Extc",20000));
		list.add(new Developer("Test","Mech",8000));
		return list;
	}
	

}
