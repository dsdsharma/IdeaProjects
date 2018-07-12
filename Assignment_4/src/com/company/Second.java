package com.company;

import java.util.Scanner;

public class Second {
    public static int LinearIndex(int[] array,int value ){

        for (int i = 0; i <array.length ; i++) {
            if(array[i]==value)
                return i;
        }
        return -1;
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = s.nextInt();
        System.out.print("Enter the elements of array");
        int[] array = new int[n];

        for (int i = 0; i <array.length ; i++) {
            array[i]= s.nextInt();

        }
        System.out.print("Enter the element to search:");
        int value = s.nextInt();
        int result = LinearIndex(array,value);
        System.out.println(result+" is the index of "+value);
    }

}
