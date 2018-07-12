package com.company;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter number");

        int sumeven =0;
        int i=1;
        int sumodd =0;
        int n =scan.nextInt();

        while (n!=0){
            if(i%2==0){
                sumeven +=n%10;
            }
            else{
                sumodd +=n%10;
            }
            n/=10;
            i+=1;


        }
        System.out.println("SUm even: "+ sumeven +"Sum odd: " + sumodd);
    }
}
