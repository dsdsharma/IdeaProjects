package com.company;

public class Inverse {
    public static void main(String[] args) {
        System.out.println(num(123));
    }
    public static int num(int a){
        int i;
        int res = 0;
        while(a!=0){
            i = a%10;

            res = res * 10 + i;
            a = a/10;

        }
        return res;
    }
}
