package com.base.day4;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        List list = new java.util.ArrayList();
        list.add(123);
        list.add("a");
        list.add(false);
        list.add(true);
        for (Object a:list
             ) {
            System.out.println(a);
        }
    }
}
