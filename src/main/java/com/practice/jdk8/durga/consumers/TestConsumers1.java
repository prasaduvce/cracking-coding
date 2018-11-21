package com.practice.jdk8.durga.consumers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestConsumers1 {
	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student("Sunny", 80));
		students.add(new Student("Bunny", 70));
		students.add(new Student("Chinny", 60));
		students.add(new Student("Gunny", 50));
		students.add(new Student("Dunny", 40));
		students.add(new Student("Junny", 30));

		Predicate<Student> predicate = student -> student.marks >=60;
		Function<Student, String> function = student -> {
			if (student.marks >= 80) {
				return "A [Distinction]";
			} else if (student.marks >= 60) {
				return "B [FirstClass]";
			} else if (student.marks >= 50) {
				return "C [SecondClass]";
			} else if (student.marks >= 35) {
				return "D [ThirdClass]";
			}
			return "E[Failed]";
		};
		Consumer<Student> consumer = student -> {
			System.out.println("Name is "+student.name);
			System.out.println("Marks is "+student.marks);
			System.out.println("Grade is "+function.apply(student));
		};

		for (Student st:students) {
			if (predicate.test(st)) {
				consumer.accept(st);
			}
		}
	}
}

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}