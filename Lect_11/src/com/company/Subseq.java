package com.company;

public class Subseq {
    public static void main(String[] args) {
        String first = "amma";
        String second  ="mumma";

        System.out.println(maxSubseq(first,second,first.length()-1,second.length()-1));

    }

    public static int maxSubseq(String first, String second, int f, int s){

        if(s<0||f<0){
            return 0;
        }
        if(first.charAt(f)==second.charAt(s)){
            return 1+maxSubseq(first,second,f-1,s-1);
        }
        else{
            return Math.max(maxSubseq(first,second,f-1,s),maxSubseq(first,second,f,s-1));
        }
    }
}
