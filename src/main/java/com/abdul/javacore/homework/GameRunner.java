package com.abdul.javacore.homework;

import java.util.Scanner;

public class GameRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Field essence = new Field();
        GameLogic logic = new GameLogic();
        logic.field = essence;
        boolean crossOrZero = true;
        while (true) {
            System.out.println();
            essence.printField(essence.field);
            System.out.println((crossOrZero) ? "Ход делает: X" : "Ход делает: 0");
            System.out.print("Введите координаты ячейки через пробел, или end" + " ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) break;
            String[] parts = input.split(" ");
            if (parts.length > 2) {
                System.out.println("Неверный формат ввода");
                continue;
            }
            int x = Integer.parseInt(parts[0]) - 1;
            int y = Integer.parseInt(parts[1]) - 1;
            if (essence.field[x][y] != essence.EMPTY) {
                System.out.println("ЗАНЯТО");
                continue;
            }
            essence.field[x][y] = (crossOrZero) ? essence.CROSS : essence.ZERO;
            if (logic.isWIn(essence.field, (crossOrZero) ? essence.CROSS : essence.ZERO)) {
                System.out.println((crossOrZero) ? "Крестики выиграли" : "Нолики выиграли");
                break;
            } else if (logic.draw(essence.field)) {
                System.out.println("Ничья");
                break;
            }
            if (crossOrZero) {
                crossOrZero = false;
            } else crossOrZero = true;
        }
    }
}

