package com.company;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("This program count the number of digit in a number!");
        System.out.print("Enter the Number");
        int n = s.nextInt();
        System.out.print("Enter the digit to count:");
        int o =s.nextInt();
        System.out.println("The number of "+o+" is "+count(n,o));

    }

    public static int count(int a, int b){
        int count=0;

        while(a!=0){
            int temp = a % 10;
            if(temp==b){
                count++;
            }
            a = a/10;
        }
        return count;
    }
}
