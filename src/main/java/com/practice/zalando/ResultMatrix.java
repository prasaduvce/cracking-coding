package com.practice.zalando;

public class ResultMatrix {

    private int [][] numsBoard;

    private int row;

    private int col;

    private int row0Sum;

    private int row1Sum;

    private int[] nums;

    public ResultMatrix(int[] nums, int row0Sum, int row1Sum) {
        this.row = 2;
        this.col = nums.length;
        this.numsBoard = new int[row][col];
        this.nums = nums;
        this.row0Sum = row0Sum;
        this.row1Sum = row1Sum;
    }

    public void initialize() {
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                numsBoard[i][j] = 0;
            }
        }
    }

    public int getRowSum(int rowIndex) {
        int sum = 0;
        for (int i=0;i<col;i++) {
            sum = sum + numsBoard[rowIndex][i];
        }
        return sum;
    }

    public int getColumnSum(int columnIndex) {
        int sum = 0;
        for (int i=0;i<row;i++) {
            sum = sum+numsBoard[i][columnIndex];
        }
        return sum;
    }

    public void placeNumber(int row, int col) {
        int arrayRow0Sum = getRowSum(0);
        int colSum = getColumnSum(col);
        if (arrayRow0Sum < row0Sum && colSum < nums[col]) {
            numsBoard[0][col] = 1;
        }
        int arrayRow1Sum = getRowSum(1);
        colSum = getColumnSum(col);
        if (arrayRow1Sum < row1Sum && colSum < nums[col]) {
            numsBoard[1][col] = 1;
        }
    }

    public void displayBoard() {
        System.out.println("-----------------");
        for (int i=0;i<row;i++) {
            System.out.print("|");
            for (int j=0;j<col;j++) {
                System.out.print(numsBoard[i][j]+" |");
            }
            System.out.println("");
            System.out.println("-----------------");
        }
    }
}
