package com.code.java8.streamExamples;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Mahesh", "HR", 55000, 30),
                new Employee("Bob", "IT", 80000, 28),
                new Employee("Ajay", "HR", 60000, 25),
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

        System.out.println("--------------------------------------------------------------------");

        List<Employee> employeeWithSalaryDescending =
                employees.stream()
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                .collect(Collectors.toList());

        System.out.println("Employee with Salary Descending : " + employeeWithSalaryDescending);

        System.out.println("---------------------------------------------------------");

        List<Employee> employeeWithA =
                employees.stream()
                        .filter(employee -> employee.getName().toLowerCase().startsWith("a"))
                        .collect(Collectors.toList());

        System.out.println("Employee with A : " + employeeWithA);

        System.out.println("-----------------------------------------------------------");

        Double totalSalry = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();

        System.out.println("Total Salary of all employee : " + totalSalry);

        System.out.println("-----------------------------------------------------------");

        System.out.println("Summary statitics of all employees");

        DoubleSummaryStatistics doubleSummaryStatistics =
                employees.stream()
                        .mapToDouble(Employee::getSalary)
                        .summaryStatistics();

        System.out.println("Total Sum of all employees: " + doubleSummaryStatistics.getSum());
        System.out.println("Average Salary of all employees: " + doubleSummaryStatistics.getAverage());
        System.out.println("Max Salary of all employees: " + doubleSummaryStatistics.getMax());
        System.out.println("Min Salary of all employees: " + doubleSummaryStatistics.getMin());
        System.out.println("Total count of all employees: " + doubleSummaryStatistics.getCount());

        System.out.println("-------------------------------------------------------------");

        Map<String, String> nameToDept = employees.stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getDepartment));

        System.out.println("Employee with Name : " + nameToDept);

        System.out.println("------------------------------------------------------------");

        Optional<Employee> oldestEmployee = employees.stream()
                .max(Comparator.comparingInt(Employee::getAge));
                 //   .max(Comparator.comparing(Employee::getAge));

        System.out.println("Oldest employee : " + oldestEmployee);

        System.out.println("----------------------------------------------------------");

        String nameJoinedByComma = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "));

        System.out.println("Employee with Name Joined By Comma : " + nameJoinedByComma);

        System.out.println("--------------------------------------------------------");

    }
}
