package com.company;

public class recursion {

    public static void main(String[] args) {
        tri(5);
    }
    public static int tri(int num,int sum){
        if(num==0){
            return sum;
        }

        sum+=tri(num-1,sum);
        return sum;

    }

    public static void pattern(int num){
        if(num==0){
            return;
        }
        pattern(num-1);
        pattermrow(num);
        System.out.println();
    }

    private static void pattermrow(int num) {
        if(num==0){
            return;
        }
        pattermrow(num-1);
        System.out.print("* ");
    }

    public static void number(int x){
        if(x==1) {
            return;
        }
        System.out.println(x);

        number(x-1);

        System.out.println(x);


    }





    public static int power(int num, int x){

        if(x==1){
            return num;
        }
        int smallpow = power(num,x/2);
        if(x%2==0){
            return smallpow*smallpow;
        }
        else{
            return smallpow*smallpow*num;
        }
    }
}
