package com.leverX.homework1;

public class Computer {

    private Field gameField;

    public int getNumber(int n) {
        gameField = Field.getInstance();
        switch (n) {
            case 0:
                if (gameField.getCells()[n + 1] == 1 && gameField.getCells()[n + 2] == 0) {
                    n += 2;
                } else if (gameField.getCells()[n + 3] == 1 && gameField.getCells()[n + 6] == 0) {
                    n += 6;
                } else if (gameField.getCells()[n + 2] == 1 && gameField.getCells()[n + 1] == 0) {
                    n++;
                } else if (gameField.getCells()[n + 6] == 1 && gameField.getCells()[n + 3] == 0) {
                    n += 3;
                } else if (gameField.getCells()[n + 8] == 1 && gameField.getCells()[n + 4] == 0) {
                    n += 4;
                } else if (gameField.getCells()[n + 4] == 1 && gameField.getCells()[n + 8] == 0) {
                    n += 8;
                } else {
                    for (int i = 0; i < gameField.getCells().length; i++) {
                        if (gameField.getCells()[i] == 0) {
                            n = i;
                        }
                    }
                }
                break;

            case 1:
                if (gameField.getCells()[n + 1] == 1 && gameField.getCells()[n - 1] == 0) {
                    n--;
                } else if (gameField.getCells()[n - 1] == 1 && gameField.getCells()[n + 1] == 0) {
                    n++;
                } else if (gameField.getCells()[n + 4] == 1 && gameField.getCells()[n + 7] == 0) {
                    n += 7;
                } else if (gameField.getCells()[n + 7] == 1 && gameField.getCells()[n + 4] == 0) {
                    n += 4;
                }  else {
                    for (int i = 0; i < gameField.getCells().length; i++) {
                        if (gameField.getCells()[i] == 0) {
                            n = i;
                        }
                    }
                }
                break;

            case 2:
                if (gameField.getCells()[n - 1] == 1 && gameField.getCells()[n - 2] == 0) {
                    n -= 2;
                } else if (gameField.getCells()[n - 2] == 1 && gameField.getCells()[n - 1] == 0) {
                    n--;
                } else if (gameField.getCells()[n + 2] == 1 && gameField.getCells()[n + 4] == 0) {
                    n += 4;
                } else if (gameField.getCells()[n + 4] == 1 && gameField.getCells()[n + 2] == 0) {
                    n += 2;
                } else if (gameField.getCells()[n + 3] == 1 && gameField.getCells()[n + 6] == 0) {
                    n += 6;
                } else if (gameField.getCells()[n + 6] == 1 && gameField.getCells()[n + 3] == 0) {
                    n += 3;
                } else {
                    for (int i = 0; i < gameField.getCells().length; i++) {
                        if (gameField.getCells()[i] == 0) {
                            n = i;
                        }
                    }
                }
                break;

            case 3:
                if (gameField.getCells()[n + 1] == 1 && gameField.getCells()[n + 2] == 0) {
                    n += 2;
                } else if (gameField.getCells()[n + 2] == 1 && gameField.getCells()[n + 1] == 0) {
                    n++;
                } else if (gameField.getCells()[n - 3] == 1 && gameField.getCells()[n + 3] == 0) {
                    n += 3;
                } else if (gameField.getCells()[n + 3] == 1 && gameField.getCells()[n - 3] == 0) {
                    n -= 3;
                } else {
                    for (int i = 0; i < gameField.getCells().length; i++) {
                        if (gameField.getCells()[i] == 0) {
                            n = i;
                        }
                    }
                }
                break;

            case 4:
                if (gameField.getCells()[n - 1] == 1 && gameField.getCells()[n + 1] == 0) {
                    n++;
                } else if (gameField.getCells()[n + 1] == 1 && gameField.getCells()[n - 1] == 0) {
                    n--;
                } else if (gameField.getCells()[n - 2] == 1 && gameField.getCells()[n + 2] == 0) {
                    n += 2;
                } else if (gameField.getCells()[n + 2] == 1 && gameField.getCells()[n - 2] == 0) {
                    n -= 2;
                } else if (gameField.getCells()[n - 4] == 1 && gameField.getCells()[n + 4] == 0) {
                    n += 4;
                } else if (gameField.getCells()[n + 4] == 1 && gameField.getCells()[n - 4] == 0) {
                    n -= 4;
                } else if (gameField.getCells()[n + 3] == 1 && gameField.getCells()[n - 3] == 0) {
                    n -= 3;
                } else if (gameField.getCells()[n - 3] == 1 && gameField.getCells()[n + 3] == 0) {
                    n += 3;
                } else {
                    for (int i = 0; i < gameField.getCells().length; i++) {
                        if (gameField.getCells()[i] == 0) {
                            n = i;
                        }
                    }
                }
                break;

            case 5:
                if (gameField.getCells()[n - 1] == 1 && gameField.getCells()[n - 2] == 0) {
                    n -= 2;
                } else if (gameField.getCells()[n - 2] == 1 && gameField.getCells()[n - 1] == 0) {
                    n--;
                } else if (gameField.getCells()[n - 3] == 1 && gameField.getCells()[n + 3] == 0) {
                    n += 3;
                } else if (gameField.getCells()[n + 3] == 1 && gameField.getCells()[n - 3] == 0) {
                    n -= 3;
                } else {
                    for (int i = 0; i < gameField.getCells().length; i++) {
                        if (gameField.getCells()[i] == 0) {
                            n = i;
                        }
                    }
                }
                break;

            case 6:
                if (gameField.getCells()[n + 1] == 1 && gameField.getCells()[n + 2] == 0) {
                    n += 2;
                } else if (gameField.getCells()[n + 2] == 1 && gameField.getCells()[n + 1] == 0) {
                    n++;
                } else if (gameField.getCells()[n - 2] == 1 && gameField.getCells()[n - 4] == 0) {
                    n -= 4;
                } else if (gameField.getCells()[n - 4] == 1 && gameField.getCells()[n - 2] == 0) {
                    n -= 2;
                } else if (gameField.getCells()[n - 3] == 1 && gameField.getCells()[n - 6] == 0) {
                    n -= 6;
                } else if (gameField.getCells()[n - 6] == 1 && gameField.getCells()[n - 3] == 0) {
                    n -= 3;
                } else {
                    for (int i = 0; i < gameField.getCells().length; i++) {
                        if (gameField.getCells()[i] == 0) {
                            n = i;
                        }
                    }
                }
                break;

            case 7:
                if (gameField.getCells()[n + 1] == 1 && gameField.getCells()[n - 1] == 0) {
                    n--;
                } else if (gameField.getCells()[n - 1] == 1 && gameField.getCells()[n + 1] == 0) {
                    n++;
                } else if (gameField.getCells()[n - 3] == 1 && gameField.getCells()[n - 6] == 0) {
                    n -= 6;
                } else if (gameField.getCells()[n - 6] == 1 && gameField.getCells()[n - 3] == 0) {
                    n -= 3;
                } else {
                    for (int i = 0; i < gameField.getCells().length; i++) {
                        if (gameField.getCells()[i] == 0) {
                            n = i;
                        }
                    }
                }
                break;

            case 8:
                if (gameField.getCells()[n - 1] == 1 && gameField.getCells()[n - 2] == 0) {
                    n -= 2;
                } else if (gameField.getCells()[n - 2] == 1 && gameField.getCells()[n - 1] == 0) {
                    n--;
                } else if (gameField.getCells()[n - 3] == 1 && gameField.getCells()[n - 6] == 0) {
                    n -= 6;
                } else if (gameField.getCells()[n - 6] == 1 && gameField.getCells()[n - 3] == 0) {
                    n -= 3;
                } else if (gameField.getCells()[n - 4] == 1 && gameField.getCells()[n - 8] == 0) {
                    n -= 8;
                } else if (gameField.getCells()[n - 8] == 1 && gameField.getCells()[n - 4] == 0) {
                    n -= 4;
                } else {
                    for (int i = 0; i < gameField.getCells().length; i++) {
                        if (gameField.getCells()[i] == 0) {
                            n = i;
                        }
                    }
                }
                break;
        }
        return n;
    }

}
