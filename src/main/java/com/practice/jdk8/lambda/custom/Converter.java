package com.practice.jdk8.lambda.custom;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F f);
}
