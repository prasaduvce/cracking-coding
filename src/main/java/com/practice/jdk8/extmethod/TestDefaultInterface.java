package com.practice.jdk8.extmethod;

public class TestDefaultInterface {
    public static void main(String[] args) {
        Formula formula = new Formula () {
            public double calculate(int num) {
                return sqrt(num * 100);
            }
        };
        System.out.println("formula.calculate(123) ===> "+formula.calculate(81));
        System.out.println("formula.sqrt(81) ===> "+formula.sqrt(81));
    }
}