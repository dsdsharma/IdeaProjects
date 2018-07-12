package com.company;
/*This program is to reverse a number
num is the number input from user
d is the variable to store last digit
result will store final number*/

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        int num;
        int d;
        int result=0;

        System.out.println("Please enter a number to reverse it");
        Scanner scan =new Scanner(System.in);
        num = scan.nextInt();

        while(num>0){
            d = num%10;
            num = num/10;

            result = result*10+d;

        }
        System.out.println(result);
    }
}
