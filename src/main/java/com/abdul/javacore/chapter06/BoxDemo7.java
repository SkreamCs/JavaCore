package com.abdul.javacore.chapter06;

class BoxDemo7 {
    public static void main(String args[]) {
        // объявить , выделить память и инициализировать объе кты типа Вох
        BoxTwo mybox1 = new BoxTwo(10, 20, 15);
        BoxTwo mybox2 = new BoxTwo(3, 6, 9);
        double vol;

        // nолучить объем первого параллелепипеда
        vol = mybox1.volume ();
        System.out.println ("Oбъeм равен " + vol);
        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм равен" + vol);
    }
}