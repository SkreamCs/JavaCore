package com.abdul.javacore.chapter8;

class SimpleInheritance {
    public static void main(String args[]) {
        A superOb = new A();
        B subOb = new B();
// суперкласс може т исполь зоваться самостоятельно
        superOb.i = 10;
        superOb.j = 20;
        System.out.println(" Coдepжимoe объекта supe rOb : ");
        superOb.showij();
        System.out.println();
/* Подкласс име ет доступ ко всем открытым членам
своего суперкласса . */
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println(" Coдepжимoe объекта subOb : ");
        subOb.showij();
        subOb.showij();
        System.out.println();
        System.out.println("Cyммa i, j и k в объекте subOb:");
        subOb.sum();
    }
}

