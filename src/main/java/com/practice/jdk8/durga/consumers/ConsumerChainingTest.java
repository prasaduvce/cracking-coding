package com.practice.jdk8.durga.consumers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerChainingTest {

	public static void main(String[] args) {
		List<Movie1> movie1s = new ArrayList<>();
		movie1s.add(new Movie1("MV1", "HIT"));
		movie1s.add(new Movie1("MV2", "AVG"));
		movie1s.add(new Movie1("MV3", "FLOP"));
		movie1s.add(new Movie1("MV4", "NOTGOOD"));

		Consumer<Movie1> c1 = m -> System.out.println("Movie "+m.name +" is going to be released");
		Consumer<Movie1> c2 = m -> System.out.println("Movie "+m.name +" is "+m.result);
		Consumer<Movie1> c3 = m -> System.out.println("Movie "+m.name +" result is going to be saved in DB ");

		Consumer<Movie1> chained = c1.andThen(c2).andThen(c3);

		for (Movie1 m: movie1s) {
			chained.accept(m);
		}
	}
}

class Movie1 {
	String name;
	String result;

	public Movie1(String name, String result) {
		this.name = name;
		this.result = result;
	}
}