package com.base.day4;

public class Print {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int sum) {
        int number = 0;
        for (int i = 1; i <= sum; i++) {
            int starNum = 2 * i - 1;
            int emptyNum = sum - i;
            if (i == sum) {
                number = starNum + i;
            }
            printl(emptyNum, starNum);
        }
        int nrow = sum + 1;
        int srow = 2 * sum - 1;
        for (int i = nrow; i <= srow; i++) {
            int emptyNum = i - sum;
            int starNum = number - i - emptyNum;
            printl(emptyNum, starNum);
        }

    }

    public static void printl(int emptyNum, int starNum) {
        for (int z = 0; z < emptyNum; z++) {
            System.out.print(" ");
        }
        for (int j = 0; j < starNum; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

