package com.company;

public class Knapsack {
    public static void main(String[] args) {

        System.out.println(  );

    }
    public static int knap(int[] weight, int[] price,int cap,int loc){
        if(cap==0||loc==weight.length){
            return 0;
        }

        int keep=0;

        if(cap>=weight[loc]){
         keep= price[loc]+knap(weight,price,cap-weight[loc],loc);
        }

        int reject = knap(weight,price,cap,loc+1);

        return Math.max(keep,reject);

    }
}
