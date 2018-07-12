package com.ProjectEuler;

public class Main {

    public static void main(String[] args) {
//	    int result=0;
//        for (int i = 0; i <1000 ; i++) {
//            if(i%3==0||i%5==0) {
//                result += i;
////                System.out.println(i);
//            }
//        }
//        System.out.println(result);
//euler3();
    }
    public static int evenfibosum(){
        int sum = 0;
        int n =1;
        int m =1;

        while(true) {
            if(m>=4000000){
                break;
            }
            int temp;
            temp = n;
            n = m;
            m = temp+n;
//            System.out.println(m);
                if(m%2==0)
                    sum+=m;

        }

        return sum;
    }
    public static void euler3(){

        long   limit = 600851475143L;
        for (int i = 1; i < limit/2 ; i++) {


            if (limit % i == 0)
                System.out.println(i + ',');
        }

    }
    public static boolean palinint(int n){
        int temp = n;
        int sum =0;
        int r;
        while(n>0){
            r = n%10;
            sum = (sum*10)+r;
            n = n/2;
        }
        if(temp == sum)
            return true;
        return false;
    }

    public static void euler4(){
        int result=0;
        int result2=0;
        int compare;
        for (int i = 1; i < 100; i++) {
            for (int j =1; j <100 ; j++) {
                compare = i*j;
                if(palinint(compare)){
                    result = i;
                    result2 = j;
//                    System.out.println(compare);
                }

            }
            System.out.println(i);
        }


//        System.out.println(result);
//        System.out.println(result2);
    }
}
