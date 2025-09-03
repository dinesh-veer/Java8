package com.code.java8.streamExamples;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Mahesh", "HR", 55000, 30),
                new Employee("Bob", "IT", 80000, 28),
                new Employee("Kotlin", "HR", 60000, 25),
                new Employee("David", "IT", 85000, 35),
                new Employee("Eva", "Sales", 75000, 29),
                new Employee("Sameer", "Sales", 72000, 32)
        );


        System.out.println("----------------------------------------------------------");

        Map<String, List<Employee>> groupByDepartment = employees.stream().
                                        collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Group by Department : " + groupByDepartment);

        System.out.println("----------------------------------------------------------");

        Map<String, Double> averageSalaryByDepartment =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average salary by Department : " + averageSalaryByDepartment);

        System.out.println("----------------------------------------------------------");

        Map<String, Optional<Employee>> highestSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                        ));
        //Without optional
        Map<String, Employee> highestSalaryByDept1 =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                                                Optional::get)
                        ));
        System.out.println("Highest salary by Department : " + highestSalaryByDept);


        System.out.println("---------------------------------------------------------");
    }
}
