package com.leverX.homework1;

import java.util.Scanner;

public class GameProcess {

    private Field gameField;
    private boolean isCurrentX = false;
    private boolean gameOver = false;

    public void startOfTheGame() {
        gameField = Field.getInstance();
        int numberOfVariant = 0;
        System.out.println("If you want to play with the computer please enter the number 1, but if you want to play" +
                " with your friend enter the number 2:");
        Scanner choiceViewOfPLay = new Scanner(System.in);
        boolean fl = false;
        while (!fl) {
            numberOfVariant = choiceViewOfPLay.nextInt();
            if (numberOfVariant == 1) {
                computerAndHumanMode();
                fl = true;
            } else if (numberOfVariant == 2) {
                twoHumanPlayersMode();
                fl = true;
            } else {
                System.out.println("Please enter 1 or 2!");
            }
        }
    }

    public void twoHumanPlayersMode() {
        Human player = new Human();
        System.out.println();
        System.out.println("You have chosen the game mode with your friend.");
        while (!gameOver) {
            isCurrentX = !isCurrentX;
            gameField.drawCells();
            System.out.println("Please choose the number of a free cell that you want to mark" +
                    " as " + (isCurrentX ? "X." : "O."));
            int numberOfSelectedCell = player.getNumber();
            gameField.getCells()[numberOfSelectedCell] = isCurrentX ? 1 : 2;
            gameOver = isGameOver(numberOfSelectedCell);
            if (isDraw()) {
                System.out.println("The game ended in a draw.");
                return;
            }
        }
        gameField.drawCells();
        System.out.println();
        System.out.println("The winner is " + (isCurrentX ? "X" : "O") + "!");
    }

    public void computerAndHumanMode() {
        Human player1 = new Human();
        Computer player2 = new Computer();
        int numberOfSelectedCell = 0;
        int j = 0;
        System.out.println();
        System.out.println("You have chosen the game mode with the computer. Your sign is X.");
        gameField.drawCells();
        while (!gameOver) {
            if (!isCurrentX) {
                System.out.println("Please choose the number of a free cell that you want to mark" +
                        " as X.");
                numberOfSelectedCell = player1.getNumber();
                gameField.getCells()[numberOfSelectedCell] = 1;
                gameOver = isGameOver(numberOfSelectedCell);
            } else {
                j = player2.getNumber(numberOfSelectedCell);
                gameField.getCells()[j] = 2;
                gameOver = isGameOver(j);
            }
            isCurrentX = !isCurrentX;
            if (!isCurrentX) {
                gameField.drawCells();
            }
            if (isDraw()) {
                System.out.println("The game ended in a draw.");
                return;
            }
        }
        gameField.drawCells();
        System.out.println();
        System.out.println("The winner is " + (isCurrentX ? "X" : "O") + "!");
    }

    public boolean isGameOver(int numberOfSelectedCell) {
        //поиск совпадений по горизонтали
        int row = numberOfSelectedCell - numberOfSelectedCell % 3; //номер строки - проверяем только её
        if (gameField.getCells()[row] == gameField.getCells()[row + 1] &&
                gameField.getCells()[row] == gameField.getCells()[row + 2]) {
            return true;
        }
        //поиск совпадений по вертикали
        int column = numberOfSelectedCell % 3; //номер столбца - проверяем только его
        if (gameField.getCells()[column] == gameField.getCells()[column + 3])
            if (gameField.getCells()[column] == gameField.getCells()[column + 6]) {
                return true;
            }
        //мы здесь, значит, первый поиск не положительного результата
        //если значение n находится на одной из граней - возвращаем false
        if (numberOfSelectedCell % 2 != 0) {
            return false;
        }
        //проверяем принадлежит ли к левой диагонали значение
        if (numberOfSelectedCell % 4 == 0) {
            //проверяем есть ли совпадения на левой диагонали
            if (gameField.getCells()[0] == gameField.getCells()[4] &&
                    gameField.getCells()[0] == gameField.getCells()[8]) {
                return true;
            }

            if (numberOfSelectedCell != 4) {
                return false;
            }
        }
        return gameField.getCells()[2] == gameField.getCells()[4] &&
                gameField.getCells()[2] == gameField.getCells()[6];
    }

    public boolean isDraw() {
        for (int i : gameField.getCells()) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }

}

