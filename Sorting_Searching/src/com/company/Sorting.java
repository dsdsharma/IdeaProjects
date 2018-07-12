package com.company;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        Selection(nums);

    }
    public static void Bubble(int[] nums){

        for (int i = 0; i <nums.length-1; i++) {
            for (int j = 0; j <nums.length-i-1 ; j++) {
                if(nums[j]>nums[j+1]){
                    Main.Swap(nums,j,j+1);
                }

            }

        }
    }
    public static int maxint(int[] nums, int start , int end){
        int m =0;
        for (int i = start; i <end ; i++) {
            if(nums[i+1]> nums[i]){

                m = (i+1);

            }


        }
        return m;
    }
    public static void Selection(int[] nums){
        for (int i = 0; i <nums.length; ++i) {
            int max = maxint(nums,0,nums.length-i-1);
            Main.Swap(nums,max, nums.length-i-1);

        }

    }
}
