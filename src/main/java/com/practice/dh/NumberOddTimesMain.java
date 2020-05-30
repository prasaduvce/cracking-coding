package com.practice.dh;

public class NumberOddTimesMain {
    int getOddTimesElement(int ar[])
    {
        int i;
        int result = 0;
        for (i = 0; i < ar.length; i++)
        {
            // XOR operation
            System.out.println(result+" ^ "+ar[i]);
            result = result ^ ar[i];
            System.out.println("xor result ===> "+result);
        }
        return result;
    }


    public static void main(String[] args)
    {
        NumberOddTimesMain occur = new NumberOddTimesMain();
        int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        System.out.println("Number which occurs odd number of times is : "+occur.getOddTimesElement(array));
    }
}
