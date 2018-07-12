package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*This */
        temp();

    }


    public static void temp() {
        Scanner scan = new Scanner(System.in);
        int start, end, gap;
        System.out.println("Enter the Starting number: ");
        start = scan.nextInt();
        System.out.println("Enter the last number: ");
        end = scan.nextInt();
        System.out.println("Enter the gaps in the temerature: ");
        gap = scan.nextInt();

        while (start <= end) {
            float result;
            result = (5 / 9f) * (start - 32);

            start += gap;

            System.out.println(result);
        }

    }

}
