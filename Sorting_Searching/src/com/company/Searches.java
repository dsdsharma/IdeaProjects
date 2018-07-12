package com.company;

import java.util.Scanner;

public class Searches {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("This is a Linear Search");
        System.out.print("Enter an array of size 5:");
        // Declaring array of size 5
        int[] nums = {1,2,3,4,5};
        // Input to array til size of array.
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = s.nextInt();
//
//        }

        System.out.println("------------------");
        System.out.println();
        System.out.print("Enter the value you want to search:");
        int value = s.nextInt();

        /*System.out.println(Main.LinearSearch(nums,value));
        System.out.println(value +" is at "+Main.LinearSearchIndex(nums,value)+" place.");*/

        System.out.println(Main.BinarySearchIndex(nums, value));


    }
}
