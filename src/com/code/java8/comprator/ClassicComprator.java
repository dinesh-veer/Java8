package com.code.java8.comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author dineshveer
 *
 */
public class ClassicComprator {

	public static void main(String[] args) {

		List<Developer> listOfDevelopers =getData();
		
		System.out.println("Before Sorting...");
		for (Developer developer : listOfDevelopers) {
			System.out.println(developer);
		}
		//sorting by name
		/*
		Collections.sort(listOfDevelopers, new Comparator<Developer>() {

			@Override
			public int compare(Developer d1, Developer d2) {

				//return d1.getName().compareTo(d2.getName());//Ascneding Sorted by name
				return -d2.getName().compareTo(d1.getName());//Ascending sorted by name
				//return d2.getName().compareTo(d1.getName());//Descending sorted by name
				//return d1.getName().compareTo(d2.getName());//Descending Sorted by name
			}
		});*/
		
		//sort by dept
		/*Collections.sort(listOfDevelopers, new Comparator<Developer>() {

			@Override
			public int compare(Developer d1, Developer d2) {

				//return d1.getDepaartment().compareTo(d2.getDepaartment());//Ascneding Sorted by Department
				//return -d2.getDepaartment().compareTo(d1.getDepaartment());//Ascending sorted by Department
				return d2.getDepaartment().compareTo(d1.getDepaartment());//Descending sorted by Department
				//return d1.getDepaartment().compareTo(d2.getDepaartment());//Descending Sorted by Department
			}
		});*/
		
		//Sort by Salary
		Collections.sort(listOfDevelopers, new Comparator<Developer>() {

			@Override
			public int compare(Developer d1, Developer d2) {

				return d1.getSalary()-d2.getSalary();//Ascneding Sorted by Salary
				//return -d2.getSalary()-d1.getSalary();//Ascending sorted by Salary
				//return d2.getSalary()-d1.getSalary();//Descending sorted by Salary
				//return return -d1.getSalary()-d2.getSalary();//Descending Sorted by Salary
			}
		});
		
		System.out.println("After Sorting...");
		for (Developer developer : listOfDevelopers) {
			System.out.println(developer);
		}
		
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
