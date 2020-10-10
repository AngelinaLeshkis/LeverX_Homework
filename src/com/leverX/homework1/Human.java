package com.leverX.homework1;

import java.util.Scanner;

public class Human {

    private Field gameField;

    public int getNumber() {
        gameField = Field.getInstance();
        Scanner enteredNumber = new Scanner(System.in);
        while (true) {
                int numberOfSelectedCell = enteredNumber.nextInt();
                if (numberOfSelectedCell >= 0 && numberOfSelectedCell < gameField.getCells().length
                        && gameField.getCells()[numberOfSelectedCell] == 0) {
                    return numberOfSelectedCell;
                }
                System.out.println("Choose a free cell and enter its number!");
        }
    }

}

