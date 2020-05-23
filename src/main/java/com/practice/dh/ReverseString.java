package com.practice.dh;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String input = "Prasad";
        System.out.println("Reverse of string "+input+" is "+reverseString.reverse(input));
        System.out.println("Reverse of string "+input+" is "+reverseString.reverseRecursion(input));
    }

    private String reverse(String input) {
        if (input.isEmpty()) {
            return "";
        }
        String reversedString = "";
        for (int i=input.length()-1;i>=0;i--) {
            reversedString = reversedString+input.charAt(i);
        }
        return reversedString;
    }

    private String reverseRecursion(String input) {
        if (input.isEmpty()) {
            return input;
        }
        System.out.println("Reversing String "+input.substring(1));
        return reverseRecursion(input.substring(1))+input.charAt(0);
    }

}
