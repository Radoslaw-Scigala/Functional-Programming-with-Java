package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chapter3Video7 {
    static class Employee {
        public final String name;
        public final Integer age;
        public final String jobTitle;
        public final Float salary;

        public Employee(String name, Integer age, String jobTitle, Float salary) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        Chapter3Challenge1.Employee[] employeesArr = {
                new Chapter3Challenge1.Employee("John", 34, "developer", 80000f),
                new Chapter3Challenge1.Employee("Hannah", 24, "developer", 95000f),
                new Chapter3Challenge1.Employee("Bart", 50, "sales executive", 100000f),
                new Chapter3Challenge1.Employee("Sophie", 49, "construction worker", 40000f),
                new Chapter3Challenge1.Employee("Darren", 38, "writer", 50000f),
                new Chapter3Challenge1.Employee("Nancy", 29, "developer", 75000f),
        };
        List<Chapter3Challenge1.Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

        Float totalDeveloperSalaries = employees
                .stream()
                .filter(emp -> emp.jobTitle.equals("developer"))
                .map(dev -> dev.salary)
                .reduce(0f, Float::sum);

        Long numberOfDevelopers = employees
                .stream()
                .filter(emp -> emp.jobTitle.equals("developer"))
                .count();

        float averageDeveloperSalary = totalDeveloperSalaries / numberOfDevelopers;

        Float totalNotDeveloperSalaries = employees
                .stream()
                .filter(emp -> !emp.jobTitle.equals("developer"))
                .map(dev -> dev.salary)
                .reduce(0f, Float::sum);

        Long numberOfNotDevelopers = employees
                .stream()
                .filter(emp -> !emp.jobTitle.equals("developer"))
                .count();

        float averageNotDeveloperSalary = totalNotDeveloperSalaries / numberOfNotDevelopers;

        System.out.println("Avg Dev salary: " + averageDeveloperSalary
                + "\nAvg not Dev salary: " + averageNotDeveloperSalary);
    }
}
