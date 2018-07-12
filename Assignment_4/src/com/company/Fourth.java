package com.company;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Size of array:");
        int n = s.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();

        }
        Reverse(array);
    }
    public static void Reverse(int[] array){


        int temp;

        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length- i-1];
            array[array.length-i-1] = temp;

        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);

        }
    }
}
