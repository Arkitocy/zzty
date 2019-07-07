package com.base.day1;

import javax.sound.midi.Soundbank;

public class Day1 {
    public static void main(String[] args) {
          int a = 89;
//        int b;
//        b = 30;
//        int c = a + b;
//        System.out.println("今天是个好日子~");
//        System.out.println("a=" + a + ",b=" + b + ",c=" + c);
//        System.out.println(b - a);
//        boolean f = false;
//        boolean t = true;
//        if (t) {
//            System.out.println("t是true");
//        }
//        if (f) {
//            System.out.println("f是true");
//        }
//        boolean f1 = 10 > 100;
//        boolean f2 = 10000 > 100;
//        System.out.println(f1);
//        System.out.println(f2);
//        if (10 > 20) {
//            System.out.println("false");
//        }
//        if (20 > 10) {
//            System.out.println("true");
//        }
        if (a >= 90 && a <= 100) {
            System.out.println("优秀");
        } else if (a >= 80) {
            System.out.println("良好");
        } else if (a >= 60) {
            System.out.println("及格");
        } else if (a < 60) {
            System.out.println("不及格");
        }
    }
}
