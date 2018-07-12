package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

	// write your code here
        int[] nums = new int[10];// Declaration of array of type int, nums is the variable where array is stored

        int [] numbers = {1,2,3,4,4,5,6,};  // giving data into array numbers without giving size

        System.out.println(Arrays.toString(numbers));   // printing all elememts of array

        System.out.println(numbers.length);  // printing size of numbers
        System.out.println(nums.length);    // printing size of nums
        int i =0;
        while(i< numbers.length){   // using loop to print array elements
            System.out.println(numbers[i]); // printing one element at i with each loop recursion.
            i++;

        }
        System.out.println("--------------------");



    }
}
