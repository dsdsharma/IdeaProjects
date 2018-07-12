package com.company;

public class Seventh {
    public static void main(String[] args) {
        int a = 32145;
        System.out.println(calc(a));
    }
    public static int calc(int a){
        int r;
        int result=0;
        int counter =1;
        int counter2 ;

        while(a!=0){
            r = a%10;
            counter2=counter;
            while(r>1){
                counter2 = counter2 * 10;
                r--;

            }
            a=a/10;
            result+= counter2;
            counter++;
        }
        return result;



    }
}
