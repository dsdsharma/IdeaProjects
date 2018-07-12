package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = s.nextInt();
        int[] first = new int[n];

        System.out.println("Enter the elements of first array");
        for (int i = 0; i <first.length ; i++) {
            first[i] = s.nextInt();
        }

        System.out.println("Enter the target");
        int k = s.nextInt();

        for (int i = 0; i <first.length-1 ; i++) {
            for (int j = i; j <first.length-1 ; j++) {
                if(first[i]+first[j]==k){
                    System.out.print(first[i]);
                    System.out.print(first[j]);
                    System.out.println();
                }

            }

        }
    }
}
