package com.company;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        int c=0;
        while(n!=0){
            int r = n%10;

            if(r==5){
                c++;
            }
            n=n/10;


        }
        System.out.print("Number of 5s are: "+ c);
    }
}
