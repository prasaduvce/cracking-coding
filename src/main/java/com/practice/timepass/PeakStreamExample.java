package com.practice.timepass;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class PeakStreamExample {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(1, "AAA", BigDecimal.valueOf(100)),
				new Employee(2, "BBB", BigDecimal.valueOf(200)),
				new Employee(3, "CCC", BigDecimal.valueOf(300))
		);

		System.out.println("Before Salary Hike employees ===> "+employees);
		List<Employee> employeesAfterHike = employees.stream()
				.peek(new Consumer<Employee>() {
					@Override
					public void accept(Employee employee) {
						employee.incrementSalary(BigDecimal.valueOf(2));
					}
				}).collect(Collectors.toList());
		System.out.println("After Salary Hike employees ===> "+employeesAfterHike);
	}
}

class Employee {
	int id;
	String name;
	BigDecimal salary;

	public Employee(int id, String name, BigDecimal salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public BigDecimal incrementSalary(BigDecimal hikePercent) {
		BigDecimal actualPercent = hikePercent.divide(BigDecimal.valueOf(100));
		BigDecimal hikedSalry = this.salary.multiply(actualPercent);
		return this.salary = this.salary.add(hikedSalry);
	}

	@Override
	public String toString() {
		return "Employee{" +
			   "id=" + id +
			   ", name='" + name + '\'' +
			   ", salary=" + salary +
			   '}';
	}
}