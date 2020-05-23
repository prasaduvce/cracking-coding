package com.practice.dh;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringUnique {

    public static void main(String[] args) {
        StringUnique stringUnique = new StringUnique();
        String str = "Helo";
        System.out.println(stringUnique.isUnique(str));
    }

    private boolean isUnique(String input) {
        Set<Character> charSet = new HashSet<>();
        for (int i=0;i<input.length();i++) {
            char c = input.charAt(i);
            if (!charSet.add(c)) {
                return false;
            }
        }
        return true;
    }
}
