package com.abdul.javacore.chapter03;

class Conversion {
    public static void main(String args[]) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\nПpeoбpaзoвaниe типа int в тип byte.");
        b = (byte) i;
        System.out.println(" i и Ь" + i + "" + b);
        System.out.println("\nПpeoбpaзoвaниe типа double в тип int.");
        i = (int) d;
        System.out.println("d и i" + d + "" + i);
        System.out.println("\nПpeoбpaзoвaниe типа double в тип byte.");
        b = (byte) d;
        System.out.println("d и b" + d + " " + b);
    }
}