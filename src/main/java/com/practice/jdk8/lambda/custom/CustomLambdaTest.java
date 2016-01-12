package com.practice.jdk8.lambda.custom;

public class CustomLambdaTest {
    public static void main(String[] args) {
        Converter<String, Integer> integerConverter = Integer::valueOf;
        System.out.println(integerConverter.convert("3456"));
    }
}
