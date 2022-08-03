package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Chapter3Challenge1 {
    public static void main(String[] args) {
        Person[] peopleArr = {
                new Person("Brandon", 23),
                new Person("Hank", 43),
                new Person("Jenna", 33),
                new Person("Veronica", 56),
                new Person("Jack", 27)
        };
        List<Person> people = new ArrayList<>(Arrays.asList(peopleArr));

        // Get a list that contains all the people's name
        Function<Person, String> getName = (person) -> person.name;
        List<String> names = people
                .stream()
                .map(getName)
                .toList();

        System.out.println(names);

        Car[] carsArr = {
                new Car("Chevy", "red", 45000f),
                new Car("Ford", "blue", 23000f),
                new Car("Toyota", "grey", 14000f),
                new Car("Lamborghini", "blue", 150000f),
                new Car("Renault", "blue", 150000f)
        };
        List<Car> cars = new ArrayList<>(Arrays.asList(carsArr));

        // Get a list of all the blue cars
        Predicate<Car> isCarBlue = (car) -> car.color.equals("blue");
        List<Car> blueCars = cars
                .stream()
                .filter(isCarBlue)
                .toList();

        blueCars.forEach(car -> {
            System.out.println("Brand: " + car.make + ", color: " + car.color + ", price: " + car.price);
        });

        Employee[] employeesArr = {
                new Employee("John", 34, "developer", 80000f),
                new Employee("Hannah", 24, "developer", 95000f),
                new Employee("Bart", 50, "sales executive", 100000f),
                new Employee("Sophie", 49, "construction worker", 40000f),
                new Employee("Darren", 38, "writer", 50000f),
                new Employee("Nancy", 29, "developer", 75000f),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

        // Find the sum of all the employees' salaries
        Function<Employee, Float> getSalary = (emp) -> emp.salary;
        BinaryOperator<Float> sumSalaries = Float::sum; //(acc, x) -> acc + x
        Float sumAllSalaries = employees
                .stream()
                .map(getSalary)
                .reduce(0f, sumSalaries);

        System.out.println("Sum of all the employees' salaries: " + sumAllSalaries);
    }

    static class Person {
        public final String name;
        public final Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Car {
        public final String make;
        public final String color;
        public final Float price;

        public Car(String make, String color, Float price) {
            this.make = make;
            this.color = color;
            this.price = price;
        }
    }

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
}
