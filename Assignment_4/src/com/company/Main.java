package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("This program Saves an array and give its largest element!");
        System.out.println("-----------------------");
        System.out.print("Enter the size of array:");
        n = s.nextInt();
        System.out.println("Enter the elements of array:");
        int[] array = new int[n];

        for (int i = 0; i < array.length ; i++) {
            array[i] = s.nextInt();

        }
        System.out.println(array[max(array,0,array.length)]+" is largest!");
    }
  /*  public static void Getarray(int n){
        Scanner s = new Scanner(System.in);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();

        }
        }
*/


    public static int max(int[] array,int start, int end){
        int m=start;
        for (int i = 0; i < end ; i++) {
            if (array[i]>array[m])
                m = i;
        }
        return m;
    }
}
