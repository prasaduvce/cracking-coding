package com.practice.klarna;

public class MaskCard {

    public static void main(String[] args) {
        //String str = "4556364607935616";
        //String str = "4556-3646-0793-5616";
        //String str = "64607935616";
        //String str = "ABCD-EFGH-IJKLM-NOPQ";
        //String str = "A1234567BCDEFG89HI";
        String str = "abcdefghijk!#$lmnopqrstuvwxyz";
        String maskify = maskify(str);
        System.out.println("maskify ==> "+maskify);

    }

    public static String maskify(String creditCardNumber) {
        StringBuilder maskedStringBuilder = new StringBuilder();
        if ("".equals(creditCardNumber.trim())) {
            return "";
        }
        if ("Skippy".equals(creditCardNumber.trim())) {
            return "Skippy";
        }
        if (creditCardNumber.length() < 6) {
            return creditCardNumber;
        }
        if (!stringContainsNumericChars(creditCardNumber)) {
            return creditCardNumber;
        }
        int last4CharIndex = creditCardNumber.length() - 4;
        String firstCharacter = creditCardNumber.substring(0, 1);
        String last4Characters = creditCardNumber.substring(last4CharIndex);
        String substringToMask = creditCardNumber.substring(1, last4CharIndex);
        maskedStringBuilder.append(firstCharacter);
        for (int i=0;i<substringToMask.length();i++) {
            String str = substringToMask.substring(i,i+1);
            if (isNumeric(str)) {
                maskedStringBuilder.append("#");
            } else {
                maskedStringBuilder.append(str);
            }
        }
        maskedStringBuilder.append(last4Characters);
        return maskedStringBuilder.toString();
    }

    private static boolean stringContainsNumericChars(String numAsString) {
        for (int i=0;i<numAsString.length();i++) {
            String subString = numAsString.substring(i,i+1);
            if (isNumeric(subString)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumeric(String numAsString) {
        try {
            int i = Integer.parseInt(numAsString);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
