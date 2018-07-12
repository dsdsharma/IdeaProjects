package com.company;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Size of array:");
        int n = s.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();

        }
        System.out.println("Enter th element to find");
        int value = s.nextInt();
        System.out.println(find(array,value));








    }

    public static int find(int[] array, int value){
        int start = 0;
        int end = array.length-1;
        for (int i = 0; i <end ; i++) {
            int mid =(start+end)/2;
            if(array[mid]== value){
                return mid;
            }
            else if(array[mid]>value){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }


        return -1;
    }

}
