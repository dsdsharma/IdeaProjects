package com.company;

public class TwoD {
    public static void main(String[] args) {

     int[][] nums = new int[5][4];
     nums[3][3] = 34;
//        int [][] nums = {
//                {1,2,2},
//                {22,22,2},
//                {2,2,2}
//
//
//        };
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums[i].length ; j++) {
                System.out.print(nums[i][j]+"   ");

            }
            System.out.println();
        }

    }
}

int [][] nums = {
            {1,2,2},
            {22,22,2},
            {2,2,2}


};