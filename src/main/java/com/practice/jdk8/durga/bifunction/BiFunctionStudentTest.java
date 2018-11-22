package com.practice.jdk8.durga.bifunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionStudentTest {

	public static void main(String[] args) {
		BiFunction<String, Integer, Student> studentBiFunction = (name, rollNo) -> new Student(name, rollNo);
		List<Student> students = new ArrayList<>();
		students.add(studentBiFunction.apply("AAA", 123));
		students.add(studentBiFunction.apply("BBB", 456));
		students.add(studentBiFunction.apply("CCC", 789));
		students.add(studentBiFunction.apply("DDD", 135));
		System.out.println(students);
	}
}

class Student {
	String name;
	int rollNo;

	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student{" +
			   "name='" + name + '\'' +
			   ", rollNo=" + rollNo +
			   '}';
	}
}