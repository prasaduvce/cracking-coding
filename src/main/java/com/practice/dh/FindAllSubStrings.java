package com.practice.dh;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubStrings {

    public static void main(String[] args) {
        FindAllSubStrings allSubStrings = new FindAllSubStrings();
        System.out.println(allSubStrings.subStrings("Prasad"));
    }

    private List<String> subStrings(String str) {
        List<String> subStrings = new ArrayList<>();
        for (int i=0;i<str.length();i++) {
            for (int j=i+1;j<=str.length();j++) {
                subStrings.add(str.substring(i,j));
            }
        }
        return subStrings;
    }
}
