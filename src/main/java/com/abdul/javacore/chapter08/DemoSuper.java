package com.abdul.javacore.chapter08;

class DemoSuper {
    public static void main(String args[]) {

        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        Box b = new Box();
        double vol;
        vol = mybox1.volume();
        System.out.println("Oбъeм mybox l равен " + vol);
        System.out.println(" Bec mybox l равен " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
        System.out.println("Bec mybox2 равен " + mybox2.weight);
        System.out.println();
        vol = mybox3.volume();
        System.out.println("Oбъeм mybox3 равен " + vol);
        System.out.println(" Bec mybox3 равен " + mybox3.weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("Oбъeм myclone равен " + vol);
        System.out.println(" Bec mycl one равен " + myclone.weight);
        System.out.println();
        vol = mycube.volume();
        System.out.println("Oбъeм mycube равен " + vol);
        System.out.println(" Bec mycube равен " + mycube.weight);
        System.out.println();
    }
}