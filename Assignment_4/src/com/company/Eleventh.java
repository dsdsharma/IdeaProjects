package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = s.nextInt();
        int[] first = new int[n];
        int[] second = new int[n];
        int[] result = new int[n];
        int k=0;
        System.out.println("Enter the elements of first array");
        for (int i = 0; i <first.length ; i++) {
            first[i] = s.nextInt();
        }
        System.out.println("Enter the elements of second array");
        for (int i = 0; i <second.length ; i++) {
            second[i] = s.nextInt();
        }
        for (int i = 0; i <first.length ; i++) {
            int j =0;
            while(j<first.length) {
                if(first[i]==second[j]){
                    result[k] = first[i];
                    k++;

                }
                j++;


            }

        }

        System.out.println(Arrays.toString(result));

    }

}
