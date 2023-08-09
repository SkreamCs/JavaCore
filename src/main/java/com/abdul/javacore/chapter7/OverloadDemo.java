package com.abdul.javacore.chapter7;

class OverloadDemo {
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

    // Пере гружаемый метод , проверяющий наличие одного целочисленного параметра
    void test(int а) {
        System.out.println("a:" + а);
        //Перегружаемый метод, проверяющий наличие
    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + "" + b);
    }

    // Перегружаемый метод , проверяющий наличие
    // параметра типа double
    double test(double a) {
        System.out.println("double а:" + a);
        return a * a;
    }
}
