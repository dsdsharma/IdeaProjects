package com.company;

import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
    int[] nums = {12,13,34,45,56,12};
//    boolean b = sorted(nums,0);
//        System.out.println(b);
        ArrayList l =indexall(nums,0,12);
        System.out.println(l);
//        for (int i = 0; i < l.size(); i++) {
//            System.out.println(l.get(i));
//
//        }
    }
    public static boolean find(int[] arr,int start, int item){
            if(start == arr.length)
                return false;

        return arr[start]==item || find(arr,start+1,item);
    }

    public static int index(int[] arr, int start, int item){
        if(start == arr.length)
            return -1;

        if(arr[start]==item)
            return start;
        return index(arr,start+1,item);
    }

    public static int lastindex(int[] arr, int end, int item){
        if(end>-1)
            return -1;
        if(arr[end]==item)
            return end;
    return lastindex(arr,end-1,item);
    }

    public static boolean sorted(int[] nums, int start) {
        if(start==nums.length-1)
            return true;
        return nums[start] <= nums[start+1] &&
                sorted(nums,start+1);
    }

    public static ArrayList indexall(int[]arr,int start, int item){
        if(start==arr.length)
            return new ArrayList();
    ArrayList list = indexall(arr, start+1,item);
        if(arr[start]==item)
            list.add(start);

    return list;
    }

}

