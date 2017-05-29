package com.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by renuka.prasad on 2017/05/29.
 */
public class CamelCase {

    public static void main(String[] args) {
        System.out.println("Enter string to count the camel case words.");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println("Str is ===> "+str);
        int countOfCamelCaseWords = 0;
        char[] chars = str.toCharArray();
        for (int i=0;i<str.length(); i++) {
            if (Character.isUpperCase(chars[i])) {
                countOfCamelCaseWords++;
            }
        }
        System.out.println("Count of Camel Case letters is : "+(countOfCamelCaseWords+1));
    }
}
