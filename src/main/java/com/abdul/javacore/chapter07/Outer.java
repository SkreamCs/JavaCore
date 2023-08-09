package com.abdul.javacore.chapter07;

class Outer {
    int outer_х = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println(" вывoд : outer х " + outer_х);
        }
    }
}
