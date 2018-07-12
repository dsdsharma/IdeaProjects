package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String name = "acf";
// 1       System.out.println(ispalin(name));
//  2      System.out.println(pallincount(name));
//   3     toogle(name);
//    4    oddeven(name);
//     5      diffindex(name);

    }
    public static boolean ispalin(String line){
        int start = 0;
        int end = line.length()-1;
        while(start<end){
            if(line.charAt(start)!= line.charAt(end))
                return false;
        start++;
        end--;
        }
        return true;
    }

    public static int pallincount(String line){
        int count = 0;
        for (int i = 0; i <line.length(); i++) {
            for (int j = i+1; j <line.length() ; j++) {
                if(ispalin(line.substring(i,j)))
                    count+=1;
            }
        }
        return count;
    }

    public static void toogle(String line){
        StringBuilder change = new StringBuilder(line);

        for (int i = 0; i < line.length(); i++) {
            char ch = change.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                if(ch>='a'&&ch<='z')
                    change.setCharAt(i,(char)(ch -'a'+'A'));

                else if(ch>='A'&&ch<='Z')
                    change.setCharAt(i,(char)(ch-'A'+'a'));
            }
        }
        System.out.println(change.toString());
    }

    public static void oddeven(String line){

        StringBuilder change = new StringBuilder(line);
        for (int i = 0; i < line.length(); i++) {
            char ch = change.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                if(i%2==0)
                    change.setCharAt(i,(char)(ch-1));
                else
                    change.setCharAt(i,(char)(ch+1));
            }
        }
        System.out.println(change.toString());
    }

    public static void diffindex(String line){
        StringBuilder change = new StringBuilder(line);

        int i;
        int[] diff = new int[line.length()-1];
        for(int n=0; n<line.length()-1; n++){

            char ch = line.charAt(n);
            if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
                diff[n] = line.charAt(n+1)-line.charAt(n);
            }
        }
        i = diff.length-1;
        for (int j=change.length()-1;j>0;j--) {

         change.insert(j,diff[i]);
         i--;
        }

        System.out.println(change.toString());
    }


}
