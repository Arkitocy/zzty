package com.base.day3;

public class querry {
    public static void main(String[] args) {
        byte a[] = {1, 4, 6, 12, 9, 2, 7, 5, 3, 4};
        System.out.println("和="+sum(a));
        System.out.println("平均="+avg(a));
        System.out.println("最大="+max(a));
    }

    public static byte sum(byte[] num) {
        byte sum = 0;
        for (double b : num) {
            sum += b;
        }
        return sum;
    }

    public static int max(byte[] num) {
        byte max = 0;
        for (byte b : num
        ) {
            if (max < b) {
                max = b;
            }
        }

        return max;
    }

    public static double avg(byte[] num) {
        double avg = 0;
        byte sum = sum(num);
        avg = sum / num.length;
        return avg;
    }
}
