package com.practice.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private List<String> empList;

	public Employees() {
		this.empList = new ArrayList<>();
	}

	public Employees(List<String> empList) {
		this.empList = empList;
	}


	public void loadData() {
		this.empList.add("Emp1");
		this.empList.add("Emp2");
		this.empList.add("Emp3");
		this.empList.add("Emp4");
		this.empList.add("Emp5");
	}

	public List<String> getEmpList() {
		return this.empList;
	}

	@Override
	public Object clone() {
		List<String> tempList = new ArrayList<>(this.empList);
		return new Employees(tempList);
	}
}
