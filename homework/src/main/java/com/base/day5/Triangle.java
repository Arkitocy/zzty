package com.base.day5;

public class Triangle {

    public void print(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.print(5);
    }
}