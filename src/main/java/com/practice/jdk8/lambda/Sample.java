package com.practice.jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Sample {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

        values.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        values.forEach((integer) -> System.out.println("From Lambda ==> "+integer));
        values.forEach(System.out::println);
    }
}
