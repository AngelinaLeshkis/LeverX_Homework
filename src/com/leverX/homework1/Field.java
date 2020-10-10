package com.leverX.homework1;

public class Field {

    private static Field instance = null;
    private int[] cells = {0, 0, 0,
            0, 0, 0,
            0, 0, 0};

    public static Field getInstance() {
        if (instance == null) {
            instance = new Field();
        }
        return instance;
    }

    public void drawCells() {
        System.out.println();
        System.out.println("     |     |     ");
        for (int i = 0; i < cells.length; i++) {
            if (i != 0) {
                if (i % 3 == 0) {
                    System.out.println();
                    System.out.println("_____|_____|_____");
                    System.out.println("     |     |     ");
                } else
                    System.out.print("|");
            }

            if (cells[i] == 0) {
                System.out.print("  " + i + "  ");
            }

            if (cells[i] == 1) {
                System.out.print("  X  ");
            }

            if (cells[i] == 2) {
                System.out.print("  O  ");
            }
        }
        System.out.println();
        System.out.println("     |     |     ");
        System.out.println();
    }

    public int[] getCells() {
        return cells;
    }

}

