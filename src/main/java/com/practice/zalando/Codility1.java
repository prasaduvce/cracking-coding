package com.practice.zalando;

public class Codility1 {

    public static void main(String[] args) {

        Codility1 codility1 = new Codility1();
        System.out.println("Solution ==> "+codility1.solution(1990));


    }

    public int solution(int N) {
        int sum = calculateSumOfDigits(N);
        while (true) {
            N = N+1;
            int newSum = calculateSumOfDigits(N);
            if (newSum == sum) {
                break;
            }
        }
        return N;
    }

    private int calculateSumOfDigits(int num) {
        String numStr = String.valueOf(num);
        int sum = 0;
        for (int i =0;i<numStr.length();i++) {
            int i1 = numStr.charAt(i) - '0';
            sum = sum+i1;
        }
        return sum;
    }
}
