package com.elgo;

public class Specific {

    public static Integer addition(int a, int b) {
        return a + b;
    }

    public static Integer soustraction(int a, int b) {
        return b - a;
    }

    public static Integer multiplication(int a, int b) {
        return a * b;
    }
    public static Integer division(int a, int b) {
        if (a==0)
            System.out.println("Opération Impossible. Division By Zéro Exception");
        return b / a;
    }
}
