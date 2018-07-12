package com.company;

public class Seventh {
    public static void main(String[] args) {
        int[] first = {3,1,4,2,0};
        int[] second = {4,1,3,0,2};
        System.out.println(inverse(first,second));

    }
    public static boolean inverse(int[]first, int[]second){
        int[] temp = new int[first.length];

        for (int i = 0; i < first.length; i++) {
            temp[first[i]] = i;

        }
        for (int i = 0; i <first.length ; i++) {
            if (temp[i] != second[i]) {
                return false;
            }

        }
        return true;
    }

}
