package com.abdul.javacore.chapter07;

class OverloadCons {
    public static void main(String args[]) {
// создать параллелепипеды, исполь зуя разные
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        double vol;
// получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);

        vol = mybox2.volume();
        System.out.println(" Oбъeм mybox2 равен " + vol);

        vol = mycube.volume();
        System.out.println(" Oбъeм mycube равен " + vol);
    }
}

