package com.practice.facebook.tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TTT game = new TTT();
        System.out.println("Tic Tac Toe gaming");
        game.initializeBoard();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Current Board layout");
            game.printBoard();

            int row;
            int col;
            do {
                System.out.println("Player "+game.getCurrentPlayerMark()+", enter an empty row and column to place mark");
                row = scanner.nextInt()-1;
                col = scanner.nextInt()-1;
            } while (!game.placeMark(row, col));
            game.changePlayer();
        }while (!game.checkForWin() && !game.isBoardFull());
        if (game.isBoardFull() && !game.checkForWin()) {
            System.out.println("Tie game");
        } else {
            System.out.println("Current board layout");
            game.printBoard();
            game.changePlayer();
            System.out.println(Character.toUpperCase(game.getCurrentPlayerMark())+" Wins");
        }
    }
}
