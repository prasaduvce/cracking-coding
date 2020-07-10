package com.practice.dailycoding;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {
        //String str = "the quick brown fox jumps over the lazy dog";
        String str = "the quick brown";
        String result = reverse(str);
        System.out.println("result ===>"+result);
    }

    private static String reverse(String s) {
        String result = "";
        result = reverse(s, result);
        return result;
    }

    private static String reverse(String s, String result) {
        if (s == null || s.trim().isEmpty()) {
            return result;
        }
        String[] stringSplits = s.split(" ");
        if (stringSplits.length == 1) {
            result = result+" "+ s;
            return result;
        }
        String lastString = stringSplits[stringSplits.length-1];
        result = result+" "+ lastString;
        int resultingStringLength = s.length() - lastString.length();
        String remainingString = s.substring(0, resultingStringLength-1);
        return reverse(remainingString, result);
    }
}
