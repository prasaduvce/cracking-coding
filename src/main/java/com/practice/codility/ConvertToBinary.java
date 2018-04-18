package com.practice.codility;

public class ConvertToBinary {

    public static void main(String[] args) {
        System.out.println("16 in binary format "+execute(16));
        System.out.println("17 in binary format "+execute(17));
        System.out.println("18 in binary format "+execute(18));
        System.out.println("19 in binary format "+execute(19));
    }


    public static Integer execute(Integer decimal) {
        if (decimal == 0 || decimal == 1) {
            return decimal;
        }
        String binaryVersion = "";
        while (decimal != 0) {

            int mod = decimal % 2;
            decimal = decimal / 2;
            binaryVersion = mod+binaryVersion;
        }
        return Integer.valueOf(binaryVersion);
    }
}
