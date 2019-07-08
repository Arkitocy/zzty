package com.base.day4;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        double a1 = 123.4;
        double a2 = 456.7;
        double a3 = 789.1;
        double a4 = 329.2;
        arrayList.add('a');
        arrayList.add('b');
        arrayList.add('c');
        arrayList.add(a1);
        arrayList.add(a2);
        arrayList.add(a3);
        arrayList.add(a4);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
