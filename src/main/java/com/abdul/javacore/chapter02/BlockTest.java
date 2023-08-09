package com.abdul.javacore.chapter02;

class BlockTest {
    public static void main(String args[]) {
        int x, у;
        у = 20;
// адресатом э того оператора цикла служит блок кода
        for (x = 0; x < 10; x++) {

            System.out.println("Знaчeниe х: " + x);
            System.out.println("Знaчeниe у: " + у);
            у = у - 2;
        }
    }
}

