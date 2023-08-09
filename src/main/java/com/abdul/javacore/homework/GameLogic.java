package com.abdul.javacore.homework;

public class GameLogic {
    public Field field;

    public boolean isWIn(char[][] field, char player) {
        for (int i = 0; i < field[0].length; i++) {
            if (field[i][0] == player && field[i][1] == player && field[i][2] == player ||
                    field[0][i] == player && field[1][i] == player && field[2][i] == player) return true;
        }
        if (field[0][2] == player && field[1][1] == player && field[2][0] == player ||
                field[0][0] == player && field[1][1] == player && field[2][2] == player) return true;

        return false;
    }

    public boolean draw(char[][] field) {
        int draw = 0;
        for (char[] element : field) {
            for (char symbol : element) {
                if (symbol != this.field.EMPTY) draw++;
                else if (symbol == this.field.EMPTY) return false;
            }
            if (draw == 9) return true;
        }
        return false;
    }
}
