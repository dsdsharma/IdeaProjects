package com.company;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {10,2,16,9,3,1 };
        sort(nums);
        System.out.println(Arrays.toString(sort(nums)));
    }

    public static int[] sort(int[] nums){

        if(nums.length==1){
            return nums;
        }
        int[] first = Arrays.copyOfRange(nums,0,nums.length/2);
        int[] second = Arrays.copyOfRange(nums,nums.length/2, nums.length);

        first = sort(first);
        second = sort(second);
        return merge(first,second);
    }

    private static int[] merge(int[] first, int[] second) {
        int result[] = new int[first.length+second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<first.length&&j<second.length){
            if (first[i]<=second[j]){
                result[k] = first[i++];
            }
            else{
                result[k] = second[j++];
            }
            k++;
        }
        while (i < first.length) {
            result[k] = first[i++];
            k++;
        }
        while(j<second.length){
            result[k] = second[j++];
        }
        return result;
    }


}

