package com.practice.facebook.tictactoe;

public class TTT {

    private static final Character X = 'X';
    private static final Character O = 'O';
    private static final Character EMPTY = '-';

    char [][] board;

    private char currentPlayerMark;

    public char getCurrentPlayerMark() {
        return currentPlayerMark;
    }

    public TTT() {
        this.board = new char[3][3];
        this.currentPlayerMark = X;
    }

    public void initializeBoard() {
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i=0;i<3;i++) {
            System.out.println("-------------");
            System.out.print("| ");
            for (int j=0;j<3;j++) {
                System.out.print(board[i][j]+ " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean isBoardFull() {
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkForWin() {
        if (checkRowsForWin() ||
        checkColumnsForWin() ||
        checkDiagonalsForWin()) {
            return true;
        }
        return false;
    }

    public boolean checkRowsForWin() {
        for (int i=0;i<3;i++) {
            return checkRowCol(
                board[i][0],
                board[i][1],
                board[i][2]);
        }
        return false;
    }

    public boolean checkColumnsForWin() {
        for (int i=0;i<3;i++) {
            return checkRowCol(
                board[0][i],
                board[1][i],
                board[2][i]);
        }
        return false;
    }

    public boolean checkDiagonalsForWin() {
        return checkRowCol(board[0][0], board[1][1], board[2][2])
            || checkRowCol(board[0][2], board[1][1], board[2][0]);
    }

    public boolean checkRowCol(char c1, char c2, char c3) {
        if (c1 == EMPTY || c2 == EMPTY || c3 == EMPTY) {
            return false;
        }
        return (c1 == c2) && (c1 == c3);
    }

    public void changePlayer() {
        if (this.currentPlayerMark == O) {
            this.currentPlayerMark = X;
        } else {
            this.currentPlayerMark = O;
        }
    }

    public boolean placeMark(int row, int col) {
        if ( (row >=0 && row <=2)
            && (col >=0 && col <=2)
        && board[row][col] == EMPTY) {
            board[row][col] = currentPlayerMark;
            return true;
        }
        return false;
    }
}
