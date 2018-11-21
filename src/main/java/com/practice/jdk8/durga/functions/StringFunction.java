package com.practice.jdk8.durga.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StringFunction {
	public static void main(String[] args) {
		Function<String, Integer> stringLengthFunction = str -> str.length();
		Function<Integer, Integer> squareFunction = num -> (num * num);
		Function<String, String> removeSpacesFunction = str -> str.replace(" ", "");
		Function<String, Integer> countSpaces = str -> str.length() - removeSpacesFunction.apply(str).length();
		Function<Integer, String> gradeFunction = grade -> {
			if (grade >= 80) {
				return "A [Distinction]";
			} else if (grade >= 60) {
				return "B [FirstClass]";
			} else if (grade >= 50) {
				return "C [SecondClass]";
			} else if (grade >= 35) {
				return "D [ThirdClass]";
			}
			return "E[Failed]";
		};

		Function<List<Employee>, Double> totalMonthlySalaryFunction = employees -> {
			Double salary = 0D;
			for (Employee emp:employees) {
				salary = salary+emp.salary;
			}
			return salary;
		};
		System.out.println(stringLengthFunction.apply("Hello User"));
		System.out.println("Square of 5 is "+squareFunction.apply(5));
		System.out.println(removeSpacesFunction.apply("Hello User space"));
		System.out.println(countSpaces.apply("Hello User space java world"));
		System.out.println(gradeFunction.apply(10));
		List<Employee> employees = new ArrayList<>();
		populate(employees);
		System.out.println(totalMonthlySalaryFunction.apply(employees));
	}



	private static void populate(List<Employee> employees) {
		employees.add(new Employee("Bunny", 1200D));
		employees.add(new Employee("Chinny", 1000D));
		employees.add(new Employee("Munny", 200D));
		employees.add(new Employee("Sunny", 1700D));
	}
}

class Employee {
	String name;
	Double salary;

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "name : "+this.name+", salary : "+this.salary;
	}
}

