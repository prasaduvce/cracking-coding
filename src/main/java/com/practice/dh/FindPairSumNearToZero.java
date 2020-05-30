package com.practice.dh;

public class FindPairSumNearToZero {

    public static void main(String[] args) {
        int array[]={1,3,-5,7,8,20,-40,6};
        printMinSumNearToZero(array);
    }

    private static void printMinSumNearToZero(int[] num) {
        int minSum = num[0]+num[1];
        int index1 = 0;
        int index2 = 0;
        for (int i=0;i<num.length;i++) {
            for (int j=i+1;j<num.length;j++) {
                int tempSum = num[i]+num[j];
                if (Math.abs(tempSum) <= Math.abs(minSum)) {
                    index1 = i;
                    index2 = j;
                    minSum = tempSum;
                }
            }
        }
        System.out.println("First num "+num[index1]+", Second Num "+num[index2]);
    }
}
