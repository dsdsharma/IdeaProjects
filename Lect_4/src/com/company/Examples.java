package com.company;

public class Examples {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};

//
//        Util.swap(nums,3,4);
//        System.out.println("======================");
//        System.out.println(LinearSearch(nums,44));
//        System.out.println(BinarySearchIndex(nums,4));
//        insertion(nums);
//        Util.display(nums);
        insertion(nums);
    }

    public static boolean LinearSearch(int[] nums, int value){
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]==value){

                return true;
            }

        }
        return false;

    }

    public static int LinearSearchIndex(int[] nums, int value){
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]==value){

                return i;
            }

        }
        return -1;

    }

    public static int BinarySearchIndex(int[] nums, int item){
        int left = 0;
        int right = nums.length -1;
        while(left<=right){
            int mid =(left + right)/2;
            if(nums[mid]==item){
                return mid;
            }
            else if (nums[mid] < item){
                left = mid +1;
            }
            else{
                right = mid-1;
            }

        }
        return -1;

    }
    public static void Bubble(int[] nums){int k =0;
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(k);
            for (int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j] > nums[j+1]){
                    Util.swap(nums,j,j+1);
                }

            }

        }

    }
    public static void selection(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int maxIndex = Util.max(nums,0,nums.length-i);

            Util.swap(nums,maxIndex,nums.length-i-1);


        }

    }
    public static void insertion(int[] nums){int k =0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(k);
            for (int j = i; j > 0; j--) {

                if (nums[j]<nums[j-1]){
                    Util.swap(nums, j, j-1);


                }
                else {
                    break;
                }


            }

        }
    }
}
