package com.base.day5;

public class TestDescribe {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setAge(12);
//        System.out.println(student.getAge());
//        student.setName("AAA");
//        System.out.println(student.getName());

        int[][] a=new int[2][3];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=i+j+1;
            }
        }

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
