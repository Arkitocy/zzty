package com.base.day8;


import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap();
        map.put("1", "a");
        map.put("2", "b");
        System.out.println(map.get("1"));
    }
}
