package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here


    }
     public static void Swap(int[] nums,int x , int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
         System.out.println(Arrays.toString(nums));
     }
     public static boolean LinearSearch(int[] nums,int value ){
         for (int i = 0; i <nums.length ; i++) {
             if(nums[i]==value){

                 return true;
             }

         }

        return false;
     }
     public static int LinearSearchIndex(int[] nums,int value){
         for (int i = 0; i < nums.length ; i++) {
             if(nums[i]== value){

                 return i+1;
             }

         }
        return -1;
     }

     public static int BinarySearchIndex(int[] nums, int value){
        int start = 0;
        int end = nums.length-1;
        // loop til list is ended
        while(start <= end){
            // mid is mis index of the list
            int mid = (start+end)/2;
            // if value is at mid index of list it will return mid+1;
            if(nums[mid]==value){
                return mid+1;
            }
            // if nums[mid] is smaller than value which means value is ahead of mid.
            else if(nums[mid]<value){
                start = mid+1;

            }
            // else if it greater it must be backward mid.
            else{
                end = mid -1;

            }
        }

        return -1;
     }

}
