package com.code.java8.streamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStreamComplexExamples {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Mahesh", "HR", 55000, 30),
                new Employee("Bob", "IT", 80000, 28),
                new Employee("Ajay", "HR", 60000, 24),
                new Employee("David", "IT", 85000, 35),
                new Employee("Eva", "Sales", 75000, 29),
                new Employee("Sameer", "Sales", 72000, 32)
        );


        System.out.println("----------------------------------------------------------");

        Map<Boolean, List<Employee>> map = employees.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getAge()>30));

        System.out.println("Grouping by Employee Age below and above 30 :" +map);

        System.out.println("----------------------------------------------------------");

        System.out.println("Custom collector for Junior<25, Mid-level<30, Senior >=30");

        Map<String, List<Employee>> employeeSeperation = employees.stream()
                .collect(Collectors.groupingBy(
                        employee -> {
                            if (employee.getAge()<25)
                                return "Junior";
                            else if(employee.getAge()<30)
                                return "Mid-level";
                            else
                                return "Senior";
                        }
                ));

        System.out.println("Employee with catagory : "+employeeSeperation);

        System.out.println("---------------------------------------------------------");

        Map<String, Map<String, List<Employee>>> groupByDeptThenByAge = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.groupingBy(employee -> {
                            if (employee.getAge()<25)
                                return "Junior";
                            else if(employee.getAge()<30)
                                return "Mid-level";
                            else
                                return "Senior";
                        }
                        )));

        System.out.println("Employee with Dept then with Age grouping : "+groupByDeptThenByAge);

        System.out.println("----------------------------------------------------------");

        List<Employee> employeeWithSalary75k= employees.parallelStream()
                .filter(employee -> employee.getSalary()>75000)
                .collect(Collectors.toList());

        System.out.println("Employee with Salary greater than 75k using parallel stream : "+employeeWithSalary75k);

        System.out.println("---------------------------------------------------------");
    }
}
