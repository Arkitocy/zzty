package com.base.day3;

public class Word {
    public static void main(String[] args) {
        String a = "abcdefg";
        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt((a.length() - (i + 1))));
        }
    }
}
