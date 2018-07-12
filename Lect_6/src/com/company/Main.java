package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        printDecInc(5);
//        System.out.println(factorial(8));
//        System.out.println(fibbo(10));

        System.out.println(pow(5,7));
    }



    public static int fibbo(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;

    return fibbo(n-1)+fibbo(n-2);
    }


    public static int pow(int x,int y){
        if(y==0)
            return 1;
        else
            return x*pow(x,y-1);
    }


    public static int factorial(int num){
        if(num == 0)
            return 1;


    return num*factorial(num-1);
    }

    public static void printInc(int n){
    if (n==0){
        return;
    }


        printInc(n-1);
        System.out.println(n);

    }

    public static void printDecInc(int n){
        if (n==0){
            return;
        }


        System.out.println(n);

        printDecInc(n-1);

        System.out.println(n);
        return;
    }
}
