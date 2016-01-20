package com.practice.jdk8.lambda;

import java.util.Arrays;
import java.util.List;

public class Sample4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,6,2,8,3,4,5,9,10,7);

        int result = 0;
        for (Integer num:numbers) {
            if (num > 3 && num %2 == 0) {
                result = 2*num;
                        break;
            }
        }
        //System.out.println("Result ===> "+result);
        System.out.println("Result from Lambda ===> "+numbers.stream()
                .filter(Sample4::isGT3)
                .filter(Sample4::isEven)
                .map(Sample4::multiplyIt)
                .findFirst()
                .get());
    }

    private static boolean isGT3(Integer num) {
        System.out.println("isGT3 :: for "+num);
        return num > 3;
    }

    private static boolean isEven(Integer num) {
        System.out.println("isEven :: for "+num);
        return num % 2 ==0;
    }

    private static int multiplyIt(Integer num) {
        System.out.println("multiplyIt :: for "+num);
        return num*2;
    }
}
