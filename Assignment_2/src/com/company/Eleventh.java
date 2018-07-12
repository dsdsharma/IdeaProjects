package com.company;

public class Eleventh {
    public static void main(String[] args) {
        int n =5, i=0,j,star=0;

        while(i<n/2+1){

            j= n/2 - i;
            while(j>0){
                System.out.print(" ");
                j -= 1;
            }

            star =2*i+1;
            while(star>0){
                System.out.print("*");
                star -=1;

            }
            System.out.println("");
            i +=1;

        }

        j=0;

        while(i<n){

            while(j>=0){
                System.out.print("*");
                j -=1;
            }
            j +=1;


            System.out.println();
            i +=1;
        }
    }

}

