package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter the Number!");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i=2;
        int flag = 0;
        while(i<n/2){

            if(n%i==0) {
                flag = 1;
                break;
            }

            i += 1;
        }
        if(flag == 0) {
            System.out.print(n);
            System.out.print(" is a prime number!");
        }
        else {
            System.out.print(n);
            System.out.println(" is not a prime number!");
        }
    }
}
