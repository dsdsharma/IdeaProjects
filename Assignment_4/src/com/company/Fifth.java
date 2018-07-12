package com.company;

import java.util.Arrays;

public class Fifth {
    public static void main(String[] args) {
        int[] array = {3,1,4,2,0};
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            result[array[i]] = i;
        }
        System.out.println(Arrays.toString(result));
    }
}
