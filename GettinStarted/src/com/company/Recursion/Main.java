package com.company.Recursion;

import java.util.ArrayList;

public class Main {

     int num;
     int num1;
     int num2;

    public Main(int num,int num1,int num2) {
        this.num = num;
        this.num1= num1;
        this.num2= num2;
    }

    public static void main(String[] args) {
        Main cons = new Main(0,1,0);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(fibbo(5,0,1,0,list));

    }

    public static ArrayList fibbo(int limit, int num, int num1, int num2,ArrayList list){


        if(limit==0){
            return list;
        }
        list.add(num);
        num2 = num1+num;
        num = num1;
        num1= num2;

        return fibbo(limit-1,num,num1,num2,list);
    }


    public int fact(int num){
        if(num==1){
            return 1;
        }else{

            return (num*fact(num-1));
        }

    }



}
