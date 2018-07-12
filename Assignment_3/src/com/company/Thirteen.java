package com.company;

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("This program calculates the value of x^n!");
        System.out.print("Enter the value of x: ");
        int n = s.nextInt();
        System.out.print("Enter the value of n: ");
        int o =s.nextInt();
        System.out.println("The value of "+n+" raise to "+o+" is "+calc(n,o));
    }
    public static int calc(int a, int b){
        int result=1;
        int i = b;
        while(i>0){
            result *= a;

            i--;
        }

        return result;
    }
}
