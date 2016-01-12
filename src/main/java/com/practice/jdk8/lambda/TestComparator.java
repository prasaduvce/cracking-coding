package com.practice.jdk8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bheemesh", "Somesh", "Arun", "Aakash" ,"Zaheer", "Yasin");

        System.out.println("Before sorting collections ======> "+names);

        Collections.sort(names, (firstString, secondString) -> secondString.compareTo(firstString));

        System.out.println("After sorting collections ======> "+names);
    }
}
