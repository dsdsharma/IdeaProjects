package com.company;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        System.out.println("Please enter a number!");
        /*n is the number input from user
          a acts as first number
          b is the second number
          result is the final sum*/

        int n;
        int a=0;
        int b = 1;
        int i=2;
        int result;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        if(n==0){
            System.out.println("Fibonacci is 0");
        }
        else if(n==1){
            System.out.println("Fibonacci is 1");
        }
        else {

            while(i<n){
                result = a+b;
                a = b;
                b = result;     //Next digit is in result and transferred to b
                i += 1;

                System.out.println(b);
            }

        }
    }
}
