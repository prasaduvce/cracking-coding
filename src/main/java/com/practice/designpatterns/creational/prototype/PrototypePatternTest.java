package com.practice.designpatterns.creational.prototype;

import java.util.List;

public class PrototypePatternTest {
	public static void main(String[] args) {
		Employees employees = new Employees();
		employees.loadData();

		Employees employees1 = (Employees) employees.clone();
		List<String> empList1 = employees1.getEmpList();
		empList1.add("Emp6");
		Employees employees2 = (Employees) employees.clone();
		List<String> empList2 = employees2.getEmpList();
		empList2.remove("Emp5");

		System.out.println("employees.getEmpList() ====> "+employees.getEmpList());
		System.out.println("empList1 ====> "+empList1);
		System.out.println("empList2 ====> "+empList2);
	}
}
