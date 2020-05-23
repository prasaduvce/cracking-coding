package com.practice.dh;

import java.util.Arrays;

public class StringAnagram {

    public static void main(String[] args) {
        StringAnagram stringAnagram = new StringAnagram();
        System.out.println("Is Anagram ===> "+stringAnagram.isAnagram("c a t", "act"));
    }

    private boolean isAnagram(String input1, String input2) {
        String input1Replaced = input1.replaceAll(" ", "");
        String input2Replaced = input2.replaceAll(" ", "");
        if (input1Replaced.length() != input2Replaced.length()) {
            return false;
        }

        System.out.println("input1Replaced ==> "+input1Replaced);
        System.out.println("input2Replaced ==> "+input2Replaced);

        char[] firstChars = input1Replaced.toCharArray();
        Arrays.sort(firstChars);
        char[] secondChars = input2Replaced.toCharArray();
        Arrays.sort(secondChars);

        System.out.println("input1Replaced after sorting ==> "+Arrays.toString(firstChars));
        System.out.println("input2Replaced after sorting ==> "+Arrays.toString(secondChars));

        return Arrays.equals(firstChars, secondChars);
    }
}
