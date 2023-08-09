package com.abdul.javacore.homework;

public class Field {
    public final char CROSS = 'X';
    public final char ZERO = '0';
    public final char EMPTY = '-';
    public char[][] field = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'},
    };

    public void printField(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
