package com.practice.jdk8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample2 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(3,2,5,6,1,4);

        int sum = 0;
        for (Integer num: values) {
            sum += num*2;
        }
        System.out.println("Result from old java code is "+sum);

        int res = values.stream().map(e -> e*2).reduce(0, (c, e) -> c+e);
        System.out.println("Res from lambda ====> "+res);
    }
}
