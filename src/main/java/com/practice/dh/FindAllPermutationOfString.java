package com.practice.dh;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindAllPermutationOfString {

    public static void main(String[] args) {
        String str = "abc";

        Set<String> permutations = new HashSet<>();
        permutations.stream().filter(s -> s.length() == str.length()).collect(Collectors.toSet());

        printPermut(str, "");
    }

    private static void printPermut(String str, String ans) {
        if (str.length() == 0) {
            System.out.println("Permutation is "+ans);
            return;
        }
        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            String rem = str.substring(0, i)+str.substring(i+1);
            printPermut(rem, ch+ans);
        }
    }
}
