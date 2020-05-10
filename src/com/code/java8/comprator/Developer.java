/**
 * 
 */
package com.code.java8.comprator;

/**
 * @author dineshveer
 *
 */
public class Developer {

	private String name;
	
	private String depaartment;
	
	private int salary;

	public Developer(String name, String depaartment, int salary) {
		super();
		this.name = name;
		this.depaartment = depaartment;
		this.salary = salary;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the depaartment
	 */
	public String getDepaartment() {
		return depaartment;
	}
	/**
	 * @param depaartment the depaartment to set
	 */
	public void setDepaartment(String depaartment) {
		this.depaartment = depaartment;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Developer [name=" + name + ", depaartment=" + depaartment + ", salary=" + salary + "]";
	}
	
	
	
	
}
