package com.practice.jdk8.durga.bifunction;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class EmployeeBiFunctionTest {

	public static void main(String[] args) {
		Employee e = new Employee(101, "Durga", 1500D);
		TimeSheet t = new TimeSheet(101, 25);

		BiFunction<Employee, TimeSheet, Double> monthlySalaryFunction = (emp, timeSheet) -> emp.dailyWage * timeSheet.days;

		System.out.println(monthlySalaryFunction.apply(e, t));
	}
}

class Employee {
	String name;
	int eno;
	Double dailyWage;

	public Employee(int eno, String name,  Double dailyWage) {
		this.name = name;
		this.eno = eno;
		this.dailyWage = dailyWage;
	}
}

class TimeSheet {
	int eno;
	int days;

	public TimeSheet(int eno, int days) {
		this.eno = eno;
		this.days = days;
	}
}
