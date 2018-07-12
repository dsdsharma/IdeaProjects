package com.company;

public class Util {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        swap(nums,3,4);

    }

    public static void swap(int[] nums, int x, int y ){     // it will swap to elements in an array

        int temp =nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
        display(nums);



    }
    public static void display(int[] nums){     // it is same as in main it will display array elements with space
        for(int i= 0;i<nums.length;i++){
            System.out.print(nums[i]+ "   ");

        }
        System.out.println();
    }
    public static int max(int[] nums, int start, int end){  // it will find maximum element in an array
        int m = start;
//        int value = nums[start];
        for (int i = 0; i <end ; i++) {
            if( nums[i] > nums[start]){
//                nums[start] = nums[i];
                m = i;
            }
        }

        return m;
    }
}
