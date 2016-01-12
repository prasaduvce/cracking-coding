package com.practice.jdk8.extmethod;

public interface Formula {
    double calculate(int num);

    default double sqrt(int num) {
        return Math.sqrt(num);
    }
}
