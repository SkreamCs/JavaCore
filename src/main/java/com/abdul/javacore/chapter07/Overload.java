package com.abdul.javacore.chapter07;

class Overload {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        // вызвать все варианты метода test ()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Peзyльтaт вызова ob . test (123.25} : " + result);
    }
}