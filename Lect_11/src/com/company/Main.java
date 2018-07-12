package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        int[] mem = new int[num];

        Arrays.fill(mem,-1);
        fiboDp(num,mem);
    }

    private static int fiboDp(int num, int[] mem) {
        if(num<=1){
            return num;
        }

        mem[num] =  fiboDp(num-1,mem)+fiboDp(num-2,mem);
        return mem[num];
    }

    public static int fibo(int num){
        if(num<=1){
            return num;
        }

        return fibo(num-1)+fibo(num-2);

    }
    public static int fboItr(int num, int[] mem){
        mem[0]=0;
        mem[1]=1;
        for (int i = 2; i <=num ; i++) {
            mem[i]=mem[i-1]+ mem[i-2];

        }
        return mem[num];
    }



}
