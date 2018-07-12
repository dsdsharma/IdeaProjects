package com.company;

public class Deci2Octal {
    public static void main(String[] args) {
        int a =20;
        System.out.println(deci2Octal(a));
    }

    public static int deci2Octal(int deci){
        int octal=0;
        int r;
        int pow =1;
        while(deci>0){
            r = deci%8;
            deci = deci/8;
            octal += pow*r;
            pow = pow * 10;
        }


        return octal;
    }
}
