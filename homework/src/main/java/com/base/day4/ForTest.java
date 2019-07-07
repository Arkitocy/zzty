package com.base.day4;

public class ForTest {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 7, 8};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

//        for(int i=0;i<5;i++){
//            for (int j=0;j<5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
                System.out.print(" ");
            for(int k=1;k<=2*i-1;k++)
                System.out.print('*');
            System.out.println();
        }
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(" ");
            for(int k=7;k>=2*i-1;k--)
                System.out.print('*');
            System.out.println();
        }
    }
}
