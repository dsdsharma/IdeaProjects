package com.company;

public class Bin2Deci {
    public static void main(String[] args) {
        int a = 1010;
        System.out.println(bin2deci(a));
    }
    public static int bin2deci(int bin){
        int r;
        int deci=0;
        int pow =1;
        while(bin!=0){
            r= bin%10;
            bin = bin/10;
            deci += pow*r;
            pow *= 2;

        }
        return deci;
    }
}


