package com.company;

import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        System.out.print("This program checks if a number is Armstrong number or not!");
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        if(CheckArm(n)==1){
            System.out.println(n+" is an Armstrong number!");
        }
        else{
            System.out.println(n+" is not an Armstrong number!");
        }

    }
    public static int CheckArm(int a){
        int temp=0;
        int result =0;
        int i = a ;
        while(a!=0){
            temp = a % 10;
            result += temp*temp*temp;
            a=a/10;
        }
        if(result==i) {
            return 1;
        }
        return 0;
    }

}
