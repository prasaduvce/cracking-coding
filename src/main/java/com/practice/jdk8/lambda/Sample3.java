package com.practice.jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Sample3 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(3,1,5,6,2,4);
        System.out.println("Total Sum ===> "+totalValues(values, e -> true));
        System.out.println("Even Sum ===> "+totalValues(values, e -> e%2 ==0));
        System.out.println("Odd Sum ===> "+totalValues(values, e -> e%2 != 0));
    }

    private static int totalValues(List<Integer> values, Predicate<Integer> predicate) {
       /* int sum = 0;
        for (Integer val:values){
            if (predicate.test(val)) {
                sum += val;
            }
        }
        return sum;*/
        return values.stream().filter(predicate).reduce(0, (c, e) -> c+e);
    }
}
