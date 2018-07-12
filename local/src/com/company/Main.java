package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            char op = s.next().charAt(0);

            if(op=='x'||op=='X'){
                System.out.println();
                break;}
                /*else if(op!='+'){
                System.out.println("Invalid operation. Try again.");
            }*/
            int a = s.nextInt();
            int b = s.nextInt();
            if((op=='/'||op=='%')&&(b<=0)){
                continue;
            }

            switch(op){
                case '+':
                    System.out.println(a+b);
                    break;

                case'-':
                    System.out.println(a-b);
                    break;

                case '%':

                        System.out.println(a%b);
                        break;


                case '/':

                        System.out.println(a/b);
                        break;

            }

        }

































//        int n = s.nextInt();
//        int temp;
//        int result=0;
//        while(n!=0){
//            temp = n%10;
//            result =result* 10 + temp;
//            n = n/10;
//
//        }
//        System.out.println(result);
//
//
//        int n = s.nextInt();
//        int first = 0;
//        int sec = 1;
//        int temp;
//        for (int i = 0; i < n; i++) {
//
//            temp = first + sec ;
//            System.out.println(i);


        }

public static int mod(int a, int b){
        int reslult;
        reslult= a%b;
    return reslult;

}

}

