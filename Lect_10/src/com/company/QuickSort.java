package com.company;
//worst case is n^2

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {4,5,3,1,9,22};
        sort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));

    }
    public static void sort(int[] nums, int start, int end){
        if(start>=end){
            return;
        }
        int p = end;
        p = pivot(nums,start,end,p);

        sort(nums,start,p-1);
        sort(nums,p+1,end);
    }
    public static int pivot(int[] nums, int start,int end ,int p){

        int j = start;
        for (int i = start; i < p; i++) {
            if(nums[i]<nums[p]){
                swap(nums,i,j);
                j++;
            }
        }
        swap(nums,j,p);
        return j;
    }

    private static void swap(int[] nums, int i, int j) {
        int t =nums[i];
        nums[i] =nums[j];
        nums[j] =t;
    }

}
