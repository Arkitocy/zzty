package com.base.day3;

public class Day3 {
    public static void main(String[] args) {
//        String a = "adsafhdvsna";
//        System.out.println(a.substring(a.length() - 3, a.length() - 1));
//        int[] b = {1, 2, 3, 4, 5, 6, 7};
//        int[] c = new int[]{12, 214, 1, 413, 515};
//        int i = 0;
//        while (i < b.length) {
//            System.out.println(b[i]);
//            i++;
//        }
//        for (int a : b) {
//            System.out.println(a);
//        }
        for(int i=1;i<=6;i++){
            for(int j=6; i<=j; j--)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print("*");
            for(int j=1; j<i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
