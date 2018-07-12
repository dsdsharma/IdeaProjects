package com.company;

import java.util.Scanner;

/*This program prints all prime numbers from 2 to n */
public class Fourth {
    public static void main(String[] args) {
        int num;
        int i =2;
        int k=2;
        int flag =0;
        System.out.println("Enter the number");
        Scanner scan =new Scanner(System.in);
        num = scan.nextInt();

        while(k<num){
        while(i<k/2) {
            if (k % i == 0) {
                flag = 1;
                i+=1;
            }

            if (flag==0){
                System.out.println(k);
            }
        }

            k +=1;

        }
    }
}
