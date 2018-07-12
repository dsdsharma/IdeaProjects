package com.company;

public class Board {
    public static void main(String[] args) {

    }
    public static int count(int num){
        if(num==0){
            return 1;
        }
        int sum =0;


        for (int i = 1; i <=6 ; i++) {
            sum+=count(num-i);

        }

        return sum;
    }
}
