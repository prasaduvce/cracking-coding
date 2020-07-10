package com.practice.dailycoding;

import java.util.ArrayList;
import java.util.List;

public class SplitString {

    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog";
        int k = 10;
        List<String> result = breakString(str, k);
        System.out.println("result ===> "+result);
    }

    private static List<String> breakString(String s, int k) {
        ArrayList<String> resultList = new ArrayList<>();
        breakStr(s, k, resultList);
        return resultList;
    }

    private static List<String> breakStr(String s, int k, List<String> resultList) {
        if (s.length() < k) {
            resultList.add(s);
            return resultList;
        }
        String substring = s.substring(0, k);
        resultList.add(substring);
        String remainingString = s.substring(substring.length());
        return breakStr(remainingString, k, resultList);
    }
}
