package com.practice.mycodeschool;

public class ReturnSpiralArray {

    public Integer[] get(int [][] inputArray) {
        int row = inputArray.length;
        int column = inputArray[0].length;
        Integer [] res = new Integer[column*row];
        int top = 0;
        int bottom = row-1;
        int left = 0;
        int right = column - 1;
        int dir = 0;
        int j =0;
        while (top <= bottom && left <= right) {
            if (dir == 0) {
                for (int i=left; i<=right; i++) {
                    res[j++] = inputArray[top][i];
                }
                top++;
                //dir = 1;
            }
            else if (dir == 1) {
                for (int i=top;i<=bottom;i++) {
                    res[j++] = inputArray[i][right];
                }
                right--;
                //dir = 2;
            }
            else if (dir == 2) {
                for (int i=right; i>=left;i--) {
                    res[j++] = inputArray[bottom][i];
                }
                bottom--;
                //dir = 3;
            }
            else if (dir == 3) {
                for (int i=bottom;i>=top;i--) {
                    res[j++] = inputArray[i][left];
                }
                left++;
                //dir = 0;
            }
            dir = (dir+1)%4;
        }
        return res;
    }
}
