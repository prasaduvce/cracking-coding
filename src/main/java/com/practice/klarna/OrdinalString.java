package com.practice.klarna;

public class OrdinalString {

    public static void main(String[] args) {
        Integer number = 23;
        String result = numberToOrdinal(number);
        System.out.println(result);

        /*boolean endingWith = isEndingWith(3, 3);
        System.out.println("endingWith ==> "+endingWith);*/
    }

    private static String numberToOrdinal( Integer number ) {
        if (number == 0) {
            return "0";
        }
        if (ifNumberBetween4And20Range(number)) {
            return number+"th";
        }
        if (isEndingWith(number, 1)) {
            return number+"st";
        }
        if (isEndingWith(number, 2)) {
            return number+"nd";
        }
        if (isEndingWith(number, 3)) {
            return number+"rd";
        }
        return number+"th";
    }

    private static boolean ifNumberBetween4And20Range(Integer number) {
        for (int i=0;i<10000;i=i+100) {
            if (number >= (i+4) && number <=(i+20)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isEndingWith(Integer number, Integer endingDigit) {
        Integer remainder = number % 10;
        return remainder.equals(endingDigit);
    }
}
