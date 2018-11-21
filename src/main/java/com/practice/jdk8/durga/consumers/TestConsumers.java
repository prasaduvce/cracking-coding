package com.practice.jdk8.durga.consumers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumers {
	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Hello");
		c.accept("DurgaSoft");

		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("XYZ", "XYZHero", "XYZHeroine"));
		movies.add(new Movie("ABC", "ABCHero", "ABCHeroine"));
		movies.add(new Movie("DEF", "DEFHero", "DEFHeroine"));

		Consumer<Movie> movieConsumer = movie -> {
			System.out.println("Movie name: "+movie.name);
			System.out.println("Movie hero: "+movie.hero);
			System.out.println("Movie heroine: "+movie.heroine);
		};

		for (Movie m : movies) {
			movieConsumer.accept(m);
		}
	}
}

class Movie {
	String name;
	String hero;
	String heroine;

	public Movie(String name, String hero, String heroine) {
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}
}