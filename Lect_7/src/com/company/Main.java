package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        triangleup(0,5);
//        subsequence("","abc");
//        System.out.println(subsequencelist("","abc"));

    }
    public static void triangleup(int start, int end){
        if(end==0)
            return;
        if(start == end){
            System.out.println();
            triangleup(0,end-1);
            System.out.println();
            return;
        }
        System.out.print("1");
        triangleup(start+1,end);
        System.out.print("1");

    }

    public static void subsequence(String proc, String unproc){
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }

        char ch = unproc.charAt(0);

        unproc = unproc.substring(1);

        subsequence(proc+ch, unproc);

        subsequence(proc,unproc);
    }

    public static ArrayList subsequencelist(String proc, String unproc){
        if(unproc.isEmpty()){
            ArrayList list = new ArrayList();
            list.add(proc);
            return list;
        }

        char ch = unproc.charAt(0);

        unproc = unproc.substring(1);

        ArrayList l1 = subsequencelist(proc+ch, unproc);

        ArrayList l2 = subsequencelist(proc,unproc);

        l1.addAll(l2);

        return l1;
    }

//    public static ArrayList keycombi(String processed, String unprocessed){
//        if(unprocessed.isEmpty()){
//            ArrayList list = new ArrayList();
//            list.add(processed);
//            return list;
//        }
//
//        int digit = unprocessed.charAt(0)-'0';
//        unprocessed = unprocessed.substring(1);
//
//        ArrayList list = new ArrayList();
//        for (int i = 3*(digit-1); i <3*digit; i++) {
//            if(i==26){
//                continue;
//            }
//            char ch = (char)(i+'a');
//            ArrayList temp = keycombi(processed+);
//            list.addAll(temp);
//
//        }
//        return list;
//    }

    public static void permutwa(String str){
        char ch = str.charAt(0);
        permutwa(str);

        }



    }

}
