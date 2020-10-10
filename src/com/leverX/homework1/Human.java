package com.leverX.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Human {

    private Field gameField;

    public int getNumber() {
        gameField = Field.getInstance();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                int numberOfSelectedCell = Integer.parseInt(reader.readLine());
                if (numberOfSelectedCell >= 0 && numberOfSelectedCell < gameField.getCells().length
                        && gameField.getCells()[numberOfSelectedCell] == 0) {
                    return numberOfSelectedCell;
                }
                System.out.println("Choose a free cell and enter its number!");
            } catch (NumberFormatException ex) {
                System.out.println("Please enter the number!");
            } catch (IOException ex) {
            }
        }
    }

}

