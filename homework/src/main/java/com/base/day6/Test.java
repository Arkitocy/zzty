package com.base.day6;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int[][][] a=new int[2][3][4];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    a[i][j][k]=i+j+k;
                }
            }
        }
        ArrayList b=new ArrayList();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    if(a[i][j][k]%2!=0){
                        b.add(a[i][j][k]);
                    }
                }
            }
        }

        System.out.println(b);

    }


}
