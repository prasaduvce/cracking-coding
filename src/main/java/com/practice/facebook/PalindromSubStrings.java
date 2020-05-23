package com.practice.facebook;

import java.util.ArrayList;
import java.util.List;

public class PalindromSubStrings {

    public static void main(String[] args) {
        PalindromSubStrings subStrings = new PalindromSubStrings();
        String input = "PRGADAGRENER";
        List<String> palindromes = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j<= input.length(); j++) {
                String substring = input.substring(i, j);
                if (subStrings.isPalindrome(substring)) {
                    palindromes.add(substring);
                }
            }
        }
        if (subStrings.isPalindrome(input)) {
            palindromes.add(input);
        }
        System.out.println("palindromes ===> "+palindromes);
    }

    private boolean isPalindrome(String input) {
        int i = 0;
        int j = input.length()-1;
        boolean isPalindrome = false;
        while (i < j){
            if (input.charAt(i) == input.charAt(j)) {
                i++;
                j--;
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
