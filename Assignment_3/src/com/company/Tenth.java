package com.company;

import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        int start;
        int end;
        int counter;
        int temp ;
        int result=0;
        int digit;
        Scanner s = new Scanner(System.in);
        System.out.println("This program prints Armstrong numbers between two numbers!");
        System.out.print("Enter the starting number!");
        start =s.nextInt();
        System.out.print("Enter the last number!");
        end = s.nextInt();

        counter = start;  // to have a fix value i.e. start to compare with
        while(counter <=end){    //to check the number increment with limit

            digit = counter; // to have a seperate number to operate on

            while(digit!=0){
            temp = digit % 10;         // copy last digit for cube
            result += temp*temp*temp;      // calculates sum of cube of each digit
            if(result==counter){              // if calculated result is same as counter or current number
                System.out.println(result);
            }
            digit = digit/10;
            }
            result=0;
            counter++;                  // increment for next number less than limit
        }

    }

}
