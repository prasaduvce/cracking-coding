package com.practice.zalando;

public class Test3 {

    public static void main(String[] args) {
        /*int [] nums = {2, 1, 1, 0, 1};
        int row0Sum = 3;
        int row1Sum = 2;*/
        int [] nums = {2, 0, 2, 0};
        int row0Sum = 2;
        int row1Sum = 2;
        ResultMatrix resultMatrix = new ResultMatrix(nums, row0Sum, row1Sum);
        resultMatrix.initialize();
        resultMatrix.displayBoardOld();

        //for (int i=0;i<2;i++) {
            for (int j=0;j<nums.length;j++) {
                resultMatrix.placeNumber(j);
            }
        //}
        resultMatrix.displayBoardOld();
        String result = resultMatrix.displayBoard();
        System.out.println("result ==> "+result);
    }
}
