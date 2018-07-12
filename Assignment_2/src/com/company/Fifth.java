package com.company;

import java.util.Scanner;
/*This */
public class Fifth {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scan = new Scanner(System.in);

        int n;
        int i=1;
        int k=1;

        n= scan.nextInt();

        while(i<n){
            int j = 1;

            while(j<=i){

                System.out.print(k);
                k +=1;
                j +=1;
            }


            i += 1;
            System.out.println();
        }

    }
}
