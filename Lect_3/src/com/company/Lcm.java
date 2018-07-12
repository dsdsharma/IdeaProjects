package com.company;

public class Lcm {
    public static void main(String[] args) {
        System.out.println(lcm(8,4));
    }

    public static int lcm(int n, int m){
        int res =1;
        int c=2;

        while(m!=1||n!=1){

            if(n%c==0 || m%c==0){
                res = res*c;
                if(n%c==0){
                    n=n/c;

                }
                if(m%c==0){
                    m=m/c;

                }

            }
            else{
                c++;
            }
        }
        return  res;
    }
}
