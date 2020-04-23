package com.practice.facebook;

import java.util.Collections;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ConvertToRomanNumeral {

    private static TreeMap<Integer, String> BASE_VALUES = new TreeMap<>(Collections.reverseOrder());
    static {
        BASE_VALUES.put(1, "I");
        BASE_VALUES.put(2, "II");
        BASE_VALUES.put(3, "III");
        BASE_VALUES.put(4, "IV");
        BASE_VALUES.put(5, "V");
        BASE_VALUES.put(6, "VI");
        BASE_VALUES.put(7, "VII");
        BASE_VALUES.put(8, "VIII");
        BASE_VALUES.put(9, "IX");
        BASE_VALUES.put(10, "X");
        BASE_VALUES.put(40, "XL");
        BASE_VALUES.put(50, "L");
        BASE_VALUES.put(90, "XC");
        BASE_VALUES.put(100, "C");
        BASE_VALUES.put(400, "CD");
        BASE_VALUES.put(500, "D");
        BASE_VALUES.put(900, "CM");
        BASE_VALUES.put(1000, "M");
    }

    public static void main(String[] args) {
        int num = 17;
        String romanString = printRoman(num);
        System.out.println("romanString ==> "+romanString);
    }

    private static Integer getBaseValue(int num) {
        return BASE_VALUES.entrySet()
            .stream()
            .filter(integerStringEntry -> num > integerStringEntry.getKey())
            .findAny()
            .map(Entry::getKey)
            .orElse(1);
    }

    private static String printRoman(int num) {
        String romanString = "";
        while (num > 0) {
            if (num <= 10) {
                romanString = romanString+BASE_VALUES.get(num);
                num = 0;
            } else {
                Integer baseValue = getBaseValue(num);
                int remainder = num % baseValue;
                int quotient = num / baseValue;
                num = remainder;
                for (int i=0; i<quotient;i++) {
                    String s = BASE_VALUES.get(baseValue);
                    romanString = romanString+s;
                }
            }
        }
        return romanString;
    }
}
