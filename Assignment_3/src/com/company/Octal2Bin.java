package com.company;

public class Octal2Bin {
    public static void main(String[] args) {
        int a = 21;
        System.out.println(octal2bin(a));
        System.out.println(octal2deci(a));
    }
    public static int octal2deci(int a){
        int r;
        int deci=0;
        int pow =1;
        while(a>0){
            r= a%10;
            a = a/10;
            deci += pow *r;
            pow *= 8;

        }

        return deci;
    }
    public static int octal2bin(int a){
        int deci = octal2deci(a);

        int r;
        int bin =0;
        int pow =1;
        while(a>0){
            r = a%2;
            a = a/2;
            bin += pow*r;
            pow *= 10;
        }
        return bin;
    }
}
