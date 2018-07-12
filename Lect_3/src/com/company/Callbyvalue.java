package com.company;

public class Callbyvalue {
    public static void main(String[] args) {
        int i = 23;
        int j = 32;
        swap(i,j);
        System.out.println(i);
        System.out.println(j);
    }

    public static void swap(int i, int j){
            int t=i;
            i=j;
            j=t;
        System.out.print("This is swap");
        System.out.println(i);
        System.out.println(j);
    }

}
